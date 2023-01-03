package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CollectionsCidType;
import io.swagger.model.UtilDbCID;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-01-03T16:17:31.432Z[GMT]")
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
  /**
   **/
  public CollectionsCollectionListResponse cid(UtilDbCID cid) {
    this.cid = cid;
    return this;
  }

  
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
  public CollectionsCollectionListResponse coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

  
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
  public CollectionsCollectionListResponse contId(Integer contId) {
    this.contId = contId;
    return this;
  }

  
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
  public CollectionsCollectionListResponse dir(String dir) {
    this.dir = dir;
    return this;
  }

  
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
  public CollectionsCollectionListResponse name(String name) {
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
  public CollectionsCollectionListResponse size(Integer size) {
    this.size = size;
    return this;
  }

  
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
  public CollectionsCollectionListResponse type(CollectionsCidType type) {
    this.type = type;
    return this;
  }

  
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
  public CollectionsCollectionListResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
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
