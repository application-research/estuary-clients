package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MainImportDealBody  {
  
  @ApiModelProperty(value = "")
  private String coluuid = null;

  @ApiModelProperty(value = "")
  private List<Integer> dealIDs = null;

  @ApiModelProperty(value = "")
  private String dir = null;

  @ApiModelProperty(value = "")
  private String name = null;
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

  public MainImportDealBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

 /**
   * Get dealIDs
   * @return dealIDs
  **/
  @JsonProperty("dealIDs")
  public List<Integer> getDealIDs() {
    return dealIDs;
  }

  public void setDealIDs(List<Integer> dealIDs) {
    this.dealIDs = dealIDs;
  }

  public MainImportDealBody dealIDs(List<Integer> dealIDs) {
    this.dealIDs = dealIDs;
    return this;
  }

  public MainImportDealBody addDealIDsItem(Integer dealIDsItem) {
    this.dealIDs.add(dealIDsItem);
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

  public MainImportDealBody dir(String dir) {
    this.dir = dir;
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

  public MainImportDealBody name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainImportDealBody {\n");
    
    sb.append("    coluuid: ").append(toIndentedString(coluuid)).append("\n");
    sb.append("    dealIDs: ").append(toIndentedString(dealIDs)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

