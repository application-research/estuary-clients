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
  public class UtilContentCreateBody {
    /// <summary>
    /// Gets or Sets Coluuid
    /// </summary>
    [DataMember(Name="coluuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "coluuid")]
    public string Coluuid { get; set; }

    /// <summary>
    /// Gets or Sets Dir
    /// </summary>
    [DataMember(Name="dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dir")]
    public string Dir { get; set; }

    /// <summary>
    /// Gets or Sets Location
    /// </summary>
    [DataMember(Name="location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "location")]
    public string Location { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Root
    /// </summary>
    [DataMember(Name="root", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "root")]
    public string Root { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public int? Type { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UtilContentCreateBody {\n");
      sb.Append("  Coluuid: ").Append(Coluuid).Append("\n");
      sb.Append("  Dir: ").Append(Dir).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Root: ").Append(Root).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
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
