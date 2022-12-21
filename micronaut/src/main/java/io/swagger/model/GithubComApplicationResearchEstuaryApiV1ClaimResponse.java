package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GithubComApplicationResearchEstuaryApiV1ClaimResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-21T01:22:09.878Z[GMT]")
public class GithubComApplicationResearchEstuaryApiV1ClaimResponse   {
  @JsonProperty("success")
  private Boolean success = null;

  public GithubComApplicationResearchEstuaryApiV1ClaimResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  **/
  @Schema(description = "")

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
    return Objects.equals(this.success, githubComApplicationResearchEstuaryApiV1ClaimResponse.success);
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
