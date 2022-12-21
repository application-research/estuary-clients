package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-21T01:22:11.593Z[GMT]")public class GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse   {
  private String hexmsg = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("hexmsg")
  public String getHexmsg() {
    return hexmsg;
  }
  public void setHexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse githubComApplicationResearchEstuaryApiV2ClaimMsgResponse = (GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse) o;
    return Objects.equals(hexmsg, githubComApplicationResearchEstuaryApiV2ClaimMsgResponse.hexmsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexmsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse {\n");
    
    sb.append("    hexmsg: ").append(toIndentedString(hexmsg)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
