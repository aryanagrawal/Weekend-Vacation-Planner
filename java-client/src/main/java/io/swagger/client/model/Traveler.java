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
import io.swagger.client.model.Contact;
import io.swagger.client.model.FrequentTravelerCard;
import io.swagger.client.model.Infant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * Traveler
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T20:05:26.084Z")
public class Traveler {
  @SerializedName("id")
  private String id = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("traveler_type")
  private String travelerType = null;

  @SerializedName("infant")
  private Infant infant = null;

  @SerializedName("date_of_birth")
  private LocalDate dateOfBirth = null;

  @SerializedName("contacts")
  private List<Contact> contacts = null;

  @SerializedName("frequent_traveler_cards")
  private List<FrequentTravelerCard> frequentTravelerCards = null;

  public Traveler id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies this traveler in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Uniquely identifies this traveler in this travel record. This ID is persistent, and remains the same for the lifetime of the travel record.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Traveler lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the passenger, as entered by the agent, in upper-case. May include suffixes. For example&amp;colon; THACKSTON, KING III, LU.
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The last name of the passenger, as entered by the agent, in upper-case. May include suffixes. For example&colon; THACKSTON, KING III, LU.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Traveler firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the passenger, as entered by the agent, in upper-case. May include middle names, initials or prefixes. The total combined length of the first name and last name must be between 2 and 57 characters. For example&amp;colon; ALEXANDRA, JOSE-ANTONIO MR, ELAINE T DR.
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The first name of the passenger, as entered by the agent, in upper-case. May include middle names, initials or prefixes. The total combined length of the first name and last name must be between 2 and 57 characters. For example&colon; ALEXANDRA, JOSE-ANTONIO MR, ELAINE T DR.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Traveler travelerType(String travelerType) {
    this.travelerType = travelerType;
    return this;
  }

   /**
   * Enumeration of the type of traveler. May be ADULT or CHILD.
   * @return travelerType
  **/
  @ApiModelProperty(required = true, value = "Enumeration of the type of traveler. May be ADULT or CHILD.")
  public String getTravelerType() {
    return travelerType;
  }

  public void setTravelerType(String travelerType) {
    this.travelerType = travelerType;
  }

  public Traveler infant(Infant infant) {
    this.infant = infant;
    return this;
  }

   /**
   * Details on any infant that may be sharing this seat with this traveler. Absence of this key indicates that no infant is traveling with this passenger. An empty object at this key indicated an anonymous infant is traveling with the passenger.
   * @return infant
  **/
  @ApiModelProperty(value = "Details on any infant that may be sharing this seat with this traveler. Absence of this key indicates that no infant is traveling with this passenger. An empty object at this key indicated an anonymous infant is traveling with the passenger.")
  public Infant getInfant() {
    return infant;
  }

  public void setInfant(Infant infant) {
    this.infant = infant;
  }

  public Traveler dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * An &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO 8601&lt;/a&gt; date indicating the birth date of the traveler, as provided by the agent. For example&amp;colon; 1972-02-19.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "An <a href=\"https://en.wikipedia.org/wiki/ISO_8601\">ISO 8601</a> date indicating the birth date of the traveler, as provided by the agent. For example&colon; 1972-02-19.")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Traveler contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Traveler addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Details on how to contact this traveler. At least one traveler in a travel-record will have a contact element.
   * @return contacts
  **/
  @ApiModelProperty(value = "Details on how to contact this traveler. At least one traveler in a travel-record will have a contact element.")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Traveler frequentTravelerCards(List<FrequentTravelerCard> frequentTravelerCards) {
    this.frequentTravelerCards = frequentTravelerCards;
    return this;
  }

  public Traveler addFrequentTravelerCardsItem(FrequentTravelerCard frequentTravelerCardsItem) {
    if (this.frequentTravelerCards == null) {
      this.frequentTravelerCards = new ArrayList<FrequentTravelerCard>();
    }
    this.frequentTravelerCards.add(frequentTravelerCardsItem);
    return this;
  }

   /**
   * Information regarding loyalty cards that the traveler would like to use to accrue benefits as part of this travel record. Where possible, the system will attempt to validate that the frequent traveler card is eligible for use in the context of this travel record.
   * @return frequentTravelerCards
  **/
  @ApiModelProperty(value = "Information regarding loyalty cards that the traveler would like to use to accrue benefits as part of this travel record. Where possible, the system will attempt to validate that the frequent traveler card is eligible for use in the context of this travel record.")
  public List<FrequentTravelerCard> getFrequentTravelerCards() {
    return frequentTravelerCards;
  }

  public void setFrequentTravelerCards(List<FrequentTravelerCard> frequentTravelerCards) {
    this.frequentTravelerCards = frequentTravelerCards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Traveler traveler = (Traveler) o;
    return Objects.equals(this.id, traveler.id) &&
        Objects.equals(this.lastName, traveler.lastName) &&
        Objects.equals(this.firstName, traveler.firstName) &&
        Objects.equals(this.travelerType, traveler.travelerType) &&
        Objects.equals(this.infant, traveler.infant) &&
        Objects.equals(this.dateOfBirth, traveler.dateOfBirth) &&
        Objects.equals(this.contacts, traveler.contacts) &&
        Objects.equals(this.frequentTravelerCards, traveler.frequentTravelerCards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, travelerType, infant, dateOfBirth, contacts, frequentTravelerCards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Traveler {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    travelerType: ").append(toIndentedString(travelerType)).append("\n");
    sb.append("    infant: ").append(toIndentedString(infant)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    frequentTravelerCards: ").append(toIndentedString(frequentTravelerCards)).append("\n");
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

