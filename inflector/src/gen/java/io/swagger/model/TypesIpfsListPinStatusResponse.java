package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TypesIpfsPinStatusResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-01-04T12:55:51.789Z[GMT]")
public class TypesIpfsListPinStatusResponse   {
  @JsonProperty("count")
  private Integer count = null;
  @JsonProperty("results")
  private List<TypesIpfsPinStatusResponse> results = null;
  /**
   **/
  public TypesIpfsListPinStatusResponse count(Integer count) {
    this.count = count;
    return this;
  }

  
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
  public TypesIpfsListPinStatusResponse results(List<TypesIpfsPinStatusResponse> results) {
    this.results = results;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("results")
  public List<TypesIpfsPinStatusResponse> getResults() {
    return results;
  }
  public void setResults(List<TypesIpfsPinStatusResponse> results) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
