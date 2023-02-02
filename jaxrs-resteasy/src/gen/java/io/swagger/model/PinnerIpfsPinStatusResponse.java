package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.StatusPinningStatus;
import io.swagger.model.UtilContent;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-02-02T18:38:38.031Z[GMT]")public class PinnerIpfsPinStatusResponse   {
  private UtilContent content = null;  private String created = null;  private List<String> delegates = new ArrayList<String>();  private Map<String, Object> info = new HashMap<String, Object>();  private PinnerIpfsPin pin = null;  private String requestid = null;  private StatusPinningStatus status = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("content")
  public UtilContent getContent() {
    return content;
  }
  public void setContent(UtilContent content) {
    this.content = content;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("delegates")
  public List<String> getDelegates() {
    return delegates;
  }
  public void setDelegates(List<String> delegates) {
    this.delegates = delegates;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("info")
  public Map<String, Object> getInfo() {
    return info;
  }
  public void setInfo(Map<String, Object> info) {
    this.info = info;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("pin")
  public PinnerIpfsPin getPin() {
    return pin;
  }
  public void setPin(PinnerIpfsPin pin) {
    this.pin = pin;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("requestid")
  public String getRequestid() {
    return requestid;
  }
  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  /**
   **/
  
  @Schema(description = "")
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
