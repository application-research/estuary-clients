package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2022-12-18T07:30:23.308Z[GMT]")
public class ApiChannelIDParam   {
  @JsonProperty("id")
  private Integer id = null;
  @JsonProperty("initiator")
  private String initiator = null;
  @JsonProperty("responder")
  private String responder = null;
  /**
   **/
  public ApiChannelIDParam id(Integer id) {
    this.id = id;
    return this;
  }

  
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
  public ApiChannelIDParam initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("initiator")
  public String getInitiator() {
    return initiator;
  }
  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  /**
   **/
  public ApiChannelIDParam responder(String responder) {
    this.responder = responder;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("responder")
  public String getResponder() {
    return responder;
  }
  public void setResponder(String responder) {
    this.responder = responder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiChannelIDParam apiChannelIDParam = (ApiChannelIDParam) o;
    return Objects.equals(id, apiChannelIDParam.id) &&
        Objects.equals(initiator, apiChannelIDParam.initiator) &&
        Objects.equals(responder, apiChannelIDParam.responder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initiator, responder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiChannelIDParam {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    responder: ").append(toIndentedString(responder)).append("\n");
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
