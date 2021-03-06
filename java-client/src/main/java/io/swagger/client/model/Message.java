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
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class Message {
  @SerializedName("severity")
  private String severity = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("message")
  private String message = null;

  public Message severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * An indicator of the importance of this message as part of the flow. May be ERROR or INFO.
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "An indicator of the importance of this message as part of the flow. May be ERROR or INFO.")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Message type(String type) {
    this.type = type;
    return this;
  }

   /**
   * An indicator of the source or type of message that has been generated. May be USER or SYSTEM.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "An indicator of the source or type of message that has been generated. May be USER or SYSTEM.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Message message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A free text message that provides more information.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A free text message that provides more information.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.severity, message.severity) &&
        Objects.equals(this.type, message.type) &&
        Objects.equals(this.message, message.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, type, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

