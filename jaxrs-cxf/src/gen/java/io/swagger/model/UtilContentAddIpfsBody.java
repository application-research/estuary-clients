package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
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

public class UtilContentAddIpfsBody   {
  
  @Schema(description = "")
  private String coluuid = null;
  
  @Schema(description = "")
  private String dir = null;
  
  @Schema(description = "")
  private String filename = null;
  
  @Schema(description = "")
  private List<String> peers = null;
  
  @Schema(description = "")
  private String root = null;
 /**
   * Get coluuid
   * @return coluuid
  **/
  @JsonProperty("coluuid")
  public String getColuuid() {
    return coluuid;
  }

  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  public UtilContentAddIpfsBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

 /**
   * Get dir
   * @return dir
  **/
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public UtilContentAddIpfsBody dir(String dir) {
    this.dir = dir;
    return this;
  }

 /**
   * Get filename
   * @return filename
  **/
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public UtilContentAddIpfsBody filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
   * Get peers
   * @return peers
  **/
  @JsonProperty("peers")
  public List<String> getPeers() {
    return peers;
  }

  public void setPeers(List<String> peers) {
    this.peers = peers;
  }

  public UtilContentAddIpfsBody peers(List<String> peers) {
    this.peers = peers;
    return this;
  }

  public UtilContentAddIpfsBody addPeersItem(String peersItem) {
    this.peers.add(peersItem);
    return this;
  }

 /**
   * Get root
   * @return root
  **/
  @JsonProperty("root")
  public String getRoot() {
    return root;
  }

  public void setRoot(String root) {
    this.root = root;
  }

  public UtilContentAddIpfsBody root(String root) {
    this.root = root;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilContentAddIpfsBody {\n");
    
    sb.append("    coluuid: ").append(toIndentedString(coluuid)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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
