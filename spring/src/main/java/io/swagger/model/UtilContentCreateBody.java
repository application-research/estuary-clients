package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UtilContentType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UtilContentCreateBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-02T18:38:36.904Z[GMT]")


public class UtilContentCreateBody   {
  @JsonProperty("coluuid")
  private String coluuid = null;

  @JsonProperty("dir")
  private String dir = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("overwrite")
  private Boolean overwrite = null;

  @JsonProperty("root")
  private String root = null;

  @JsonProperty("type")
  private UtilContentType type = null;

  public UtilContentCreateBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

  /**
   * Get coluuid
   * @return coluuid
   **/
  @Schema(description = "")
  
    public String getColuuid() {
    return coluuid;
  }

  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  public UtilContentCreateBody dir(String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Get dir
   * @return dir
   **/
  @Schema(description = "")
  
    public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public UtilContentCreateBody location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")
  
    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UtilContentCreateBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UtilContentCreateBody overwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  /**
   * Get overwrite
   * @return overwrite
   **/
  @Schema(description = "")
  
    public Boolean isOverwrite() {
    return overwrite;
  }

  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }

  public UtilContentCreateBody root(String root) {
    this.root = root;
    return this;
  }

  /**
   * Get root
   * @return root
   **/
  @Schema(description = "")
  
    public String getRoot() {
    return root;
  }

  public void setRoot(String root) {
    this.root = root;
  }

  public UtilContentCreateBody type(UtilContentType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    @Valid
    public UtilContentType getType() {
    return type;
  }

  public void setType(UtilContentType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContentCreateBody utilContentCreateBody = (UtilContentCreateBody) o;
    return Objects.equals(this.coluuid, utilContentCreateBody.coluuid) &&
        Objects.equals(this.dir, utilContentCreateBody.dir) &&
        Objects.equals(this.location, utilContentCreateBody.location) &&
        Objects.equals(this.name, utilContentCreateBody.name) &&
        Objects.equals(this.overwrite, utilContentCreateBody.overwrite) &&
        Objects.equals(this.root, utilContentCreateBody.root) &&
        Objects.equals(this.type, utilContentCreateBody.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coluuid, dir, location, name, overwrite, root, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentCreateBody {\n");
    
    sb.append("    coluuid: ").append(toIndentedString(coluuid)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
