package com.example.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.tp5.model.Features;
import com.example.tp5.model.Geometry;
import com.example.tp5.model.Main;
import com.example.tp5.model.Trucs;
import com.example.tp5.model.openWeather;

@Controller
public class meteoControlleur {
	
	@PostMapping("/meteo")
	public String meteoPost(@RequestParam(name="cAdr") String adresse, Model model) {
		model.addAttribute("adr", adresse);
		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://api-adresse.data.gouv.fr/search/?q=";
		Features response = restTemplate.getForObject(fooResourceUrl + adresse, Features.class);
        Trucs trucs = response.getFeatures().get(0);
        Geometry geometry = trucs.getGeometry();
        Double lon = geometry.getCoordinates().get(0);
        Double lat = geometry.getCoordinates().get(1);

        RestTemplate rest = new RestTemplate();
		String url = "http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&units=metric&appid=434a28dd340e75797d7733e857068ad6";
		openWeather reponse2 = rest.getForObject(url, openWeather.class);
        Main main = reponse2.getMain();
        float temperature = main.getTemp();
        float ressenti = main.getFeels_like();
        
        model.addAttribute("temp", temperature);
        model.addAttribute("ress", ressenti);
        
		return "meteo";
	}
}
