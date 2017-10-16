
# FlightSearchBookingInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**travelClass** | **String** | The cabin class offered on this flight. An enumeration that will read either ECONOMY, PREMIUM_ECONOMY, BUSINESS or FIRST | 
**cabinCode** | **String** | A single character encoding of the travel_class, generally only available on responses from affiliates. |  [optional]
**bookingCode** | **String** | The Reservation Booking Designator code that determines the quality and terms of the flight offered for the given price. A single letter from A..Z | 
**seatsRemaining** | **String** | The minimum number of seats that are still available for this price at the time of search. If the value is a 4 or above, there are often more than this number of seats still available. | 
**fareFamily** | **String** | Enumeration of the type of fare which this airline is providing, eg. VALUE. This is generally only available for affiliate responses. |  [optional]
**fareBasis** | **String** | See https://en.wikipedia.org/wiki/Fare_basis_code for the fare being offered. |  [optional]



