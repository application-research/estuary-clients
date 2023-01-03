package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UtilUserSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UtilViewerResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-03T16:17:32.784Z[GMT]")


public class UtilViewerResponse   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("auth_expiry")
  private String authExpiry = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("miners")
  @Valid
  private List<String> miners = null;

  @JsonProperty("perms")
  private Integer perms = null;

  @JsonProperty("settings")
  private UtilUserSettings settings = null;

  @JsonProperty("username")
  private String username = null;

  public UtilViewerResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UtilViewerResponse authExpiry(String authExpiry) {
    this.authExpiry = authExpiry;
    return this;
  }

  /**
   * Get authExpiry
   * @return authExpiry
   **/
  @Schema(description = "")
  
    public String getAuthExpiry() {
    return authExpiry;
  }

  public void setAuthExpiry(String authExpiry) {
    this.authExpiry = authExpiry;
  }

  public UtilViewerResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UtilViewerResponse miners(List<String> miners) {
    this.miners = miners;
    return this;
  }

  public UtilViewerResponse addMinersItem(String minersItem) {
    if (this.miners == null) {
      this.miners = new ArrayList<String>();
    }
    this.miners.add(minersItem);
    return this;
  }

  /**
   * Get miners
   * @return miners
   **/
  @Schema(description = "")
  
    public List<String> getMiners() {
    return miners;
  }

  public void setMiners(List<String> miners) {
    this.miners = miners;
  }

  public UtilViewerResponse perms(Integer perms) {
    this.perms = perms;
    return this;
  }

  /**
   * Get perms
   * @return perms
   **/
  @Schema(description = "")
  
    public Integer getPerms() {
    return perms;
  }

  public void setPerms(Integer perms) {
    this.perms = perms;
  }

  public UtilViewerResponse settings(UtilUserSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   **/
  @Schema(description = "")
  
    @Valid
    public UtilUserSettings getSettings() {
    return settings;
  }

  public void setSettings(UtilUserSettings settings) {
    this.settings = settings;
  }

  public UtilViewerResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(description = "")
  
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
    return Objects.equals(this.address, utilViewerResponse.address) &&
        Objects.equals(this.authExpiry, utilViewerResponse.authExpiry) &&
        Objects.equals(this.id, utilViewerResponse.id) &&
        Objects.equals(this.miners, utilViewerResponse.miners) &&
        Objects.equals(this.perms, utilViewerResponse.perms) &&
        Objects.equals(this.settings, utilViewerResponse.settings) &&
        Objects.equals(this.username, utilViewerResponse.username);
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
