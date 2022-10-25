package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-25T22:24:58.988Z")
public class MainUserStatsResponse   {
  
  private Integer numPins = null;
  private Integer totalSize = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numPins")
  public Integer getNumPins() {
    return numPins;
  }
  public void setNumPins(Integer numPins) {
    this.numPins = numPins;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalSize")
  public Integer getTotalSize() {
    return totalSize;
  }
  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainUserStatsResponse mainUserStatsResponse = (MainUserStatsResponse) o;
    return Objects.equals(numPins, mainUserStatsResponse.numPins) &&
        Objects.equals(totalSize, mainUserStatsResponse.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPins, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainUserStatsResponse {\n");
    
    sb.append("    numPins: ").append(toIndentedString(numPins)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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

