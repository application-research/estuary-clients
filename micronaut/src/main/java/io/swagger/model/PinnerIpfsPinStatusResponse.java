package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.StatusPinningStatus;
import io.swagger.model.UtilContent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PinnerIpfsPinStatusResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-30T18:30:35.042Z[GMT]")
public class PinnerIpfsPinStatusResponse   {
  @JsonProperty("content")
  private UtilContent content = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("delegates")
  @Valid
  private List<String> delegates = null;

  @JsonProperty("info")
  @Valid
  private Map<String, Object> info = null;

  @JsonProperty("pin")
  private PinnerIpfsPin pin = null;

  @JsonProperty("requestid")
  private String requestid = null;

  @JsonProperty("status")
  private StatusPinningStatus status = null;

  public PinnerIpfsPinStatusResponse content(UtilContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @Schema(description = "")

  @Valid
  public UtilContent getContent() {
    return content;
  }

  public void setContent(UtilContent content) {
    this.content = content;
  }

  public PinnerIpfsPinStatusResponse created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @Schema(description = "")

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PinnerIpfsPinStatusResponse delegates(List<String> delegates) {
    this.delegates = delegates;
    return this;
  }

  public PinnerIpfsPinStatusResponse addDelegatesItem(String delegatesItem) {
    if (this.delegates == null) {
      this.delegates = new ArrayList<String>();
    }
    this.delegates.add(delegatesItem);
    return this;
  }

  /**
   * Get delegates
   * @return delegates
  **/
  @Schema(description = "")

  public List<String> getDelegates() {
    return delegates;
  }

  public void setDelegates(List<String> delegates) {
    this.delegates = delegates;
  }

  public PinnerIpfsPinStatusResponse info(Map<String, Object> info) {
    this.info = info;
    return this;
  }

  public PinnerIpfsPinStatusResponse putInfoItem(String key, Object infoItem) {
    if (this.info == null) {
      this.info = new HashMap<String, Object>();
    }
    this.info.put(key, infoItem);
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @Schema(description = "")

  public Map<String, Object> getInfo() {
    return info;
  }

  public void setInfo(Map<String, Object> info) {
    this.info = info;
  }

  public PinnerIpfsPinStatusResponse pin(PinnerIpfsPin pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
  **/
  @Schema(description = "")

  @Valid
  public PinnerIpfsPin getPin() {
    return pin;
  }

  public void setPin(PinnerIpfsPin pin) {
    this.pin = pin;
  }

  public PinnerIpfsPinStatusResponse requestid(String requestid) {
    this.requestid = requestid;
    return this;
  }

  /**
   * Get requestid
   * @return requestid
  **/
  @Schema(description = "")

  public String getRequestid() {
    return requestid;
  }

  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  public PinnerIpfsPinStatusResponse status(StatusPinningStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @Schema(description = "")

  @Valid
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
    return Objects.equals(this.content, pinnerIpfsPinStatusResponse.content) &&
        Objects.equals(this.created, pinnerIpfsPinStatusResponse.created) &&
        Objects.equals(this.delegates, pinnerIpfsPinStatusResponse.delegates) &&
        Objects.equals(this.info, pinnerIpfsPinStatusResponse.info) &&
        Objects.equals(this.pin, pinnerIpfsPinStatusResponse.pin) &&
        Objects.equals(this.requestid, pinnerIpfsPinStatusResponse.requestid) &&
        Objects.equals(this.status, pinnerIpfsPinStatusResponse.status);
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
