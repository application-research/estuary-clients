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
  public class PeeringPeeringPeer {
    /// <summary>
    /// Gets or Sets Addrs
    /// </summary>
    [DataMember(Name="Addrs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Addrs")]
    public List<string> Addrs { get; set; }

    /// <summary>
    /// Gets or Sets Connected
    /// </summary>
    [DataMember(Name="Connected", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Connected")]
    public bool? Connected { get; set; }

    /// <summary>
    /// Gets or Sets ID
    /// </summary>
    [DataMember(Name="ID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ID")]
    public string ID { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PeeringPeeringPeer {\n");
      sb.Append("  Addrs: ").Append(Addrs).Append("\n");
      sb.Append("  Connected: ").Append(Connected).Append("\n");
      sb.Append("  ID: ").Append(ID).Append("\n");
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
