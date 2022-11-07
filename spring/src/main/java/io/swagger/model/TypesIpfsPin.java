package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypesIpfsPin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-07T20:06:52.777Z")


public class TypesIpfsPin   {
  @JsonProperty("cid")
  private String cid = null;

  @JsonProperty("meta")
  private Object meta = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("origins")
  @Valid
  private List<String> origins = null;

  public TypesIpfsPin cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * Get cid
   * @return cid
  **/
  @ApiModelProperty(value = "")


  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public TypesIpfsPin meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")


  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public TypesIpfsPin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypesIpfsPin origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  public TypesIpfsPin addOriginsItem(String originsItem) {
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
  @ApiModelProperty(value = "")


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
    TypesIpfsPin typesIpfsPin = (TypesIpfsPin) o;
    return Objects.equals(this.cid, typesIpfsPin.cid) &&
        Objects.equals(this.meta, typesIpfsPin.meta) &&
        Objects.equals(this.name, typesIpfsPin.name) &&
        Objects.equals(this.origins, typesIpfsPin.origins);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

