package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CidCid;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2022-12-21T01:22:08.779Z[GMT]")
public class UtilDbCID   {
  @JsonProperty("cid")
  private CidCid cid = null;
  /**
   **/
  public UtilDbCID cid(CidCid cid) {
    this.cid = cid;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("cid")
  public CidCid getCid() {
    return cid;
  }
  public void setCid(CidCid cid) {
    this.cid = cid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
