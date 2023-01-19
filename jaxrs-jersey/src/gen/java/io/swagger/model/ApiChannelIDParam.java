/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ApiChannelIDParam
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-19T16:30:00.833Z[GMT]")public class ApiChannelIDParam   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("initiator")
  private String initiator = null;

  @JsonProperty("responder")
  private String responder = null;

  public ApiChannelIDParam id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApiChannelIDParam initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

  /**
   * Get initiator
   * @return initiator
   **/
  @JsonProperty("initiator")
  @Schema(description = "")
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  public ApiChannelIDParam responder(String responder) {
    this.responder = responder;
    return this;
  }

  /**
   * Get responder
   * @return responder
   **/
  @JsonProperty("responder")
  @Schema(description = "")
  public String getResponder() {
    return responder;
  }

  public void setResponder(String responder) {
    this.responder = responder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiChannelIDParam apiChannelIDParam = (ApiChannelIDParam) o;
    return Objects.equals(this.id, apiChannelIDParam.id) &&
        Objects.equals(this.initiator, apiChannelIDParam.initiator) &&
        Objects.equals(this.responder, apiChannelIDParam.responder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initiator, responder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiChannelIDParam {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    responder: ").append(toIndentedString(responder)).append("\n");
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
