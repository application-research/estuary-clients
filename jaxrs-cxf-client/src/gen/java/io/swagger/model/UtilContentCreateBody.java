package io.swagger.model;


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

public class UtilContentCreateBody   {
  
  @Schema(description = "")
  private String coluuid = null;
  
  @Schema(description = "")
  private String dir = null;
  
  @Schema(description = "")
  private String location = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private String root = null;
  
  @Schema(description = "")
  private Integer type = null;
 /**
   * Get coluuid
   * @return coluuid
  **/
  @JsonProperty("coluuid")
  public String getColuuid() {
    return coluuid;
  }

  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  public UtilContentCreateBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

 /**
   * Get dir
   * @return dir
  **/
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public UtilContentCreateBody dir(String dir) {
    this.dir = dir;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UtilContentCreateBody location(String location) {
    this.location = location;
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

  public UtilContentCreateBody name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get root
   * @return root
  **/
  @JsonProperty("root")
  public String getRoot() {
    return root;
  }

  public void setRoot(String root) {
    this.root = root;
  }

  public UtilContentCreateBody root(String root) {
    this.root = root;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public UtilContentCreateBody type(Integer type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
