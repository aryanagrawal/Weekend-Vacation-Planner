# DefaultApi

All URIs are relative to *https://api.sandbox.amadeus.com/v1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**airportAutocomplete**](DefaultApi.md#airportAutocomplete) | **GET** /airports/autocomplete | Airport Autocomplete - Find an IATA location code for flight search based on a city or airport name using the term parameter. By only using the country parameter, this API is also able to find all the IATA location codes associated with a country. Both term and country parameters can be used together to filter the results accordingly. The API is fully JQuery-Autocomplete compatible to enable you to quickly build a drop-down list for your users to find the right airport easily.
[**carRentalAirportSearch**](DefaultApi.md#carRentalAirportSearch) | **GET** /cars/search-airport | Car Rental Airport Search - Find car rental providers and rates when you provide an airport code, as well as the pick-up and drop-off dates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.
[**carRentalGeosearch**](DefaultApi.md#carRentalGeosearch) | **GET** /cars/search-circle | Car Rental Geosearch - Locate car rental providers and available vehicles when you define a circular area with one coordinate and radius, as well as the pick-up and drop-off dates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.
[**flightAffiliateSearch**](DefaultApi.md#flightAffiliateSearch) | **GET** /flights/affiliate-search | Flight Affiliate Search - Use Travel Audience Connect&#39;s affiliate network API to search flights from our list of partners and provides deep-links to allow the user to book directly on the airline website.
[**flightExtensiveSearch**](DefaultApi.md#flightExtensiveSearch) | **GET** /flights/extensive-search | Flight Extensive Search - Build travel searches based on very flexible and open range of dates. You can use it to answer questions such as \&quot;When is the best date to fly...\&quot;.  It&#39;s built on Amadeus&#39; Featured Results technology, which returns thousands of results (prices, itineraries and dates) in a matter of milliseconds. Results are available over half a calendar year with a 1 to 15 day stay duration
[**flightInspirationSearch**](DefaultApi.md#flightInspirationSearch) | **GET** /flights/inspiration-search | Flight Inspiration Search - Go beyond the traditional search by origin, destination and dates to meet the needs of travelers looking for suggestions and a search experience that reflects the way they choose their trip. This can help you answer the question \&quot;Where can I go within a given travel budget?\&quot;
[**flightLowFareSearch**](DefaultApi.md#flightLowFareSearch) | **GET** /flights/low-fare-search | Flight Low-Fare Search - Find the cheapest one way or return itineraries and fares between two airports at specific dates.
[**flightTrafficAPI**](DefaultApi.md#flightTrafficAPI) | **GET** /travel-intelligence/flight-traffic | Flight Traffic API - Find the true origin and destination traffic summary between two journey points over a specified period. This can help you answer questions like \&quot;What cities are people coming from to visit Los Angeles between January through April of 2015\&quot;
[**hotelAirportSearch**](DefaultApi.md#hotelAirportSearch) | **GET** /hotels/search-airport | Hotel Airport Search - Locate the cheapest available rooms near a given airport, for a given stay period. This API is ideal if you want to connect flight and hotels. Provide an IATA airport code, as well as the check-in and check-out dates, and get a list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms.
[**hotelGeosearchByBox**](DefaultApi.md#hotelGeosearchByBox) | **GET** /hotels/search-box | Hotel Geosearch by box - Locate the cheapest available rooms within a given rectangular region for a given stay period. It&#39;s ideal for displaying results on a map.
[**hotelGeosearchByCircle**](DefaultApi.md#hotelGeosearchByCircle) | **GET** /hotels/search-circle | Hotel Geosearch by Circle API - Locate the cheapest available rooms within a given radius of a defined point for a given stay period.
[**hotelPropertyCodeSearch**](DefaultApi.md#hotelPropertyCodeSearch) | **GET** /hotels/{property_code} | Hotel Property Code Search - Find out more room and rate information once you have found your preferred hotel.
[**locationInformation**](DefaultApi.md#locationInformation) | **GET** /location/{code} | Location Information - Find more information about any IATA city or airport location code. With this API, you can find information such as city and airport names and locations, as well as information on timezones and airport usage.
[**nearestRelevantAirport**](DefaultApi.md#nearestRelevantAirport) | **GET** /airports/nearest-relevant | Nearest Relevant Airport - Find the most useful nearby airport to a given location.
[**railStationAutocomplete**](DefaultApi.md#railStationAutocomplete) | **GET** /rail-stations/autocomplete | Rail Station Autocomplete - Transform user input into a unique rail station code. Currently only French and Italian stations are supported.
[**railStationInformation**](DefaultApi.md#railStationInformation) | **GET** /rail-station/{id} | Rail-Station Information - Retrieve the rail station information corresponding to an Amadeus UIC rail station ID. Currently only French and Italian stations are supported.
[**topFlightDestinations**](DefaultApi.md#topFlightDestinations) | **GET** /travel-intelligence/top-destinations | Top Flight Destinations - Find the most popular flight destinations from an origin during a period. This can help you answer questions like \&quot;Where are most people going to from Paris during the month of September?\&quot;
[**topFlightSearches**](DefaultApi.md#topFlightSearches) | **GET** /travel-intelligence/top-searches | Top Flight Searches - Find the most popular flight searches from an origin in a during given search period. This can help you answer questions like \&quot;Where are people looking to travel from Paris during the month of September?\&quot;
[**trainExtensiveSearch**](DefaultApi.md#trainExtensiveSearch) | **GET** /trains/extensive-search | Train Extensive Search - Provides multi-day availability and a variety of schedule and pricing options to travel to your destination instantly. Supports SNCF French trains only.
[**trainScheduleSearch**](DefaultApi.md#trainScheduleSearch) | **GET** /trains/schedule-search | Train Schedule Search - Suggest destinations from your chosen departure station. Supports SNCF French Rail only.
[**travelRecordRetrieve**](DefaultApi.md#travelRecordRetrieve) | **GET** /travel-record/{record_locator} | Travel Record Retrieve - Enable travelers to explore the details of their journeys stored in the Amadeus system using our Retrieve Travel Record API.
[**yapQCityNameSearch**](DefaultApi.md#yapQCityNameSearch) | **GET** /points-of-interest/yapq-search-text | YapQ City Name Search - Find landmarks and attractions in a given city.
[**yapQGeosearch**](DefaultApi.md#yapQGeosearch) | **GET** /points-of-interest/yapq-search-circle | YapQ Geosearch - Find landmarks and attractions near a given point.


<a name="airportAutocomplete"></a>
# **airportAutocomplete**
> List&lt;AirportAutocompleteResponse&gt; airportAutocomplete(apikey, term, country, allAirports)

Airport Autocomplete - Find an IATA location code for flight search based on a city or airport name using the term parameter. By only using the country parameter, this API is also able to find all the IATA location codes associated with a country. Both term and country parameters can be used together to filter the results accordingly. The API is fully JQuery-Autocomplete compatible to enable you to quickly build a drop-down list for your users to find the right airport easily.

&lt;p&gt;Using the term parameter and given the start of any word in an airport&#39;s official name, a city name, or the start of an &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt;, this API provides the full name and IATA location code of the city or airport, for use in flight searches. Only major cities and civilian airports with several commercial flights per week are included by default. The response provides up to 20 possible matches, sorted by importance, in a &lt;a href&#x3D;\&quot;http://jqueryui.com/autocomplete/\&quot;&gt;JQuery UI Autocomplete&lt;/a&gt; compatible format. &lt;a href&#x3D;\&quot;https://github.com/amadeus-travel-innovation-sandbox/sandbox-content/blob/master/airport-autocomplete-template.html\&quot;&gt;This sample implementation&lt;/a&gt; using JQuery UI may help. This API uses data from the &lt;a href&#x3D;\&quot;https://github.com/opentraveldata/opentraveldata/blob/master/opentraveldata/optd_por_public.csv\&quot;&gt;OpenTravelData&lt;/a&gt; project. &lt;/p&gt;  &lt;p&gt;By only using the country parameter, this API is also able to find all the IATA location codes associated with a country. Both term and country parameters can be used together to filter the results accordingly.           &lt;/p&gt; &lt;p&gt;The value returned is the IATA location code. The label returned is always in UTF-8 format, with the airport official name (which is often in the native language), in the format of English City Name (if not already included in the airport name).&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **term** | **String**| Search keyword that should represent the start of a word in a city or airport name. | [default to Ban]
 **country** | **String**| Identified a country based of a &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot;&gt;ISO 3166-1 alpha-2 code&lt;/a&gt; | [optional] [default to US]
 **allAirports** | **Boolean**| Boolean to include or not all airports, no matter their traffic rank. False by default, to only display relevant airports. | [optional] [default to false]

### Return type

[**List&lt;AirportAutocompleteResponse&gt;**](AirportAutocompleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="carRentalAirportSearch"></a>
# **carRentalAirportSearch**
> CarSearchResponse carRentalAirportSearch(apikey, location, pickUp, dropOff, lang, currency, provider, rateClass, ratePlan, rateFilter, vehicle)

Car Rental Airport Search - Find car rental providers and rates when you provide an airport code, as well as the pick-up and drop-off dates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.

&lt;p&gt;With this API you can find out the price and type of car, for all car rental providers, near a specified airport.&lt;/p&gt;  &lt;p&gt;You can quickly see the locations of car providers near a given airport, and what cars are available to rent, and at what prices. This API is based on our car pricing service that gets live availability from car providers, and is used to power a variety of airline and travel agency websites.&lt;/p&gt;             &lt;p&gt;Results are validated from car providers, and thus response times may take up to 10 seconds (response times are typically about 5s), and the number of concurrent calls is throttled per user to avoid flooding our provider&#39;s systems. However, this means the final result is guaranteed to be live and accurate.&lt;/p&gt;  &lt;p&gt;The configuration of this API allows search for car rentals in the rental location where the car is picked up (at the start of the rental), is the same as the one where it will be dropped off.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String location = "NCE"; // String | The <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the airport at which the car will be rented.
String pickUp = "2017-08-07"; // String | Date on which the car rental will be collected from the car rental location. If no time is provided, a default value of 09:00 is used. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
String dropOff = "2017-08-08"; // String | Date at which the car rental will end and the car will be returned to the rental location. If no time is provided, a default value of 17:00 is used.
String lang = "EN"; // String | The preferred language of the content related to each car rental. Content will be returned in this language if available.
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> to use when displaying prices and rates related to the car rental.
String provider = "ZI"; // String | 2 character car rental provider code. You may provide this parameter more than once. 
String rateClass = "ALL"; // String | Allows to request specific rate types.
String ratePlan = "DAILY"; // String | Qualifies the rate depending on the pickup date and the rental duration.
String rateFilter = "ESTIMATED"; // String | Defines the types of rates to be returned in the output
List<String> vehicle = Arrays.asList("vehicle_example"); // List<String> | Specifies the type of vehicle to be rented. If selected, the results set will include only vehicles that match these type descriptions. The enumerations above correspond to ACRISS Pseudo Codes, and you may also provide an ACRISS pseudo code directly. If specifying a vehicle-specific ACRISS code, you may provide this parameter up to 3 times.
try {
    CarSearchResponse result = apiInstance.carRentalAirportSearch(apikey, location, pickUp, dropOff, lang, currency, provider, rateClass, ratePlan, rateFilter, vehicle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#carRentalAirportSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **location** | **String**| The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the airport at which the car will be rented. | [default to NCE]
 **pickUp** | **String**| Date on which the car rental will be collected from the car rental location. If no time is provided, a default value of 09:00 is used. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date. | [default to 2017-08-07]
 **dropOff** | **String**| Date at which the car rental will end and the car will be returned to the rental location. If no time is provided, a default value of 17:00 is used. | [default to 2017-08-08]
 **lang** | **String**| The preferred language of the content related to each car rental. Content will be returned in this language if available. | [optional] [default to EN]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; to use when displaying prices and rates related to the car rental. | [optional] [default to USD]
 **provider** | **String**| 2 character car rental provider code. You may provide this parameter more than once.  | [optional] [default to ZI]
 **rateClass** | **String**| Allows to request specific rate types. | [optional] [default to ALL]
 **ratePlan** | **String**| Qualifies the rate depending on the pickup date and the rental duration. | [optional] [default to DAILY]
 **rateFilter** | **String**| Defines the types of rates to be returned in the output | [optional] [default to ESTIMATED] [enum: AVAILABLE, ESTIMATED, ALL]
 **vehicle** | [**List&lt;String&gt;**](String.md)| Specifies the type of vehicle to be rented. If selected, the results set will include only vehicles that match these type descriptions. The enumerations above correspond to ACRISS Pseudo Codes, and you may also provide an ACRISS pseudo code directly. If specifying a vehicle-specific ACRISS code, you may provide this parameter up to 3 times. | [optional]

### Return type

[**CarSearchResponse**](CarSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="carRentalGeosearch"></a>
# **carRentalGeosearch**
> CarSearchResponse carRentalGeosearch(apikey, latitude, longitude, radius, pickUp, dropOff, lang, currency, provider, rateClass, ratePlan, rateFilter, vehicle)

Car Rental Geosearch - Locate car rental providers and available vehicles when you define a circular area with one coordinate and radius, as well as the pick-up and drop-off dates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.

&lt;p&gt;With this API you can find out the price and type of car, for all car rental providers, in a specified geographical location.&lt;/p&gt;  &lt;p&gt;You can quickly see the locations of car providers near a given point, and what cars are available to rent, and at what prices. This API is based on our car pricing service that gets live availability from car providers, and is used to power a variety of airline and travel agency websites.&lt;/p&gt;             &lt;p&gt;Results are validated from car providers, and thus response times may take up to 10 seconds (response times are typically about 5s), and the number of concurrent calls is throttled per user to avoid flooding our provider&#39;s systems. However, this means the final result is guaranteed to be live and accurate.&lt;/p&gt;  &lt;p&gt;The configuration of this API allows search for car rentals in the rental location where the car is picked up (at the start of the rental), is the same as the one where it will be dropped off. &lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
BigDecimal latitude = new BigDecimal(); // BigDecimal | Latitude of the center of the search.
BigDecimal longitude = new BigDecimal(); // BigDecimal | Longitude of the center of the search.
Integer radius = 42; // Integer | Radius around the center to look for hotels in kilometers (km).
String pickUp = "2017-08-07"; // String | Date on which the car rental will be collected from the car rental location. If no time is provided, a default value of 09:00 is used. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
String dropOff = "2017-08-08"; // String | Date at which the car rental will end and the car will be returned to the rental location. If no time is provided, a default value of 17:00 is used.
String lang = "EN"; // String | The preferred language of the content related to each car rental. Content will be returned in this language if available.
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> to use when displaying prices and rates related to the car rental.
String provider = "ZI"; // String | 2 character car rental provider code. You may provide this parameter more than once. 
String rateClass = "ALL"; // String | Allows to request specific rate types.
String ratePlan = "DAILY"; // String | Qualifies the rate depending on the pickup date and the rental duration.
String rateFilter = "ESTIMATED"; // String | Defines the types of rates to be returned in the output
List<String> vehicle = Arrays.asList("vehicle_example"); // List<String> | Specifies the type of vehicle to be rented. If selected, the results set will include only vehicles that match these type descriptions. The enumerations above correspond to ACRISS Pseudo Codes, and you may also provide an ACRISS pseudo code directly. If specifying a vehicle-specific ACRISS code, you may provide this parameter up to 3 times.
try {
    CarSearchResponse result = apiInstance.carRentalGeosearch(apikey, latitude, longitude, radius, pickUp, dropOff, lang, currency, provider, rateClass, ratePlan, rateFilter, vehicle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#carRentalGeosearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **latitude** | **BigDecimal**| Latitude of the center of the search. | [default to 35.1504]
 **longitude** | **BigDecimal**| Longitude of the center of the search. | [default to -114.57632]
 **radius** | **Integer**| Radius around the center to look for hotels in kilometers (km). | [default to 42]
 **pickUp** | **String**| Date on which the car rental will be collected from the car rental location. If no time is provided, a default value of 09:00 is used. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date. | [default to 2017-08-07]
 **dropOff** | **String**| Date at which the car rental will end and the car will be returned to the rental location. If no time is provided, a default value of 17:00 is used. | [default to 2017-08-08]
 **lang** | **String**| The preferred language of the content related to each car rental. Content will be returned in this language if available. | [optional] [default to EN]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; to use when displaying prices and rates related to the car rental. | [optional] [default to USD]
 **provider** | **String**| 2 character car rental provider code. You may provide this parameter more than once.  | [optional] [default to ZI]
 **rateClass** | **String**| Allows to request specific rate types. | [optional] [default to ALL]
 **ratePlan** | **String**| Qualifies the rate depending on the pickup date and the rental duration. | [optional] [default to DAILY]
 **rateFilter** | **String**| Defines the types of rates to be returned in the output | [optional] [default to ESTIMATED] [enum: AVAILABLE, ESTIMATED, ALL]
 **vehicle** | [**List&lt;String&gt;**](String.md)| Specifies the type of vehicle to be rented. If selected, the results set will include only vehicles that match these type descriptions. The enumerations above correspond to ACRISS Pseudo Codes, and you may also provide an ACRISS pseudo code directly. If specifying a vehicle-specific ACRISS code, you may provide this parameter up to 3 times. | [optional]

### Return type

[**CarSearchResponse**](CarSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="flightAffiliateSearch"></a>
# **flightAffiliateSearch**
> AffiliateSearchResponse flightAffiliateSearch(apikey, origin, destination, departureDate, returnDate, adults, children, infants, includeMerchants, excludeMerchants, maxPrice, currency, mobile)

Flight Affiliate Search - Use Travel Audience Connect&#39;s affiliate network API to search flights from our list of partners and provides deep-links to allow the user to book directly on the airline website.

&lt;p&gt;The Flight Affiliate Search API combines Amadeus&#39; flight search technology with Travel Audience&#39;s Connect API partners to provide a unique flight search, where all results come with deep-links to book the flight at a partner&#39;s website. The API will let you easily provide the traveler with a path to book flights from your application.&lt;/p&gt; &lt;p&gt;Travel Audience Connect partners include &lt;ul&gt;   &lt;li&gt;&lt;a href&#x3D;\&quot;http://www.cityjet.com/\&quot;&gt;CityJet&lt;/a&gt;, &lt;a href&#x3D;\&quot;https://www.aireuropa.com/en/flights\&quot;&gt;Air Europa&lt;/a&gt; and &lt;a href&#x3D;\&quot;http://www.flytap.com/\&quot;&gt;TAP&lt;/a&gt; in Western Europe,&lt;/li&gt;   &lt;li&gt;&lt;a href&#x3D;\&quot;http://uralairlines.com/\&quot;&gt;Ural Airlines&lt;/a&gt; in Russia, &lt;/li&gt;   &lt;li&gt;&lt;a href&#x3D;\&quot;http://www.avianca.com.br/\&quot;&gt;Avianca Brazil&lt;/a&gt;  and&lt;/li&gt;   &lt;li&gt;&lt;a href&#x3D;\&quot;http://www.jal.com/\&quot;&gt;JAL&lt;/a&gt; in East Asia&lt;/li&gt; &lt;/ul&gt; &lt;/p&gt; &lt;p&gt;Only Travel Audience Connect partner airlines are searched. For an up-to-date list of routes, see the route maps on each partners respective websites above. You can earn commission using the deep links provided in the search results if you sign up for an account at &lt;a href&#x3D;\&quot;http://connect.travelaudience.com/\&quot;&gt;connect.travelaudience.com&lt;/a&gt;.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String origin = "LON"; // String | City code from which the traveler will depart. See the location and airport interfaces for more information.
String destination = "DUB"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city to which the traveler is going
String departureDate = "2017-08-25"; // String | The date on which the traveler will depart from the origin to go to the destination. The maximum scope for a date range is 2 days, for a larger scope, use the Extensive Search! 
String returnDate = "2017-08-28"; // String | The date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, the search will find only one-way trips. If this, or the return_by parameter are specified, only return trips are found
Integer adults = 1; // Integer | The number of adult (age 12 and over) passengers traveling on this flight.
Integer children = 0; // Integer | The number of child (younger than age 12 on date of departure) passengers traveling on this flight who will each have their own separate seat
Integer infants = 0; // Integer | The number of infant (younger than age 2 on date of departure) passengers traveling on this flight. Infants travel in the lap of an adult passenger, and thus the number of infants must not exceed the number of adults.
List<String> includeMerchants = Arrays.asList("includeMerchants_example"); // List<String> | If specified, all results will include at least one flight where one or more of these airlines is the marketing carrier. Airlines are specified using <a href=\"https://en.wikipedia.org/wiki/Airline_codes\"><a href=\"https://en.wikipedia.org/wiki/Airline_codes\">IATA airline code</a>s</a>
List<String> excludeMerchants = Arrays.asList("excludeMerchants_example"); // List<String> | If specified, no results will include any flights where any of these airlines is the marketing carrier. Airlines are specified using <a href=\"https://en.wikipedia.org/wiki/Airline_codes\"><a href=\"https://en.wikipedia.org/wiki/Airline_codes\">IATA airline code</a>s</a>
Integer maxPrice = 980; // Integer | Maximum price of trips to find in the result set, in USD (US dollars) unless some other currency code is specified. By default, no limit is applied
String currency = "EUR"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> for the results
Boolean mobile = false; // Boolean | Setting this to true will show mobile web deeplinks 
try {
    AffiliateSearchResponse result = apiInstance.flightAffiliateSearch(apikey, origin, destination, departureDate, returnDate, adults, children, infants, includeMerchants, excludeMerchants, maxPrice, currency, mobile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#flightAffiliateSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **origin** | **String**| City code from which the traveler will depart. See the location and airport interfaces for more information. | [default to LON]
 **destination** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city to which the traveler is going | [default to DUB]
 **departureDate** | **String**| The date on which the traveler will depart from the origin to go to the destination. The maximum scope for a date range is 2 days, for a larger scope, use the Extensive Search!  | [default to 2017-08-25]
 **returnDate** | **String**| The date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, the search will find only one-way trips. If this, or the return_by parameter are specified, only return trips are found | [optional] [default to 2017-08-28]
 **adults** | **Integer**| The number of adult (age 12 and over) passengers traveling on this flight. | [optional] [default to 1]
 **children** | **Integer**| The number of child (younger than age 12 on date of departure) passengers traveling on this flight who will each have their own separate seat | [optional] [default to 0]
 **infants** | **Integer**| The number of infant (younger than age 2 on date of departure) passengers traveling on this flight. Infants travel in the lap of an adult passenger, and thus the number of infants must not exceed the number of adults. | [optional] [default to 0]
 **includeMerchants** | [**List&lt;String&gt;**](String.md)| If specified, all results will include at least one flight where one or more of these airlines is the marketing carrier. Airlines are specified using &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt;s&lt;/a&gt; | [optional]
 **excludeMerchants** | [**List&lt;String&gt;**](String.md)| If specified, no results will include any flights where any of these airlines is the marketing carrier. Airlines are specified using &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt;s&lt;/a&gt; | [optional]
 **maxPrice** | **Integer**| Maximum price of trips to find in the result set, in USD (US dollars) unless some other currency code is specified. By default, no limit is applied | [optional] [default to 980]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; for the results | [optional] [default to EUR]
 **mobile** | **Boolean**| Setting this to true will show mobile web deeplinks  | [optional] [default to false]

### Return type

[**AffiliateSearchResponse**](AffiliateSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="flightExtensiveSearch"></a>
# **flightExtensiveSearch**
> ExtremeSearchResponse flightExtensiveSearch(apikey, origin, destination, departureDate, oneWay, duration, direct, maxPrice, aggregationMode)

Flight Extensive Search - Build travel searches based on very flexible and open range of dates. You can use it to answer questions such as \&quot;When is the best date to fly...\&quot;.  It&#39;s built on Amadeus&#39; Featured Results technology, which returns thousands of results (prices, itineraries and dates) in a matter of milliseconds. Results are available over half a calendar year with a 1 to 15 day stay duration

&lt;p&gt;The Extensive Flight Search allows you to find the prices of one-way or return flights between two airports over a large number of dates, and for a large variety of stay durations. The search doesn&#39;t return exact itineraries, but rather tells you the best price for a flight on a given day, for a stay of a given duration.&lt;/p&gt;  &lt;p&gt;The search is based on our Extreme Search platform, which continually caches a large number of flight search results from a list of origin cities to a variety of destinations. Since it&#39;s a cached search, the response time is fast, but not all origin airports are available. Here is &lt;a href&#x3D;\&quot;https://github.com/amadeus-travel-innovation-sandbox/sandbox-content/blob/master/flight-search-cache-origin-destination.csv\&quot;&gt;a list of the currently supported origin-destination IATA location pairs&lt;/a&gt;. We try to keep this list as fresh as possible for you, but be aware that it may not always be exactly up-to-date and it can change without warning.&lt;/p&gt;  &lt;p&gt;That said, a price graph like this provides a powerful bargin shopping tool - allowing travelers with flexible itineraries to identify days on which they can get the cheapest flights to their destinations.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String origin = "FRA"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city from which the traveler will depart. See the location and airport interfaces for more information.
String destination = "LON"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city to which the traveler is going
String departureDate = "2017-08-16--2017-08-26"; // String | Range of dates between which the traveler could depart. Dates are specified in the <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> yyyy-MM-dd date format. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single date is specified, only that date will be searched. By default, the date range starts today and applies up to 361 in the future is applied. Past dates are generally not supported, future dates should be in the next 361 days, although results start to become sparse after about 6 months in the future, as airlines may still be defining their schedules. The default is to search all future dates available.  
Boolean oneWay = false; // Boolean | When set to true, the query will be for a single trip from the origin to the destination. When this parameter is not provided, or is set to false, the query is for a round trip from the origin to the destination and back again.
String duration = "1--15"; // String | The allowed duration or range of durations of the trip, in days. This parameter must not be set if the one-way parameter is set to true.
Boolean direct = false; // Boolean | Limit the search to results that do not require the passenger to change plane?
String maxPrice = "950"; // String | Maximum price of trips to find in the result set, in the currency specified for this origin and destination pair in the cache contents spreadsheet. So, for example, if the origin is NYC, and the max price is 400, this means 400 USD. If the origin is PAR, and the max price is 400, this means 400 EUR. By default, no limit is applied
String aggregationMode = "DAY"; // String | Specifies the granularity of results to be found. DAY is the default when one-way is true finds a result for departure date in the date range. STAY is the default otherwise and finds all round trip permutations for this route withim the given date range. DESTINATION finds one result, only the cheapest price for this route over the provided date range. WEEK finds the cheapest result for every week in the date range. Note that specifying a small granularity but a large search scope may result in a huge output. For some very large outputs, the API may refuse to provide a result.
try {
    ExtremeSearchResponse result = apiInstance.flightExtensiveSearch(apikey, origin, destination, departureDate, oneWay, duration, direct, maxPrice, aggregationMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#flightExtensiveSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **origin** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city from which the traveler will depart. See the location and airport interfaces for more information. | [default to FRA]
 **destination** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city to which the traveler is going | [default to LON]
 **departureDate** | **String**| Range of dates between which the traveler could depart. Dates are specified in the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; yyyy-MM-dd date format. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single date is specified, only that date will be searched. By default, the date range starts today and applies up to 361 in the future is applied. Past dates are generally not supported, future dates should be in the next 361 days, although results start to become sparse after about 6 months in the future, as airlines may still be defining their schedules. The default is to search all future dates available.   | [optional] [default to 2017-08-16--2017-08-26]
 **oneWay** | **Boolean**| When set to true, the query will be for a single trip from the origin to the destination. When this parameter is not provided, or is set to false, the query is for a round trip from the origin to the destination and back again. | [optional] [default to false]
 **duration** | **String**| The allowed duration or range of durations of the trip, in days. This parameter must not be set if the one-way parameter is set to true. | [optional] [default to 1--15]
 **direct** | **Boolean**| Limit the search to results that do not require the passenger to change plane? | [optional] [default to false]
 **maxPrice** | **String**| Maximum price of trips to find in the result set, in the currency specified for this origin and destination pair in the cache contents spreadsheet. So, for example, if the origin is NYC, and the max price is 400, this means 400 USD. If the origin is PAR, and the max price is 400, this means 400 EUR. By default, no limit is applied | [optional] [default to 950]
 **aggregationMode** | **String**| Specifies the granularity of results to be found. DAY is the default when one-way is true finds a result for departure date in the date range. STAY is the default otherwise and finds all round trip permutations for this route withim the given date range. DESTINATION finds one result, only the cheapest price for this route over the provided date range. WEEK finds the cheapest result for every week in the date range. Note that specifying a small granularity but a large search scope may result in a huge output. For some very large outputs, the API may refuse to provide a result. | [optional] [default to DAY]

### Return type

[**ExtremeSearchResponse**](ExtremeSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="flightInspirationSearch"></a>
# **flightInspirationSearch**
> ExtremeSearchResponse flightInspirationSearch(apikey, origin, destination, departureDate, oneWay, duration, direct, maxPrice, aggregationMode)

Flight Inspiration Search - Go beyond the traditional search by origin, destination and dates to meet the needs of travelers looking for suggestions and a search experience that reflects the way they choose their trip. This can help you answer the question \&quot;Where can I go within a given travel budget?\&quot;

&lt;p&gt;The Inspiration Flight Search allows you to find the prices of one-way and return flights from an origin city without necessarily having a destination, or even a flight date, in mind. The search doesn&#39;t return a distinct set of price options, but rather, can tell you the price of flying from a given city to some destination, for a trip of a given duration, that falls within a given date range.&lt;/p&gt;  &lt;p&gt;The search is based on our Extreme Search platform, which continually caches a large number of flight search results from a list of origin cities to a variety of destinations. Since it&#39;s a cached search, the response time is fast, but not all origin airports are available. Here is &lt;a href&#x3D;\&quot;https://github.com/amadeus-travel-innovation-sandbox/sandbox-content/blob/master/flight-search-cache-origin-destination.csv\&quot;&gt;a list of the currently supported origin-destination IATA location pairs&lt;/a&gt;. We try to keep this list as fresh as possible for you, but be aware that it may not always be exactly up-to-date and it can change without warning.&lt;/p&gt;  &lt;p&gt;Despite this limitation don&#39;t underestimate the power of this API. Thanks to its quick response speed you can easily pair it with other APIs to provide a low fare and inspiration for any destination. For example, you can could combine it with a event search API and suggest a total price to see go and see an concert or a game in a selection of cities.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String origin = "NYC"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city from which the traveler will depart. See the location and airport interfaces for more information.
String destination = "LAX"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city to which the traveler is going
String departureDate = "2017-08-16--2017-08-26"; // String | Range of dates between which the traveler could depart. Dates are specified in the <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> yyyy-MM-dd date format. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single date is specified, only that date will be searched. By default, the date range starts today and applies up to 361 in the future is applied. Past dates are generally not supported, future dates should be in the next 361 days, although results start to become sparse after about 6 months in the future, as airlines may still be defining their schedules. The default is to search all future dates available.
Boolean oneWay = false; // Boolean | When set to true, the query will be for a single trip from the origin to the destination. When this parameter is not provided, or is set to false, the query is for a round trip from the origin to the destination and back again.
String duration = "1--15"; // String | The allowed duration or range of durations of the trip, in days. This parameter must not be set if the one-way parameter is set to true.
Boolean direct = false; // Boolean | Limit the search to results that do not require the passenger to change plane?
String maxPrice = "maxPrice_example"; // String | Maximum price of trips to find in the result set, in the currency specified for this origin and destination pair in the cache contents spreadsheet. So, for example, if the origin is NYC, and the max price is 400, this means 400 USD. If the origin is PAR, and the max price is 400, this means 400 EUR. By default, no limit is applied
String aggregationMode = "aggregationMode_example"; // String | Specifies the granularity of results to be found. DESTINATION is the default and finds one result per city. COUNTRY finds one result per country, DAY finds on result for every day in the date range, WEEK finds one result for every week in the date range. Note that specifying a small granularity but a large search scope may result in a huge output. For some very large outputs, the API may refuse to provide a result.
try {
    ExtremeSearchResponse result = apiInstance.flightInspirationSearch(apikey, origin, destination, departureDate, oneWay, duration, direct, maxPrice, aggregationMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#flightInspirationSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **origin** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city from which the traveler will depart. See the location and airport interfaces for more information. | [default to NYC]
 **destination** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city to which the traveler is going | [optional] [default to LAX]
 **departureDate** | **String**| Range of dates between which the traveler could depart. Dates are specified in the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; yyyy-MM-dd date format. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single date is specified, only that date will be searched. By default, the date range starts today and applies up to 361 in the future is applied. Past dates are generally not supported, future dates should be in the next 361 days, although results start to become sparse after about 6 months in the future, as airlines may still be defining their schedules. The default is to search all future dates available. | [optional] [default to 2017-08-16--2017-08-26]
 **oneWay** | **Boolean**| When set to true, the query will be for a single trip from the origin to the destination. When this parameter is not provided, or is set to false, the query is for a round trip from the origin to the destination and back again. | [optional] [default to false]
 **duration** | **String**| The allowed duration or range of durations of the trip, in days. This parameter must not be set if the one-way parameter is set to true. | [optional] [default to 1--15]
 **direct** | **Boolean**| Limit the search to results that do not require the passenger to change plane? | [optional] [default to false]
 **maxPrice** | **String**| Maximum price of trips to find in the result set, in the currency specified for this origin and destination pair in the cache contents spreadsheet. So, for example, if the origin is NYC, and the max price is 400, this means 400 USD. If the origin is PAR, and the max price is 400, this means 400 EUR. By default, no limit is applied | [optional]
 **aggregationMode** | **String**| Specifies the granularity of results to be found. DESTINATION is the default and finds one result per city. COUNTRY finds one result per country, DAY finds on result for every day in the date range, WEEK finds one result for every week in the date range. Note that specifying a small granularity but a large search scope may result in a huge output. For some very large outputs, the API may refuse to provide a result. | [optional]

### Return type

[**ExtremeSearchResponse**](ExtremeSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="flightLowFareSearch"></a>
# **flightLowFareSearch**
> LowFareSearchResponse flightLowFareSearch(apikey, origin, destination, departureDate, returnDate, arriveBy, returnBy, adults, children, infants, includeAirlines, excludeAirlines, nonstop, maxPrice, currency, travelClass, numberOfResults)

Flight Low-Fare Search - Find the cheapest one way or return itineraries and fares between two airports at specific dates.

&lt;p&gt;This is the low fare search engine Amadeus uses to retrieve the best price for flights, based on our latest Master Pricer Travel Board technology. This document describes how to make a low fare search and how to handle the returned messages.&lt;/p&gt;  &lt;p&gt;The message is composed of multiple results for given request. A result is defined by a unique combination of price, tax, passenger type, fare type, cabin, and availability for each requested segment.&lt;/p&gt;   &lt;p&gt;A result is then composed of single or multiple itineraries. Each itinerary is composed of an outbound leg, and, if a return date was specified, an inbound leg. Each leg is composed of a list of one or more flights, that the traveller will be required to take in order to get from the origin airport to the destination airport.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String origin = "BOS"; // String | City code from which the traveler will depart. See the location and airport interfaces for more information.
String destination = "LON"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city to which the traveler is going
String departureDate = "2017-08-25"; // String | The date on which the traveler will depart from the origin to go to the destination. You can specify a date range of up to 2 days. For a larger date range, use the Extensive Search. Dates are specified in the <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> yyyy-MM-dd date format and separated by --.
String returnDate = "2017-08-28"; // String | The date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, the search will find only one-way trips. If this, or the return_by parameter are specified, only return trips are found. You can specify a date range of up to 2 days.
String arriveBy = "2017-08-25T16:00"; // String | The datetime by which the outbound flight should arrive, based on local time at the destination airport.  Date-times are specified in the <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> yyyy-MM-ddTHH:mm date format
String returnBy = "2017-08-28T08:00"; // String | The time by which the inbound flight should arrive, based on local time at the airport specified as the origin parameter
Integer adults = 1; // Integer | The number of adult (age 12 and over) passengers traveling on this flight.
Integer children = 0; // Integer | The number of child (younger than age 12 on date of departure) passengers traveling on this flight who will each have their own separate seat
Integer infants = 0; // Integer | The number of infant (younger than age 2 on date of departure) passengers traveling on this flight. Infants travel in the lap of an adult passenger, and thus the number of infants must not exceed the number of adults.
List<String> includeAirlines = Arrays.asList("includeAirlines_example"); // List<String> | If specified, all results will include at least one flight where one or more of these airlines is the marketing carrier. This behaves as an OR function. Airlines are specified using <a href=\"https://en.wikipedia.org/wiki/Airline_codes\"><a href=\"https://en.wikipedia.org/wiki/Airline_codes\">IATA airline code</a>s</a>.
List<String> excludeAirlines = Arrays.asList("excludeAirlines_example"); // List<String> | If specified, no results will include any flights where any of these airlines is the marketing carrier. Airlines are specified using <a href=\"https://en.wikipedia.org/wiki/Airline_codes\"><a href=\"https://en.wikipedia.org/wiki/Airline_codes\">IATA airline code</a>s</a>.
Boolean nonstop = false; // Boolean | Setting this to true will find only flights that do not require the passenger to change from one flight to another
Integer maxPrice = 980; // Integer | Maximum price of trips to find in the result set, in USD (US dollars) unless some other currency code is specified. By default, no limit is applied
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> for the results
String travelClass = "ECONOMY"; // String | Searches for results where the majority of the itinerary flight time should be in a the specified cabin class or higher
Integer numberOfResults = 5; // Integer | The number of results to display. This will not be strictly interpreted but used as a guideline to display a useful number of results. By default, the number of results is dynamically determined. A maximum of 250 results will be displayed.
try {
    LowFareSearchResponse result = apiInstance.flightLowFareSearch(apikey, origin, destination, departureDate, returnDate, arriveBy, returnBy, adults, children, infants, includeAirlines, excludeAirlines, nonstop, maxPrice, currency, travelClass, numberOfResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#flightLowFareSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **origin** | **String**| City code from which the traveler will depart. See the location and airport interfaces for more information. | [default to BOS]
 **destination** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city to which the traveler is going | [default to LON]
 **departureDate** | **String**| The date on which the traveler will depart from the origin to go to the destination. You can specify a date range of up to 2 days. For a larger date range, use the Extensive Search. Dates are specified in the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; yyyy-MM-dd date format and separated by --. | [default to 2017-08-25]
 **returnDate** | **String**| The date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, the search will find only one-way trips. If this, or the return_by parameter are specified, only return trips are found. You can specify a date range of up to 2 days. | [optional] [default to 2017-08-28]
 **arriveBy** | **String**| The datetime by which the outbound flight should arrive, based on local time at the destination airport.  Date-times are specified in the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; yyyy-MM-ddTHH:mm date format | [optional] [default to 2017-08-25T16:00]
 **returnBy** | **String**| The time by which the inbound flight should arrive, based on local time at the airport specified as the origin parameter | [optional] [default to 2017-08-28T08:00]
 **adults** | **Integer**| The number of adult (age 12 and over) passengers traveling on this flight. | [optional] [default to 1]
 **children** | **Integer**| The number of child (younger than age 12 on date of departure) passengers traveling on this flight who will each have their own separate seat | [optional] [default to 0]
 **infants** | **Integer**| The number of infant (younger than age 2 on date of departure) passengers traveling on this flight. Infants travel in the lap of an adult passenger, and thus the number of infants must not exceed the number of adults. | [optional] [default to 0]
 **includeAirlines** | [**List&lt;String&gt;**](String.md)| If specified, all results will include at least one flight where one or more of these airlines is the marketing carrier. This behaves as an OR function. Airlines are specified using &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt;s&lt;/a&gt;. | [optional]
 **excludeAirlines** | [**List&lt;String&gt;**](String.md)| If specified, no results will include any flights where any of these airlines is the marketing carrier. Airlines are specified using &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt;s&lt;/a&gt;. | [optional]
 **nonstop** | **Boolean**| Setting this to true will find only flights that do not require the passenger to change from one flight to another | [optional] [default to false]
 **maxPrice** | **Integer**| Maximum price of trips to find in the result set, in USD (US dollars) unless some other currency code is specified. By default, no limit is applied | [optional] [default to 980]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; for the results | [optional] [default to USD]
 **travelClass** | **String**| Searches for results where the majority of the itinerary flight time should be in a the specified cabin class or higher | [optional] [default to ECONOMY]
 **numberOfResults** | **Integer**| The number of results to display. This will not be strictly interpreted but used as a guideline to display a useful number of results. By default, the number of results is dynamically determined. A maximum of 250 results will be displayed. | [optional] [default to 5]

### Return type

[**LowFareSearchResponse**](LowFareSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="flightTrafficAPI"></a>
# **flightTrafficAPI**
> List&lt;FlightTrafficSearchResult&gt; flightTrafficAPI(apikey, period, origin, destination, numberOfResultsPerPeriod)

Flight Traffic API - Find the true origin and destination traffic summary between two journey points over a specified period. This can help you answer questions like \&quot;What cities are people coming from to visit Los Angeles between January through April of 2015\&quot;

&lt;p&gt;The Flight Traffic API lets you find the origin and destination traffic summary between two journey points over a specified period.&lt;/p&gt; &lt;p&gt;The search returns number of flights &amp; travelers for each origin and destination, ordered by popularity, for each month specified within the search period. This search can help you answer questions like \&quot;Where are people from Los Angeles traveling to between January and April of 2015?\&quot; or \&quot;Which is the most popular month for New Yorkers to travel last year?\&quot;. &lt;/p&gt; &lt;p&gt;This search is based on Amadeus&#39; Travel Intelligence Engine, a high performance scalable cloud-based platform, born in the age of Big Data and purposely built for the industry bringing total flexibility and speed to business intelligence for travel. Please see &lt;a href&#x3D;\&quot;http://www.amadeus.com/travelintelligence\&quot;&gt;amadeus.com/travelintelligence&lt;/a&gt; for more information.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String period = "2014-09--2014-10"; // String | Range of periods for which flight traffic information is required. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single period is specified, only that period will be displayed. Only periods from 2011-01 up to previous month of the current year are valid. Future periods are not supported.
String origin = "BOS"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city from which the traveler will depart.
String destination = "LAX"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city to which the traveler is going.
Integer numberOfResultsPerPeriod = 5; // Integer | The maximum number of destinations to return for each period. Destinations are ordered by dates and number of travelers. The maximum number of destinations per period returned is 50
try {
    List<FlightTrafficSearchResult> result = apiInstance.flightTrafficAPI(apikey, period, origin, destination, numberOfResultsPerPeriod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#flightTrafficAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **period** | **String**| Range of periods for which flight traffic information is required. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single period is specified, only that period will be displayed. Only periods from 2011-01 up to previous month of the current year are valid. Future periods are not supported. | [default to 2014-09--2014-10]
 **origin** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city from which the traveler will depart. | [default to BOS]
 **destination** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city to which the traveler is going. | [optional] [default to LAX]
 **numberOfResultsPerPeriod** | **Integer**| The maximum number of destinations to return for each period. Destinations are ordered by dates and number of travelers. The maximum number of destinations per period returned is 50 | [optional] [default to 5]

### Return type

[**List&lt;FlightTrafficSearchResult&gt;**](FlightTrafficSearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotelAirportSearch"></a>
# **hotelAirportSearch**
> HotelSearchResponse hotelAirportSearch(apikey, location, checkIn, checkOut, radius, lang, currency, chain, maxRate, numberOfResults, allRooms, showSoldOut, amenity)

Hotel Airport Search - Locate the cheapest available rooms near a given airport, for a given stay period. This API is ideal if you want to connect flight and hotels. Provide an IATA airport code, as well as the check-in and check-out dates, and get a list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms.

&lt;p&gt;A fast Hotel shopping API to see which hotels are available in a given area, on a given day and displays their lowest prices. With this API you can find out the price of the cheapest daily rate for all hotels near a given airport.&lt;/p&gt;  &lt;p&gt;This API allows you to quickly see the locations of hotels near a given airport, and what prices in that area look like. Note that hotel images are not available to users outside of Amadeus, as we are not licensed to redistribute them. The API is based on our high-speed hotel pricing cache, which is also used to power the &lt;a href&#x3D;\&quot;https://hotelsearchengine.amadeus.com/\&quot;&gt;Amadeus Hotel Search Engine&lt;/a&gt; application. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String location = "BOS"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA airport code</a> for hotel availability is required requested.
String checkIn = "2017-08-15"; // String | Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
String checkOut = "2017-08-16"; // String | Date on which the guest will end their stay in the hotel.
Integer radius = 42; // Integer | Radius around the center to look for hotels in kilometers (km).
String lang = "EN"; // String | The preferred language of the content related to each hotel. Content will be returned in this language if available.
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> for the results
String chain = "6C"; // String | Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code.
BigDecimal maxRate = new BigDecimal(); // BigDecimal | The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates.
Integer numberOfResults = 20; // Integer | The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned.
Boolean allRooms = false; // Boolean | This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
Boolean showSoldOut = false; // Boolean | This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
List<String> amenity = Arrays.asList("amenity_example"); // List<String> | Hotel <a href=\"hotels-api-supported-amenities-filter\">amenities filter</a> to search narrow down hotels with certain amenities. For example&colon; amenity=POOL. (Note: multiple amenities can be used in searches: amenity=PARKING&amenity=RESTAURANT&amenity=PETS_ALLOWED). 
try {
    HotelSearchResponse result = apiInstance.hotelAirportSearch(apikey, location, checkIn, checkOut, radius, lang, currency, chain, maxRate, numberOfResults, allRooms, showSoldOut, amenity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#hotelAirportSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **location** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA airport code&lt;/a&gt; for hotel availability is required requested. | [default to BOS]
 **checkIn** | **String**| Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date. | [default to 2017-08-15]
 **checkOut** | **String**| Date on which the guest will end their stay in the hotel. | [default to 2017-08-16]
 **radius** | **Integer**| Radius around the center to look for hotels in kilometers (km). | [optional] [default to 42]
 **lang** | **String**| The preferred language of the content related to each hotel. Content will be returned in this language if available. | [optional] [default to EN]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; for the results | [optional] [default to USD]
 **chain** | **String**| Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code. | [optional] [default to 6C]
 **maxRate** | **BigDecimal**| The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates. | [optional] [default to 500]
 **numberOfResults** | **Integer**| The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned. | [optional] [default to 20]
 **allRooms** | **Boolean**| This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned. | [optional] [default to false]
 **showSoldOut** | **Boolean**| This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties) | [optional] [default to false]
 **amenity** | [**List&lt;String&gt;**](String.md)| Hotel &lt;a href&#x3D;\&quot;hotels-api-supported-amenities-filter\&quot;&gt;amenities filter&lt;/a&gt; to search narrow down hotels with certain amenities. For example&amp;colon; amenity&#x3D;POOL. (Note: multiple amenities can be used in searches: amenity&#x3D;PARKING&amp;amenity&#x3D;RESTAURANT&amp;amenity&#x3D;PETS_ALLOWED).  | [optional]

### Return type

[**HotelSearchResponse**](HotelSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotelGeosearchByBox"></a>
# **hotelGeosearchByBox**
> HotelSearchResponse hotelGeosearchByBox(apikey, southWestCorner, northEastCorner, checkIn, checkOut, lang, currency, chain, maxRate, numberOfResults, allRooms, showSoldOut, amenity)

Hotel Geosearch by box - Locate the cheapest available rooms within a given rectangular region for a given stay period. It&#39;s ideal for displaying results on a map.

&lt;p&gt;A fast Hotel shopping API to see which hotels are available in a given area, on a given day and displays their lowest prices. With this API you can find out the price of the cheapest daily rate for all hotels within a specified geographical region.&lt;/p&gt;  &lt;p&gt;This API allows you to quickly see the hotel locations in a region, and what prices in that area look like,  as well as the check-in and check-out dates, and get a list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms.&lt;/p&gt;              &lt;p&gt;The API is based on our high-speed hotel pricing cache, which is also used to power the &lt;a href&#x3D;\&quot;https://hotelsearchengine.amadeus.com/\&quot;&gt;Amadeus Hotel Search Engine&lt;/a&gt; application. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String southWestCorner = "38.8675,-77.1457"; // String | The coordinates of the south-west corner of the search box.
String northEastCorner = "38.9072,-77.0632"; // String | The coordinates of the north-east corner of the search box.
String checkIn = "2017-08-15"; // String | Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
String checkOut = "2017-08-16"; // String | Date on which the guest will end their stay in the hotel.
String lang = "EN"; // String | The preferred language of the content related to each hotel. Content will be returned in this language if available.
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> for the results
String chain = "6C"; // String | Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code.
BigDecimal maxRate = new BigDecimal(); // BigDecimal | The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates.
Integer numberOfResults = 20; // Integer | The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned.
Boolean allRooms = false; // Boolean | This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
Boolean showSoldOut = false; // Boolean | This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
List<String> amenity = Arrays.asList("amenity_example"); // List<String> | Hotel <a href=\"hotels-api-supported-amenities-filter\">amenities filter</a> to search narrow down hotels with certain amenities. For example&colon; amenity=POOL. (Note: multiple amenities can be used in searches: amenity=PARKING&amenity=RESTAURANT&amenity=PETS_ALLOWED). 
try {
    HotelSearchResponse result = apiInstance.hotelGeosearchByBox(apikey, southWestCorner, northEastCorner, checkIn, checkOut, lang, currency, chain, maxRate, numberOfResults, allRooms, showSoldOut, amenity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#hotelGeosearchByBox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **southWestCorner** | **String**| The coordinates of the south-west corner of the search box. | [default to 38.8675,-77.1457]
 **northEastCorner** | **String**| The coordinates of the north-east corner of the search box. | [default to 38.9072,-77.0632]
 **checkIn** | **String**| Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date. | [default to 2017-08-15]
 **checkOut** | **String**| Date on which the guest will end their stay in the hotel. | [default to 2017-08-16]
 **lang** | **String**| The preferred language of the content related to each hotel. Content will be returned in this language if available. | [optional] [default to EN]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; for the results | [optional] [default to USD]
 **chain** | **String**| Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code. | [optional] [default to 6C]
 **maxRate** | **BigDecimal**| The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates. | [optional] [default to 500]
 **numberOfResults** | **Integer**| The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned. | [optional] [default to 20]
 **allRooms** | **Boolean**| This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned. | [optional] [default to false]
 **showSoldOut** | **Boolean**| This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties) | [optional] [default to false]
 **amenity** | [**List&lt;String&gt;**](String.md)| Hotel &lt;a href&#x3D;\&quot;hotels-api-supported-amenities-filter\&quot;&gt;amenities filter&lt;/a&gt; to search narrow down hotels with certain amenities. For example&amp;colon; amenity&#x3D;POOL. (Note: multiple amenities can be used in searches: amenity&#x3D;PARKING&amp;amenity&#x3D;RESTAURANT&amp;amenity&#x3D;PETS_ALLOWED).  | [optional]

### Return type

[**HotelSearchResponse**](HotelSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotelGeosearchByCircle"></a>
# **hotelGeosearchByCircle**
> HotelSearchResponse hotelGeosearchByCircle(apikey, latitude, longitude, radius, checkIn, checkOut, lang, currency, chain, maxRate, numberOfResults, allRooms, showSoldOut, amenity)

Hotel Geosearch by Circle API - Locate the cheapest available rooms within a given radius of a defined point for a given stay period.

&lt;p&gt;A fast Hotel shopping API to see which hotels are available in a given area, on a given day and displays their lowest prices. With this API you can find out the price of the cheapest daily rate for all hotels within a specified radius of a point.&lt;/p&gt;  &lt;p&gt;This API allows you to quickly see the hotel locations in a region, and what prices in that area look like,  as well as the check-in and check-out dates, and get list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms. &lt;/p&gt;  &lt;p&gt;The API is based on our high-speed hotel pricing cache, which is also used to power the &lt;a href&#x3D;\&quot;https://hotelsearchengine.amadeus.com/\&quot;&gt;Amadeus Hotel Search Engine&lt;/a&gt; application. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
BigDecimal latitude = new BigDecimal(); // BigDecimal | Latitude of the center of the search.
BigDecimal longitude = new BigDecimal(); // BigDecimal | Longitude of the center of the search.
Integer radius = 42; // Integer | Radius around the center to look for hotels in kilometers (km).
String checkIn = "2017-08-15"; // String | Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
String checkOut = "2017-08-16"; // String | Date on which the guest will end their stay in the hotel.
String lang = "EN"; // String | The preferred language of the content related to each hotel. Content will be returned in this language if available.
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> for the results
String chain = "6C"; // String | Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code.
BigDecimal maxRate = new BigDecimal(); // BigDecimal | The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates.
Integer numberOfResults = 20; // Integer | The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned.
Boolean allRooms = false; // Boolean | This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
Boolean showSoldOut = false; // Boolean | This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
List<String> amenity = Arrays.asList("amenity_example"); // List<String> | Hotel <a href=\"hotels-api-supported-amenities-filter\">amenities filter</a> to search narrow down hotels with certain amenities. For example&colon; amenity=POOL. (Note: multiple amenities can be used in searches: amenity=PARKING&amenity=RESTAURANT&amenity=PETS_ALLOWED). 
try {
    HotelSearchResponse result = apiInstance.hotelGeosearchByCircle(apikey, latitude, longitude, radius, checkIn, checkOut, lang, currency, chain, maxRate, numberOfResults, allRooms, showSoldOut, amenity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#hotelGeosearchByCircle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **latitude** | **BigDecimal**| Latitude of the center of the search. | [default to 36.0857]
 **longitude** | **BigDecimal**| Longitude of the center of the search. | [default to -115.1541]
 **radius** | **Integer**| Radius around the center to look for hotels in kilometers (km). | [default to 42]
 **checkIn** | **String**| Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date. | [default to 2017-08-15]
 **checkOut** | **String**| Date on which the guest will end their stay in the hotel. | [default to 2017-08-16]
 **lang** | **String**| The preferred language of the content related to each hotel. Content will be returned in this language if available. | [optional] [default to EN]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; for the results | [optional] [default to USD]
 **chain** | **String**| Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code. | [optional] [default to 6C]
 **maxRate** | **BigDecimal**| The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates. | [optional] [default to 500]
 **numberOfResults** | **Integer**| The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned. | [optional] [default to 20]
 **allRooms** | **Boolean**| This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned. | [optional] [default to false]
 **showSoldOut** | **Boolean**| This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties) | [optional] [default to false]
 **amenity** | [**List&lt;String&gt;**](String.md)| Hotel &lt;a href&#x3D;\&quot;hotels-api-supported-amenities-filter\&quot;&gt;amenities filter&lt;/a&gt; to search narrow down hotels with certain amenities. For example&amp;colon; amenity&#x3D;POOL. (Note: multiple amenities can be used in searches: amenity&#x3D;PARKING&amp;amenity&#x3D;RESTAURANT&amp;amenity&#x3D;PETS_ALLOWED).  | [optional]

### Return type

[**HotelSearchResponse**](HotelSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotelPropertyCodeSearch"></a>
# **hotelPropertyCodeSearch**
> HotelPropertyResponse hotelPropertyCodeSearch(apikey, propertyCode, checkIn, checkOut, lang, currency, allRooms, showSoldOut)

Hotel Property Code Search - Find out more room and rate information once you have found your preferred hotel.

&lt;p&gt;This API allows you to quickly see the detailed information of a single hotel, including descriptions, address, GPS location, amenities, awards, lowest priced room and all room prices and booking information. &lt;/p&gt;  &lt;p&gt;This API gives you more information on a specific property. Optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms. &lt;/p&gt;  &lt;p&gt;The API is based on our high-speed hotel pricing cache, which is also used to power the &lt;a href&#x3D;\&quot;https://hotelsearchengine.amadeus.com/\&quot;&gt;Amadeus Hotel Search Engine&lt;/a&gt; application. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String propertyCode = "propertyCode_example"; // String | A Hotel property code based on 2 letter chain code + 3 letter <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city + 3 char property unique id.
String checkIn = "2017-08-14"; // String | Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
String checkOut = "2017-08-15"; // String | Date on which the guest will end their stay in the hotel.
String lang = "EN"; // String | The preferred language of the content related to each hotel. Content will be returned in this language if available.
String currency = "USD"; // String | The preferred <a href=\"https://en.wikipedia.org/wiki/ISO_4217\">currency</a> for the results
Boolean allRooms = true; // Boolean | This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
Boolean showSoldOut = false; // Boolean | This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
try {
    HotelPropertyResponse result = apiInstance.hotelPropertyCodeSearch(apikey, propertyCode, checkIn, checkOut, lang, currency, allRooms, showSoldOut);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#hotelPropertyCodeSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **propertyCode** | **String**| A Hotel property code based on 2 letter chain code + 3 letter &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city + 3 char property unique id. |
 **checkIn** | **String**| Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date. | [default to 2017-08-14]
 **checkOut** | **String**| Date on which the guest will end their stay in the hotel. | [default to 2017-08-15]
 **lang** | **String**| The preferred language of the content related to each hotel. Content will be returned in this language if available. | [optional] [default to EN]
 **currency** | **String**| The preferred &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;currency&lt;/a&gt; for the results | [optional] [default to USD]
 **allRooms** | **Boolean**| This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned. | [optional] [default to true]
 **showSoldOut** | **Boolean**| This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties) | [optional] [default to false]

### Return type

[**HotelPropertyResponse**](HotelPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationInformation"></a>
# **locationInformation**
> LocationResponse locationInformation(apikey, code)

Location Information - Find more information about any IATA city or airport location code. With this API, you can find information such as city and airport names and locations, as well as information on timezones and airport usage.

&lt;p&gt;This service retrieves the location information corresponding to a IATA city or airport code.&lt;/p&gt;  &lt;p&gt;When provided with an &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt;, the service determines whether this code could relate to a city code, an airport code or both. If the city could contain multiple airports, it will return all possible airports that correspond to that city code.&lt;/p&gt;  &lt;p&gt;This API is based on the Amadeus supported &lt;a href&#x3D;\&quot;http://opentraveldata.github.io/geobases\&quot;&gt;Geobases&lt;/a&gt; open-source project. If you wish to make your own database with all IATA location information, in order to get faster reponses, you can download the latest raw data from their &lt;a href&#x3D;\&quot;https://github.com/opentraveldata/opentraveldata/blob/master/opentraveldata/optd_por_public.csv\&quot;&gt;github page&lt;/a&gt;.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String code = "code_example"; // String | IATA location code for which further information is required
try {
    LocationResponse result = apiInstance.locationInformation(apikey, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **code** | **String**| IATA location code for which further information is required |

### Return type

[**LocationResponse**](LocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nearestRelevantAirport"></a>
# **nearestRelevantAirport**
> List&lt;NearestAirport&gt; nearestRelevantAirport(apikey, latitude, longitude)

Nearest Relevant Airport - Find the most useful nearby airport to a given location.

&lt;p&gt;This service gives the most relevant airports in a radius of 500 km around the given coordinates. The relevance of an airport is computed by dividing the number of airport movements (take offs and landings) by the distance from the point. This causes the relevance of an airport to increase exponentially as you approach it.&lt;/p&gt;  &lt;p&gt;To minimize response time, all distances are computed as a &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/Great-circle_distance\&quot;&gt;great-circle distance&lt;/a&gt; from the provided coordinates to the airport coordinates, and thus do not take into account traffic conditions, international boundaries, mountains, water, or other elements that might make the a nearby airport hard to reach.&lt;/p&gt;  &lt;p&gt;Only civilian airports with at least several commercial flights per week are included in the results.&lt;/p&gt;  &lt;p&gt;The result is a list of airports sorted by decreasing relevance. It always contains the nearest airport with significant commercial traffic. You can freely download the &lt;a href&#x3D;\&quot;https://github.com/opentraveldata/opentraveldata/blob/master/opentraveldata/optd_por_public.csv\&quot;&gt;point of reference information&lt;/a&gt; used by this API from the &lt;a href&#x3D;\&quot;https://github.com/opentraveldata/opentraveldata\&quot;&gt;Open Travel Data&lt;/a&gt; project.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String latitude = "46.6734"; // String | Latitude location to be at the center of your search circle.
String longitude = "-71.7412"; // String | Longitude location to be at the center of your search circle.
try {
    List<NearestAirport> result = apiInstance.nearestRelevantAirport(apikey, latitude, longitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nearestRelevantAirport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **latitude** | **String**| Latitude location to be at the center of your search circle. | [default to 46.6734]
 **longitude** | **String**| Longitude location to be at the center of your search circle. | [default to -71.7412]

### Return type

[**List&lt;NearestAirport&gt;**](NearestAirport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railStationAutocomplete"></a>
# **railStationAutocomplete**
> List&lt;RailStationAutocompleteResponse&gt; railStationAutocomplete(apikey, term)

Rail Station Autocomplete - Transform user input into a unique rail station code. Currently only French and Italian stations are supported.

&lt;p&gt;Given the start of any word in a rail station&#39;s official name, as a term, this API provides the full name and rail station ID of a rail station for use in searches. The response provides an array of up to 20 possible matches, sorted by passenger traffic, in a JQuery Autocomplete compatible format.&lt;/p&gt;  &lt;p&gt;The value returned is the UIC station code. The label returned is always in UTF-8 format, with the station&#39;s official name (which is often in the native language). Agglomeration station codes may also be returned.&lt;/p&gt;  &lt;p&gt;Note that only French and Italian rail stations are supported by the Rail Station Autocomplete API&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String term = "Mi"; // String | Search term that should represent some part of a station name. Not case sensitive, may be blank.
try {
    List<RailStationAutocompleteResponse> result = apiInstance.railStationAutocomplete(apikey, term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#railStationAutocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **term** | **String**| Search term that should represent some part of a station name. Not case sensitive, may be blank. | [default to Mi]

### Return type

[**List&lt;RailStationAutocompleteResponse&gt;**](RailStationAutocompleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railStationInformation"></a>
# **railStationInformation**
> RailStationResponse railStationInformation(apikey, id)

Rail-Station Information - Retrieve the rail station information corresponding to an Amadeus UIC rail station ID. Currently only French and Italian stations are supported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String id = "id_example"; // String | Station ID for which further information is required.
try {
    RailStationResponse result = apiInstance.railStationInformation(apikey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#railStationInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **id** | **String**| Station ID for which further information is required. |

### Return type

[**RailStationResponse**](RailStationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="topFlightDestinations"></a>
# **topFlightDestinations**
> TopDestinationsSearchResponse topFlightDestinations(apikey, period, origin, numberOfResults)

Top Flight Destinations - Find the most popular flight destinations from an origin during a period. This can help you answer questions like \&quot;Where are most people going to from Paris during the month of September?\&quot;

&lt;p&gt;The Top Flight Destinations API lets you find the most popular flight destinations from an origin during a period. This can help you answer questions like \&quot;Where are most people from Paris going to during the month of September?\&quot; The API is based on estimated flight traffic summary data from two journey points over a specific period. It returns up to 50 results, ordered by popularity, showing number of travelers as well as number of flights.&lt;/p&gt;  &lt;p&gt;This estimated search is based on Amadeus&#39; Travel Intelligence Engine, a high performance scalable cloud-based platform, born in the age of Big Data and purposely built for the industry bringing total flexibility and speed to business intelligence for travel. Please see &lt;a href&#x3D;\&quot;http://www.amadeus.com/travelintelligence\&quot;&gt;amadeus.com/travelintelligence&lt;/a&gt; for more information.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String period = "2016-09"; // String | Period, in month of the year (YYYY-MM), when consumers are traveling. Only periods from 2011-01 up to previous month of the current year are valid. Future dates are not supported.
String origin = "BOS"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city from which the traveler will depart.
Integer numberOfResults = 10; // Integer | The maximum number of destinations to return in the results set. Destinations are ordered by number of travelers. The maximum number of destinations returned is 50
try {
    TopDestinationsSearchResponse result = apiInstance.topFlightDestinations(apikey, period, origin, numberOfResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#topFlightDestinations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **period** | **String**| Period, in month of the year (YYYY-MM), when consumers are traveling. Only periods from 2011-01 up to previous month of the current year are valid. Future dates are not supported. | [default to 2016-09]
 **origin** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city from which the traveler will depart. | [default to BOS]
 **numberOfResults** | **Integer**| The maximum number of destinations to return in the results set. Destinations are ordered by number of travelers. The maximum number of destinations returned is 50 | [optional] [default to 10]

### Return type

[**TopDestinationsSearchResponse**](TopDestinationsSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="topFlightSearches"></a>
# **topFlightSearches**
> TopSearchesSearchResponse topFlightSearches(apikey, period, origin, country, destination, numberOfResults)

Top Flight Searches - Find the most popular flight searches from an origin in a during given search period. This can help you answer questions like \&quot;Where are people looking to travel from Paris during the month of September?\&quot;

&lt;p&gt;The Top Flight Search allows you to find number of estimated searches from an origin, optionally a destination, within a time period when travelers are performing the searches.&lt;/p&gt;  &lt;p&gt;The search is based on queries performed from within a country (also refers to as market) and returns up to 50 results, ordered by popularity, showing number of searches for most searched destination with its previous year comparison. This search also shows patterns on how travelers are searching for flights, revealing where, when and for how long they’re planning to travel. See &lt;ul&gt;&lt;li&gt;Trip Durations(How long are the trips planned for?) and&lt;/li&gt; &lt;li&gt; Advance Search Period (How long before departures do travelers start searching for their trips?)&lt;/li&gt; &lt;/ul&gt;&lt;/p&gt; &lt;p&gt;This estimated search is based on Amadeus&#39; Travel Intelligence Engine, a high performance scalable cloud-based platform, born in the age of Big Data and purposely built for the industry bringing total flexibility and speed to business intelligence for travel. Please see &lt;a href&#x3D;\&quot;http://www.amadeus.com/travelintelligence\&quot;&gt;amadeus.com/travelintelligence&lt;/a&gt; for more information.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String period = "2016-09"; // String | Period of date (month or year) when consumers are searching to travel. Use YYYY-MM for month or YYYY for year. Only periods from year 2011-01 up to current year, previous month are valid. Future dates are not supported.
String origin = "BOS"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city from which the traveler will depart.
String country = "US"; // String | 2-letter IATA country code of the country where the search queries originates from.
String destination = "LON"; // String | <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city to which the traveler is going
Integer numberOfResults = 10; // Integer | The maximum number of destinations to return in the results set. Destinations are ordered by number of searches. The maximum number of destinations returned is 50
try {
    TopSearchesSearchResponse result = apiInstance.topFlightSearches(apikey, period, origin, country, destination, numberOfResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#topFlightSearches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **period** | **String**| Period of date (month or year) when consumers are searching to travel. Use YYYY-MM for month or YYYY for year. Only periods from year 2011-01 up to current year, previous month are valid. Future dates are not supported. | [default to 2016-09]
 **origin** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city from which the traveler will depart. | [default to BOS]
 **country** | **String**| 2-letter IATA country code of the country where the search queries originates from. | [default to US]
 **destination** | **String**| &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city to which the traveler is going | [optional] [default to LON]
 **numberOfResults** | **Integer**| The maximum number of destinations to return in the results set. Destinations are ordered by number of searches. The maximum number of destinations returned is 50 | [optional] [default to 10]

### Return type

[**TopSearchesSearchResponse**](TopSearchesSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trainExtensiveSearch"></a>
# **trainExtensiveSearch**
> ExtensiveTrainSearchResponse trainExtensiveSearch(apikey, origin, destination, departureDate)

Train Extensive Search - Provides multi-day availability and a variety of schedule and pricing options to travel to your destination instantly. Supports SNCF French trains only.

&lt;p&gt;This API allows you to search trains availability and prices for a single day or date range. It&#39;s based on our Rail Instant Search technology, providing you with immediate results from our rail search cache.&lt;/p&gt;  &lt;p&gt;This API has content from SNCF (French trains).&lt;/p&gt;              &lt;p&gt;The content is also restricted to single-leg trips - where a single train takes you directly from the origin to the destination.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String origin = "7171801"; // String | Identifier of the rail station from which you would like to depart.
String destination = "8768600"; // String | Identifier of the rail station to which you would like to travel.
String departureDate = "2017-04-25"; // String | The date or range of dates on which you would like to depart from the origin station to go to the destination.
try {
    ExtensiveTrainSearchResponse result = apiInstance.trainExtensiveSearch(apikey, origin, destination, departureDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#trainExtensiveSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **origin** | **String**| Identifier of the rail station from which you would like to depart. | [default to 7171801]
 **destination** | **String**| Identifier of the rail station to which you would like to travel. | [default to 8768600]
 **departureDate** | **String**| The date or range of dates on which you would like to depart from the origin station to go to the destination. | [default to 2017-04-25]

### Return type

[**ExtensiveTrainSearchResponse**](ExtensiveTrainSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trainScheduleSearch"></a>
# **trainScheduleSearch**
> TrainScheduleSearchResponse trainScheduleSearch(apikey, origin, departureDate)

Train Schedule Search - Suggest destinations from your chosen departure station. Supports SNCF French Rail only.

&lt;p&gt;This API allows you to find all the possible destinations in the Rail Instant Search cache (used by Extensive Search above) from a given origin station on a given day. You can use this to help build network maps, journey planners or provide inspiration for rail travel.&lt;/p&gt;  &lt;p&gt;This API has continuous content from &lt;a href&#x3D;\&quot;http://www.sncf.com/\&quot;&gt;SNCF&lt;/a&gt;.&lt;br /&gt; All the options returned are single-leg trips - where a single train takes you directly from the origin to the destination. In general, only departure dates up to 90 days in the future are supported&lt;/p&gt;  &lt;p&gt;Currently agglomeration stations are not supported&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String origin = "7171801"; // String | Identifier of the rail station where you would like to depart from.
LocalDate departureDate = new LocalDate(); // LocalDate | The date on which you would like to depart from the origin station to go to the destination.
try {
    TrainScheduleSearchResponse result = apiInstance.trainScheduleSearch(apikey, origin, departureDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#trainScheduleSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **origin** | **String**| Identifier of the rail station where you would like to depart from. | [default to 7171801]
 **departureDate** | **LocalDate**| The date on which you would like to depart from the origin station to go to the destination. | [default to 2017-04-25]

### Return type

[**TrainScheduleSearchResponse**](TrainScheduleSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="travelRecordRetrieve"></a>
# **travelRecordRetrieve**
> TravelRecordResponse travelRecordRetrieve(apikey, recordLocator, lastName, env)

Travel Record Retrieve - Enable travelers to explore the details of their journeys stored in the Amadeus system using our Retrieve Travel Record API.

&lt;p&gt;Note: This API requires the use of HTTPS&lt;/p&gt;  &lt;p&gt;This service retrieves a travel record (also sometimes referred to as a PNR) for a given journey when provided with Record Locator to identify a travel record, along with the last name of any traveler who is marked as a passenger on this record.&lt;/p&gt;  &lt;p&gt;The API provides detailed information on a given record, including any air, car, hotel or rail reservations, as well as passenger details, and contact frequent traveler information for each passenger when available. You can use this to provide a wide variety of pre-trip or in-trip services.&lt;/p&gt;  &lt;p&gt;Note that this API transmits sensitive personal data about a traveler&#39;s journey. We work hard to ensure that we comply with all the legal requirements this entails, and as an application owner, you need to do so too - we don&#39;t want you to get in trouble! This paragraph, or anything else in our documentation, does not constitute legal advice, it&#39;s just to give you an idea of some of the potential issues that you may encounter. Please check your legal obligations regarding the use of this data before implementing this API&lt;/p&gt;  &lt;p&gt;In most countries, the data in the returned travel record is considered to be the property of the traveler. In order to ensure that you are acting on behalf of the traveler, we require you to provide the traveler&#39;s last name in addition to the record locator when you make a call to this API. You should ensure that you have consent from the traveler before retrieving this record, in some countries this is a legal requirement - please respect this appropriately.&lt;/p&gt;  &lt;p&gt;Our data center is based in Europe, so there is a legal requirement that you to access this API over a secure connection. If you plan to store the information returned by this API, ensure you comply with storage requirements for European data, in addition to those of your local country. For example, there are strict requirements on the caching of retrieved travel records, so please ensure the cache control HTTP headers in the response are respected.&lt;/p&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String recordLocator = "recordLocator_example"; // String | The Amadeus identifier of the given travel record. Usually printed at the top of an itinerary or boarding pass.
String lastName = "LOPEZ"; // String | The last name of any traveler in this record, as written on their identification used for travel. This is required to ensure that applications retrieving the record are acting on behalf of the customer.
String env = "TEST"; // String | Indicates the Amadeus system from which this record should be retrieved.
try {
    TravelRecordResponse result = apiInstance.travelRecordRetrieve(apikey, recordLocator, lastName, env);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#travelRecordRetrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **recordLocator** | **String**| The Amadeus identifier of the given travel record. Usually printed at the top of an itinerary or boarding pass. |
 **lastName** | **String**| The last name of any traveler in this record, as written on their identification used for travel. This is required to ensure that applications retrieving the record are acting on behalf of the customer. | [default to LOPEZ]
 **env** | **String**| Indicates the Amadeus system from which this record should be retrieved. | [optional] [default to TEST]

### Return type

[**TravelRecordResponse**](TravelRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="yapQCityNameSearch"></a>
# **yapQCityNameSearch**
> PointsOfInterestResponse yapQCityNameSearch(apikey, cityName, lang, category, geonames, vibes, socialMedia, imageSize, numberOfImages, numberOfResults)

YapQ City Name Search - Find landmarks and attractions in a given city.

Amadeus has partnered with &lt;a href&#x3D;\&quot;http://yapq.io/\&quot;&gt;YapQ&lt;/a&gt; to bring you point of interest APIs with the goal of offering you unbiased ratings of landmarks and tourist attractions. YapQ rates these points according to their interest on social media and provides Wikipedia content and Geonames ID in a given city. &lt;br /&gt; YapQ&#39;s service indexes millions of points around the world, and provides content in 12 different languages. This allows you to ensure you catch the &lt;em&gt;must-see&lt;/em&gt; sights in a &lt;a href&#x3D;\&quot;http://yapq.io/cities.html\&quot;&gt;YapQ supported city&lt;/a&gt;.&lt;br /&gt; Each point of interest comes with links to content, grading information, location and directions to help make discovering your destination easy and fun.&lt;br /&gt;&lt;br /&gt; This service is still under active development, and the response format may change without warning. We&#39;d be interested in your feedback - &lt;a href&#x3D;\&quot;mailto:sandbox@yapq.com\&quot;&gt;send us an email&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
String cityName = "Tel Aviv"; // String | The name of the <a href=\"http://yapq.io/cities.txt\">supported city</a> for which you are searching, in the selected language.
String lang = "EN"; // String | The preferred language of the content related to each point of interest. Content will be returned in this language if available
String category = "Museum"; // String | Filters the resulting points_of_interest to include only results which have a least one category containing the given provided word. Good examples are <em>museum</em>, <em>landmark</em> or <em>church</em>
Boolean geonames = false; // Boolean | Setting this to true includes only points of interest with a geonames ID
Boolean vibes = false; // Boolean | Includes content that doesn't correspond to an active physical place, but which gives the user some background information, or <em>vibe</em> for the place they are visiting. An example of this may be information on an influential demolished building that used to exist at a certain location, or more information on a district of the city
Boolean socialMedia = false; // Boolean | Enabling this includes images from Instagram in the output results. This is disabled by default, since these images are often just pictures of people or food, which often have little relevance to the actual location
String imageSize = "MEDIUM"; // String | The size of the images you'd like to see in the response
Integer numberOfImages = 4; // Integer | Number of images to display
Integer numberOfResults = 20; // Integer | The maximum number of points of interest to return in the results set. This is a range from 1 to 100
try {
    PointsOfInterestResponse result = apiInstance.yapQCityNameSearch(apikey, cityName, lang, category, geonames, vibes, socialMedia, imageSize, numberOfImages, numberOfResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#yapQCityNameSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **cityName** | **String**| The name of the &lt;a href&#x3D;\&quot;http://yapq.io/cities.txt\&quot;&gt;supported city&lt;/a&gt; for which you are searching, in the selected language. | [default to Tel Aviv]
 **lang** | **String**| The preferred language of the content related to each point of interest. Content will be returned in this language if available | [optional] [default to EN] [enum: DE, EN, ES, FR, HE, IT, JA, KO, NL, PL, RU, ZH]
 **category** | **String**| Filters the resulting points_of_interest to include only results which have a least one category containing the given provided word. Good examples are &lt;em&gt;museum&lt;/em&gt;, &lt;em&gt;landmark&lt;/em&gt; or &lt;em&gt;church&lt;/em&gt; | [optional] [default to Museum]
 **geonames** | **Boolean**| Setting this to true includes only points of interest with a geonames ID | [optional] [default to false]
 **vibes** | **Boolean**| Includes content that doesn&#39;t correspond to an active physical place, but which gives the user some background information, or &lt;em&gt;vibe&lt;/em&gt; for the place they are visiting. An example of this may be information on an influential demolished building that used to exist at a certain location, or more information on a district of the city | [optional] [default to false]
 **socialMedia** | **Boolean**| Enabling this includes images from Instagram in the output results. This is disabled by default, since these images are often just pictures of people or food, which often have little relevance to the actual location | [optional] [default to false]
 **imageSize** | **String**| The size of the images you&#39;d like to see in the response | [optional] [default to MEDIUM] [enum: SMALL, MEDIUM, LARGE, HD]
 **numberOfImages** | **Integer**| Number of images to display | [optional] [default to 4]
 **numberOfResults** | **Integer**| The maximum number of points of interest to return in the results set. This is a range from 1 to 100 | [optional] [default to 20]

### Return type

[**PointsOfInterestResponse**](PointsOfInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="yapQGeosearch"></a>
# **yapQGeosearch**
> PointsOfInterestResponse yapQGeosearch(apikey, latitude, longitude, radius, lang, category, geonames, vibes, socialMedia, imageSize, numberOfImages, numberOfResults)

YapQ Geosearch - Find landmarks and attractions near a given point.

Amadeus has partnered with &lt;a href&#x3D;\&quot;http://yapq.io/\&quot;&gt;YapQ&lt;/a&gt; to bring you point of interest APIs with the goal of offering you unbiased ratings of landmarks and tourist attractions. YapQ rates places according to their interest on social media and provides Wikipedia content and Geonames ID at a given location. &lt;br /&gt; YapQ&#39;s service indexes millions of points around the world, and provides content in 12 different languages. This allows you to ensure you catch the &lt;em&gt;must-see&lt;/em&gt; sights at a specific &lt;a href&#x3D;\&quot;http://yapq.io/cities.html\&quot;&gt;YapQ supported location&lt;/a&gt;.&lt;br /&gt; Each point of interest comes with links to content, grading information, location and directions to help make discovering your destination easy and fun.&lt;br /&gt;&lt;br /&gt; This service is still under active development, and the response format may change without warning. We&#39;d be interested in your feedback - &lt;a href&#x3D;\&quot;mailto:sandbox@yapq.com\&quot;&gt;send us an email&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | API Key provided for your account, to identify you for API access. Make sure to keep this API key secret.
BigDecimal latitude = new BigDecimal(); // BigDecimal | Latitude of the center of the search, in decimal degrees
BigDecimal longitude = new BigDecimal(); // BigDecimal | Longitude of the center of the search, in decimal degrees
Integer radius = 42; // Integer | Radius around the center to look for points-of-interest around the given latitude and longitude in kilometers (km)
String lang = "EN"; // String | The preferred language of the content related to each point of interest. Content will be returned in this language if available
String category = "Museum"; // String | Filters the resulting points_of_interest to include only results which have a least one category containing the given provided word. Good examples are <em>museum</em>, <em>landmark</em> or <em>church</em>
Boolean geonames = false; // Boolean | Setting this to true includes only points of interest with a geonames ID
Boolean vibes = false; // Boolean | Includes content that doesn't correspond to an active physical place, but which gives the user some background information, or <em>vibe</em> for the place they are visiting. An example of this may be information on an influential demolished building that used to exist at a certain location, or more information on a district of the city
Boolean socialMedia = false; // Boolean | Enabling this includes images from Instagram in the output results. This is disabled by default, since these images are often just pictures of people or food, which often have little relevance to the actual location
String imageSize = "MEDIUM"; // String | The size of the images you'd like to see in the response
Integer numberOfImages = 4; // Integer | Number of images to display.
Integer numberOfResults = 20; // Integer | The maximum number of points of interest to return in the results set. This is a range from 1 to 100
try {
    PointsOfInterestResponse result = apiInstance.yapQGeosearch(apikey, latitude, longitude, radius, lang, category, geonames, vibes, socialMedia, imageSize, numberOfImages, numberOfResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#yapQGeosearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| API Key provided for your account, to identify you for API access. Make sure to keep this API key secret. |
 **latitude** | **BigDecimal**| Latitude of the center of the search, in decimal degrees | [default to 35.1504]
 **longitude** | **BigDecimal**| Longitude of the center of the search, in decimal degrees | [default to -114.57632]
 **radius** | **Integer**| Radius around the center to look for points-of-interest around the given latitude and longitude in kilometers (km) | [default to 42]
 **lang** | **String**| The preferred language of the content related to each point of interest. Content will be returned in this language if available | [optional] [default to EN] [enum: DE, EN, ES, FR, HE, IT, JA, KO, NL, PL, RU, ZH]
 **category** | **String**| Filters the resulting points_of_interest to include only results which have a least one category containing the given provided word. Good examples are &lt;em&gt;museum&lt;/em&gt;, &lt;em&gt;landmark&lt;/em&gt; or &lt;em&gt;church&lt;/em&gt; | [optional] [default to Museum]
 **geonames** | **Boolean**| Setting this to true includes only points of interest with a geonames ID | [optional] [default to false]
 **vibes** | **Boolean**| Includes content that doesn&#39;t correspond to an active physical place, but which gives the user some background information, or &lt;em&gt;vibe&lt;/em&gt; for the place they are visiting. An example of this may be information on an influential demolished building that used to exist at a certain location, or more information on a district of the city | [optional] [default to false]
 **socialMedia** | **Boolean**| Enabling this includes images from Instagram in the output results. This is disabled by default, since these images are often just pictures of people or food, which often have little relevance to the actual location | [optional] [default to false]
 **imageSize** | **String**| The size of the images you&#39;d like to see in the response | [optional] [default to MEDIUM] [enum: SMALL, MEDIUM, LARGE, HD]
 **numberOfImages** | **Integer**| Number of images to display. | [optional] [default to 4]
 **numberOfResults** | **Integer**| The maximum number of points of interest to return in the results set. This is a range from 1 to 100 | [optional] [default to 20]

### Return type

[**PointsOfInterestResponse**](PointsOfInterestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

