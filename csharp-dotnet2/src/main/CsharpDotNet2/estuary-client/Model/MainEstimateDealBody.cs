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
  public class MainEstimateDealBody {
    /// <summary>
    /// Gets or Sets DurationBlks
    /// </summary>
    [DataMember(Name="durationBlks", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "durationBlks")]
    public int? DurationBlks { get; set; }

    /// <summary>
    /// Gets or Sets Replication
    /// </summary>
    [DataMember(Name="replication", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replication")]
    public int? Replication { get; set; }

    /// <summary>
    /// Gets or Sets Size
    /// </summary>
    [DataMember(Name="size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size")]
    public int? Size { get; set; }

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
      sb.Append("class MainEstimateDealBody {\n");
      sb.Append("  DurationBlks: ").Append(DurationBlks).Append("\n");
      sb.Append("  Replication: ").Append(Replication).Append("\n");
      sb.Append("  Size: ").Append(Size).Append("\n");
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
