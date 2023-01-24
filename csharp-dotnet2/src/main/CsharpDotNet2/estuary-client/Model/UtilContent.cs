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
  public class UtilContent {
    /// <summary>
    /// Gets or Sets Active
    /// </summary>
    [DataMember(Name="active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "active")]
    public bool? Active { get; set; }

    /// <summary>
    /// Gets or Sets Aggregate
    /// </summary>
    [DataMember(Name="aggregate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aggregate")]
    public bool? Aggregate { get; set; }

    /// <summary>
    /// TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
    /// </summary>
    /// <value>TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler</value>
    [DataMember(Name="aggregatedIn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aggregatedIn")]
    public int? AggregatedIn { get; set; }

    /// <summary>
    /// Gets or Sets Cid
    /// </summary>
    [DataMember(Name="cid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cid")]
    public UtilDbCID Cid { get; set; }

    /// <summary>
    /// Gets or Sets CreatedAt
    /// </summary>
    [DataMember(Name="createdAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createdAt")]
    public string CreatedAt { get; set; }

    /// <summary>
    /// If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
    /// </summary>
    /// <value>If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)</value>
    [DataMember(Name="dagSplit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dagSplit")]
    public bool? DagSplit { get; set; }

    /// <summary>
    /// Gets or Sets DealStatus
    /// </summary>
    [DataMember(Name="dealStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dealStatus")]
    public string DealStatus { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets Failed
    /// </summary>
    [DataMember(Name="failed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "failed")]
    public bool? Failed { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

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
    /// Gets or Sets Offloaded
    /// </summary>
    [DataMember(Name="offloaded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "offloaded")]
    public bool? Offloaded { get; set; }

    /// <summary>
    /// Gets or Sets Origins
    /// </summary>
    [DataMember(Name="origins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "origins")]
    public string Origins { get; set; }

    /// <summary>
    /// Gets or Sets PinMeta
    /// </summary>
    [DataMember(Name="pinMeta", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pinMeta")]
    public string PinMeta { get; set; }

    /// <summary>
    /// Gets or Sets Pinning
    /// </summary>
    [DataMember(Name="pinning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pinning")]
    public bool? Pinning { get; set; }

    /// <summary>
    /// Gets or Sets PinningStatus
    /// </summary>
    [DataMember(Name="pinningStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pinningStatus")]
    public string PinningStatus { get; set; }

    /// <summary>
    /// Gets or Sets Replace
    /// </summary>
    [DataMember(Name="replace", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replace")]
    public bool? Replace { get; set; }

    /// <summary>
    /// Gets or Sets Replication
    /// </summary>
    [DataMember(Name="replication", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replication")]
    public int? Replication { get; set; }

    /// <summary>
    /// Gets or Sets Size
    /// </summary>
    [DataMember(Name="size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size")]
    public int? Size { get; set; }

    /// <summary>
    /// Gets or Sets SplitFrom
    /// </summary>
    [DataMember(Name="splitFrom", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "splitFrom")]
    public int? SplitFrom { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public UtilContentType Type { get; set; }

    /// <summary>
    /// Gets or Sets UpdatedAt
    /// </summary>
    [DataMember(Name="updatedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updatedAt")]
    public string UpdatedAt { get; set; }

    /// <summary>
    /// Gets or Sets UserId
    /// </summary>
    [DataMember(Name="userId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userId")]
    public int? UserId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UtilContent {\n");
      sb.Append("  Active: ").Append(Active).Append("\n");
      sb.Append("  Aggregate: ").Append(Aggregate).Append("\n");
      sb.Append("  AggregatedIn: ").Append(AggregatedIn).Append("\n");
      sb.Append("  Cid: ").Append(Cid).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  DagSplit: ").Append(DagSplit).Append("\n");
      sb.Append("  DealStatus: ").Append(DealStatus).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Failed: ").Append(Failed).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Offloaded: ").Append(Offloaded).Append("\n");
      sb.Append("  Origins: ").Append(Origins).Append("\n");
      sb.Append("  PinMeta: ").Append(PinMeta).Append("\n");
      sb.Append("  Pinning: ").Append(Pinning).Append("\n");
      sb.Append("  PinningStatus: ").Append(PinningStatus).Append("\n");
      sb.Append("  Replace: ").Append(Replace).Append("\n");
      sb.Append("  Replication: ").Append(Replication).Append("\n");
      sb.Append("  Size: ").Append(Size).Append("\n");
      sb.Append("  SplitFrom: ").Append(SplitFrom).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
      sb.Append("  UserId: ").Append(UserId).Append("\n");
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
