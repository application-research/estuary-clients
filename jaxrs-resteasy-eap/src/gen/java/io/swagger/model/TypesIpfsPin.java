package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-11-07T20:06:03.798Z")
public class TypesIpfsPin   {
  
  private String cid = null;
  private Object meta = null;
  private String name = null;
  private List<String> origins = new ArrayList<String>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("meta")
  public Object getMeta() {
    return meta;
  }
  public void setMeta(Object meta) {
    this.meta = meta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("origins")
  public List<String> getOrigins() {
    return origins;
  }
  public void setOrigins(List<String> origins) {
    this.origins = origins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesIpfsPin typesIpfsPin = (TypesIpfsPin) o;
    return Objects.equals(cid, typesIpfsPin.cid) &&
        Objects.equals(meta, typesIpfsPin.meta) &&
        Objects.equals(name, typesIpfsPin.name) &&
        Objects.equals(origins, typesIpfsPin.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, meta, name, origins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesIpfsPin {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

