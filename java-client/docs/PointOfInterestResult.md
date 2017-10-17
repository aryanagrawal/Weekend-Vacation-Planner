
# PointOfInterestResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Display name of a given point of interest | 
**mainImage** | **String** | A link to an image of the given location | 
**location** | [**Geolocation**](Geolocation.md) |  | 
**grades** | [**PointOfInterestResultGrades**](PointOfInterestResultGrades.md) |  |  [optional]
**categories** | **List&lt;String&gt;** | Array of descriptions indicating what type of point of interest this is. You can filter the results to include only certain categories of point of interest using the category input parameter. | 
**details** | [**PointOfInterestDetails**](PointOfInterestDetails.md) |  |  [optional]
**contextualImages** | [**List&lt;ImageSize&gt;**](ImageSize.md) | Images taken at this point of interest. Note that these images might have nothing to do with the point itself, particularly if you have enabled the social_media parameter |  [optional]
**geonameId** | **Integer** | The GeonamesID of this point of interest, if available |  [optional]
**walkTime** | [**BigDecimal**](BigDecimal.md) | Time in minutes that it takes to walk from the searched coordinates to this Point of Interest |  [optional]



