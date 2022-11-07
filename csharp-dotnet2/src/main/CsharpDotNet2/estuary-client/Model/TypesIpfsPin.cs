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
  public class TypesIpfsPin {
    /// <summary>
    /// Gets or Sets Cid
    /// </summary>
    [DataMember(Name="cid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cid")]
    public string Cid { get; set; }

    /// <summary>
    /// Gets or Sets Meta
    /// </summary>
    [DataMember(Name="meta", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "meta")]
    public Object Meta { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Origins
    /// </summary>
    [DataMember(Name="origins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "origins")]
    public List<string> Origins { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TypesIpfsPin {\n");
      sb.Append("  Cid: ").Append(Cid).Append("\n");
      sb.Append("  Meta: ").Append(Meta).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Origins: ").Append(Origins).Append("\n");
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
