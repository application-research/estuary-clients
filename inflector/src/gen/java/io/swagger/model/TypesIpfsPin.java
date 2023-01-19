package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-01-19T16:29:58.380Z[GMT]")
public class TypesIpfsPin   {
  @JsonProperty("cid")
  private String cid = null;
  @JsonProperty("meta")
  private Map<String, Object> meta = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("origins")
  private List<String> origins = null;
  /**
   **/
  public TypesIpfsPin cid(String cid) {
    this.cid = cid;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  /**
   **/
  public TypesIpfsPin meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("meta")
  public Map<String, Object> getMeta() {
    return meta;
  }
  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  /**
   **/
  public TypesIpfsPin name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public TypesIpfsPin origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("origins")
  public List<String> getOrigins() {
    return origins;
  }
  public void setOrigins(List<String> origins) {
    this.origins = origins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesIpfsPin typesIpfsPin = (TypesIpfsPin) o;
    return Objects.equals(cid, typesIpfsPin.cid) &&
        Objects.equals(meta, typesIpfsPin.meta) &&
        Objects.equals(name, typesIpfsPin.name) &&
        Objects.equals(origins, typesIpfsPin.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, meta, name, origins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesIpfsPin {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
