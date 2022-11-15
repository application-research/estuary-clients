package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2022-11-15T21:05:25.078Z[GMT]")
public class ContentAddBody   {
  @JsonProperty("data")
  private File data = null;
  @JsonProperty("filename")
  private String filename = null;
  /**
   * File to upload
   **/
  public ContentAddBody data(File data) {
    this.data = data;
    return this;
  }

  
  @Schema(required = true, description = "File to upload")
  @JsonProperty("data")
  public File getData() {
    return data;
  }
  public void setData(File data) {
    this.data = data;
  }

  /**
   * Filenam to use for upload
   **/
  public ContentAddBody filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @Schema(description = "Filenam to use for upload")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentAddBody contentAddBody = (ContentAddBody) o;
    return Objects.equals(data, contentAddBody.data) &&
        Objects.equals(filename, contentAddBody.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentAddBody {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
