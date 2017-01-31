package com.teamtreehouse.countries.data;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Component;

import com.teamtreehouse.countries.model.Country;

@Component
public class CountryRepository {
    
	private static final List<Country> ALL_COUNTRIES=Arrays.asList(
			new Country("Italy","59.83 Millions","Rome",Arrays.asList("Italian"),"italy"),
		    new Country("France","66.03 Millions","Paris",Arrays.asList("French"),"france"),
			new Country("Ecuador","9.593 Millions","Kito",Arrays.asList("Spanish"),"ecuador"),
			new Country("Kenya","44.35 Millions","Nairobi",Arrays.asList("Swahili","English"),"kenya"),
			new Country("India", "1.252 Billion","San Juan",Arrays.asList("Hindi,English"),"india")
	);
	
	
	public List<Country> getListCountries(){
		return ALL_COUNTRIES;
	}
	
	public Country findByName(String name){
		for(Country country : ALL_COUNTRIES){
			if(country.getCountryName().toLowerCase().equals(name.toLowerCase())){
				return country;
			}
		}
		return null;
	}
	
}


