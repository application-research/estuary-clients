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
  public class UtilContentAddResponse {
    /// <summary>
    /// Gets or Sets Cid
    /// </summary>
    [DataMember(Name="cid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cid")]
    public string Cid { get; set; }

    /// <summary>
    /// Gets or Sets EstuaryId
    /// </summary>
    [DataMember(Name="estuaryId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "estuaryId")]
    public int? EstuaryId { get; set; }

    /// <summary>
    /// Gets or Sets Providers
    /// </summary>
    [DataMember(Name="providers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "providers")]
    public List<string> Providers { get; set; }

    /// <summary>
    /// Gets or Sets RetrievalUrl
    /// </summary>
    [DataMember(Name="retrieval_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "retrieval_url")]
    public string RetrievalUrl { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UtilContentAddResponse {\n");
      sb.Append("  Cid: ").Append(Cid).Append("\n");
      sb.Append("  EstuaryId: ").Append(EstuaryId).Append("\n");
      sb.Append("  Providers: ").Append(Providers).Append("\n");
      sb.Append("  RetrievalUrl: ").Append(RetrievalUrl).Append("\n");
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
