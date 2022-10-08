package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2022-10-07T23:59:22.073Z")
public class MainUserStatsResponse   {
  @JsonProperty("numPins")
  private Integer numPins = null;

  @JsonProperty("totalSize")
  private Integer totalSize = null;

  /**
   **/
  public MainUserStatsResponse numPins(Integer numPins) {
    this.numPins = numPins;
    return this;
  }

  
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
  public MainUserStatsResponse totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  
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

