package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class MainChannelIDParam   {
  private Integer id = null;
  private String initiator = null;
  private String responder = null;

  /**
   **/
  public MainChannelIDParam id(Integer id) {
    this.id = id;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public MainChannelIDParam initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("initiator")
  public String getInitiator() {
    return initiator;
  }
  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  /**
   **/
  public MainChannelIDParam responder(String responder) {
    this.responder = responder;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("responder")
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
    MainChannelIDParam mainChannelIDParam = (MainChannelIDParam) o;
    return Objects.equals(id, mainChannelIDParam.id) &&
        Objects.equals(initiator, mainChannelIDParam.initiator) &&
        Objects.equals(responder, mainChannelIDParam.responder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initiator, responder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainChannelIDParam {\n");
    
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
