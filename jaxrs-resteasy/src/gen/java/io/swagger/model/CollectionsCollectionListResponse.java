package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CollectionsCidType;
import io.swagger.model.UtilDbCID;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-12-14T06:22:39.433Z[GMT]")public class CollectionsCollectionListResponse   {
  private UtilDbCID cid = null;  private String coluuid = null;  private Integer contId = null;  private String dir = null;  private String name = null;  private Integer size = null;  private CollectionsCidType type = null;  private String updatedAt = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("cid")
  public UtilDbCID getCid() {
    return cid;
  }
  public void setCid(UtilDbCID cid) {
    this.cid = cid;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("coluuid")
  public String getColuuid() {
    return coluuid;
  }
  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("contId")
  public Integer getContId() {
    return contId;
  }
  public void setContId(Integer contId) {
    this.contId = contId;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }
  public void setDir(String dir) {
    this.dir = dir;
  }

  /**
   **/
  
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
  
  @Schema(description = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("type")
  public CollectionsCidType getType() {
    return type;
  }
  public void setType(CollectionsCidType type) {
    this.type = type;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionsCollectionListResponse collectionsCollectionListResponse = (CollectionsCollectionListResponse) o;
    return Objects.equals(cid, collectionsCollectionListResponse.cid) &&
        Objects.equals(coluuid, collectionsCollectionListResponse.coluuid) &&
        Objects.equals(contId, collectionsCollectionListResponse.contId) &&
        Objects.equals(dir, collectionsCollectionListResponse.dir) &&
        Objects.equals(name, collectionsCollectionListResponse.name) &&
        Objects.equals(size, collectionsCollectionListResponse.size) &&
        Objects.equals(type, collectionsCollectionListResponse.type) &&
        Objects.equals(updatedAt, collectionsCollectionListResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, coluuid, contId, dir, name, size, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsCollectionListResponse {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    coluuid: ").append(toIndentedString(coluuid)).append("\n");
    sb.append("    contId: ").append(toIndentedString(contId)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
