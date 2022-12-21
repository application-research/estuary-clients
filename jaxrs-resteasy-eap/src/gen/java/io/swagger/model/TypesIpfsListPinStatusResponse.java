package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TypesIpfsPinStatusResponse;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-21T01:22:11.593Z[GMT]")public class TypesIpfsListPinStatusResponse   {
  private Integer count = null;
  private List<TypesIpfsPinStatusResponse> results = new ArrayList<TypesIpfsPinStatusResponse>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("results")
  public List<TypesIpfsPinStatusResponse> getResults() {
    return results;
  }
  public void setResults(List<TypesIpfsPinStatusResponse> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse = (TypesIpfsListPinStatusResponse) o;
    return Objects.equals(count, typesIpfsListPinStatusResponse.count) &&
        Objects.equals(results, typesIpfsListPinStatusResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesIpfsListPinStatusResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
