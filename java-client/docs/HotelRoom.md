
# HotelRoom

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookingCode** | **String** | The booking code identifies a product at the hotel. It can be used to book a room. | 
**roomTypeCode** | **String** | A 3-letter code to identify a specific room type. |  [optional]
**ratePlanCode** | **String** | A 3 letter code to designate different rates base on traveler type. |  [optional]
**totalAmount** | [**Amount**](Amount.md) | The total price of staying in this room from the given check-in date to the given check-out date |  [optional]
**rates** | [**List&lt;PeriodRate&gt;**](PeriodRate.md) | The total price of staying in this room from the given check-in date to the given check-out date |  [optional]
**descriptions** | **List&lt;String&gt;** | An array of description strings describing room and rate types features |  [optional]
**roomTypeInfo** | [**RoomInfo**](RoomInfo.md) |  |  [optional]
**rateTypeCode** | **String** | The unique rate code used by the hotel chain to price this room&#39;s rate |  [optional]



