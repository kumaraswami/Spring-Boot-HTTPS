package com.davita;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoronaDetails {
	
	@JsonProperty
	private String Country;
	@JsonProperty
	private String Slug;
	@JsonProperty
	private String NewConfirmed;
	@JsonProperty
	private String TotalConfirmed;
	@JsonProperty
	private String NewDeaths;
	@JsonProperty
	private String TotalDeaths;
	@JsonProperty
	private String NewRecovered;
	@JsonProperty
	private String TotalRecovered;
	
	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getSlug() {
		return Slug;
	}

	public void setSlug(String slug) {
		Slug = slug;
	}

	public String getNewConfirmed() {
		return NewConfirmed;
	}

	public void setNewConfirmed(String newConfirmed) {
		NewConfirmed = newConfirmed;
	}

	public String getTotalConfirmed() {
		return TotalConfirmed;
	}

	public void setTotalConfirmed(String totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}

	public String getNewDeaths() {
		return NewDeaths;
	}

	public void setNewDeaths(String newDeaths) {
		NewDeaths = newDeaths;
	}

	public String getTotalDeaths() {
		return TotalDeaths;
	}

	public void setTotalDeaths(String totalDeaths) {
		TotalDeaths = totalDeaths;
	}

	public String getNewRecovered() {
		return NewRecovered;
	}

	public void setNewRecovered(String newRecovered) {
		NewRecovered = newRecovered;
	}

	public String getTotalRecovered() {
		return TotalRecovered;
	}

	public void setTotalRecovered(String totalRecovered) {
		TotalRecovered = totalRecovered;
	}

	
	  @Override public String toString() {
	  
	  return "Country Name: ".concat(getCountry()).concat(", ") + 
			  "Total Confirmed: ".concat(getTotalConfirmed()).concat(", ") + 
			  "Total Recovered:	".concat(getTotalRecovered()).concat(", ") +
			  "Total Deaths:	".concat(getTotalDeaths()).concat(", ") + 
			  "New Confirmed:	".concat(getNewConfirmed()); 
	  
	  }
	 

}
