package com.codingdojo.country.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.country.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	List<City> findAll();

}
