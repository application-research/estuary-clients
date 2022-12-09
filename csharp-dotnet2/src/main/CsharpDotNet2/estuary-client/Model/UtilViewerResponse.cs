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
  public class UtilViewerResponse {
    /// <summary>
    /// Gets or Sets Address
    /// </summary>
    [DataMember(Name="address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "address")]
    public string Address { get; set; }

    /// <summary>
    /// Gets or Sets AuthExpiry
    /// </summary>
    [DataMember(Name="auth_expiry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth_expiry")]
    public string AuthExpiry { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Gets or Sets Miners
    /// </summary>
    [DataMember(Name="miners", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "miners")]
    public List<string> Miners { get; set; }

    /// <summary>
    /// Gets or Sets Perms
    /// </summary>
    [DataMember(Name="perms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "perms")]
    public int? Perms { get; set; }

    /// <summary>
    /// Gets or Sets Settings
    /// </summary>
    [DataMember(Name="settings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "settings")]
    public UtilUserSettings Settings { get; set; }

    /// <summary>
    /// Gets or Sets Username
    /// </summary>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public string Username { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UtilViewerResponse {\n");
      sb.Append("  Address: ").Append(Address).Append("\n");
      sb.Append("  AuthExpiry: ").Append(AuthExpiry).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Miners: ").Append(Miners).Append("\n");
      sb.Append("  Perms: ").Append(Perms).Append("\n");
      sb.Append("  Settings: ").Append(Settings).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
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
