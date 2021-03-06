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
import java.io.IOException;

/**
 * TopDestinationsSearchResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class TopDestinationsSearchResult {
  @SerializedName("destination")
  private String destination = null;

  @SerializedName("flights")
  private Integer flights = null;

  @SerializedName("travelers")
  private Integer travelers = null;

  public TopDestinationsSearchResult destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city or airport to which the traveler may go, from the provided origin
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city or airport to which the traveler may go, from the provided origin")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public TopDestinationsSearchResult flights(Integer flights) {
    this.flights = flights;
    return this;
  }

   /**
   * Number of flights from origin to destination during the search period provided. This field is deprecated.
   * @return flights
  **/
  @ApiModelProperty(value = "Number of flights from origin to destination during the search period provided. This field is deprecated.")
  public Integer getFlights() {
    return flights;
  }

  public void setFlights(Integer flights) {
    this.flights = flights;
  }

  public TopDestinationsSearchResult travelers(Integer travelers) {
    this.travelers = travelers;
    return this;
  }

   /**
   * Number of passengers from origin to destination during the search period provided
   * @return travelers
  **/
  @ApiModelProperty(required = true, value = "Number of passengers from origin to destination during the search period provided")
  public Integer getTravelers() {
    return travelers;
  }

  public void setTravelers(Integer travelers) {
    this.travelers = travelers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopDestinationsSearchResult topDestinationsSearchResult = (TopDestinationsSearchResult) o;
    return Objects.equals(this.destination, topDestinationsSearchResult.destination) &&
        Objects.equals(this.flights, topDestinationsSearchResult.flights) &&
        Objects.equals(this.travelers, topDestinationsSearchResult.travelers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, flights, travelers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopDestinationsSearchResult {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
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

