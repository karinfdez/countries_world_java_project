package com.teamtreehouse.countries.model;


import java.util.List;

public class Country {
	private String countryName;
	private String population;
	private String capitalCity;
	private String countryImageName;
	private List<String> officialLanguages;
	
	public Country(String countryName, String population, String capitalCity, List<String> languages,String countryImageName) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.capitalCity = capitalCity;
		this.officialLanguages=languages;
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
	public String getPopulation() {
		return population;
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
