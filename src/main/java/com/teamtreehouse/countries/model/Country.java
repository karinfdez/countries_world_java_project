package com.teamtreehouse.countries.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String countryName;
	private double population;
	private String capitalCity;
	private String countryImageName;
	private List<String> officialLanguages;
	
	public Country(String countryName, double population, String capitalCity,
			String countryImageName) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.capitalCity = capitalCity;
		this.officialLanguages=new ArrayList<>();
		this.countryImageName = countryImageName;
	}
	
	public boolean addLanguage(String language){
		return officialLanguages.add(language);
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(float population) {
		this.population = population;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public List<String> getOfficialLanguages() {
		return officialLanguages;
	}
	public void setOfficialLanguages(List<String> officialLanguages) {
		this.officialLanguages = officialLanguages;
	}
	public String getCountryImageName() {
		return countryImageName;
	}
	public void setCountryImageName(String countryImageName) {
		this.countryImageName = countryImageName;
	}
	
}
