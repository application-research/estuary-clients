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
  public class MainChannelIDParam {
    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Gets or Sets Initiator
    /// </summary>
    [DataMember(Name="initiator", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "initiator")]
    public string Initiator { get; set; }

    /// <summary>
    /// Gets or Sets Responder
    /// </summary>
    [DataMember(Name="responder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "responder")]
    public string Responder { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MainChannelIDParam {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Initiator: ").Append(Initiator).Append("\n");
      sb.Append("  Responder: ").Append(Responder).Append("\n");
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
