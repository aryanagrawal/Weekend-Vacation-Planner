package request;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.CarSearchResponse;
import io.swagger.client.model.CarSearchResult;

public class CarRequest {
	Session session;
	DefaultApi myApi;
	List<CarSearchResult> carList;
	public CarRequest(Session currSession){
		this.session = currSession;
		this.myApi = currSession.myApi;
		try {
			CarSearchResponse response = myApi.carRentalAirportSearch(session.apikey, session.airportCode, session.departureDate, session.returnDate, null, null, null, null, null, null, null);
//			System.out.println(response.getResults().get(0).toString());
			this.carList = response.getResults();
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
