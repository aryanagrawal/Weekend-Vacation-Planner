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
 * A monetary amount with a price and a currency
 */
@ApiModel(description = "A monetary amount with a price and a currency")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class Amount {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("amount")
  private String amount = null;

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * &lt;a href&#x3D;\&quot;http://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;ISO 4217&lt;/a&gt; currency code.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "<a href=\"http://en.wikipedia.org/wiki/ISO_4217\">ISO 4217</a> currency code.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Amount amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total amount in the given currency, formatted appropriately. For example&amp;colon; 194.99
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Total amount in the given currency, formatted appropriately. For example&colon; 194.99")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.amount, amount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

