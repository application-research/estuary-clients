package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MainChannelIDParam  {
  
  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private String initiator = null;

  @ApiModelProperty(value = "")
  private String responder = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MainChannelIDParam id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get initiator
   * @return initiator
  **/
  @JsonProperty("initiator")
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  public MainChannelIDParam initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

 /**
   * Get responder
   * @return responder
  **/
  @JsonProperty("responder")
  public String getResponder() {
    return responder;
  }

  public void setResponder(String responder) {
    this.responder = responder;
  }

  public MainChannelIDParam responder(String responder) {
    this.responder = responder;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

