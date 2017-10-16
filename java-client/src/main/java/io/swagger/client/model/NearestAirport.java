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
import java.math.BigDecimal;

/**
 * NearestAirport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class NearestAirport {
  @SerializedName("airport")
  private String airport = null;

  @SerializedName("airport_name")
  private String airportName = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("city_name")
  private String cityName = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("location")
  private Geolocation location = null;

  @SerializedName("aircraft_movements")
  private Integer aircraftMovements = null;

  @SerializedName("timezone")
  private String timezone = null;

  public NearestAirport airport(String airport) {
    this.airport = airport;
    return this;
  }

   /**
   * The 3 letter IATA airport code of this given airport. You can use this as an input parameter for a low-fare flight search, to get more specific results than the city code, but inspiration search works best using the city code.
   * @return airport
  **/
  @ApiModelProperty(required = true, value = "The 3 letter IATA airport code of this given airport. You can use this as an input parameter for a low-fare flight search, to get more specific results than the city code, but inspiration search works best using the city code.")
  public String getAirport() {
    return airport;
  }

  public void setAirport(String airport) {
    this.airport = airport;
  }

  public NearestAirport airportName(String airportName) {
    this.airportName = airportName;
    return this;
  }

   /**
   * The name of this airport, in UTF-8 format
   * @return airportName
  **/
  @ApiModelProperty(required = true, value = "The name of this airport, in UTF-8 format")
  public String getAirportName() {
    return airportName;
  }

  public void setAirportName(String airportName) {
    this.airportName = airportName;
  }

  public NearestAirport city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The three letter &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of the city of the city in which this airport is located.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The three letter <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of the city of the city in which this airport is located.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public NearestAirport cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * The English name of the city in which this airport is located
   * @return cityName
  **/
  @ApiModelProperty(required = true, value = "The English name of the city in which this airport is located")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public NearestAirport state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state code of this city, if applicable
   * @return state
  **/
  @ApiModelProperty(value = "The state code of this city, if applicable")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public NearestAirport distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance in km from the point specified in the query, to this location
   * @return distance
  **/
  @ApiModelProperty(required = true, value = "The distance in km from the point specified in the query, to this location")
  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public NearestAirport location(Geolocation location) {
    this.location = location;
    return this;
  }

   /**
   *   An object containing the longitude and latitude of the given airport.
   * @return location
  **/
  @ApiModelProperty(required = true, value = "  An object containing the longitude and latitude of the given airport.")
  public Geolocation getLocation() {
    return location;
  }

  public void setLocation(Geolocation location) {
    this.location = location;
  }

  public NearestAirport aircraftMovements(Integer aircraftMovements) {
    this.aircraftMovements = aircraftMovements;
    return this;
  }

   /**
   * The annual number of aircraft movements at that airport.
   * @return aircraftMovements
  **/
  @ApiModelProperty(value = "The annual number of aircraft movements at that airport.")
  public Integer getAircraftMovements() {
    return aircraftMovements;
  }

  public void setAircraftMovements(Integer aircraftMovements) {
    this.aircraftMovements = aircraftMovements;
  }

  public NearestAirport timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot;&gt;Olson format&lt;/a&gt; name of the timezone in which this airport is located
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"http://en.wikipedia.org/wiki/List_of_tz_database_time_zones\">Olson format</a> name of the timezone in which this airport is located")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearestAirport nearestAirport = (NearestAirport) o;
    return Objects.equals(this.airport, nearestAirport.airport) &&
        Objects.equals(this.airportName, nearestAirport.airportName) &&
        Objects.equals(this.city, nearestAirport.city) &&
        Objects.equals(this.cityName, nearestAirport.cityName) &&
        Objects.equals(this.state, nearestAirport.state) &&
        Objects.equals(this.distance, nearestAirport.distance) &&
        Objects.equals(this.location, nearestAirport.location) &&
        Objects.equals(this.aircraftMovements, nearestAirport.aircraftMovements) &&
        Objects.equals(this.timezone, nearestAirport.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airport, airportName, city, cityName, state, distance, location, aircraftMovements, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearestAirport {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
    sb.append("    airportName: ").append(toIndentedString(airportName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    aircraftMovements: ").append(toIndentedString(aircraftMovements)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

