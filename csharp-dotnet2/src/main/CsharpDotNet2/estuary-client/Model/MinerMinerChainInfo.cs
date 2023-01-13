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
  public class MinerMinerChainInfo {
    /// <summary>
    /// Gets or Sets Addresses
    /// </summary>
    [DataMember(Name="addresses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses")]
    public List<string> Addresses { get; set; }

    /// <summary>
    /// Gets or Sets Owner
    /// </summary>
    [DataMember(Name="owner", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "owner")]
    public string Owner { get; set; }

    /// <summary>
    /// Gets or Sets PeerId
    /// </summary>
    [DataMember(Name="peerId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "peerId")]
    public string PeerId { get; set; }

    /// <summary>
    /// Gets or Sets Worker
    /// </summary>
    [DataMember(Name="worker", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "worker")]
    public string Worker { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MinerMinerChainInfo {\n");
      sb.Append("  Addresses: ").Append(Addresses).Append("\n");
      sb.Append("  Owner: ").Append(Owner).Append("\n");
      sb.Append("  PeerId: ").Append(PeerId).Append("\n");
      sb.Append("  Worker: ").Append(Worker).Append("\n");
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
