package request;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.HotelPropertyResponse;
import io.swagger.client.model.HotelSearchResponse;

public class HotelRequest {
	Session session;
	DefaultApi myApi;
	List<HotelPropertyResponse> hotelList;
	public HotelRequest(Session currSession){
		this.myApi = currSession.myApi;
		this.session = currSession;
		try {
			HotelSearchResponse response = myApi.hotelAirportSearch(session.apikey, session.airportCode, session.departureDate, session.returnDate, 30, null, null, null, null, 5, null, null, null);
			 this.hotelList = response.getResults();
//			System.out.println(response.getResults().get(0).toString());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
