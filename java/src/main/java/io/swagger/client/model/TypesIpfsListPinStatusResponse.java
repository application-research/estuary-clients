/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.TypesIpfsPinStatusResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TypesIpfsListPinStatusResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-22T22:05:02.366Z[GMT]")
public class TypesIpfsListPinStatusResponse {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("results")
  private List<TypesIpfsPinStatusResponse> results = null;

  public TypesIpfsListPinStatusResponse count(Integer count) {
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

  public TypesIpfsListPinStatusResponse results(List<TypesIpfsPinStatusResponse> results) {
    this.results = results;
    return this;
  }

  public TypesIpfsListPinStatusResponse addResultsItem(TypesIpfsPinStatusResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<TypesIpfsPinStatusResponse>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
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
    return Objects.equals(this.count, typesIpfsListPinStatusResponse.count) &&
        Objects.equals(this.results, typesIpfsListPinStatusResponse.results);
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
