package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CidCid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-03T16:17:32.399Z[GMT]")public class UtilDbCID   {
  private CidCid cid = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("cid")
  public CidCid getCid() {
    return cid;
  }
  public void setCid(CidCid cid) {
    this.cid = cid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilDbCID utilDbCID = (UtilDbCID) o;
    return Objects.equals(cid, utilDbCID.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilDbCID {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
