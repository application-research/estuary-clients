package io.swagger.model;

import io.swagger.model.CollectionsCidType;
import io.swagger.model.UtilDbCID;
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

public class CollectionsCollectionListResponse   {
  
  @Schema(description = "")
  private UtilDbCID cid = null;
  
  @Schema(description = "")
  private String coluuid = null;
  
  @Schema(description = "")
  private Integer contId = null;
  
  @Schema(description = "")
  private String dir = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private Integer size = null;
  
  @Schema(description = "")
  private CollectionsCidType type = null;
  
  @Schema(description = "")
  private String updatedAt = null;
 /**
   * Get cid
   * @return cid
  **/
  @JsonProperty("cid")
  public UtilDbCID getCid() {
    return cid;
  }

  public void setCid(UtilDbCID cid) {
    this.cid = cid;
  }

  public CollectionsCollectionListResponse cid(UtilDbCID cid) {
    this.cid = cid;
    return this;
  }

 /**
   * Get coluuid
   * @return coluuid
  **/
  @JsonProperty("coluuid")
  public String getColuuid() {
    return coluuid;
  }

  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  public CollectionsCollectionListResponse coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

 /**
   * Get contId
   * @return contId
  **/
  @JsonProperty("contId")
  public Integer getContId() {
    return contId;
  }

  public void setContId(Integer contId) {
    this.contId = contId;
  }

  public CollectionsCollectionListResponse contId(Integer contId) {
    this.contId = contId;
    return this;
  }

 /**
   * Get dir
   * @return dir
  **/
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public CollectionsCollectionListResponse dir(String dir) {
    this.dir = dir;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CollectionsCollectionListResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public CollectionsCollectionListResponse size(Integer size) {
    this.size = size;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public CollectionsCidType getType() {
    return type;
  }

  public void setType(CollectionsCidType type) {
    this.type = type;
  }

  public CollectionsCollectionListResponse type(CollectionsCidType type) {
    this.type = type;
    return this;
  }

 /**
   * Get updatedAt
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CollectionsCollectionListResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
