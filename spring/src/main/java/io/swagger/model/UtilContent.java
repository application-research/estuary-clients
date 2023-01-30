package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UtilContentType;
import io.swagger.model.UtilDbCID;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UtilContent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T18:30:36.664Z[GMT]")


public class UtilContent   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("aggregate")
  private Boolean aggregate = null;

  @JsonProperty("aggregatedIn")
  private Integer aggregatedIn = null;

  @JsonProperty("cid")
  private UtilDbCID cid = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("dagSplit")
  private Boolean dagSplit = null;

  @JsonProperty("dealStatus")
  private String dealStatus = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("failed")
  private Boolean failed = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("offloaded")
  private Boolean offloaded = null;

  @JsonProperty("origins")
  private String origins = null;

  @JsonProperty("pinMeta")
  private String pinMeta = null;

  @JsonProperty("pinning")
  private Boolean pinning = null;

  @JsonProperty("pinningStatus")
  private String pinningStatus = null;

  @JsonProperty("replace")
  private Boolean replace = null;

  @JsonProperty("replication")
  private Integer replication = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("splitFrom")
  private Integer splitFrom = null;

  @JsonProperty("type")
  private UtilContentType type = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;

  @JsonProperty("userId")
  private Integer userId = null;

  public UtilContent active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   **/
  @Schema(description = "")
  
    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UtilContent aggregate(Boolean aggregate) {
    this.aggregate = aggregate;
    return this;
  }

  /**
   * Get aggregate
   * @return aggregate
   **/
  @Schema(description = "")
  
    public Boolean isAggregate() {
    return aggregate;
  }

  public void setAggregate(Boolean aggregate) {
    this.aggregate = aggregate;
  }

  public UtilContent aggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
    return this;
  }

  /**
   * TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
   * @return aggregatedIn
   **/
  @Schema(description = "TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler")
  
    public Integer getAggregatedIn() {
    return aggregatedIn;
  }

  public void setAggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
  }

  public UtilContent cid(UtilDbCID cid) {
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

  public UtilContent createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(description = "")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public UtilContent dagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
    return this;
  }

  /**
   * If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
   * @return dagSplit
   **/
  @Schema(description = "If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)")
  
    public Boolean isDagSplit() {
    return dagSplit;
  }

  public void setDagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
  }

  public UtilContent dealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
    return this;
  }

  /**
   * Get dealStatus
   * @return dealStatus
   **/
  @Schema(description = "")
  
    public String getDealStatus() {
    return dealStatus;
  }

  public void setDealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
  }

  public UtilContent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UtilContent failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Get failed
   * @return failed
   **/
  @Schema(description = "")
  
    public Boolean isFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  public UtilContent id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UtilContent location(String location) {
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

  public UtilContent name(String name) {
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

  public UtilContent offloaded(Boolean offloaded) {
    this.offloaded = offloaded;
    return this;
  }

  /**
   * Get offloaded
   * @return offloaded
   **/
  @Schema(description = "")
  
    public Boolean isOffloaded() {
    return offloaded;
  }

  public void setOffloaded(Boolean offloaded) {
    this.offloaded = offloaded;
  }

  public UtilContent origins(String origins) {
    this.origins = origins;
    return this;
  }

  /**
   * Get origins
   * @return origins
   **/
  @Schema(description = "")
  
    public String getOrigins() {
    return origins;
  }

  public void setOrigins(String origins) {
    this.origins = origins;
  }

  public UtilContent pinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
    return this;
  }

  /**
   * Get pinMeta
   * @return pinMeta
   **/
  @Schema(description = "")
  
    public String getPinMeta() {
    return pinMeta;
  }

  public void setPinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
  }

  public UtilContent pinning(Boolean pinning) {
    this.pinning = pinning;
    return this;
  }

  /**
   * Get pinning
   * @return pinning
   **/
  @Schema(description = "")
  
    public Boolean isPinning() {
    return pinning;
  }

  public void setPinning(Boolean pinning) {
    this.pinning = pinning;
  }

  public UtilContent pinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
    return this;
  }

  /**
   * Get pinningStatus
   * @return pinningStatus
   **/
  @Schema(description = "")
  
    public String getPinningStatus() {
    return pinningStatus;
  }

  public void setPinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
  }

  public UtilContent replace(Boolean replace) {
    this.replace = replace;
    return this;
  }

  /**
   * Get replace
   * @return replace
   **/
  @Schema(description = "")
  
    public Boolean isReplace() {
    return replace;
  }

  public void setReplace(Boolean replace) {
    this.replace = replace;
  }

  public UtilContent replication(Integer replication) {
    this.replication = replication;
    return this;
  }

  /**
   * Get replication
   * @return replication
   **/
  @Schema(description = "")
  
    public Integer getReplication() {
    return replication;
  }

  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  public UtilContent size(Integer size) {
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

  public UtilContent splitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
    return this;
  }

  /**
   * Get splitFrom
   * @return splitFrom
   **/
  @Schema(description = "")
  
    public Integer getSplitFrom() {
    return splitFrom;
  }

  public void setSplitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
  }

  public UtilContent type(UtilContentType type) {
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

  public UtilContent updatedAt(String updatedAt) {
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

  public UtilContent userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(description = "")
  
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
    return Objects.equals(this.active, utilContent.active) &&
        Objects.equals(this.aggregate, utilContent.aggregate) &&
        Objects.equals(this.aggregatedIn, utilContent.aggregatedIn) &&
        Objects.equals(this.cid, utilContent.cid) &&
        Objects.equals(this.createdAt, utilContent.createdAt) &&
        Objects.equals(this.dagSplit, utilContent.dagSplit) &&
        Objects.equals(this.dealStatus, utilContent.dealStatus) &&
        Objects.equals(this.description, utilContent.description) &&
        Objects.equals(this.failed, utilContent.failed) &&
        Objects.equals(this.id, utilContent.id) &&
        Objects.equals(this.location, utilContent.location) &&
        Objects.equals(this.name, utilContent.name) &&
        Objects.equals(this.offloaded, utilContent.offloaded) &&
        Objects.equals(this.origins, utilContent.origins) &&
        Objects.equals(this.pinMeta, utilContent.pinMeta) &&
        Objects.equals(this.pinning, utilContent.pinning) &&
        Objects.equals(this.pinningStatus, utilContent.pinningStatus) &&
        Objects.equals(this.replace, utilContent.replace) &&
        Objects.equals(this.replication, utilContent.replication) &&
        Objects.equals(this.size, utilContent.size) &&
        Objects.equals(this.splitFrom, utilContent.splitFrom) &&
        Objects.equals(this.type, utilContent.type) &&
        Objects.equals(this.updatedAt, utilContent.updatedAt) &&
        Objects.equals(this.userId, utilContent.userId);
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
