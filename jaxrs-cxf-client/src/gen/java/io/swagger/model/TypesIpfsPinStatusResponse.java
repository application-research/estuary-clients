package io.swagger.model;

import io.swagger.model.TypesIpfsPin;
import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class TypesIpfsPinStatusResponse   {
  
  @Schema(description = "")
  private String created = null;
  
  @Schema(description = "")
  private List<String> delegates = null;
  
  @Schema(description = "")
  private Object info = null;
  
  @Schema(description = "")
  private TypesIpfsPin pin = null;
  
  @Schema(description = "")
  private String requestid = null;
  
  @Schema(description = "")
  private String status = null;
 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public TypesIpfsPinStatusResponse created(String created) {
    this.created = created;
    return this;
  }

 /**
   * Get delegates
   * @return delegates
  **/
  @JsonProperty("delegates")
  public List<String> getDelegates() {
    return delegates;
  }

  public void setDelegates(List<String> delegates) {
    this.delegates = delegates;
  }

  public TypesIpfsPinStatusResponse delegates(List<String> delegates) {
    this.delegates = delegates;
    return this;
  }

  public TypesIpfsPinStatusResponse addDelegatesItem(String delegatesItem) {
    this.delegates.add(delegatesItem);
    return this;
  }

 /**
   * Get info
   * @return info
  **/
  @JsonProperty("info")
  public Object getInfo() {
    return info;
  }

  public void setInfo(Object info) {
    this.info = info;
  }

  public TypesIpfsPinStatusResponse info(Object info) {
    this.info = info;
    return this;
  }

 /**
   * Get pin
   * @return pin
  **/
  @JsonProperty("pin")
  public TypesIpfsPin getPin() {
    return pin;
  }

  public void setPin(TypesIpfsPin pin) {
    this.pin = pin;
  }

  public TypesIpfsPinStatusResponse pin(TypesIpfsPin pin) {
    this.pin = pin;
    return this;
  }

 /**
   * Get requestid
   * @return requestid
  **/
  @JsonProperty("requestid")
  public String getRequestid() {
    return requestid;
  }

  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  public TypesIpfsPinStatusResponse requestid(String requestid) {
    this.requestid = requestid;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TypesIpfsPinStatusResponse status(String status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesIpfsPinStatusResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    delegates: ").append(toIndentedString(delegates)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    requestid: ").append(toIndentedString(requestid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
