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
 * TravelRecordHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class TravelRecordHeader {
  @SerializedName("creation_office_id")
  private String creationOfficeId = null;

  @SerializedName("owner_office_id")
  private String ownerOfficeId = null;

  public TravelRecordHeader creationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
    return this;
  }

   /**
   * 9 character Amadeus office identifier of the travel agency that created this travel record. An office ID may be considered as equivalent to a &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Pseudo_city_code\&quot;&gt;PCC&lt;/a&gt; in other reservation systems.
   * @return creationOfficeId
  **/
  @ApiModelProperty(required = true, value = "9 character Amadeus office identifier of the travel agency that created this travel record. An office ID may be considered as equivalent to a <a href=\"https://en.wikipedia.org/wiki/Pseudo_city_code\">PCC</a> in other reservation systems.")
  public String getCreationOfficeId() {
    return creationOfficeId;
  }

  public void setCreationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
  }

  public TravelRecordHeader ownerOfficeId(String ownerOfficeId) {
    this.ownerOfficeId = ownerOfficeId;
    return this;
  }

   /**
   * 9 character Amadeus office identifier of the travel agency that owns and manages this travel record.
   * @return ownerOfficeId
  **/
  @ApiModelProperty(required = true, value = "9 character Amadeus office identifier of the travel agency that owns and manages this travel record.")
  public String getOwnerOfficeId() {
    return ownerOfficeId;
  }

  public void setOwnerOfficeId(String ownerOfficeId) {
    this.ownerOfficeId = ownerOfficeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelRecordHeader travelRecordHeader = (TravelRecordHeader) o;
    return Objects.equals(this.creationOfficeId, travelRecordHeader.creationOfficeId) &&
        Objects.equals(this.ownerOfficeId, travelRecordHeader.ownerOfficeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationOfficeId, ownerOfficeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRecordHeader {\n");
    
    sb.append("    creationOfficeId: ").append(toIndentedString(creationOfficeId)).append("\n");
    sb.append("    ownerOfficeId: ").append(toIndentedString(ownerOfficeId)).append("\n");
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

