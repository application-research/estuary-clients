package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse   {
  private String hexmsg = null;

  /**
   **/
  public GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse hexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("hexmsg")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
