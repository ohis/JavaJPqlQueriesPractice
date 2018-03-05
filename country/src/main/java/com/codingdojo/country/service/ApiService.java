package com.codingdojo.country.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.country.models.Country;
import com.codingdojo.country.repository.CityRepository;
import com.codingdojo.country.repository.CountryRepository;
import com.codingdojo.country.repository.LanguageRepository;

@Service
public class ApiService {
 private CountryRepository countryRepo;
 private CityRepository cityRepo;
 private LanguageRepository langRepo;
public ApiService(CountryRepository countryRepo, CityRepository cityRepo, LanguageRepository langRepo) {
	
	this.countryRepo = countryRepo;
	this.cityRepo = cityRepo;
	this.langRepo = langRepo;
}

public ArrayList<Country> allCountries(){
	return (ArrayList<Country>) countryRepo.findAll();
}

public ArrayList<Country> allcountriesWithname(){
	return (ArrayList<Country>) countryRepo.findAllCountries();
}

public List<Object[]> getCountryWithNamesandLanguage(){
	return countryRepo.joinLanguagesAndCountries();
}

public List<Object[]> getCitiesForCountries(){
	return countryRepo.joinCitiesAndCountries();
}

 public List<Object[]> getCitiesForMexicoGreaterThan500000(){
	 return countryRepo.joinCityPoulationsWithMexico();
 }
}
