package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-21T01:22:09.878Z[GMT]")
public class GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse   {
  @JsonProperty("hexmsg")
  private String hexmsg = null;

  public GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse hexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
    return this;
  }

  /**
   * Get hexmsg
   * @return hexmsg
  **/
  @Schema(description = "")

  public String getHexmsg() {
    return hexmsg;
  }

  public void setHexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse githubComApplicationResearchEstuaryApiV1ClaimMsgResponse = (GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse) o;
    return Objects.equals(this.hexmsg, githubComApplicationResearchEstuaryApiV1ClaimMsgResponse.hexmsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexmsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse {\n");
    
    sb.append("    hexmsg: ").append(toIndentedString(hexmsg)).append("\n");
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
