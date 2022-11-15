package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
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

public class UtilContentAddResponse   {
  
  @Schema(description = "")
  private String cid = null;
  
  @Schema(description = "")
  private Integer estuaryId = null;
  
  @Schema(description = "")
  private List<String> providers = null;
  
  @Schema(description = "")
  private String retrievalUrl = null;
 /**
   * Get cid
   * @return cid
  **/
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public UtilContentAddResponse cid(String cid) {
    this.cid = cid;
    return this;
  }

 /**
   * Get estuaryId
   * @return estuaryId
  **/
  @JsonProperty("estuaryId")
  public Integer getEstuaryId() {
    return estuaryId;
  }

  public void setEstuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
  }

  public UtilContentAddResponse estuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
    return this;
  }

 /**
   * Get providers
   * @return providers
  **/
  @JsonProperty("providers")
  public List<String> getProviders() {
    return providers;
  }

  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  public UtilContentAddResponse providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public UtilContentAddResponse addProvidersItem(String providersItem) {
    this.providers.add(providersItem);
    return this;
  }

 /**
   * Get retrievalUrl
   * @return retrievalUrl
  **/
  @JsonProperty("retrieval_url")
  public String getRetrievalUrl() {
    return retrievalUrl;
  }

  public void setRetrievalUrl(String retrievalUrl) {
    this.retrievalUrl = retrievalUrl;
  }

  public UtilContentAddResponse retrievalUrl(String retrievalUrl) {
    this.retrievalUrl = retrievalUrl;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
