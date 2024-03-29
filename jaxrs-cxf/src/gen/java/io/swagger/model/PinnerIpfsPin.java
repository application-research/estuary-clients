package io.swagger.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;

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

public class PinnerIpfsPin   {
  
  @Schema(description = "")
  private String cid = null;
  
  @Schema(description = "")
  private Map<String, Object> meta = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private List<String> origins = null;
 /**
   * Get cid
   * @return cid
  **/
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public PinnerIpfsPin cid(String cid) {
    this.cid = cid;
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public PinnerIpfsPin meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public PinnerIpfsPin putMetaItem(String key, Object metaItem) {
    this.meta.put(key, metaItem);
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PinnerIpfsPin name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get origins
   * @return origins
  **/
  @JsonProperty("origins")
  public List<String> getOrigins() {
    return origins;
  }

  public void setOrigins(List<String> origins) {
    this.origins = origins;
  }

  public PinnerIpfsPin origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  public PinnerIpfsPin addOriginsItem(String originsItem) {
    this.origins.add(originsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
