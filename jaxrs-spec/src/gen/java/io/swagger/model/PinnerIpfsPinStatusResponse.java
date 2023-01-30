package io.swagger.model;

import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.StatusPinningStatus;
import io.swagger.model.UtilContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinnerIpfsPinStatusResponse   {

  private @Valid UtilContent content = null;

  private @Valid String created = null;

  private @Valid List<String> delegates = new ArrayList<String>();

  private @Valid Map<String, Object> info = new HashMap<String, Object>();

  private @Valid PinnerIpfsPin pin = null;

  private @Valid String requestid = null;

  private @Valid StatusPinningStatus status = null;

  /**
   **/
  public PinnerIpfsPinStatusResponse content(UtilContent content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content")

  public UtilContent getContent() {
    return content;
  }
  public void setContent(UtilContent content) {
    this.content = content;
  }

  /**
   **/
  public PinnerIpfsPinStatusResponse created(String created) {
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
  public PinnerIpfsPinStatusResponse delegates(List<String> delegates) {
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
  public PinnerIpfsPinStatusResponse info(Map<String, Object> info) {
    this.info = info;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("info")

  public Map<String, Object> getInfo() {
    return info;
  }
  public void setInfo(Map<String, Object> info) {
    this.info = info;
  }

  /**
   **/
  public PinnerIpfsPinStatusResponse pin(PinnerIpfsPin pin) {
    this.pin = pin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pin")

  public PinnerIpfsPin getPin() {
    return pin;
  }
  public void setPin(PinnerIpfsPin pin) {
    this.pin = pin;
  }

  /**
   **/
  public PinnerIpfsPinStatusResponse requestid(String requestid) {
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
  public PinnerIpfsPinStatusResponse status(StatusPinningStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public StatusPinningStatus getStatus() {
    return status;
  }
  public void setStatus(StatusPinningStatus status) {
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
    PinnerIpfsPinStatusResponse pinnerIpfsPinStatusResponse = (PinnerIpfsPinStatusResponse) o;
    return Objects.equals(content, pinnerIpfsPinStatusResponse.content) &&
        Objects.equals(created, pinnerIpfsPinStatusResponse.created) &&
        Objects.equals(delegates, pinnerIpfsPinStatusResponse.delegates) &&
        Objects.equals(info, pinnerIpfsPinStatusResponse.info) &&
        Objects.equals(pin, pinnerIpfsPinStatusResponse.pin) &&
        Objects.equals(requestid, pinnerIpfsPinStatusResponse.requestid) &&
        Objects.equals(status, pinnerIpfsPinStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, created, delegates, info, pin, requestid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinnerIpfsPinStatusResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
