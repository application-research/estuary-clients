package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiPublicNodeInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-18T07:30:27.009Z[GMT]")


public class ApiPublicNodeInfo   {
  @JsonProperty("primaryAddress")
  private AddressAddress primaryAddress = null;

  public ApiPublicNodeInfo primaryAddress(AddressAddress primaryAddress) {
    this.primaryAddress = primaryAddress;
    return this;
  }

  /**
   * Get primaryAddress
   * @return primaryAddress
   **/
  @Schema(description = "")
  
    @Valid
    public AddressAddress getPrimaryAddress() {
    return primaryAddress;
  }

  public void setPrimaryAddress(AddressAddress primaryAddress) {
    this.primaryAddress = primaryAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPublicNodeInfo apiPublicNodeInfo = (ApiPublicNodeInfo) o;
    return Objects.equals(this.primaryAddress, apiPublicNodeInfo.primaryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPublicNodeInfo {\n");
    
    sb.append("    primaryAddress: ").append(toIndentedString(primaryAddress)).append("\n");
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
