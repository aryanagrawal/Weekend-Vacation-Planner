package requests;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
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
		Integer numberOfResults = 1;
		
		public Request(String request, String origin, String destination, String departureDate) {
			this.myApi = new DefaultApi();
			this.request = request;
			this.origin = origin;
			this.destination = destination;
			this.departureDate = departureDate;
			sendNewRequest();
		}
		private void sendNewRequest() {
			// TODO Auto-generated method stub
			if (request == "LowFlight"){
				sendLowFlightRequest();
			}
		}
		private void sendLowFlightRequest() {
			// TODO Auto-generated method stub
			
			try {
				 LowFareSearchResponse response = myApi.flightLowFareSearch(apikey, origin, destination, departureDate, returnDate, arriveBy, returnBy, adults, children, infants, includeAirlines, excludeAirlines, nonstop, maxPrice, currency, travelClass, numberOfResults);
				List<LowFareSearchResult> temp = response.getResults();
				
				LowFareSearchResult temp2 = temp.get(0);
				System.out.println(temp2.getFare().getTotalPrice());
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
