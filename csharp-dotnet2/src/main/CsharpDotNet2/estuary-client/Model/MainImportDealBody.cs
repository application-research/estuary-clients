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
  public class MainImportDealBody {
    /// <summary>
    /// Gets or Sets Coluuid
    /// </summary>
    [DataMember(Name="coluuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "coluuid")]
    public string Coluuid { get; set; }

    /// <summary>
    /// Gets or Sets DealIDs
    /// </summary>
    [DataMember(Name="dealIDs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dealIDs")]
    public List<int?> DealIDs { get; set; }

    /// <summary>
    /// Gets or Sets Dir
    /// </summary>
    [DataMember(Name="dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dir")]
    public string Dir { get; set; }

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
      sb.Append("class MainImportDealBody {\n");
      sb.Append("  Coluuid: ").Append(Coluuid).Append("\n");
      sb.Append("  DealIDs: ").Append(DealIDs).Append("\n");
      sb.Append("  Dir: ").Append(Dir).Append("\n");
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
