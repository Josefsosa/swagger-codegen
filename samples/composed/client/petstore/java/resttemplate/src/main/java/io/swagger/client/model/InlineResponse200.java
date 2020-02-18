/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse200
 */


public class InlineResponse200 {
  @JsonProperty("parrots")
  private List<Object> parrots = null;

  public InlineResponse200 parrots(List<Object> parrots) {
    this.parrots = parrots;
    return this;
  }

  public InlineResponse200 addParrotsItem(Object parrotsItem) {
    if (this.parrots == null) {
      this.parrots = new ArrayList<Object>();
    }
    this.parrots.add(parrotsItem);
    return this;
  }

   /**
   * Get parrots
   * @return parrots
  **/
  @Schema(description = "")
  public List<Object> getParrots() {
    return parrots;
  }

  public void setParrots(List<Object> parrots) {
    this.parrots = parrots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.parrots, inlineResponse200.parrots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parrots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    parrots: ").append(toIndentedString(parrots)).append("\n");
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
