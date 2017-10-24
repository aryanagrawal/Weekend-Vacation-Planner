package com.maven.test;

import java.util.*;

import java.time.*;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.*;

import requests.*;

public class App {

	public static void main(String args[]) {
		Search search = new Search("TUS", "PHX", "2017-11-11", "2017-11-12");
		List<LowFareSearchResult> flights = search.getFlightResponseList();
		List<CarSearchResult> cars = search.getCarResponseList();
		List<HotelPropertyResponse> hotels = search.getHotelResponseList();

		ArrayList<Object[]> objects = getFlights(flights);
		for(Object[] o : objects){
			for(Object ob : o){
				System.out.println(ob.toString());
			}
			System.out.println();
		}
	}

	public static ArrayList<Object[]> getFlights(List<LowFareSearchResult> flights) {

		int Flight_Id;
		String Departure, Arrival, Airline, Depart_time, Arrive_time;
		double Cost;
		String Currency;
		ArrayList<Object[]> objects = new ArrayList<Object[]>();
		Object[] object = new Object[8];
		
		
		for (LowFareSearchResult result : flights) {
			Cost = Double.parseDouble(result.getFare().getTotalPrice().toString().trim());
			Currency = "USD";
			for (FlightSearchItinerary itinerary : result.getItineraries()) {
				for (FlightSearchSegment flight : itinerary.getOutbound().getFlights()) {
					Flight_Id = Integer.parseInt(flight.getFlightNumber().toString().trim());
					Departure = flight.getOrigin().getAirport();
					Arrival = flight.getDestination().getAirport();
					Airline = flight.getOperatingAirline();
					Depart_time = flight.getDepartsAt();
					Arrive_time = flight.getArrivesAt();
					object = new Object[] { Flight_Id, Departure, Arrival, Airline, Depart_time, Arrive_time, Cost,
							Currency };
					objects.add(object);
				}

				for (FlightSearchSegment flight : itinerary.getInbound().getFlights()) {
					Flight_Id = Integer.parseInt(flight.getFlightNumber().toString().trim());
					Departure = flight.getOrigin().getAirport();
					Arrival = flight.getDestination().getAirport();
					Airline = flight.getOperatingAirline();
					Depart_time = flight.getDepartsAt();
					Arrive_time = flight.getArrivesAt();
					object = new Object[] { Flight_Id, Departure, Arrival, Airline, Depart_time, Arrive_time, Cost,
							Currency };
					objects.add(object);
				}
			}
		}
		return objects;
	}

}