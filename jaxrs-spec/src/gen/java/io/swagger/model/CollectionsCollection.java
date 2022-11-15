package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CollectionsCollection   {

  private @Valid String cid = null;

  private @Valid String createdAt = null;

  private @Valid String description = null;

  private @Valid String name = null;

  private @Valid Integer userId = null;

  private @Valid String uuid = null;

  /**
   **/
  public CollectionsCollection cid(String cid) {
    this.cid = cid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cid")

  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  /**
   **/
  public CollectionsCollection createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("createdAt")

  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public CollectionsCollection description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public CollectionsCollection name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CollectionsCollection userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")

  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  public CollectionsCollection uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid")

  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionsCollection collectionsCollection = (CollectionsCollection) o;
    return Objects.equals(cid, collectionsCollection.cid) &&
        Objects.equals(createdAt, collectionsCollection.createdAt) &&
        Objects.equals(description, collectionsCollection.description) &&
        Objects.equals(name, collectionsCollection.name) &&
        Objects.equals(userId, collectionsCollection.userId) &&
        Objects.equals(uuid, collectionsCollection.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, createdAt, description, name, userId, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsCollection {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
