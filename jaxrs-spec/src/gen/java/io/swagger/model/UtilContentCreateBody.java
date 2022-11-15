package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UtilContentCreateBody   {

  private @Valid String coluuid = null;

  private @Valid String dir = null;

  private @Valid String location = null;

  private @Valid String name = null;

  private @Valid String root = null;

  private @Valid Integer type = null;

  /**
   **/
  public UtilContentCreateBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("coluuid")

  public String getColuuid() {
    return coluuid;
  }
  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  /**
   **/
  public UtilContentCreateBody dir(String dir) {
    this.dir = dir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dir")

  public String getDir() {
    return dir;
  }
  public void setDir(String dir) {
    this.dir = dir;
  }

  /**
   **/
  public UtilContentCreateBody location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("location")

  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public UtilContentCreateBody name(String name) {
    this.name = name;
    return this;
  }

  
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
  public UtilContentCreateBody root(String root) {
    this.root = root;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("root")

  public String getRoot() {
    return root;
  }
  public void setRoot(String root) {
    this.root = root;
  }

  /**
   **/
  public UtilContentCreateBody type(Integer type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")

  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContentCreateBody utilContentCreateBody = (UtilContentCreateBody) o;
    return Objects.equals(coluuid, utilContentCreateBody.coluuid) &&
        Objects.equals(dir, utilContentCreateBody.dir) &&
        Objects.equals(location, utilContentCreateBody.location) &&
        Objects.equals(name, utilContentCreateBody.name) &&
        Objects.equals(root, utilContentCreateBody.root) &&
        Objects.equals(type, utilContentCreateBody.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coluuid, dir, location, name, root, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentCreateBody {\n");
    
    sb.append("    coluuid: ").append(toIndentedString(coluuid)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
