package io.swagger.model;

import io.swagger.model.UtilUserSettings;
import java.util.ArrayList;
import java.util.List;

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

public class UtilViewerResponse   {
  
  @Schema(description = "")
  private String address = null;
  
  @Schema(description = "")
  private String authExpiry = null;
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private List<String> miners = null;
  
  @Schema(description = "")
  private Integer perms = null;
  
  @Schema(description = "")
  private UtilUserSettings settings = null;
  
  @Schema(description = "")
  private String username = null;
 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UtilViewerResponse address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Get authExpiry
   * @return authExpiry
  **/
  @JsonProperty("auth_expiry")
  public String getAuthExpiry() {
    return authExpiry;
  }

  public void setAuthExpiry(String authExpiry) {
    this.authExpiry = authExpiry;
  }

  public UtilViewerResponse authExpiry(String authExpiry) {
    this.authExpiry = authExpiry;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UtilViewerResponse id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get miners
   * @return miners
  **/
  @JsonProperty("miners")
  public List<String> getMiners() {
    return miners;
  }

  public void setMiners(List<String> miners) {
    this.miners = miners;
  }

  public UtilViewerResponse miners(List<String> miners) {
    this.miners = miners;
    return this;
  }

  public UtilViewerResponse addMinersItem(String minersItem) {
    this.miners.add(minersItem);
    return this;
  }

 /**
   * Get perms
   * @return perms
  **/
  @JsonProperty("perms")
  public Integer getPerms() {
    return perms;
  }

  public void setPerms(Integer perms) {
    this.perms = perms;
  }

  public UtilViewerResponse perms(Integer perms) {
    this.perms = perms;
    return this;
  }

 /**
   * Get settings
   * @return settings
  **/
  @JsonProperty("settings")
  public UtilUserSettings getSettings() {
    return settings;
  }

  public void setSettings(UtilUserSettings settings) {
    this.settings = settings;
  }

  public UtilViewerResponse settings(UtilUserSettings settings) {
    this.settings = settings;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UtilViewerResponse username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilViewerResponse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authExpiry: ").append(toIndentedString(authExpiry)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    miners: ").append(toIndentedString(miners)).append("\n");
    sb.append("    perms: ").append(toIndentedString(perms)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
