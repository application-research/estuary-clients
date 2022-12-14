package io.swagger.model;

import io.swagger.model.CidCid;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UtilDbCID   {

  private @Valid CidCid cid = null;

  /**
   **/
  public UtilDbCID cid(CidCid cid) {
    this.cid = cid;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
