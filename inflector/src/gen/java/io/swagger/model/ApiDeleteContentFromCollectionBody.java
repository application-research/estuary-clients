package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-01-04T12:55:51.789Z[GMT]")
public class ApiDeleteContentFromCollectionBody   {
  @JsonProperty("by")
  private String by = null;
  @JsonProperty("value")
  private String value = null;
  /**
   **/
  public ApiDeleteContentFromCollectionBody by(String by) {
    this.by = by;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("by")
  public String getBy() {
    return by;
  }
  public void setBy(String by) {
    this.by = by;
  }

  /**
   **/
  public ApiDeleteContentFromCollectionBody value(String value) {
    this.value = value;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDeleteContentFromCollectionBody apiDeleteContentFromCollectionBody = (ApiDeleteContentFromCollectionBody) o;
    return Objects.equals(by, apiDeleteContentFromCollectionBody.by) &&
        Objects.equals(value, apiDeleteContentFromCollectionBody.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDeleteContentFromCollectionBody {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
