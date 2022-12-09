package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UtilUserSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2022-12-09T03:38:44.168Z[GMT]")
public class UtilViewerResponse   {
  @JsonProperty("address")
  private String address = null;
  @JsonProperty("auth_expiry")
  private String authExpiry = null;
  @JsonProperty("id")
  private Integer id = null;
  @JsonProperty("miners")
  private List<String> miners = null;
  @JsonProperty("perms")
  private Integer perms = null;
  @JsonProperty("settings")
  private UtilUserSettings settings = null;
  @JsonProperty("username")
  private String username = null;
  /**
   **/
  public UtilViewerResponse address(String address) {
    this.address = address;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  public UtilViewerResponse authExpiry(String authExpiry) {
    this.authExpiry = authExpiry;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("auth_expiry")
  public String getAuthExpiry() {
    return authExpiry;
  }
  public void setAuthExpiry(String authExpiry) {
    this.authExpiry = authExpiry;
  }

  /**
   **/
  public UtilViewerResponse id(Integer id) {
    this.id = id;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public UtilViewerResponse miners(List<String> miners) {
    this.miners = miners;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("miners")
  public List<String> getMiners() {
    return miners;
  }
  public void setMiners(List<String> miners) {
    this.miners = miners;
  }

  /**
   **/
  public UtilViewerResponse perms(Integer perms) {
    this.perms = perms;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("perms")
  public Integer getPerms() {
    return perms;
  }
  public void setPerms(Integer perms) {
    this.perms = perms;
  }

  /**
   **/
  public UtilViewerResponse settings(UtilUserSettings settings) {
    this.settings = settings;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("settings")
  public UtilUserSettings getSettings() {
    return settings;
  }
  public void setSettings(UtilUserSettings settings) {
    this.settings = settings;
  }

  /**
   **/
  public UtilViewerResponse username(String username) {
    this.username = username;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilViewerResponse utilViewerResponse = (UtilViewerResponse) o;
    return Objects.equals(address, utilViewerResponse.address) &&
        Objects.equals(authExpiry, utilViewerResponse.authExpiry) &&
        Objects.equals(id, utilViewerResponse.id) &&
        Objects.equals(miners, utilViewerResponse.miners) &&
        Objects.equals(perms, utilViewerResponse.perms) &&
        Objects.equals(settings, utilViewerResponse.settings) &&
        Objects.equals(username, utilViewerResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, authExpiry, id, miners, perms, settings, username);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
