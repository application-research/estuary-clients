package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GithubComApplicationResearchEstuaryApiV2ClaimResponse   {
  private Boolean success = null;

  /**
   **/
  public GithubComApplicationResearchEstuaryApiV2ClaimResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("success")
  public Boolean isSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComApplicationResearchEstuaryApiV2ClaimResponse githubComApplicationResearchEstuaryApiV2ClaimResponse = (GithubComApplicationResearchEstuaryApiV2ClaimResponse) o;
    return Objects.equals(success, githubComApplicationResearchEstuaryApiV2ClaimResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComApplicationResearchEstuaryApiV2ClaimResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
