package com.teamtreehouse.countries.data;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Component;

import com.teamtreehouse.countries.model.Country;


@Component
public class CountryRepository {
	
	private static final List<Country> ALL_COUNTRIES=Arrays.asList(
			new Country("Italy",59.83,"Rome","italy"),
			new Country("France",66.03,"Paris","france"),
			new Country("Sweeden",9.593,"Stockholm","ecuador"),
			new Country("Cuba",11.27,"Havana","kenya"),
			new Country("Puerto Rico", 3.548,"San Juan","india")
	);
	
	public List<Country> getListCountries(){
		return ALL_COUNTRIES;
	}
}


