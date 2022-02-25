package com.gleenpeltroche.paises.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code; //char
    private String name; //char
    private String continent; //enum
    private String region; //char
    private double surfaceArea; //float
    private short indepYear; //small
    private int population; //int
    private double lifeExpectancy; //float
    private double gnp; //float
    private double gnpOld; //float
    private String localName; //char
    private String governmentForm; //char
    private String headOfState; //char
    private int capital; //int
    private String code2; //char
    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
    private List<City> cities;
    
    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
    private List<Language> languages;
    
	public Country() {
	}

	public Country(Long id, String code, String name, String continent, String region, double surfaceArea,
			short indepYear, int population, double lifeExpectancy, double gnp, double gnpOld, String localName,
			String governmentForm, String headOfState, int capital, String code2, List<City> cities) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surfaceArea = surfaceArea;
		this.indepYear = indepYear;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
		this.gnp = gnp;
		this.gnpOld = gnpOld;
		this.localName = localName;
		this.governmentForm = governmentForm;
		this.headOfState = headOfState;
		this.capital = capital;
		this.code2 = code2;
		this.cities = cities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public short getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(short indepYear) {
		this.indepYear = indepYear;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public double getGnp() {
		return gnp;
	}

	public void setGnp(double gnp) {
		this.gnp = gnp;
	}

	public double getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(double gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
    
}
