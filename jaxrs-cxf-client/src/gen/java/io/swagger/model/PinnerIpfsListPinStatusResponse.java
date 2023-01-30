package io.swagger.model;

import io.swagger.model.PinnerIpfsPinStatusResponse;
import java.util.ArrayList;
import java.util.List;

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

public class PinnerIpfsListPinStatusResponse   {
  
  @Schema(description = "")
  private Integer count = null;
  
  @Schema(description = "")
  private List<PinnerIpfsPinStatusResponse> results = null;
 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PinnerIpfsListPinStatusResponse count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<PinnerIpfsPinStatusResponse> getResults() {
    return results;
  }

  public void setResults(List<PinnerIpfsPinStatusResponse> results) {
    this.results = results;
  }

  public PinnerIpfsListPinStatusResponse results(List<PinnerIpfsPinStatusResponse> results) {
    this.results = results;
    return this;
  }

  public PinnerIpfsListPinStatusResponse addResultsItem(PinnerIpfsPinStatusResponse resultsItem) {
    this.results.add(resultsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
