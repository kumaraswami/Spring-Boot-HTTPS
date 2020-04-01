package com.davita;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
//@RequestMapping("/covid")
public class CoronaCheckController {
	
	
	@RequestMapping("/hello")
	//public String getSummary(@PathVariable (name = "countryName") String countryName) throws JsonMappingException, JsonProcessingException {
	public String getSummary() {	
		/*
		 * RestTemplate restTemplate = new RestTemplate(); String result =
		 * restTemplate.getForObject("https://api.covid19api.com/summary",
		 * String.class); JsonObject convertedObject = new Gson().fromJson(result,
		 * JsonObject.class); String countryDetails =
		 * convertedObject.get("Countries").toString(); ObjectMapper mapper = new
		 * ObjectMapper();
		 * mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 * List<CoronaDetails> coronaDetails = null;
		 * 
		 * coronaDetails = mapper.readValue(countryDetails , new
		 * TypeReference<List<CoronaDetails>>(){});
		 * 
		 * for(CoronaDetails c: coronaDetails) {
		 * 
		 * if(c.getCountry().equalsIgnoreCase(countryName)) return c.toString(); }
		 * 
		 * return "Please Enter Correct Country Name";
		 */ //coronaDetails.stream().filter(s -> s.getCountry().equalsIgnoreCase(countryName)).map(Object::toString).collect(Collectors.toList());
		
		return "Hello Davita";
	}

}
