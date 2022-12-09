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
  public class MinerClaimMinerBody {
    /// <summary>
    /// Gets or Sets Claim
    /// </summary>
    [DataMember(Name="claim", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "claim")]
    public string Claim { get; set; }

    /// <summary>
    /// Gets or Sets Miner
    /// </summary>
    [DataMember(Name="miner", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "miner")]
    public AddressAddress Miner { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MinerClaimMinerBody {\n");
      sb.Append("  Claim: ").Append(Claim).Append("\n");
      sb.Append("  Miner: ").Append(Miner).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
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
