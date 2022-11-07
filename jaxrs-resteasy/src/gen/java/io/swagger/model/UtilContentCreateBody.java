package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class UtilContentCreateBody   {
  
  private String coluuid = null;
  private String dir = null;
  private String location = null;
  private String name = null;
  private String root = null;
  private Integer type = null;

  /**
   **/
  
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
  @JsonProperty("root")
  public String getRoot() {
    return root;
  }
  public void setRoot(String root) {
    this.root = root;
  }

  /**
   **/
  
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

