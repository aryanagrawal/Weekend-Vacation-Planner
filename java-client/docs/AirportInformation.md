
# AirportInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The 3 letter IATA airport code of this given airport. You can use this as an input parameter for a low-fare flight search, to get more specific results than the city code, but inspiration search works best using the city code. | 
**name** | **String** | The name of this airport, in UTF-8 format | 
**cityCode** | **String** | The three letter &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city of the city in which this airport is located. | 
**cityName** | **String** | The English name of the city in which this airport is located | 
**state** | **String** | The state code of this city, if applicable |  [optional]
**country** | **String** | The &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2\&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt; in which this city can be found. | 
**location** | [**Geolocation**](Geolocation.md) |   An object containing the longitude and latitude of the given airport. | 
**aircraftMovements** | **Integer** | The annual number of aircraft movements at that airport. |  [optional]
**timezone** | **String** | The &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot;&gt;Olson format&lt;/a&gt; name of the timezone in which this airport is located | 



