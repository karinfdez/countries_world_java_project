package com.teamtreehouse.countries.data;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Component;

import com.teamtreehouse.countries.model.Country;

@Component
public class CountryRepository {
    
	private static final List<Country> ALL_COUNTRIES=Arrays.asList(
			new Country("Italy","59, 830, 000","Rome",Arrays.asList("Italian"),"italy"),
		    new Country("France","66,030 ,000","Paris",Arrays.asList("French"),"france"),
			new Country("Ecuador","9, 593, 000","Kito",Arrays.asList("Spanish"),"ecuador"),
			new Country("Kenya","44, 350, 000","Nairobi",Arrays.asList("Swahili","English"),"kenya"),
			new Country("India","1, 276, 267, 000","New Delhi",Arrays.asList("Hindi","English"),"india")
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


