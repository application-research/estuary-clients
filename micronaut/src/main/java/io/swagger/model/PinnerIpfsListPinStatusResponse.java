package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PinnerIpfsPinStatusResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PinnerIpfsListPinStatusResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-30T18:30:35.042Z[GMT]")
public class PinnerIpfsListPinStatusResponse   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("results")
  @Valid
  private List<PinnerIpfsPinStatusResponse> results = null;

  public PinnerIpfsListPinStatusResponse count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @Schema(description = "")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PinnerIpfsListPinStatusResponse results(List<PinnerIpfsPinStatusResponse> results) {
    this.results = results;
    return this;
  }

  public PinnerIpfsListPinStatusResponse addResultsItem(PinnerIpfsPinStatusResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<PinnerIpfsPinStatusResponse>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  @Valid
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
    return Objects.equals(this.count, pinnerIpfsListPinStatusResponse.count) &&
        Objects.equals(this.results, pinnerIpfsListPinStatusResponse.results);
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
