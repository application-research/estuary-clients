using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace estuary_client.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class MainUserStatsResponse {
    /// <summary>
    /// Gets or Sets NumPins
    /// </summary>
    [DataMember(Name="numPins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numPins")]
    public int? NumPins { get; set; }

    /// <summary>
    /// Gets or Sets TotalSize
    /// </summary>
    [DataMember(Name="totalSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalSize")]
    public int? TotalSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MainUserStatsResponse {\n");
      sb.Append("  NumPins: ").Append(NumPins).Append("\n");
      sb.Append("  TotalSize: ").Append(TotalSize).Append("\n");
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
