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
 * CityInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class CityInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("geonames_ID")
  private String geonamesID = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("location")
  private Geolocation location = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("currency")
  private String currency = null;

  public CityInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA code&lt;/a&gt; of this city. If you intend to make a flight search from the output of this call, I recommend using this as your input parameter as it generally gives the best results.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\">IATA code</a> of this city. If you intend to make a flight search from the output of this call, I recommend using this as your input parameter as it generally gives the best results.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CityInformation geonamesID(String geonamesID) {
    this.geonamesID = geonamesID;
    return this;
  }

   /**
   * The ID of this city in the open-sourced Geonames DB
   * @return geonamesID
  **/
  @ApiModelProperty(required = true, value = "The ID of this city in the open-sourced Geonames DB")
  public String getGeonamesID() {
    return geonamesID;
  }

  public void setGeonamesID(String geonamesID) {
    this.geonamesID = geonamesID;
  }

  public CityInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this city, in English
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this city, in English")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CityInformation state(String state) {
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

  public CityInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2\&quot;&gt;ISO 3166-1 alpha-2 country code&lt;/a&gt; in which this city can be found.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2\">ISO 3166-1 alpha-2 country code</a> in which this city can be found.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CityInformation location(Geolocation location) {
    this.location = location;
    return this;
  }

   /**
   * This city&#39;s approximate geolocation. The exact center of a city is often not an exact location, so be aware that this might not be exact.
   * @return location
  **/
  @ApiModelProperty(required = true, value = "This city's approximate geolocation. The exact center of a city is often not an exact location, so be aware that this might not be exact.")
  public Geolocation getLocation() {
    return location;
  }

  public void setLocation(Geolocation location) {
    this.location = location;
  }

  public CityInformation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/List_of_tz_database_time_zones\&quot;&gt;Olson format&lt;/a&gt; name of the timezone in which this city is located
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"http://en.wikipedia.org/wiki/List_of_tz_database_time_zones\">Olson format</a> name of the timezone in which this city is located")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CityInformation currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code of the official local currency at this location
   * @return currency
  **/
  @ApiModelProperty(value = "The ISO-4217 currency code of the official local currency at this location")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityInformation cityInformation = (CityInformation) o;
    return Objects.equals(this.code, cityInformation.code) &&
        Objects.equals(this.geonamesID, cityInformation.geonamesID) &&
        Objects.equals(this.name, cityInformation.name) &&
        Objects.equals(this.state, cityInformation.state) &&
        Objects.equals(this.country, cityInformation.country) &&
        Objects.equals(this.location, cityInformation.location) &&
        Objects.equals(this.timezone, cityInformation.timezone) &&
        Objects.equals(this.currency, cityInformation.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, geonamesID, name, state, country, location, timezone, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    geonamesID: ").append(toIndentedString(geonamesID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

