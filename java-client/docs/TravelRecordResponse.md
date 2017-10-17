
# TravelRecordResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordLocator** | **String** | 6 character identifier of this travel record on the Amadeus system. | 
**header** | [**TravelRecordHeader**](TravelRecordHeader.md) | Summarized metadata on the record that has been retrieved. |  [optional]
**messages** | [**List&lt;Message&gt;**](Message.md) | Functional or technical messages associated with the retrieval of this travel record. |  [optional]
**travelers** | [**List&lt;Traveler&gt;**](Traveler.md) | Information about each traveler who may be included as part of this travel record. |  [optional]
**reservation** | [**Reservation**](Reservation.md) | Details about the itineraries that have been reserved as part of this travel record. |  [optional]



