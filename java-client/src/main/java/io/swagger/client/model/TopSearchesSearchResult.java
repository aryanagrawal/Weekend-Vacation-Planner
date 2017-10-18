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
 * TopSearchesSearchResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class TopSearchesSearchResult {
  @SerializedName("destination")
  private String destination = null;

  @SerializedName("searches")
  private Integer searches = null;

  @SerializedName("searches_prior_year")
  private Integer searchesPriorYear = null;

  public TopSearchesSearchResult destination(String destination) {
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

  public TopSearchesSearchResult searches(Integer searches) {
    this.searches = searches;
    return this;
  }

   /**
   * Average number of daily searches for the destination during the search period provided
   * @return searches
  **/
  @ApiModelProperty(required = true, value = "Average number of daily searches for the destination during the search period provided")
  public Integer getSearches() {
    return searches;
  }

  public void setSearches(Integer searches) {
    this.searches = searches;
  }

  public TopSearchesSearchResult searchesPriorYear(Integer searchesPriorYear) {
    this.searchesPriorYear = searchesPriorYear;
    return this;
  }

   /**
   * Prior year average number of daily searches for the destination during the search period provided
   * @return searchesPriorYear
  **/
  @ApiModelProperty(required = true, value = "Prior year average number of daily searches for the destination during the search period provided")
  public Integer getSearchesPriorYear() {
    return searchesPriorYear;
  }

  public void setSearchesPriorYear(Integer searchesPriorYear) {
    this.searchesPriorYear = searchesPriorYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopSearchesSearchResult topSearchesSearchResult = (TopSearchesSearchResult) o;
    return Objects.equals(this.destination, topSearchesSearchResult.destination) &&
        Objects.equals(this.searches, topSearchesSearchResult.searches) &&
        Objects.equals(this.searchesPriorYear, topSearchesSearchResult.searchesPriorYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, searches, searchesPriorYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopSearchesSearchResult {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
    sb.append("    searchesPriorYear: ").append(toIndentedString(searchesPriorYear)).append("\n");
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
