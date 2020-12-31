package com.example.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
	private String label;
	private float score;
	private String id;
	private String type;
	private String name;
	private String postcode;
	private String citycode;
	private float x;
	private float y;
	private float population;
	private String city;
	private String context;
	private float importance;


	// Getter Methods 

	 public String getLabel() {
	  return label;
	 }

	 public float getScore() {
	  return score;
	 }

	 public String getId() {
	  return id;
	 }

	 public String getType() {
	  return type;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getPostcode() {
	  return postcode;
	 }

	 public String getCitycode() {
	  return citycode;
	 }

	 public float getX() {
	  return x;
	 }

	 public float getY() {
	  return y;
	 }

	 public float getPopulation() {
	  return population;
	 }

	 public String getCity() {
	  return city;
	 }

	 public String getContext() {
	  return context;
	 }

	 public float getImportance() {
	  return importance;
	 }

	 // Setter Methods 

	 public void setLabel(String label) {
	  this.label = label;
	 }

	 public void setScore(float score) {
	  this.score = score;
	 }

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setPostcode(String postcode) {
	  this.postcode = postcode;
	 }

	 public void setCitycode(String citycode) {
	  this.citycode = citycode;
	 }

	 public void setX(float x) {
	  this.x = x;
	 }

	 public void setY(float y) {
	  this.y = y;
	 }

	 public void setPopulation(float population) {
	  this.population = population;
	 }

	 public void setCity(String city) {
	  this.city = city;
	 }

	 public void setContext(String context) {
	  this.context = context;
	 }

	 public void setImportance(float importance) {
	  this.importance = importance;
	 }
}
