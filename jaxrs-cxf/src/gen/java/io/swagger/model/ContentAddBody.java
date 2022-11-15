package io.swagger.model;

import java.io.File;
import javax.validation.constraints.*;

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

public class ContentAddBody   {
  
  @Schema(required = true, description = "File to upload")
 /**
   * File to upload  
  **/
  private File data = null;
  
  @Schema(description = "Filenam to use for upload")
 /**
   * Filenam to use for upload  
  **/
  private String filename = null;
 /**
   * File to upload
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public File getData() {
    return data;
  }

  public void setData(File data) {
    this.data = data;
  }

  public ContentAddBody data(File data) {
    this.data = data;
    return this;
  }

 /**
   * Filenam to use for upload
   * @return filename
  **/
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public ContentAddBody filename(String filename) {
    this.filename = filename;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
