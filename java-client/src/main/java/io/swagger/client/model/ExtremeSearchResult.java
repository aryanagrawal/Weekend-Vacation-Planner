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
import org.joda.time.LocalDate;

/**
 * ExtremeSearchResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class ExtremeSearchResult {
  @SerializedName("destination")
  private String destination = null;

  @SerializedName("departure_date")
  private LocalDate departureDate = null;

  @SerializedName("return_date")
  private LocalDate returnDate = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("airline")
  private String airline = null;

  public ExtremeSearchResult destination(String destination) {
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

  public ExtremeSearchResult departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

   /**
   * The date departure at the origin, in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date format yyyy-MM-dd, to go to the above destination
   * @return departureDate
  **/
  @ApiModelProperty(value = "The date departure at the origin, in <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> date format yyyy-MM-dd, to go to the above destination")
  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public ExtremeSearchResult returnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
    return this;
  }

   /**
   * The date at which the flight from the destination to the origin will depart from the destination. The date is in &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date format yyyy-MM-dd, in the local date of the origin. This field will not be present in the response if the one-way request parameter is set to true.
   * @return returnDate
  **/
  @ApiModelProperty(value = "The date at which the flight from the destination to the origin will depart from the destination. The date is in <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> date format yyyy-MM-dd, in the local date of the origin. This field will not be present in the response if the one-way request parameter is set to true.")
  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public ExtremeSearchResult price(String price) {
    this.price = price;
    return this;
  }

   /**
   * The minimum total price for one adult passenger for a round trip from the origin to the destination and back. Always a string, formatted correctly for the provided currency
   * @return price
  **/
  @ApiModelProperty(required = true, value = "The minimum total price for one adult passenger for a round trip from the origin to the destination and back. Always a string, formatted correctly for the provided currency")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ExtremeSearchResult airline(String airline) {
    this.airline = airline;
    return this;
  }

   /**
   * The 2 character alphanumeric &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt; of the airline that is responsible for selling the traveler this flight - also known as the Validating Carrier. Airlines are specified using &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Airline_codes\&quot;&gt;IATA airline code&lt;/a&gt;s&lt;/a&gt;
   * @return airline
  **/
  @ApiModelProperty(value = "The 2 character alphanumeric <a href=\"https://en.wikipedia.org/wiki/Airline_codes\">IATA airline code</a> of the airline that is responsible for selling the traveler this flight - also known as the Validating Carrier. Airlines are specified using <a href=\"https://en.wikipedia.org/wiki/Airline_codes\"><a href=\"https://en.wikipedia.org/wiki/Airline_codes\">IATA airline code</a>s</a>")
  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtremeSearchResult extremeSearchResult = (ExtremeSearchResult) o;
    return Objects.equals(this.destination, extremeSearchResult.destination) &&
        Objects.equals(this.departureDate, extremeSearchResult.departureDate) &&
        Objects.equals(this.returnDate, extremeSearchResult.returnDate) &&
        Objects.equals(this.price, extremeSearchResult.price) &&
        Objects.equals(this.airline, extremeSearchResult.airline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, departureDate, returnDate, price, airline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtremeSearchResult {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
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
