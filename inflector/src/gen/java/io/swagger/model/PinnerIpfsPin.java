package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-02-02T18:38:34.241Z[GMT]")
public class PinnerIpfsPin   {
  @JsonProperty("cid")
  private String cid = null;
  @JsonProperty("meta")
  private Map<String, Object> meta = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("origins")
  private List<String> origins = null;
  /**
   **/
  public PinnerIpfsPin cid(String cid) {
    this.cid = cid;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  /**
   **/
  public PinnerIpfsPin meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("meta")
  public Map<String, Object> getMeta() {
    return meta;
  }
  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  /**
   **/
  public PinnerIpfsPin name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PinnerIpfsPin origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("origins")
  public List<String> getOrigins() {
    return origins;
  }
  public void setOrigins(List<String> origins) {
    this.origins = origins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinnerIpfsPin pinnerIpfsPin = (PinnerIpfsPin) o;
    return Objects.equals(cid, pinnerIpfsPin.cid) &&
        Objects.equals(meta, pinnerIpfsPin.meta) &&
        Objects.equals(name, pinnerIpfsPin.name) &&
        Objects.equals(origins, pinnerIpfsPin.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, meta, name, origins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinnerIpfsPin {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
