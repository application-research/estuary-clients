package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UtilUserSettings;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-13T19:43:16.246Z[GMT]")public class UtilViewerResponse   {
  private String address = null;  private String authExpiry = null;  private Integer id = null;  private List<String> miners = new ArrayList<String>();  private Integer perms = null;  private UtilUserSettings settings = null;  private String username = null;

  /**
   **/
  
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
