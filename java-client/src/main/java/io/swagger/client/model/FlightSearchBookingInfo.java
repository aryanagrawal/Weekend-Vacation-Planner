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
 * FlightSearchBookingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class FlightSearchBookingInfo {
  @SerializedName("travel_class")
  private String travelClass = null;

  @SerializedName("cabin_code")
  private String cabinCode = null;

  @SerializedName("booking_code")
  private String bookingCode = null;

  @SerializedName("seats_remaining")
  private String seatsRemaining = null;

  @SerializedName("fare_family")
  private String fareFamily = null;

  @SerializedName("fare_basis")
  private String fareBasis = null;

  public FlightSearchBookingInfo travelClass(String travelClass) {
    this.travelClass = travelClass;
    return this;
  }

   /**
   * The cabin class offered on this flight. An enumeration that will read either ECONOMY, PREMIUM_ECONOMY, BUSINESS or FIRST
   * @return travelClass
  **/
  @ApiModelProperty(required = true, value = "The cabin class offered on this flight. An enumeration that will read either ECONOMY, PREMIUM_ECONOMY, BUSINESS or FIRST")
  public String getTravelClass() {
    return travelClass;
  }

  public void setTravelClass(String travelClass) {
    this.travelClass = travelClass;
  }

  public FlightSearchBookingInfo cabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
    return this;
  }

   /**
   * A single character encoding of the travel_class, generally only available on responses from affiliates.
   * @return cabinCode
  **/
  @ApiModelProperty(value = "A single character encoding of the travel_class, generally only available on responses from affiliates.")
  public String getCabinCode() {
    return cabinCode;
  }

  public void setCabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
  }

  public FlightSearchBookingInfo bookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
    return this;
  }

   /**
   * The Reservation Booking Designator code that determines the quality and terms of the flight offered for the given price. A single letter from A..Z
   * @return bookingCode
  **/
  @ApiModelProperty(required = true, value = "The Reservation Booking Designator code that determines the quality and terms of the flight offered for the given price. A single letter from A..Z")
  public String getBookingCode() {
    return bookingCode;
  }

  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  public FlightSearchBookingInfo seatsRemaining(String seatsRemaining) {
    this.seatsRemaining = seatsRemaining;
    return this;
  }

   /**
   * The minimum number of seats that are still available for this price at the time of search. If the value is a 4 or above, there are often more than this number of seats still available.
   * @return seatsRemaining
  **/
  @ApiModelProperty(required = true, value = "The minimum number of seats that are still available for this price at the time of search. If the value is a 4 or above, there are often more than this number of seats still available.")
  public String getSeatsRemaining() {
    return seatsRemaining;
  }

  public void setSeatsRemaining(String seatsRemaining) {
    this.seatsRemaining = seatsRemaining;
  }

  public FlightSearchBookingInfo fareFamily(String fareFamily) {
    this.fareFamily = fareFamily;
    return this;
  }

   /**
   * Enumeration of the type of fare which this airline is providing, eg. VALUE. This is generally only available for affiliate responses.
   * @return fareFamily
  **/
  @ApiModelProperty(value = "Enumeration of the type of fare which this airline is providing, eg. VALUE. This is generally only available for affiliate responses.")
  public String getFareFamily() {
    return fareFamily;
  }

  public void setFareFamily(String fareFamily) {
    this.fareFamily = fareFamily;
  }

  public FlightSearchBookingInfo fareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
    return this;
  }

   /**
   * See https://en.wikipedia.org/wiki/Fare_basis_code for the fare being offered.
   * @return fareBasis
  **/
  @ApiModelProperty(value = "See https://en.wikipedia.org/wiki/Fare_basis_code for the fare being offered.")
  public String getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightSearchBookingInfo flightSearchBookingInfo = (FlightSearchBookingInfo) o;
    return Objects.equals(this.travelClass, flightSearchBookingInfo.travelClass) &&
        Objects.equals(this.cabinCode, flightSearchBookingInfo.cabinCode) &&
        Objects.equals(this.bookingCode, flightSearchBookingInfo.bookingCode) &&
        Objects.equals(this.seatsRemaining, flightSearchBookingInfo.seatsRemaining) &&
        Objects.equals(this.fareFamily, flightSearchBookingInfo.fareFamily) &&
        Objects.equals(this.fareBasis, flightSearchBookingInfo.fareBasis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(travelClass, cabinCode, bookingCode, seatsRemaining, fareFamily, fareBasis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchBookingInfo {\n");
    
    sb.append("    travelClass: ").append(toIndentedString(travelClass)).append("\n");
    sb.append("    cabinCode: ").append(toIndentedString(cabinCode)).append("\n");
    sb.append("    bookingCode: ").append(toIndentedString(bookingCode)).append("\n");
    sb.append("    seatsRemaining: ").append(toIndentedString(seatsRemaining)).append("\n");
    sb.append("    fareFamily: ").append(toIndentedString(fareFamily)).append("\n");
    sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
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
