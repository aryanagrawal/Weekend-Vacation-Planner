
# CarReservation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Uniquely identifies this car rental reservation in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record. | 
**pickUp** | **String** | Date on which the car rental will be collected from the car rental location. &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date format yyyy-MM-ddTHH. | 
**dropOff** | **String** | Date at which the car rental will end and the car will be returned to the rental location. &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date format yyyy-MM-ddTHH. | 
**provider** | [**Company**](Company.md) | Details of the car company offering this rental. | 
**origin** | **String** | This car rental company office location ID. If this is an airport location, this will be the airport&#39;s &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt;. Otherwise, this is a custom value provided by the car rental provider. | 
**car** | [**Vehicle**](Vehicle.md) | A car information object giving further details about the vehicle provided for rental. | 
**travelerIds** | **List&lt;String&gt;** | Traveler identifiers to indicate the travelers to whom this car rental applies. Generally, only drivers of the vehicle will be marked in this array. |  [optional]
**bookingInfo** | [**CarReservationBookingInfo**](CarReservationBookingInfo.md) | Additional details the status of this car rental reservation. |  [optional]



