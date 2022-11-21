package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UtilContentAddResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-11-21T16:22:18.815Z[GMT]")
public class UtilContentAddResponse   {
  @JsonProperty("cid")
  private String cid = null;

  @JsonProperty("estuaryId")
  private Integer estuaryId = null;

  @JsonProperty("estuary_retrieval_url")
  private String estuaryRetrievalUrl = null;

  @JsonProperty("providers")
  @Valid
  private List<String> providers = null;

  @JsonProperty("retrieval_url")
  private String retrievalUrl = null;

  public UtilContentAddResponse cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * Get cid
   * @return cid
  **/
  @Schema(description = "")

  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public UtilContentAddResponse estuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
    return this;
  }

  /**
   * Get estuaryId
   * @return estuaryId
  **/
  @Schema(description = "")

  public Integer getEstuaryId() {
    return estuaryId;
  }

  public void setEstuaryId(Integer estuaryId) {
    this.estuaryId = estuaryId;
  }

  public UtilContentAddResponse estuaryRetrievalUrl(String estuaryRetrievalUrl) {
    this.estuaryRetrievalUrl = estuaryRetrievalUrl;
    return this;
  }

  /**
   * Get estuaryRetrievalUrl
   * @return estuaryRetrievalUrl
  **/
  @Schema(description = "")

  public String getEstuaryRetrievalUrl() {
    return estuaryRetrievalUrl;
  }

  public void setEstuaryRetrievalUrl(String estuaryRetrievalUrl) {
    this.estuaryRetrievalUrl = estuaryRetrievalUrl;
  }

  public UtilContentAddResponse providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public UtilContentAddResponse addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<String>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Get providers
   * @return providers
  **/
  @Schema(description = "")

  public List<String> getProviders() {
    return providers;
  }

  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  public UtilContentAddResponse retrievalUrl(String retrievalUrl) {
    this.retrievalUrl = retrievalUrl;
    return this;
  }

  /**
   * Get retrievalUrl
   * @return retrievalUrl
  **/
  @Schema(description = "")

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
    return Objects.equals(this.cid, utilContentAddResponse.cid) &&
        Objects.equals(this.estuaryId, utilContentAddResponse.estuaryId) &&
        Objects.equals(this.estuaryRetrievalUrl, utilContentAddResponse.estuaryRetrievalUrl) &&
        Objects.equals(this.providers, utilContentAddResponse.providers) &&
        Objects.equals(this.retrievalUrl, utilContentAddResponse.retrievalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, estuaryId, estuaryRetrievalUrl, providers, retrievalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentAddResponse {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    estuaryId: ").append(toIndentedString(estuaryId)).append("\n");
    sb.append("    estuaryRetrievalUrl: ").append(toIndentedString(estuaryRetrievalUrl)).append("\n");
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
