package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UtilContentAddResponse   {

  private @Valid String cid = null;

  private @Valid Integer estuaryId = null;

  private @Valid List<String> providers = new ArrayList<String>();

  private @Valid String retrievalUrl = null;

  /**
   **/
  public UtilContentAddResponse cid(String cid) {
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
  public UtilContentAddResponse estuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("estuaryId")

  public Integer getEstuaryId() {
    return estuaryId;
  }
  public void setEstuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
  }

  /**
   **/
  public UtilContentAddResponse providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("providers")

  public List<String> getProviders() {
    return providers;
  }
  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  /**
   **/
  public UtilContentAddResponse retrievalUrl(String retrievalUrl) {
    this.retrievalUrl = retrievalUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("retrieval_url")

  public String getRetrievalUrl() {
    return retrievalUrl;
  }
  public void setRetrievalUrl(String retrievalUrl) {
    this.retrievalUrl = retrievalUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContentAddResponse utilContentAddResponse = (UtilContentAddResponse) o;
    return Objects.equals(cid, utilContentAddResponse.cid) &&
        Objects.equals(estuaryId, utilContentAddResponse.estuaryId) &&
        Objects.equals(providers, utilContentAddResponse.providers) &&
        Objects.equals(retrievalUrl, utilContentAddResponse.retrievalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, estuaryId, providers, retrievalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentAddResponse {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    estuaryId: ").append(toIndentedString(estuaryId)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    retrievalUrl: ").append(toIndentedString(retrievalUrl)).append("\n");
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
