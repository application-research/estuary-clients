package io.swagger.model;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse   {
  
  @Schema(description = "")
  private String hexmsg = null;
 /**
   * Get hexmsg
   * @return hexmsg
  **/
  @JsonProperty("hexmsg")
  public String getHexmsg() {
    return hexmsg;
  }

  public void setHexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
  }

  public GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse hexmsg(String hexmsg) {
    this.hexmsg = hexmsg;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
