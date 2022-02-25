package com.gleenpeltroche.paises.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleenpeltroche.paises.repositories.CountryRepository;

@Service
public class ApiService {
	@Autowired
	CountryRepository countryRepository;
	
	public List<Object[]> queryNumber1(){
		return countryRepository.queryNumber1();
	}
	public List<Object[]> queryNumber2(){
		return countryRepository.queryNumber2();
	}
	public List<Object[]> queryNumber3(){
		return countryRepository.queryNumber3();
	}
	public List<Object[]> queryNumber4(){
		return countryRepository.queryNumber4();
	}
	public List<Object[]> queryNumber5(){
		return countryRepository.queryNumber5();
	}
	public List<Object[]> queryNumber6(){
		return countryRepository.queryNumber6();
	}
	public List<Object[]> queryNumber7(){
		return countryRepository.queryNumber7();
	}
}
