package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TypesIpfsPin;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2022-11-15T21:05:25.078Z[GMT]")
public class TypesIpfsPinStatusResponse   {
  @JsonProperty("created")
  private String created = null;
  @JsonProperty("delegates")
  private List<String> delegates = null;
  @JsonProperty("info")
  private Object info = null;
  @JsonProperty("pin")
  private TypesIpfsPin pin = null;
  @JsonProperty("requestid")
  private String requestid = null;
  @JsonProperty("status")
  private String status = null;
  /**
   **/
  public TypesIpfsPinStatusResponse created(String created) {
    this.created = created;
    return this;
  }

  
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
  public TypesIpfsPinStatusResponse delegates(List<String> delegates) {
    this.delegates = delegates;
    return this;
  }

  
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
  public TypesIpfsPinStatusResponse info(Object info) {
    this.info = info;
    return this;
  }

  
  @Schema(description = "")
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

  
  @Schema(description = "")
  @JsonProperty("pin")
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
  public TypesIpfsPinStatusResponse status(String status) {
    this.status = status;
    return this;
  }

  
  @Schema(description = "")
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
