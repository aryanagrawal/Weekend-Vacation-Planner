/*
 * Amadeus Travel Innovation Sandbox
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Geolocation;
import java.io.IOException;

/**
 * PointOfInterestCity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class PointOfInterestCity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("geoname_id")
  private String geonameId = null;

  @SerializedName("location")
  private Geolocation location = null;

  @SerializedName("total_points_of_interest")
  private Integer totalPointsOfInterest = null;

  public PointOfInterestCity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the location that was searched for
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the location that was searched for")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PointOfInterestCity geonameId(String geonameId) {
    this.geonameId = geonameId;
    return this;
  }

   /**
   * The Geonames ID of the location that was searched for
   * @return geonameId
  **/
  @ApiModelProperty(value = "The Geonames ID of the location that was searched for")
  public String getGeonameId() {
    return geonameId;
  }

  public void setGeonameId(String geonameId) {
    this.geonameId = geonameId;
  }

  public PointOfInterestCity location(Geolocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  public Geolocation getLocation() {
    return location;
  }

  public void setLocation(Geolocation location) {
    this.location = location;
  }

  public PointOfInterestCity totalPointsOfInterest(Integer totalPointsOfInterest) {
    this.totalPointsOfInterest = totalPointsOfInterest;
    return this;
  }

   /**
   * The total number of points_of_interest that YapQ has indexed for this city
   * @return totalPointsOfInterest
  **/
  @ApiModelProperty(required = true, value = "The total number of points_of_interest that YapQ has indexed for this city")
  public Integer getTotalPointsOfInterest() {
    return totalPointsOfInterest;
  }

  public void setTotalPointsOfInterest(Integer totalPointsOfInterest) {
    this.totalPointsOfInterest = totalPointsOfInterest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfInterestCity pointOfInterestCity = (PointOfInterestCity) o;
    return Objects.equals(this.name, pointOfInterestCity.name) &&
        Objects.equals(this.geonameId, pointOfInterestCity.geonameId) &&
        Objects.equals(this.location, pointOfInterestCity.location) &&
        Objects.equals(this.totalPointsOfInterest, pointOfInterestCity.totalPointsOfInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, geonameId, location, totalPointsOfInterest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfInterestCity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    geonameId: ").append(toIndentedString(geonameId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    totalPointsOfInterest: ").append(toIndentedString(totalPointsOfInterest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

