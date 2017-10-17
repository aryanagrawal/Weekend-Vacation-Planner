import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
        String term = "Ban"; // String | Search keyword that should represent the start of a word in a city or airport name.
        String country = "US"; // String | Identified a country based of a <a href=\"https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\">ISO 3166-1 alpha-2 code</a>
        Boolean allAirports = false; // Boolean | Boolean to include or not all airports, no matter their traffic rank. False by default, to only display relevant airports.
        try {
            List<AirportAutocompleteResponse> result = apiInstance.airportAutocomplete(apikey, term, country, allAirports);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#airportAutocomplete");
            e.printStackTrace();
        }
    }
}
