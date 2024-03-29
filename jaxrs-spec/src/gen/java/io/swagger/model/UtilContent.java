package io.swagger.model;

import io.swagger.model.UtilContentType;
import io.swagger.model.UtilDbCID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UtilContent   {

  private @Valid Boolean active = null;

  private @Valid Boolean aggregate = null;

  private @Valid Integer aggregatedIn = null;

  private @Valid UtilDbCID cid = null;

  private @Valid String createdAt = null;

  private @Valid Boolean dagSplit = null;

  private @Valid String dealStatus = null;

  private @Valid String description = null;

  private @Valid Boolean failed = null;

  private @Valid Integer id = null;

  private @Valid String location = null;

  private @Valid String name = null;

  private @Valid Boolean offloaded = null;

  private @Valid String origins = null;

  private @Valid String pinMeta = null;

  private @Valid Boolean pinning = null;

  private @Valid String pinningStatus = null;

  private @Valid Boolean replace = null;

  private @Valid Integer replication = null;

  private @Valid Integer size = null;

  private @Valid Integer splitFrom = null;

  private @Valid UtilContentType type = null;

  private @Valid String updatedAt = null;

  private @Valid Integer userId = null;

  /**
   **/
  public UtilContent active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("active")

  public Boolean isActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  public UtilContent aggregate(Boolean aggregate) {
    this.aggregate = aggregate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aggregate")

  public Boolean isAggregate() {
    return aggregate;
  }
  public void setAggregate(Boolean aggregate) {
    this.aggregate = aggregate;
  }

  /**
   * TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler
   **/
  public UtilContent aggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
    return this;
  }

  
  @ApiModelProperty(value = "TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler")
  @JsonProperty("aggregatedIn")

  public Integer getAggregatedIn() {
    return aggregatedIn;
  }
  public void setAggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
  }

  /**
   **/
  public UtilContent cid(UtilDbCID cid) {
    this.cid = cid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cid")

  public UtilDbCID getCid() {
    return cid;
  }
  public void setCid(UtilDbCID cid) {
    this.cid = cid;
  }

  /**
   **/
  public UtilContent createdAt(String createdAt) {
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
   * If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
   **/
  public UtilContent dagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
    return this;
  }

  
  @ApiModelProperty(value = "If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)")
  @JsonProperty("dagSplit")

  public Boolean isDagSplit() {
    return dagSplit;
  }
  public void setDagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
  }

  /**
   **/
  public UtilContent dealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dealStatus")

  public String getDealStatus() {
    return dealStatus;
  }
  public void setDealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
  }

  /**
   **/
  public UtilContent description(String description) {
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
  public UtilContent failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("failed")

  public Boolean isFailed() {
    return failed;
  }
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  /**
   **/
  public UtilContent id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public UtilContent location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("location")

  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public UtilContent name(String name) {
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
  public UtilContent offloaded(Boolean offloaded) {
    this.offloaded = offloaded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offloaded")

  public Boolean isOffloaded() {
    return offloaded;
  }
  public void setOffloaded(Boolean offloaded) {
    this.offloaded = offloaded;
  }

  /**
   **/
  public UtilContent origins(String origins) {
    this.origins = origins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("origins")

  public String getOrigins() {
    return origins;
  }
  public void setOrigins(String origins) {
    this.origins = origins;
  }

  /**
   **/
  public UtilContent pinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pinMeta")

  public String getPinMeta() {
    return pinMeta;
  }
  public void setPinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
  }

  /**
   **/
  public UtilContent pinning(Boolean pinning) {
    this.pinning = pinning;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pinning")

  public Boolean isPinning() {
    return pinning;
  }
  public void setPinning(Boolean pinning) {
    this.pinning = pinning;
  }

  /**
   **/
  public UtilContent pinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pinningStatus")

  public String getPinningStatus() {
    return pinningStatus;
  }
  public void setPinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
  }

  /**
   **/
  public UtilContent replace(Boolean replace) {
    this.replace = replace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replace")

  public Boolean isReplace() {
    return replace;
  }
  public void setReplace(Boolean replace) {
    this.replace = replace;
  }

  /**
   **/
  public UtilContent replication(Integer replication) {
    this.replication = replication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replication")

  public Integer getReplication() {
    return replication;
  }
  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  /**
   **/
  public UtilContent size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")

  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  public UtilContent splitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("splitFrom")

  public Integer getSplitFrom() {
    return splitFrom;
  }
  public void setSplitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
  }

  /**
   **/
  public UtilContent type(UtilContentType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")

  public UtilContentType getType() {
    return type;
  }
  public void setType(UtilContentType type) {
    this.type = type;
  }

  /**
   **/
  public UtilContent updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updatedAt")

  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  public UtilContent userId(Integer userId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContent utilContent = (UtilContent) o;
    return Objects.equals(active, utilContent.active) &&
        Objects.equals(aggregate, utilContent.aggregate) &&
        Objects.equals(aggregatedIn, utilContent.aggregatedIn) &&
        Objects.equals(cid, utilContent.cid) &&
        Objects.equals(createdAt, utilContent.createdAt) &&
        Objects.equals(dagSplit, utilContent.dagSplit) &&
        Objects.equals(dealStatus, utilContent.dealStatus) &&
        Objects.equals(description, utilContent.description) &&
        Objects.equals(failed, utilContent.failed) &&
        Objects.equals(id, utilContent.id) &&
        Objects.equals(location, utilContent.location) &&
        Objects.equals(name, utilContent.name) &&
        Objects.equals(offloaded, utilContent.offloaded) &&
        Objects.equals(origins, utilContent.origins) &&
        Objects.equals(pinMeta, utilContent.pinMeta) &&
        Objects.equals(pinning, utilContent.pinning) &&
        Objects.equals(pinningStatus, utilContent.pinningStatus) &&
        Objects.equals(replace, utilContent.replace) &&
        Objects.equals(replication, utilContent.replication) &&
        Objects.equals(size, utilContent.size) &&
        Objects.equals(splitFrom, utilContent.splitFrom) &&
        Objects.equals(type, utilContent.type) &&
        Objects.equals(updatedAt, utilContent.updatedAt) &&
        Objects.equals(userId, utilContent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, aggregate, aggregatedIn, cid, createdAt, dagSplit, dealStatus, description, failed, id, location, name, offloaded, origins, pinMeta, pinning, pinningStatus, replace, replication, size, splitFrom, type, updatedAt, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContent {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
    sb.append("    aggregatedIn: ").append(toIndentedString(aggregatedIn)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dagSplit: ").append(toIndentedString(dagSplit)).append("\n");
    sb.append("    dealStatus: ").append(toIndentedString(dealStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offloaded: ").append(toIndentedString(offloaded)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
    sb.append("    pinMeta: ").append(toIndentedString(pinMeta)).append("\n");
    sb.append("    pinning: ").append(toIndentedString(pinning)).append("\n");
    sb.append("    pinningStatus: ").append(toIndentedString(pinningStatus)).append("\n");
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
    sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    splitFrom: ").append(toIndentedString(splitFrom)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
