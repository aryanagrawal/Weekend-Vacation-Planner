
# Traveler

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Uniquely identifies this traveler in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record. | 
**lastName** | **String** | The last name of the passenger, as entered by the agent, in upper-case. May include suffixes. For example&amp;colon; THACKSTON, KING III, LU. | 
**firstName** | **String** | The first name of the passenger, as entered by the agent, in upper-case. May include middle names, initials or prefixes. The total combined length of the first name and last name must be between 2 and 57 characters. For example&amp;colon; ALEXANDRA, JOSE-ANTONIO MR, ELAINE T DR. | 
**travelerType** | **String** | Enumeration of the type of traveler. May be ADULT or CHILD. | 
**infant** | [**Infant**](Infant.md) | Details on any infant that may be sharing this seat with this traveler. Absence of this key indicates that no infant is traveling with this passenger. An empty object at this key indicated an anonymous infant is traveling with the passenger. |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) | An &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date indicating the birth date of the traveler, as provided by the agent. For example&amp;colon; 1972-02-19. |  [optional]
**contacts** | [**List&lt;Contact&gt;**](Contact.md) | Details on how to contact this traveler. At least one traveler in a travel-record will have a contact element. |  [optional]
**frequentTravelerCards** | [**List&lt;FrequentTravelerCard&gt;**](FrequentTravelerCard.md) | Information regarding loyalty cards that the traveler would like to use to accrue benefits as part of this travel record. Where possible, the system will attempt to validate that the frequent traveler card is eligible for use in the context of this travel record. |  [optional]



