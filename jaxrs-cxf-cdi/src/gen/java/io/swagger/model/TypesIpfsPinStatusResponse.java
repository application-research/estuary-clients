package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TypesIpfsPin;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class TypesIpfsPinStatusResponse   {
  
  private String created = null;
  private List<String> delegates = new ArrayList<String>();
  private Object info = null;
  private TypesIpfsPin pin = null;
  private String requestid = null;
  private String status = null;

  /**
   **/
  public TypesIpfsPinStatusResponse created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   **/
  public TypesIpfsPinStatusResponse delegates(List<String> delegates) {
    this.delegates = delegates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delegates")
  public List<String> getDelegates() {
    return delegates;
  }
  public void setDelegates(List<String> delegates) {
    this.delegates = delegates;
  }

  /**
   **/
  public TypesIpfsPinStatusResponse info(Object info) {
    this.info = info;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("info")
  public Object getInfo() {
    return info;
  }
  public void setInfo(Object info) {
    this.info = info;
  }

  /**
   **/
  public TypesIpfsPinStatusResponse pin(TypesIpfsPin pin) {
    this.pin = pin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pin")
  @Valid
  public TypesIpfsPin getPin() {
    return pin;
  }
  public void setPin(TypesIpfsPin pin) {
    this.pin = pin;
  }

  /**
   **/
  public TypesIpfsPinStatusResponse requestid(String requestid) {
    this.requestid = requestid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestid")
  public String getRequestid() {
    return requestid;
  }
  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  /**
   **/
  public TypesIpfsPinStatusResponse status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesIpfsPinStatusResponse typesIpfsPinStatusResponse = (TypesIpfsPinStatusResponse) o;
    return Objects.equals(created, typesIpfsPinStatusResponse.created) &&
        Objects.equals(delegates, typesIpfsPinStatusResponse.delegates) &&
        Objects.equals(info, typesIpfsPinStatusResponse.info) &&
        Objects.equals(pin, typesIpfsPinStatusResponse.pin) &&
        Objects.equals(requestid, typesIpfsPinStatusResponse.requestid) &&
        Objects.equals(status, typesIpfsPinStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, delegates, info, pin, requestid, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

