
# FlightReservationSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Uniquely identifies this flight in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record. | 
**departsAt** | **String** | Date and time of departure at the origin, in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt;  date format yyyy-MM-ddTHH:mm in the local time at the origin airport | 
**arrivesAt** | **String** | Date and time of departure at the destination, in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt;  date format yyyy-MM-ddTHH:mm in the local time at the destination airport | 
**origin** | [**Airport**](Airport.md) | Information on the origin airport, from which this flight departs | 
**destination** | [**Airport**](Airport.md) | Information on the destination airport, at which this flight arrives | 
**marketingAirline** | **String** | The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is responsible for the traveller this flight | 
**operatingAirline** | **String** | The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is providing the aircraft for this flight. Note that in the USA, if the marketing and operating carrier are different, you are legally required to display this in your application. | 
**flightNumber** | **String** | The identifier that the airline uses for this flight route. This is most commonly - but not always - a number. When combined with the airline and date, it identifies an individual aircraft&#39;s flight | 
**travelerIds** | **List&lt;String&gt;** | Traveler identifiers to indicate the travelers to whom this ticket applies. | 
**bookingInfo** | [**FlightReservationBookingInfo**](FlightReservationBookingInfo.md) | A booking information object with additional details about how the quality of this flight at the given price. | 



