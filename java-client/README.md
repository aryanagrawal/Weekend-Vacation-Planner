# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

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

```

## Documentation for API Endpoints

All URIs are relative to *https://api.sandbox.amadeus.com/v1.2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**airportAutocomplete**](docs/DefaultApi.md#airportAutocomplete) | **GET** /airports/autocomplete | Airport Autocomplete - Find an IATA location code for flight search based on a city or airport name using the term parameter. By only using the country parameter, this API is also able to find all the IATA location codes associated with a country. Both term and country parameters can be used together to filter the results accordingly. The API is fully JQuery-Autocomplete compatible to enable you to quickly build a drop-down list for your users to find the right airport easily.
*DefaultApi* | [**carRentalAirportSearch**](docs/DefaultApi.md#carRentalAirportSearch) | **GET** /cars/search-airport | Car Rental Airport Search - Find car rental providers and rates when you provide an airport code, as well as the pick-up and drop-off dates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.
*DefaultApi* | [**carRentalGeosearch**](docs/DefaultApi.md#carRentalGeosearch) | **GET** /cars/search-circle | Car Rental Geosearch - Locate car rental providers and available vehicles when you define a circular area with one coordinate and radius, as well as the pick-up and drop-off dates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.
*DefaultApi* | [**flightAffiliateSearch**](docs/DefaultApi.md#flightAffiliateSearch) | **GET** /flights/affiliate-search | Flight Affiliate Search - Use Travel Audience Connect&#39;s affiliate network API to search flights from our list of partners and provides deep-links to allow the user to book directly on the airline website.
*DefaultApi* | [**flightExtensiveSearch**](docs/DefaultApi.md#flightExtensiveSearch) | **GET** /flights/extensive-search | Flight Extensive Search - Build travel searches based on very flexible and open range of dates. You can use it to answer questions such as \&quot;When is the best date to fly...\&quot;.  It&#39;s built on Amadeus&#39; Featured Results technology, which returns thousands of results (prices, itineraries and dates) in a matter of milliseconds. Results are available over half a calendar year with a 1 to 15 day stay duration
*DefaultApi* | [**flightInspirationSearch**](docs/DefaultApi.md#flightInspirationSearch) | **GET** /flights/inspiration-search | Flight Inspiration Search - Go beyond the traditional search by origin, destination and dates to meet the needs of travelers looking for suggestions and a search experience that reflects the way they choose their trip. This can help you answer the question \&quot;Where can I go within a given travel budget?\&quot;
*DefaultApi* | [**flightLowFareSearch**](docs/DefaultApi.md#flightLowFareSearch) | **GET** /flights/low-fare-search | Flight Low-Fare Search - Find the cheapest one way or return itineraries and fares between two airports at specific dates.
*DefaultApi* | [**flightTrafficAPI**](docs/DefaultApi.md#flightTrafficAPI) | **GET** /travel-intelligence/flight-traffic | Flight Traffic API - Find the true origin and destination traffic summary between two journey points over a specified period. This can help you answer questions like \&quot;What cities are people coming from to visit Los Angeles between January through April of 2015\&quot;
*DefaultApi* | [**hotelAirportSearch**](docs/DefaultApi.md#hotelAirportSearch) | **GET** /hotels/search-airport | Hotel Airport Search - Locate the cheapest available rooms near a given airport, for a given stay period. This API is ideal if you want to connect flight and hotels. Provide an IATA airport code, as well as the check-in and check-out dates, and get a list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms.
*DefaultApi* | [**hotelGeosearchByBox**](docs/DefaultApi.md#hotelGeosearchByBox) | **GET** /hotels/search-box | Hotel Geosearch by box - Locate the cheapest available rooms within a given rectangular region for a given stay period. It&#39;s ideal for displaying results on a map.
*DefaultApi* | [**hotelGeosearchByCircle**](docs/DefaultApi.md#hotelGeosearchByCircle) | **GET** /hotels/search-circle | Hotel Geosearch by Circle API - Locate the cheapest available rooms within a given radius of a defined point for a given stay period.
*DefaultApi* | [**hotelPropertyCodeSearch**](docs/DefaultApi.md#hotelPropertyCodeSearch) | **GET** /hotels/{property_code} | Hotel Property Code Search - Find out more room and rate information once you have found your preferred hotel.
*DefaultApi* | [**locationInformation**](docs/DefaultApi.md#locationInformation) | **GET** /location/{code} | Location Information - Find more information about any IATA city or airport location code. With this API, you can find information such as city and airport names and locations, as well as information on timezones and airport usage.
*DefaultApi* | [**nearestRelevantAirport**](docs/DefaultApi.md#nearestRelevantAirport) | **GET** /airports/nearest-relevant | Nearest Relevant Airport - Find the most useful nearby airport to a given location.
*DefaultApi* | [**railStationAutocomplete**](docs/DefaultApi.md#railStationAutocomplete) | **GET** /rail-stations/autocomplete | Rail Station Autocomplete - Transform user input into a unique rail station code. Currently only French and Italian stations are supported.
*DefaultApi* | [**railStationInformation**](docs/DefaultApi.md#railStationInformation) | **GET** /rail-station/{id} | Rail-Station Information - Retrieve the rail station information corresponding to an Amadeus UIC rail station ID. Currently only French and Italian stations are supported.
*DefaultApi* | [**topFlightDestinations**](docs/DefaultApi.md#topFlightDestinations) | **GET** /travel-intelligence/top-destinations | Top Flight Destinations - Find the most popular flight destinations from an origin during a period. This can help you answer questions like \&quot;Where are most people going to from Paris during the month of September?\&quot;
*DefaultApi* | [**topFlightSearches**](docs/DefaultApi.md#topFlightSearches) | **GET** /travel-intelligence/top-searches | Top Flight Searches - Find the most popular flight searches from an origin in a during given search period. This can help you answer questions like \&quot;Where are people looking to travel from Paris during the month of September?\&quot;
*DefaultApi* | [**trainExtensiveSearch**](docs/DefaultApi.md#trainExtensiveSearch) | **GET** /trains/extensive-search | Train Extensive Search - Provides multi-day availability and a variety of schedule and pricing options to travel to your destination instantly. Supports SNCF French trains only.
*DefaultApi* | [**trainScheduleSearch**](docs/DefaultApi.md#trainScheduleSearch) | **GET** /trains/schedule-search | Train Schedule Search - Suggest destinations from your chosen departure station. Supports SNCF French Rail only.
*DefaultApi* | [**travelRecordRetrieve**](docs/DefaultApi.md#travelRecordRetrieve) | **GET** /travel-record/{record_locator} | Travel Record Retrieve - Enable travelers to explore the details of their journeys stored in the Amadeus system using our Retrieve Travel Record API.
*DefaultApi* | [**yapQCityNameSearch**](docs/DefaultApi.md#yapQCityNameSearch) | **GET** /points-of-interest/yapq-search-text | YapQ City Name Search - Find landmarks and attractions in a given city.
*DefaultApi* | [**yapQGeosearch**](docs/DefaultApi.md#yapQGeosearch) | **GET** /points-of-interest/yapq-search-circle | YapQ Geosearch - Find landmarks and attractions near a given point.


## Documentation for Models

 - [Address](docs/Address.md)
 - [AffiliateFlightSearchPrice](docs/AffiliateFlightSearchPrice.md)
 - [AffiliatePayout](docs/AffiliatePayout.md)
 - [AffiliateSearchMeta](docs/AffiliateSearchMeta.md)
 - [AffiliateSearchResponse](docs/AffiliateSearchResponse.md)
 - [AffiliateSearchResult](docs/AffiliateSearchResult.md)
 - [Airport](docs/Airport.md)
 - [AirportAutocompleteResponse](docs/AirportAutocompleteResponse.md)
 - [AirportInformation](docs/AirportInformation.md)
 - [Amenity](docs/Amenity.md)
 - [Amount](docs/Amount.md)
 - [Award](docs/Award.md)
 - [CarReservation](docs/CarReservation.md)
 - [CarReservationBookingInfo](docs/CarReservationBookingInfo.md)
 - [CarSearchResponse](docs/CarSearchResponse.md)
 - [CarSearchResult](docs/CarSearchResult.md)
 - [CarrierInfo](docs/CarrierInfo.md)
 - [CarrierMeta](docs/CarrierMeta.md)
 - [CityInformation](docs/CityInformation.md)
 - [Company](docs/Company.md)
 - [Contact](docs/Contact.md)
 - [Error](docs/Error.md)
 - [ExtensiveTrainSearchResponse](docs/ExtensiveTrainSearchResponse.md)
 - [ExtensiveTrainSearchResult](docs/ExtensiveTrainSearchResult.md)
 - [ExtremeSearchResponse](docs/ExtremeSearchResponse.md)
 - [ExtremeSearchResult](docs/ExtremeSearchResult.md)
 - [Fare](docs/Fare.md)
 - [FareRestrictions](docs/FareRestrictions.md)
 - [Fees](docs/Fees.md)
 - [FlightReservationBookingInfo](docs/FlightReservationBookingInfo.md)
 - [FlightReservationBound](docs/FlightReservationBound.md)
 - [FlightReservationSegment](docs/FlightReservationSegment.md)
 - [FlightSearchBookingInfo](docs/FlightSearchBookingInfo.md)
 - [FlightSearchBound](docs/FlightSearchBound.md)
 - [FlightSearchItinerary](docs/FlightSearchItinerary.md)
 - [FlightSearchPrice](docs/FlightSearchPrice.md)
 - [FlightSearchSegment](docs/FlightSearchSegment.md)
 - [FlightTicket](docs/FlightTicket.md)
 - [FlightTrafficSearchResult](docs/FlightTrafficSearchResult.md)
 - [FrequentTravelerCard](docs/FrequentTravelerCard.md)
 - [Geolocation](docs/Geolocation.md)
 - [HotelPropertyResponse](docs/HotelPropertyResponse.md)
 - [HotelReservation](docs/HotelReservation.md)
 - [HotelReservationBookingInfo](docs/HotelReservationBookingInfo.md)
 - [HotelRoom](docs/HotelRoom.md)
 - [HotelSearchResponse](docs/HotelSearchResponse.md)
 - [Image](docs/Image.md)
 - [ImageSize](docs/ImageSize.md)
 - [Infant](docs/Infant.md)
 - [Link](docs/Link.md)
 - [LocationResponse](docs/LocationResponse.md)
 - [Logos](docs/Logos.md)
 - [LowFareSearchResponse](docs/LowFareSearchResponse.md)
 - [LowFareSearchResult](docs/LowFareSearchResult.md)
 - [Message](docs/Message.md)
 - [NearestAirport](docs/NearestAirport.md)
 - [OtherReservation](docs/OtherReservation.md)
 - [OtherReservationBookingInfo](docs/OtherReservationBookingInfo.md)
 - [PeriodRate](docs/PeriodRate.md)
 - [PointOfInterestCity](docs/PointOfInterestCity.md)
 - [PointOfInterestDetails](docs/PointOfInterestDetails.md)
 - [PointOfInterestResult](docs/PointOfInterestResult.md)
 - [PointOfInterestResultGrades](docs/PointOfInterestResultGrades.md)
 - [PointsOfInterestResponse](docs/PointsOfInterestResponse.md)
 - [RailService](docs/RailService.md)
 - [RailStationAutocompleteResponse](docs/RailStationAutocompleteResponse.md)
 - [RailStationResponse](docs/RailStationResponse.md)
 - [Rate](docs/Rate.md)
 - [Reservation](docs/Reservation.md)
 - [RestrictedRate](docs/RestrictedRate.md)
 - [RoomInfo](docs/RoomInfo.md)
 - [Station](docs/Station.md)
 - [TopDestinationsSearchResponse](docs/TopDestinationsSearchResponse.md)
 - [TopDestinationsSearchResult](docs/TopDestinationsSearchResult.md)
 - [TopSearchesSearchResponse](docs/TopSearchesSearchResponse.md)
 - [TopSearchesSearchResult](docs/TopSearchesSearchResult.md)
 - [TrainScheduleSearchResponse](docs/TrainScheduleSearchResponse.md)
 - [TrainScheduleSearchResult](docs/TrainScheduleSearchResult.md)
 - [TrainSearchItinerary](docs/TrainSearchItinerary.md)
 - [TrainSearchPricing](docs/TrainSearchPricing.md)
 - [TrainSearchSegment](docs/TrainSearchSegment.md)
 - [TravelRecordHeader](docs/TravelRecordHeader.md)
 - [TravelRecordResponse](docs/TravelRecordResponse.md)
 - [Traveler](docs/Traveler.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleInfo](docs/VehicleInfo.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



