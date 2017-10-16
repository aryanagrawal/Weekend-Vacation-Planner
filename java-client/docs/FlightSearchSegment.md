
# FlightSearchSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departsAt** | **String** | Date and time of departure at the origin, in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt;  date format yyyy-MM-ddTHH:mm in the local time at the origin airport | 
**arrivesAt** | **String** | Date and time of departure at the destination, in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt;  date format yyyy-MM-ddTHH:mm in the local time at the destination airport | 
**origin** | [**Airport**](Airport.md) | Information on the origin airport, from which this flight departs | 
**destination** | [**Airport**](Airport.md) | Information on the destination airport, at which this flight arrives | 
**marketingAirline** | **String** | The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is responsible for the traveller this flight | 
**operatingAirline** | **String** | The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is providing the aircraft for this flight. Note that in the USA, if the marketing and operating carrier are different, you are legally required to display this in your application. | 
**flightNumber** | **String** | The identifier that the airline uses for this flight route. This is most commonly - but not always - a number. When combined with the airline and date, it identifies an individual aircraft&#39;s flight | 
**aircraft** | **String** | The &lt;a href&#x3D;\&quot;http://www.jacanaent.com/JacTechLib/07Aviation/AircraftTypeCodes.txt\&quot;&gt;IATA aircraft type designator&lt;/a&gt; of aircraft that will be used for this flight |  [optional]
**bookingInfo** | [**FlightSearchBookingInfo**](FlightSearchBookingInfo.md) | A booking information object with additional details about how the quality of this flight at the given price. | 



