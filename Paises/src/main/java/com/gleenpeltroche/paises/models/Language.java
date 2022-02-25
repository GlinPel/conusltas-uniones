package com.gleenpeltroche.paises.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="languages")
public class Language {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryCode; //char
    private String language; //char
    private String ifOfficial; //enum
    private double percentage; //float
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id")
    private Country country;
    
    
	public Language() {
	}


	public Language(Long id, String countryCode, String language, String ifOfficial, double percentage,
			Country country) {
		this.id = id;
		this.countryCode = countryCode;
		this.language = language;
		this.ifOfficial = ifOfficial;
		this.percentage = percentage;
		this.country = country;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getIfOfficial() {
		return ifOfficial;
	}


	public void setIfOfficial(String ifOfficial) {
		this.ifOfficial = ifOfficial;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}
}
