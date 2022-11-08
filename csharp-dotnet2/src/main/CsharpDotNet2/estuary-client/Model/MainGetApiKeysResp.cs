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
  public class MainGetApiKeysResp {
    /// <summary>
    /// Gets or Sets Expiry
    /// </summary>
    [DataMember(Name="expiry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expiry")]
    public string Expiry { get; set; }

    /// <summary>
    /// Gets or Sets Label
    /// </summary>
    [DataMember(Name="label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "label")]
    public string Label { get; set; }

    /// <summary>
    /// Gets or Sets Token
    /// </summary>
    [DataMember(Name="token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token")]
    public string Token { get; set; }

    /// <summary>
    /// Gets or Sets TokenHash
    /// </summary>
    [DataMember(Name="tokenHash", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tokenHash")]
    public string TokenHash { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MainGetApiKeysResp {\n");
      sb.Append("  Expiry: ").Append(Expiry).Append("\n");
      sb.Append("  Label: ").Append(Label).Append("\n");
      sb.Append("  Token: ").Append(Token).Append("\n");
      sb.Append("  TokenHash: ").Append(TokenHash).Append("\n");
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
