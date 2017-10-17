
# TrainSearchSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departsAt** | **String** | The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date-time of the train&#39;s departure in the local time zone of the departure station, in the format YYYY-MM-DDTHH:mm. | 
**arrivesAt** | **String** | The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date-time of the train&#39;s arrival in the local time zone of the arrival station, in the format YYYY-MM-DDTHH:mm. | 
**departureStation** | [**Station**](Station.md) | The station object representing the station at which the passenger should board this train in order to complete this part of the itinerary. | 
**arrivalStation** | [**Airport**](Airport.md) | The station object representing the station at which the passenger should disembark this train in order to complete this part of the itinerary. | 
**marketingCompany** | **String** | The name of the train company selling this train journey. This is the name you should see printed on your ticket. | 
**operatingCompany** | **String** | The name of the train company operating this train journey. This is the name you should see written on the train. | 
**trainNumber** | **String** | The identifying number of this train service. Usually the marketing company will only operate on train per day with this train number. | 
**trainType** | **String** | The type of train that you may expect for this journey. For example&amp;colon; InterCity, Regional... |  [optional]
**prices** | [**List&lt;TrainSearchPricing&gt;**](TrainSearchPricing.md) | Possible pricing for this train journey. | 



