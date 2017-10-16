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
import io.swagger.client.model.Airport;
import io.swagger.client.model.Station;
import io.swagger.client.model.TrainSearchPricing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TrainSearchSegment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class TrainSearchSegment {
  @SerializedName("departs_at")
  private String departsAt = null;

  @SerializedName("arrives_at")
  private String arrivesAt = null;

  @SerializedName("departure_station")
  private Station departureStation = null;

  @SerializedName("arrival_station")
  private Airport arrivalStation = null;

  @SerializedName("marketing_company")
  private String marketingCompany = null;

  @SerializedName("operating_company")
  private String operatingCompany = null;

  @SerializedName("train_number")
  private String trainNumber = null;

  @SerializedName("train_type")
  private String trainType = null;

  @SerializedName("prices")
  private List<TrainSearchPricing> prices = new ArrayList<TrainSearchPricing>();

  public TrainSearchSegment departsAt(String departsAt) {
    this.departsAt = departsAt;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date-time of the train&#39;s departure in the local time zone of the departure station, in the format YYYY-MM-DDTHH:mm.
   * @return departsAt
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> date-time of the train's departure in the local time zone of the departure station, in the format YYYY-MM-DDTHH:mm.")
  public String getDepartsAt() {
    return departsAt;
  }

  public void setDepartsAt(String departsAt) {
    this.departsAt = departsAt;
  }

  public TrainSearchSegment arrivesAt(String arrivesAt) {
    this.arrivesAt = arrivesAt;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date-time of the train&#39;s arrival in the local time zone of the arrival station, in the format YYYY-MM-DDTHH:mm.
   * @return arrivesAt
  **/
  @ApiModelProperty(required = true, value = "The <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> date-time of the train's arrival in the local time zone of the arrival station, in the format YYYY-MM-DDTHH:mm.")
  public String getArrivesAt() {
    return arrivesAt;
  }

  public void setArrivesAt(String arrivesAt) {
    this.arrivesAt = arrivesAt;
  }

  public TrainSearchSegment departureStation(Station departureStation) {
    this.departureStation = departureStation;
    return this;
  }

   /**
   * The station object representing the station at which the passenger should board this train in order to complete this part of the itinerary.
   * @return departureStation
  **/
  @ApiModelProperty(required = true, value = "The station object representing the station at which the passenger should board this train in order to complete this part of the itinerary.")
  public Station getDepartureStation() {
    return departureStation;
  }

  public void setDepartureStation(Station departureStation) {
    this.departureStation = departureStation;
  }

  public TrainSearchSegment arrivalStation(Airport arrivalStation) {
    this.arrivalStation = arrivalStation;
    return this;
  }

   /**
   * The station object representing the station at which the passenger should disembark this train in order to complete this part of the itinerary.
   * @return arrivalStation
  **/
  @ApiModelProperty(required = true, value = "The station object representing the station at which the passenger should disembark this train in order to complete this part of the itinerary.")
  public Airport getArrivalStation() {
    return arrivalStation;
  }

  public void setArrivalStation(Airport arrivalStation) {
    this.arrivalStation = arrivalStation;
  }

  public TrainSearchSegment marketingCompany(String marketingCompany) {
    this.marketingCompany = marketingCompany;
    return this;
  }

   /**
   * The name of the train company selling this train journey. This is the name you should see printed on your ticket.
   * @return marketingCompany
  **/
  @ApiModelProperty(required = true, value = "The name of the train company selling this train journey. This is the name you should see printed on your ticket.")
  public String getMarketingCompany() {
    return marketingCompany;
  }

  public void setMarketingCompany(String marketingCompany) {
    this.marketingCompany = marketingCompany;
  }

  public TrainSearchSegment operatingCompany(String operatingCompany) {
    this.operatingCompany = operatingCompany;
    return this;
  }

   /**
   * The name of the train company operating this train journey. This is the name you should see written on the train.
   * @return operatingCompany
  **/
  @ApiModelProperty(required = true, value = "The name of the train company operating this train journey. This is the name you should see written on the train.")
  public String getOperatingCompany() {
    return operatingCompany;
  }

  public void setOperatingCompany(String operatingCompany) {
    this.operatingCompany = operatingCompany;
  }

  public TrainSearchSegment trainNumber(String trainNumber) {
    this.trainNumber = trainNumber;
    return this;
  }

   /**
   * The identifying number of this train service. Usually the marketing company will only operate on train per day with this train number.
   * @return trainNumber
  **/
  @ApiModelProperty(required = true, value = "The identifying number of this train service. Usually the marketing company will only operate on train per day with this train number.")
  public String getTrainNumber() {
    return trainNumber;
  }

  public void setTrainNumber(String trainNumber) {
    this.trainNumber = trainNumber;
  }

  public TrainSearchSegment trainType(String trainType) {
    this.trainType = trainType;
    return this;
  }

   /**
   * The type of train that you may expect for this journey. For example&amp;colon; InterCity, Regional...
   * @return trainType
  **/
  @ApiModelProperty(value = "The type of train that you may expect for this journey. For example&colon; InterCity, Regional...")
  public String getTrainType() {
    return trainType;
  }

  public void setTrainType(String trainType) {
    this.trainType = trainType;
  }

  public TrainSearchSegment prices(List<TrainSearchPricing> prices) {
    this.prices = prices;
    return this;
  }

  public TrainSearchSegment addPricesItem(TrainSearchPricing pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Possible pricing for this train journey.
   * @return prices
  **/
  @ApiModelProperty(required = true, value = "Possible pricing for this train journey.")
  public List<TrainSearchPricing> getPrices() {
    return prices;
  }

  public void setPrices(List<TrainSearchPricing> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainSearchSegment trainSearchSegment = (TrainSearchSegment) o;
    return Objects.equals(this.departsAt, trainSearchSegment.departsAt) &&
        Objects.equals(this.arrivesAt, trainSearchSegment.arrivesAt) &&
        Objects.equals(this.departureStation, trainSearchSegment.departureStation) &&
        Objects.equals(this.arrivalStation, trainSearchSegment.arrivalStation) &&
        Objects.equals(this.marketingCompany, trainSearchSegment.marketingCompany) &&
        Objects.equals(this.operatingCompany, trainSearchSegment.operatingCompany) &&
        Objects.equals(this.trainNumber, trainSearchSegment.trainNumber) &&
        Objects.equals(this.trainType, trainSearchSegment.trainType) &&
        Objects.equals(this.prices, trainSearchSegment.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departsAt, arrivesAt, departureStation, arrivalStation, marketingCompany, operatingCompany, trainNumber, trainType, prices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainSearchSegment {\n");
    
    sb.append("    departsAt: ").append(toIndentedString(departsAt)).append("\n");
    sb.append("    arrivesAt: ").append(toIndentedString(arrivesAt)).append("\n");
    sb.append("    departureStation: ").append(toIndentedString(departureStation)).append("\n");
    sb.append("    arrivalStation: ").append(toIndentedString(arrivalStation)).append("\n");
    sb.append("    marketingCompany: ").append(toIndentedString(marketingCompany)).append("\n");
    sb.append("    operatingCompany: ").append(toIndentedString(operatingCompany)).append("\n");
    sb.append("    trainNumber: ").append(toIndentedString(trainNumber)).append("\n");
    sb.append("    trainType: ").append(toIndentedString(trainType)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

