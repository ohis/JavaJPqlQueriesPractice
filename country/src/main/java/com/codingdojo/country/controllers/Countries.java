package com.codingdojo.country.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.country.service.ApiService;

@Controller
public class Countries {
	ApiService countryServ;
	
	public Countries(ApiService countryServ) {
		
		this.countryServ = countryServ;
	}

	
	@RequestMapping("/")
	public String dispQuery(Model model) {
		model.addAttribute("countrywithnameandLang",countryServ.getCountryWithNamesandLanguage());
		//model.addAttribute("countrywithname",countryServ.allcountriesWithname());
		model.addAttribute("countrywithNumofCities", countryServ.getCitiesForCountries());
		model.addAttribute("MexWithCitiesgt500k", countryServ.getCitiesForMexicoGreaterThan500000());
		return "dispQ";
	}

	

}
