package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-02-02T18:38:34.241Z[GMT]")
public class ApiEstimateDealBody   {
  @JsonProperty("durationBlks")
  private Integer durationBlks = null;
  @JsonProperty("replication")
  private Integer replication = null;
  @JsonProperty("size")
  private Integer size = null;
  @JsonProperty("verified")
  private Boolean verified = null;
  /**
   **/
  public ApiEstimateDealBody durationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("durationBlks")
  public Integer getDurationBlks() {
    return durationBlks;
  }
  public void setDurationBlks(Integer durationBlks) {
    this.durationBlks = durationBlks;
  }

  /**
   **/
  public ApiEstimateDealBody replication(Integer replication) {
    this.replication = replication;
    return this;
  }

  
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
  public ApiEstimateDealBody size(Integer size) {
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
  public ApiEstimateDealBody verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("verified")
  public Boolean isVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiEstimateDealBody apiEstimateDealBody = (ApiEstimateDealBody) o;
    return Objects.equals(durationBlks, apiEstimateDealBody.durationBlks) &&
        Objects.equals(replication, apiEstimateDealBody.replication) &&
        Objects.equals(size, apiEstimateDealBody.size) &&
        Objects.equals(verified, apiEstimateDealBody.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationBlks, replication, size, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiEstimateDealBody {\n");
    sb.append("    durationBlks: ").append(toIndentedString(durationBlks)).append("\n");
    sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
