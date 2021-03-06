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
import io.swagger.client.model.FlightSearchSegment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FlightSearchBound
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class FlightSearchBound {
  @SerializedName("flights")
  private List<FlightSearchSegment> flights = new ArrayList<FlightSearchSegment>();

  @SerializedName("duration")
  private String duration = null;

  public FlightSearchBound flights(List<FlightSearchSegment> flights) {
    this.flights = flights;
    return this;
  }

  public FlightSearchBound addFlightsItem(FlightSearchSegment flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }

   /**
   * Get flights
   * @return flights
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FlightSearchSegment> getFlights() {
    return flights;
  }

  public void setFlights(List<FlightSearchSegment> flights) {
    this.flights = flights;
  }

  public FlightSearchBound duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of this bound, including layover time, expressed in the format hh:mm
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of this bound, including layover time, expressed in the format hh:mm")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightSearchBound flightSearchBound = (FlightSearchBound) o;
    return Objects.equals(this.flights, flightSearchBound.flights) &&
        Objects.equals(this.duration, flightSearchBound.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flights, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchBound {\n");
    
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

