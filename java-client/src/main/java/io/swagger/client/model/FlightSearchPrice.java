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
import io.swagger.client.model.Fare;
import io.swagger.client.model.FareRestrictions;
import java.io.IOException;

/**
 * FlightSearchPrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class FlightSearchPrice {
  @SerializedName("total_price")
  private String totalPrice = null;

  @SerializedName("price_per_adult")
  private Fare pricePerAdult = null;

  @SerializedName("price_per_child")
  private Fare pricePerChild = null;

  @SerializedName("price_per_infant")
  private Fare pricePerInfant = null;

  @SerializedName("restrictions")
  private FareRestrictions restrictions = null;

  public FlightSearchPrice totalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * The total price for all the requested passengers for this flight
   * @return totalPrice
  **/
  @ApiModelProperty(required = true, value = "The total price for all the requested passengers for this flight")
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public FlightSearchPrice pricePerAdult(Fare pricePerAdult) {
    this.pricePerAdult = pricePerAdult;
    return this;
  }

   /**
   * The per-passenger fare for each adult on this flight
   * @return pricePerAdult
  **/
  @ApiModelProperty(required = true, value = "The per-passenger fare for each adult on this flight")
  public Fare getPricePerAdult() {
    return pricePerAdult;
  }

  public void setPricePerAdult(Fare pricePerAdult) {
    this.pricePerAdult = pricePerAdult;
  }

  public FlightSearchPrice pricePerChild(Fare pricePerChild) {
    this.pricePerChild = pricePerChild;
    return this;
  }

   /**
   * The per-passenger fare for each child on this flight
   * @return pricePerChild
  **/
  @ApiModelProperty(value = "The per-passenger fare for each child on this flight")
  public Fare getPricePerChild() {
    return pricePerChild;
  }

  public void setPricePerChild(Fare pricePerChild) {
    this.pricePerChild = pricePerChild;
  }

  public FlightSearchPrice pricePerInfant(Fare pricePerInfant) {
    this.pricePerInfant = pricePerInfant;
    return this;
  }

   /**
   * The per-passenger fare for each infant on this flight
   * @return pricePerInfant
  **/
  @ApiModelProperty(value = "The per-passenger fare for each infant on this flight")
  public Fare getPricePerInfant() {
    return pricePerInfant;
  }

  public void setPricePerInfant(Fare pricePerInfant) {
    this.pricePerInfant = pricePerInfant;
  }

  public FlightSearchPrice restrictions(FareRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * The restrictions associated with this fare
   * @return restrictions
  **/
  @ApiModelProperty(required = true, value = "The restrictions associated with this fare")
  public FareRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(FareRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightSearchPrice flightSearchPrice = (FlightSearchPrice) o;
    return Objects.equals(this.totalPrice, flightSearchPrice.totalPrice) &&
        Objects.equals(this.pricePerAdult, flightSearchPrice.pricePerAdult) &&
        Objects.equals(this.pricePerChild, flightSearchPrice.pricePerChild) &&
        Objects.equals(this.pricePerInfant, flightSearchPrice.pricePerInfant) &&
        Objects.equals(this.restrictions, flightSearchPrice.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPrice, pricePerAdult, pricePerChild, pricePerInfant, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSearchPrice {\n");
    
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    pricePerAdult: ").append(toIndentedString(pricePerAdult)).append("\n");
    sb.append("    pricePerChild: ").append(toIndentedString(pricePerChild)).append("\n");
    sb.append("    pricePerInfant: ").append(toIndentedString(pricePerInfant)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
