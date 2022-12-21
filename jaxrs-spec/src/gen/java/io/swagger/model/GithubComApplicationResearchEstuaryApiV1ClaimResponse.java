package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GithubComApplicationResearchEstuaryApiV1ClaimResponse   {

  private @Valid Boolean success = null;

  /**
   **/
  public GithubComApplicationResearchEstuaryApiV1ClaimResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    GithubComApplicationResearchEstuaryApiV1ClaimResponse githubComApplicationResearchEstuaryApiV1ClaimResponse = (GithubComApplicationResearchEstuaryApiV1ClaimResponse) o;
    return Objects.equals(success, githubComApplicationResearchEstuaryApiV1ClaimResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComApplicationResearchEstuaryApiV1ClaimResponse {\n");
    
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
