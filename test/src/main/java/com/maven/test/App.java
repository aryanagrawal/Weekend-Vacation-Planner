package com.maven.test;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.Fare;
import io.swagger.client.model.LowFareSearchResponse;
import io.swagger.client.model.LowFareSearchResult;
import requests.Request;

public class App {
	
	public static void main(String args[]){
		new Request("LowFlight", "BOS", "LON", "2017-12-25");
	}
	
	
	/*
	public static void main(String args[]){
		DefaultApi myAPI = new DefaultApi();
		
		String apikey = "faOEuoZ26QiG5ZDCPEg409NiqXRZjrEy";
        String origin = "BOS";
        String destination = "LON";
        String departureDate = "2017-12-25";
        String returnDate = null;
        String arriveBy = null;
        String returnBy = null;
        Integer adults = null;
        Integer children = null;
        Integer infants = null;
        List<String> includeAirlines = null;
        List<String> excludeAirlines = null;
        Boolean nonstop = null;
        Integer maxPrice = null;
        String currency = null;
        String travelClass = null;
        Integer numberOfResults = null;
        
		try {
			LowFareSearchResponse response = myAPI.flightLowFareSearch(apikey, origin, destination, departureDate, returnDate, arriveBy, returnBy, adults, children, infants, includeAirlines, excludeAirlines, nonstop, maxPrice, currency, travelClass,
					numberOfResults);
			//System.out.println(response);
			List<LowFareSearchResult> temp = response.getResults();
			
			LowFareSearchResult temp2 = temp.get(0);
			System.out.println(temp2.getFare().getTotalPrice());
			
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
	}