package com.codingdojo.country.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.country.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	//@Query("SELECT l,c FROM Language l JOIN l.")
	//List<Object[]> joinLanguagesAndCountries();

}
