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
  public class CollectionsCollectionListResponse {
    /// <summary>
    /// Gets or Sets Cid
    /// </summary>
    [DataMember(Name="cid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cid")]
    public UtilDbCID Cid { get; set; }

    /// <summary>
    /// Gets or Sets Coluuid
    /// </summary>
    [DataMember(Name="coluuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "coluuid")]
    public string Coluuid { get; set; }

    /// <summary>
    /// Gets or Sets ContId
    /// </summary>
    [DataMember(Name="contId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contId")]
    public int? ContId { get; set; }

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
    /// Gets or Sets Size
    /// </summary>
    [DataMember(Name="size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size")]
    public int? Size { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public CollectionsCidType Type { get; set; }

    /// <summary>
    /// Gets or Sets UpdatedAt
    /// </summary>
    [DataMember(Name="updatedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updatedAt")]
    public string UpdatedAt { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CollectionsCollectionListResponse {\n");
      sb.Append("  Cid: ").Append(Cid).Append("\n");
      sb.Append("  Coluuid: ").Append(Coluuid).Append("\n");
      sb.Append("  ContId: ").Append(ContId).Append("\n");
      sb.Append("  Dir: ").Append(Dir).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Size: ").Append(Size).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
