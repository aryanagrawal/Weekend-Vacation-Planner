package request;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.LowFareSearchResponse;
import io.swagger.client.model.LowFareSearchResult;



public class FlightRequest {
	List<LowFareSearchResult> flightList;
	Session session;
	DefaultApi myApi;
	
	public FlightRequest(Session currSession){
		this.session = currSession;
		this.myApi = currSession.myApi;
		try {
			LowFareSearchResponse response = myApi.flightLowFareSearch(currSession.apikey, currSession.origin, currSession.destination, currSession.departureDate, currSession.returnDate, currSession.arriveBy, currSession.returnBy, currSession.adults, currSession.children, currSession.infants, currSession.includeAirlines, currSession.excludeAirlines, currSession.nonstop, currSession.maxPrice, currSession.currency, currSession.travelClass, 1);
			this.flightList = response.getResults();
			System.out.println(response.getResults().get(0).toString());
			currSession.setAirportCode(response.getResults().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getDestination().getAirport().toString());
			System.out.println(currSession.airportCode);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<LowFareSearchResult> getList(){
		return this.flightList;
	}
}
