using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ApiStorageProviderResp {
    /// <summary>
    /// Gets or Sets Addr
    /// </summary>
    [DataMember(Name="addr", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addr")]
    public AddressAddress Addr { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Suspended
    /// </summary>
    [DataMember(Name="suspended", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "suspended")]
    public bool? Suspended { get; set; }

    /// <summary>
    /// Gets or Sets SuspendedReason
    /// </summary>
    [DataMember(Name="suspendedReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "suspendedReason")]
    public string SuspendedReason { get; set; }

    /// <summary>
    /// Gets or Sets Version
    /// </summary>
    [DataMember(Name="version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "version")]
    public string Version { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ApiStorageProviderResp {\n");
      sb.Append("  Addr: ").Append(Addr).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Suspended: ").Append(Suspended).Append("\n");
      sb.Append("  SuspendedReason: ").Append(SuspendedReason).Append("\n");
      sb.Append("  Version: ").Append(Version).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
