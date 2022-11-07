package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2022-11-07T20:05:41.507Z")
public class UtilContentAddIpfsBody   {
  @JsonProperty("coluuid")
  private String coluuid = null;

  @JsonProperty("dir")
  private String dir = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("peers")
  private List<String> peers = null;

  @JsonProperty("root")
  private String root = null;

  /**
   **/
  public UtilContentAddIpfsBody coluuid(String coluuid) {
    this.coluuid = coluuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

  
  @ApiModelProperty(value = "")
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

  
  @ApiModelProperty(value = "")
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

  
  @ApiModelProperty(value = "")
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

  
  @ApiModelProperty(value = "")
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

