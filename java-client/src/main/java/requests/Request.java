package requests;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.CarSearchResponse;
import io.swagger.client.model.LowFareSearchResponse;
import io.swagger.client.model.LowFareSearchResult;

public class Request {

		DefaultApi myApi;
		String request;
		String origin;
		String destination;
		private String apikey = "faOEuoZ26QiG5ZDCPEg409NiqXRZjrEy";
		String departureDate;
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
		String airportCode = null;
		
		public Request(String origin, String destination, String departureDate, String returnDate) {
			this.myApi = new DefaultApi();
			this.origin = origin;
			this.destination = destination;
			this.departureDate = departureDate;
			this.returnDate = returnDate;
			
			sendNewRequest();
		}
		private void sendNewRequest() {
			// TODO Auto-generated method stub
			if (request == "LowFlight"){
			List<LowFareSearchResult> flightList = sendLowFlightRequest();
			}
			if (request == "Car"){
				sendCarSearch();
				}
				//sendHotelSearch();
				//sendTrainSearch();
				//sendIQSearch();
		}
		/*
		private void sendIQSearch() {
			// TODO Auto-generated method stub
			
		}
		*/
		private void sendCarSearch() {
			// TODO Auto-generated method stub
			try {
				
				CarSearchResponse response = myApi.carRentalAirportSearch(apikey, destination, departureDate, returnDate, null, null, null, null, null, null, null);
				System.out.println(response.toString());
				
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		/*
		private void sendTrainSearch() {
			// TODO Auto-generated method stub
			
		}
		private void sendHotelSearch() {
			// TODO Auto-generated method stub
			
		}
		*/
		private List<LowFareSearchResult> sendLowFlightRequest() {
			// TODO Auto-generated method stub
			
			try {
				
				LowFareSearchResponse response = myApi.flightLowFareSearch(apikey, origin, destination, departureDate, returnDate, arriveBy, returnBy, adults, children, infants, includeAirlines, excludeAirlines, nonstop, maxPrice, currency, travelClass, 1);
				List<LowFareSearchResult> temp = response.getResults();
//				System.out.println(temp.get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getDestination().getAirport().toString());
				this.airportCode = temp.get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getDestination().getAirport().toString();
				return temp;
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

}
