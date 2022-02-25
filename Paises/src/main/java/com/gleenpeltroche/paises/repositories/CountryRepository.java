package com.gleenpeltroche.paises.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gleenpeltroche.paises.models.Country;

@Repository
public interface CountryRepository  extends CrudRepository<Country, Long> {
	@Query(value="select name, language, percentage from countries join languages on languages.country_id = countries.id where languages.language = 'Slovene' order by languages.percentage desc", nativeQuery=true)
	List<Object[]> queryNumber1();
	
	@Query(value="select countries.name, count(cities.name) from countries join cities on cities.country_id = countries.id group by countries.name order by count(cities.name) desc", nativeQuery=true)
	List<Object[]> queryNumber2();
	
	@Query(value="select cities.name, cities.population, country_id from countries join cities on cities.country_id = countries.id where cities.population > 500000 and countries.code = 'MEX' order by cities.population desc", nativeQuery=true)
	List<Object[]> queryNumber3();
	
	@Query(value="select countries.name, language, percentage from countries join languages on languages.country_id = countries.id where languages.percentage > 89 order by languages.percentage desc", nativeQuery=true)
	List<Object[]> queryNumber4();
	
	@Query(value="select name, surface_area, countries.population from countries where surface_area < 501 and population > 100000", nativeQuery=true)
	List<Object[]> queryNumber5();
	
	@Query(value="select name, government_form, capital, life_expectancy from countries where government_form = 'Constitutional Monarchy' and capital > 200 and life_expectancy > 75", nativeQuery=true)
	List<Object[]> queryNumber6();
	
	@Query(value="select cities.name, cities.district, cities.population from countries as c join cities on cities.country_id = c.id where cities.district = 'Buenos Aires' and cities.population > 500000", nativeQuery=true)
	List<Object[]> queryNumber7();
}
