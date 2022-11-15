package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class MainImportDealBody   {
  private String coluuid = null;
  private List<Integer> dealIDs = new ArrayList<Integer>();
  private String dir = null;
  private String name = null;

  /**
   **/
  public MainImportDealBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("coluuid")
  public String getColuuid() {
    return coluuid;
  }
  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  /**
   **/
  public MainImportDealBody dealIDs(List<Integer> dealIDs) {
    this.dealIDs = dealIDs;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("dealIDs")
  public List<Integer> getDealIDs() {
    return dealIDs;
  }
  public void setDealIDs(List<Integer> dealIDs) {
    this.dealIDs = dealIDs;
  }

  /**
   **/
  public MainImportDealBody dir(String dir) {
    this.dir = dir;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }
  public void setDir(String dir) {
    this.dir = dir;
  }

  /**
   **/
  public MainImportDealBody name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainImportDealBody mainImportDealBody = (MainImportDealBody) o;
    return Objects.equals(coluuid, mainImportDealBody.coluuid) &&
        Objects.equals(dealIDs, mainImportDealBody.dealIDs) &&
        Objects.equals(dir, mainImportDealBody.dir) &&
        Objects.equals(name, mainImportDealBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coluuid, dealIDs, dir, name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
