package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UtilContentType;
import io.swagger.model.UtilDbCID;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-02-02T18:38:38.031Z[GMT]")public class UtilContent   {
  private Boolean active = null;  private Boolean aggregate = null;  private Integer aggregatedIn = null;  private UtilDbCID cid = null;  private String createdAt = null;  private Boolean dagSplit = null;  private String dealStatus = null;  private String description = null;  private Boolean failed = null;  private Integer id = null;  private String location = null;  private String name = null;  private Boolean offloaded = null;  private String origins = null;  private String pinMeta = null;  private Boolean pinning = null;  private String pinningStatus = null;  private Boolean replace = null;  private Integer replication = null;  private Integer size = null;  private Integer splitFrom = null;  private UtilContentType type = null;  private String updatedAt = null;  private Integer userId = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("active")
  public Boolean isActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @Schema(description = "")
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
  
  @Schema(description = "TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler")
  @JsonProperty("aggregatedIn")
  public Integer getAggregatedIn() {
    return aggregatedIn;
  }
  public void setAggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
  }

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
  
  @Schema(description = "If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)")
  @JsonProperty("dagSplit")
  public Boolean isDagSplit() {
    return dagSplit;
  }
  public void setDagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("dealStatus")
  public String getDealStatus() {
    return dealStatus;
  }
  public void setDealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("failed")
  public Boolean isFailed() {
    return failed;
  }
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
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
  @JsonProperty("offloaded")
  public Boolean isOffloaded() {
    return offloaded;
  }
  public void setOffloaded(Boolean offloaded) {
    this.offloaded = offloaded;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("origins")
  public String getOrigins() {
    return origins;
  }
  public void setOrigins(String origins) {
    this.origins = origins;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("pinMeta")
  public String getPinMeta() {
    return pinMeta;
  }
  public void setPinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("pinning")
  public Boolean isPinning() {
    return pinning;
  }
  public void setPinning(Boolean pinning) {
    this.pinning = pinning;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("pinningStatus")
  public String getPinningStatus() {
    return pinningStatus;
  }
  public void setPinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("replace")
  public Boolean isReplace() {
    return replace;
  }
  public void setReplace(Boolean replace) {
    this.replace = replace;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("replication")
  public Integer getReplication() {
    return replication;
  }
  public void setReplication(Integer replication) {
    this.replication = replication;
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
  @JsonProperty("splitFrom")
  public Integer getSplitFrom() {
    return splitFrom;
  }
  public void setSplitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("type")
  public UtilContentType getType() {
    return type;
  }
  public void setType(UtilContentType type) {
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

  /**
   **/
  
  @Schema(description = "")
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
