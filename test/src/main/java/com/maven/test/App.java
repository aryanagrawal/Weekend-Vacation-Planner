package com.maven.test;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.Fare;
import io.swagger.client.model.LowFareSearchResponse;
import io.swagger.client.model.LowFareSearchResult;
import requests.CarRequest;
import requests.FlightRequest;
import requests.HotelRequest;
import requests.Request;
import requests.Search;
import requests.Session;

public class App {

	public static void main(String args[]) {
		Search search = new Search("BOS", "ORD", "2017-12-25", "2017-12-26");
	}

}