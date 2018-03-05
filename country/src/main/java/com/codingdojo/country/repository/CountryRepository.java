package com.codingdojo.country.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.country.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	
	
  List<Country> findAll();
  
  @Query("SELECT c.name FROM Country c")
  List<Country> findAllCountries();
  
  @Query("SELECT c,l FROM Country c JOIN c.languages l WHERE l.country.id  = c.id AND l.language = 'Slovene' ORDER BY l.percentage DESC")
   List<Object[]> joinLanguagesAndCountries();
   
   @Query("SELECT c.name,c1 ,COUNT(c1.country.id) FROM Country c JOIN c.cities c1 WHERE c1.country.id = c.id"
   		+ " GROUP BY c.name ORDER BY COUNT(c1.country.id) DESC")
   List<Object[]> joinCitiesAndCountries();
   
   @Query("SELECT c, c1 FROM Country c JOIN c.cities c1 WHERE c.name = 'Mexico' AND c1.population > 500000 ORDER BY c1.population DESC")
   List<Object[]> joinCityPoulationsWithMexico();
}
