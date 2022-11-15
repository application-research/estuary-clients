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
  public class AutoretrieveInitBody {
    /// <summary>
    /// Autoretrieve's comma-separated list of addresses
    /// </summary>
    /// <value>Autoretrieve's comma-separated list of addresses</value>
    [DataMember(Name="addresses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses")]
    public string Addresses { get; set; }

    /// <summary>
    /// Autoretrieve's public key
    /// </summary>
    /// <value>Autoretrieve's public key</value>
    [DataMember(Name="pubKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pubKey")]
    public string PubKey { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AutoretrieveInitBody {\n");
      sb.Append("  Addresses: ").Append(Addresses).Append("\n");
      sb.Append("  PubKey: ").Append(PubKey).Append("\n");
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
