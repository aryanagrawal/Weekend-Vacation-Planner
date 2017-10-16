
# ExtremeSearchResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **String** | The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city or airport to which the traveler may go, from the provided origin | 
**departureDate** | [**LocalDate**](LocalDate.md) | The date departure at the origin, in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date format yyyy-MM-dd, to go to the above destination |  [optional]
**returnDate** | [**LocalDate**](LocalDate.md) | The date at which the flight from the destination to the origin will depart from the destination. The date is in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date format yyyy-MM-dd, in the local date of the origin. This field will not be present in the response if the one-way request parameter is set to true. |  [optional]
**price** | **String** | The minimum total price for one adult passenger for a round trip from the origin to the destination and back. Always a string, formatted correctly for the provided currency | 
**airline** | **String** | The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is responsible for selling the traveler this flight - also known as the Validating Carrier. Airlines are specified using &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt;s&lt;/a&gt; |  [optional]



