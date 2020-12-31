package com.example.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class adresseController {
	
	@GetMapping("/adresse")
    public String adresse(@RequestParam(name="nameGET", required=false, defaultValue="Noe") String nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "adresse";
    }
}
