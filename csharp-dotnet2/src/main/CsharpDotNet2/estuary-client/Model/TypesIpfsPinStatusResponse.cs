using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace estuary-client.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class TypesIpfsPinStatusResponse {
    /// <summary>
    /// Gets or Sets Created
    /// </summary>
    [DataMember(Name="created", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created")]
    public string Created { get; set; }

    /// <summary>
    /// Gets or Sets Delegates
    /// </summary>
    [DataMember(Name="delegates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delegates")]
    public List<string> Delegates { get; set; }

    /// <summary>
    /// Gets or Sets Info
    /// </summary>
    [DataMember(Name="info", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "info")]
    public Object Info { get; set; }

    /// <summary>
    /// Gets or Sets Pin
    /// </summary>
    [DataMember(Name="pin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pin")]
    public TypesIpfsPin Pin { get; set; }

    /// <summary>
    /// Gets or Sets Requestid
    /// </summary>
    [DataMember(Name="requestid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requestid")]
    public string Requestid { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TypesIpfsPinStatusResponse {\n");
      sb.Append("  Created: ").Append(Created).Append("\n");
      sb.Append("  Delegates: ").Append(Delegates).Append("\n");
      sb.Append("  Info: ").Append(Info).Append("\n");
      sb.Append("  Pin: ").Append(Pin).Append("\n");
      sb.Append("  Requestid: ").Append(Requestid).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
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
