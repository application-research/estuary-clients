package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MainChannelIDParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-07T20:06:52.777Z")


public class MainChannelIDParam   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("initiator")
  private String initiator = null;

  @JsonProperty("responder")
  private String responder = null;

  public MainChannelIDParam id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MainChannelIDParam initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

  /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")


  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  public MainChannelIDParam responder(String responder) {
    this.responder = responder;
    return this;
  }

  /**
   * Get responder
   * @return responder
  **/
  @ApiModelProperty(value = "")


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
    return Objects.equals(this.id, mainChannelIDParam.id) &&
        Objects.equals(this.initiator, mainChannelIDParam.initiator) &&
        Objects.equals(this.responder, mainChannelIDParam.responder);
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

