package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PinnerIpfsPin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-02T18:38:36.904Z[GMT]")


public class PinnerIpfsPin   {
  @JsonProperty("cid")
  private String cid = null;

  @JsonProperty("meta")
  @Valid
  private Map<String, Object> meta = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("origins")
  @Valid
  private List<String> origins = null;

  public PinnerIpfsPin cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * Get cid
   * @return cid
   **/
  @Schema(description = "")
  
    public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public PinnerIpfsPin meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public PinnerIpfsPin putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<String, Object>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Get meta
   * @return meta
   **/
  @Schema(description = "")
  
    public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public PinnerIpfsPin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PinnerIpfsPin origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  public PinnerIpfsPin addOriginsItem(String originsItem) {
    if (this.origins == null) {
      this.origins = new ArrayList<String>();
    }
    this.origins.add(originsItem);
    return this;
  }

  /**
   * Get origins
   * @return origins
   **/
  @Schema(description = "")
  
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
    return Objects.equals(this.cid, pinnerIpfsPin.cid) &&
        Objects.equals(this.meta, pinnerIpfsPin.meta) &&
        Objects.equals(this.name, pinnerIpfsPin.name) &&
        Objects.equals(this.origins, pinnerIpfsPin.origins);
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
