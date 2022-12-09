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
  public class UtilUserSettings {
    /// <summary>
    /// Gets or Sets ContentAddingDisabled
    /// </summary>
    [DataMember(Name="contentAddingDisabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contentAddingDisabled")]
    public bool? ContentAddingDisabled { get; set; }

    /// <summary>
    /// Gets or Sets DealDuration
    /// </summary>
    [DataMember(Name="dealDuration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dealDuration")]
    public int? DealDuration { get; set; }

    /// <summary>
    /// Gets or Sets DealMakingDisabled
    /// </summary>
    [DataMember(Name="dealMakingDisabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dealMakingDisabled")]
    public bool? DealMakingDisabled { get; set; }

    /// <summary>
    /// Gets or Sets FileStagingThreshold
    /// </summary>
    [DataMember(Name="fileStagingThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fileStagingThreshold")]
    public int? FileStagingThreshold { get; set; }

    /// <summary>
    /// Gets or Sets Flags
    /// </summary>
    [DataMember(Name="flags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "flags")]
    public int? Flags { get; set; }

    /// <summary>
    /// Gets or Sets Replication
    /// </summary>
    [DataMember(Name="replication", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replication")]
    public int? Replication { get; set; }

    /// <summary>
    /// Gets or Sets UploadEndpoints
    /// </summary>
    [DataMember(Name="uploadEndpoints", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "uploadEndpoints")]
    public List<string> UploadEndpoints { get; set; }

    /// <summary>
    /// Gets or Sets Verified
    /// </summary>
    [DataMember(Name="verified", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "verified")]
    public bool? Verified { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UtilUserSettings {\n");
      sb.Append("  ContentAddingDisabled: ").Append(ContentAddingDisabled).Append("\n");
      sb.Append("  DealDuration: ").Append(DealDuration).Append("\n");
      sb.Append("  DealMakingDisabled: ").Append(DealMakingDisabled).Append("\n");
      sb.Append("  FileStagingThreshold: ").Append(FileStagingThreshold).Append("\n");
      sb.Append("  Flags: ").Append(Flags).Append("\n");
      sb.Append("  Replication: ").Append(Replication).Append("\n");
      sb.Append("  UploadEndpoints: ").Append(UploadEndpoints).Append("\n");
      sb.Append("  Verified: ").Append(Verified).Append("\n");
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
