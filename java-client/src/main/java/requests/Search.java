package requests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.swagger.client.model.CarSearchResult;
import io.swagger.client.model.HotelPropertyResponse;
import io.swagger.client.model.LowFareSearchResult;

public class Search {
	
	FlightRequest flight;
	CarRequest car;
	HotelRequest hotel;
	
	public Search(String origin, String destination, String departureDate, String returnDate){
		Session mySession = new Session(origin, destination, departureDate, returnDate);
		this.flight = new FlightRequest(mySession);
		this.car = new CarRequest(mySession);
		this.hotel = new HotelRequest(mySession);
	}
	
	public List<LowFareSearchResult> getFlightResponseList() {
		// TODO Auto-generated method stub
		return flight.flightList;
	}
	
	public List<CarSearchResult> getCarResponseList(){
		return car.carList;
	}
	
	public List<HotelPropertyResponse> getHotelResponseList(){
		return hotel.hotelList;
	}

}
