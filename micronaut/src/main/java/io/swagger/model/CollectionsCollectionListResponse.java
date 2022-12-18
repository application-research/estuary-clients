package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CollectionsCidType;
import io.swagger.model.UtilDbCID;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CollectionsCollectionListResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-18T07:30:24.869Z[GMT]")
public class CollectionsCollectionListResponse   {
  @JsonProperty("cid")
  private UtilDbCID cid = null;

  @JsonProperty("coluuid")
  private String coluuid = null;

  @JsonProperty("contId")
  private Integer contId = null;

  @JsonProperty("dir")
  private String dir = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("type")
  private CollectionsCidType type = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;

  public CollectionsCollectionListResponse cid(UtilDbCID cid) {
    this.cid = cid;
    return this;
  }

  /**
   * Get cid
   * @return cid
  **/
  @Schema(description = "")

  @Valid
  public UtilDbCID getCid() {
    return cid;
  }

  public void setCid(UtilDbCID cid) {
    this.cid = cid;
  }

  public CollectionsCollectionListResponse coluuid(String coluuid) {
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

  public CollectionsCollectionListResponse contId(Integer contId) {
    this.contId = contId;
    return this;
  }

  /**
   * Get contId
   * @return contId
  **/
  @Schema(description = "")

  public Integer getContId() {
    return contId;
  }

  public void setContId(Integer contId) {
    this.contId = contId;
  }

  public CollectionsCollectionListResponse dir(String dir) {
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

  public CollectionsCollectionListResponse name(String name) {
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

  public CollectionsCollectionListResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @Schema(description = "")

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public CollectionsCollectionListResponse type(CollectionsCidType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @Schema(description = "")

  @Valid
  public CollectionsCidType getType() {
    return type;
  }

  public void setType(CollectionsCidType type) {
    this.type = type;
  }

  public CollectionsCollectionListResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")

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
    return Objects.equals(this.cid, collectionsCollectionListResponse.cid) &&
        Objects.equals(this.coluuid, collectionsCollectionListResponse.coluuid) &&
        Objects.equals(this.contId, collectionsCollectionListResponse.contId) &&
        Objects.equals(this.dir, collectionsCollectionListResponse.dir) &&
        Objects.equals(this.name, collectionsCollectionListResponse.name) &&
        Objects.equals(this.size, collectionsCollectionListResponse.size) &&
        Objects.equals(this.type, collectionsCollectionListResponse.type) &&
        Objects.equals(this.updatedAt, collectionsCollectionListResponse.updatedAt);
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
