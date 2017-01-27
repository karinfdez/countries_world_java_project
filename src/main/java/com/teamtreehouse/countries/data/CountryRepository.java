package com.teamtreehouse.countries.data;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Component;

import com.teamtreehouse.countries.model.Country;


@Component
public class CountryRepository {
	
	private static final List<Country> ALL_COUNTRIES=Arrays.asList(
			new Country("Italy",59.83,"Rome","italy_flag"),
			new Country("France",66.03,"Paris","france_flag"),
			new Country("Sweeden",9.593,"Stockholm","sweden_flag"),
			new Country("Cuba",11.27,"Havana","cuban_flag"),
			new Country("Puerto Rico", 3.548,"San Juan","puerto_rico_flag")
	);
	
	public List<Country> getListCountries(){
		return ALL_COUNTRIES;
	}
}
