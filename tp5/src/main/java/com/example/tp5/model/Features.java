package com.example.tp5.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Features {
	ArrayList <Trucs> features = new ArrayList <Trucs> ();
	
	@Override
	  public String toString() {
	    return "Quote{" +
	        "type='" + features.get(0).getType() + '\'' +
	        ", value=" +  +
	        '}';
	  }
	
	public ArrayList <Trucs> getFeatures() {
		return features;
	}
	
	public void setFeatures(ArrayList <Trucs> features) {
		this.features = features;
	}
}
