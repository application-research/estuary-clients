package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UtilContentAddIpfsBody   {
  private String coluuid = null;
  private String dir = null;
  private String filename = null;
  private List<String> peers = new ArrayList<String>();
  private String root = null;

  /**
   **/
  public UtilContentAddIpfsBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("coluuid")
  public String getColuuid() {
    return coluuid;
  }
  public void setColuuid(String coluuid) {
    this.coluuid = coluuid;
  }

  /**
   **/
  public UtilContentAddIpfsBody dir(String dir) {
    this.dir = dir;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }
  public void setDir(String dir) {
    this.dir = dir;
  }

  /**
   **/
  public UtilContentAddIpfsBody filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   **/
  public UtilContentAddIpfsBody peers(List<String> peers) {
    this.peers = peers;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("peers")
  public List<String> getPeers() {
    return peers;
  }
  public void setPeers(List<String> peers) {
    this.peers = peers;
  }

  /**
   **/
  public UtilContentAddIpfsBody root(String root) {
    this.root = root;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("root")
  public String getRoot() {
    return root;
  }
  public void setRoot(String root) {
    this.root = root;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilContentAddIpfsBody utilContentAddIpfsBody = (UtilContentAddIpfsBody) o;
    return Objects.equals(coluuid, utilContentAddIpfsBody.coluuid) &&
        Objects.equals(dir, utilContentAddIpfsBody.dir) &&
        Objects.equals(filename, utilContentAddIpfsBody.filename) &&
        Objects.equals(peers, utilContentAddIpfsBody.peers) &&
        Objects.equals(root, utilContentAddIpfsBody.root);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coluuid, dir, filename, peers, root);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
