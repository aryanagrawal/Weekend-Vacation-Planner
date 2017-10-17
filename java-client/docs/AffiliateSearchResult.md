
# AffiliateSearchResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outbound** | [**FlightSearchBound**](FlightSearchBound.md) | The flight from the origin to the destination | 
**inbound** | [**FlightSearchBound**](FlightSearchBound.md) | The return flight from the destination to the origin |  [optional]
**fare** | [**AffiliateFlightSearchPrice**](AffiliateFlightSearchPrice.md) | The price and fare information which applies to all itineraries in this response | 
**payout** | [**AffiliatePayout**](AffiliatePayout.md) | Details of the amount of payout that the affiliate will received per click or if this flight is sold | 
**airline** | **String** | The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is selling this result | 
**deepLink** | **String** | A link to the page from which this result can be purchased from the affiliate | 



