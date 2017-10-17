
# RailStationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of this station, as provided in the request | 
**type** | **String** | The type of code to which this station refers. Some codes represent agglomeration of multiple stations, whereas others represent an individual station. Possible values are AGGLOMERATION and STATION. | 
**name** | **String** | The name of this station. | 
**shortName** | **String** | The shortened name of this station (20 characters max) which may be used in certain cases. | 
**country** | **String** | The &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2\&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt; in which this station can be found. | 
**location** | [**Geolocation**](Geolocation.md) | This stations&#39;s approximate geolocation.  | 
**traffic** | **String** | An indication of the level of Intercity traffic passing through this station. | 



