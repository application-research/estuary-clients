package io.swagger.model;

import io.swagger.model.UtilContentType;
import io.swagger.model.UtilDbCID;

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

public class UtilContent   {
  
  @Schema(description = "")
  private Boolean active = null;
  
  @Schema(description = "")
  private Boolean aggregate = null;
  
  @Schema(description = "TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler")
 /**
   * TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler  
  **/
  private Integer aggregatedIn = null;
  
  @Schema(description = "")
  private UtilDbCID cid = null;
  
  @Schema(description = "")
  private String createdAt = null;
  
  @Schema(description = "If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)")
 /**
   * If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)  
  **/
  private Boolean dagSplit = null;
  
  @Schema(description = "")
  private String dealStatus = null;
  
  @Schema(description = "")
  private String description = null;
  
  @Schema(description = "")
  private Boolean failed = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private String location = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private Boolean offloaded = null;
  
  @Schema(description = "")
  private String origins = null;
  
  @Schema(description = "")
  private String pinMeta = null;
  
  @Schema(description = "")
  private Boolean pinning = null;
  
  @Schema(description = "")
  private String pinningStatus = null;
  
  @Schema(description = "")
  private Boolean replace = null;
  
  @Schema(description = "")
  private Integer replication = null;
  
  @Schema(description = "")
  private Integer size = null;
  
  @Schema(description = "")
  private Integer splitFrom = null;
  
  @Schema(description = "")
  private UtilContentType type = null;
  
  @Schema(description = "")
  private String updatedAt = null;
  
  @Schema(description = "")
  private Integer userId = null;
 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UtilContent active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get aggregate
   * @return aggregate
  **/
  @JsonProperty("aggregate")
  public Boolean isAggregate() {
    return aggregate;
  }

  public void setAggregate(Boolean aggregate) {
    this.aggregate = aggregate;
  }

  public UtilContent aggregate(Boolean aggregate) {
    this.aggregate = aggregate;
    return this;
  }

 /**
   * TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler
   * @return aggregatedIn
  **/
  @JsonProperty("aggregatedIn")
  public Integer getAggregatedIn() {
    return aggregatedIn;
  }

  public void setAggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
  }

  public UtilContent aggregatedIn(Integer aggregatedIn) {
    this.aggregatedIn = aggregatedIn;
    return this;
  }

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

  public UtilContent cid(UtilDbCID cid) {
    this.cid = cid;
    return this;
  }

 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public UtilContent createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
   * @return dagSplit
  **/
  @JsonProperty("dagSplit")
  public Boolean isDagSplit() {
    return dagSplit;
  }

  public void setDagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
  }

  public UtilContent dagSplit(Boolean dagSplit) {
    this.dagSplit = dagSplit;
    return this;
  }

 /**
   * Get dealStatus
   * @return dealStatus
  **/
  @JsonProperty("dealStatus")
  public String getDealStatus() {
    return dealStatus;
  }

  public void setDealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
  }

  public UtilContent dealStatus(String dealStatus) {
    this.dealStatus = dealStatus;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UtilContent description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get failed
   * @return failed
  **/
  @JsonProperty("failed")
  public Boolean isFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  public UtilContent failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UtilContent id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UtilContent location(String location) {
    this.location = location;
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

  public UtilContent name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get offloaded
   * @return offloaded
  **/
  @JsonProperty("offloaded")
  public Boolean isOffloaded() {
    return offloaded;
  }

  public void setOffloaded(Boolean offloaded) {
    this.offloaded = offloaded;
  }

  public UtilContent offloaded(Boolean offloaded) {
    this.offloaded = offloaded;
    return this;
  }

 /**
   * Get origins
   * @return origins
  **/
  @JsonProperty("origins")
  public String getOrigins() {
    return origins;
  }

  public void setOrigins(String origins) {
    this.origins = origins;
  }

  public UtilContent origins(String origins) {
    this.origins = origins;
    return this;
  }

 /**
   * Get pinMeta
   * @return pinMeta
  **/
  @JsonProperty("pinMeta")
  public String getPinMeta() {
    return pinMeta;
  }

  public void setPinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
  }

  public UtilContent pinMeta(String pinMeta) {
    this.pinMeta = pinMeta;
    return this;
  }

 /**
   * Get pinning
   * @return pinning
  **/
  @JsonProperty("pinning")
  public Boolean isPinning() {
    return pinning;
  }

  public void setPinning(Boolean pinning) {
    this.pinning = pinning;
  }

  public UtilContent pinning(Boolean pinning) {
    this.pinning = pinning;
    return this;
  }

 /**
   * Get pinningStatus
   * @return pinningStatus
  **/
  @JsonProperty("pinningStatus")
  public String getPinningStatus() {
    return pinningStatus;
  }

  public void setPinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
  }

  public UtilContent pinningStatus(String pinningStatus) {
    this.pinningStatus = pinningStatus;
    return this;
  }

 /**
   * Get replace
   * @return replace
  **/
  @JsonProperty("replace")
  public Boolean isReplace() {
    return replace;
  }

  public void setReplace(Boolean replace) {
    this.replace = replace;
  }

  public UtilContent replace(Boolean replace) {
    this.replace = replace;
    return this;
  }

 /**
   * Get replication
   * @return replication
  **/
  @JsonProperty("replication")
  public Integer getReplication() {
    return replication;
  }

  public void setReplication(Integer replication) {
    this.replication = replication;
  }

  public UtilContent replication(Integer replication) {
    this.replication = replication;
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

  public UtilContent size(Integer size) {
    this.size = size;
    return this;
  }

 /**
   * Get splitFrom
   * @return splitFrom
  **/
  @JsonProperty("splitFrom")
  public Integer getSplitFrom() {
    return splitFrom;
  }

  public void setSplitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
  }

  public UtilContent splitFrom(Integer splitFrom) {
    this.splitFrom = splitFrom;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public UtilContentType getType() {
    return type;
  }

  public void setType(UtilContentType type) {
    this.type = type;
  }

  public UtilContent type(UtilContentType type) {
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

  public UtilContent updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UtilContent userId(Integer userId) {
    this.userId = userId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
