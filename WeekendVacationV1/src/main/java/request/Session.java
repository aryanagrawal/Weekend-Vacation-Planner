package request;

import java.util.List;

import io.swagger.client.api.DefaultApi;

public class Session {
	
	DefaultApi myApi;
	String request;
	String origin;
	String destination;
	String apikey = "faOEuoZ26QiG5ZDCPEg409NiqXRZjrEy";
	String departureDate;
	String returnDate = null;
	String arriveBy = null;
	String returnBy = null;
	Integer adults = null;
	Integer children = null;
	Integer infants = null;
	List<String> includeAirlines = null;
	List<String> excludeAirlines = null;
	Boolean nonstop = true;
	Integer maxPrice = null;
	String currency = null;
	String travelClass = null;
	Integer numberOfResults = null;
	String airportCode = null;
	
	public Session(String origin, String destination, String departureDate, String returnDate){
		this.myApi = new DefaultApi();
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.airportCode = destination;
		//FlightRequest flightRequest = new FlightRequest(this);
	}
	
	public void setAirportCode(String code){
		this.airportCode = code;
	}

}
