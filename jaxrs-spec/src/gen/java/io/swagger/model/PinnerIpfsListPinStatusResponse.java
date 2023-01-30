package io.swagger.model;

import io.swagger.model.PinnerIpfsPinStatusResponse;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinnerIpfsListPinStatusResponse   {

  private @Valid Integer count = null;

  private @Valid List<PinnerIpfsPinStatusResponse> results = new ArrayList<PinnerIpfsPinStatusResponse>();

  /**
   **/
  public PinnerIpfsListPinStatusResponse count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("count")

  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  public PinnerIpfsListPinStatusResponse results(List<PinnerIpfsPinStatusResponse> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")

  public List<PinnerIpfsPinStatusResponse> getResults() {
    return results;
  }
  public void setResults(List<PinnerIpfsPinStatusResponse> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinnerIpfsListPinStatusResponse pinnerIpfsListPinStatusResponse = (PinnerIpfsListPinStatusResponse) o;
    return Objects.equals(count, pinnerIpfsListPinStatusResponse.count) &&
        Objects.equals(results, pinnerIpfsListPinStatusResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinnerIpfsListPinStatusResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
