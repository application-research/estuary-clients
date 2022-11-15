/* 
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = estuary-client.Client.SwaggerDateConverter;

namespace estuary-client.Model
{
    /// <summary>
    /// TypesIpfsPinStatusResponse
    /// </summary>
    [DataContract]
        public partial class TypesIpfsPinStatusResponse :  IEquatable<TypesIpfsPinStatusResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TypesIpfsPinStatusResponse" /> class.
        /// </summary>
        /// <param name="created">created.</param>
        /// <param name="delegates">delegates.</param>
        /// <param name="info">info.</param>
        /// <param name="pin">pin.</param>
        /// <param name="requestid">requestid.</param>
        /// <param name="status">status.</param>
        public TypesIpfsPinStatusResponse(string created = default(string), List<string> delegates = default(List<string>), Object info = default(Object), TypesIpfsPin pin = default(TypesIpfsPin), string requestid = default(string), string status = default(string))
        {
            this.Created = created;
            this.Delegates = delegates;
            this.Info = info;
            this.Pin = pin;
            this.Requestid = requestid;
            this.Status = status;
        }
        
        /// <summary>
        /// Gets or Sets Created
        /// </summary>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public string Created { get; set; }

        /// <summary>
        /// Gets or Sets Delegates
        /// </summary>
        [DataMember(Name="delegates", EmitDefaultValue=false)]
        public List<string> Delegates { get; set; }

        /// <summary>
        /// Gets or Sets Info
        /// </summary>
        [DataMember(Name="info", EmitDefaultValue=false)]
        public Object Info { get; set; }

        /// <summary>
        /// Gets or Sets Pin
        /// </summary>
        [DataMember(Name="pin", EmitDefaultValue=false)]
        public TypesIpfsPin Pin { get; set; }

        /// <summary>
        /// Gets or Sets Requestid
        /// </summary>
        [DataMember(Name="requestid", EmitDefaultValue=false)]
        public string Requestid { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TypesIpfsPinStatusResponse {\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Delegates: ").Append(Delegates).Append("\n");
            sb.Append("  Info: ").Append(Info).Append("\n");
            sb.Append("  Pin: ").Append(Pin).Append("\n");
            sb.Append("  Requestid: ").Append(Requestid).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TypesIpfsPinStatusResponse);
        }

        /// <summary>
        /// Returns true if TypesIpfsPinStatusResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of TypesIpfsPinStatusResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TypesIpfsPinStatusResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Created == input.Created ||
                    (this.Created != null &&
                    this.Created.Equals(input.Created))
                ) && 
                (
                    this.Delegates == input.Delegates ||
                    this.Delegates != null &&
                    input.Delegates != null &&
                    this.Delegates.SequenceEqual(input.Delegates)
                ) && 
                (
                    this.Info == input.Info ||
                    (this.Info != null &&
                    this.Info.Equals(input.Info))
                ) && 
                (
                    this.Pin == input.Pin ||
                    (this.Pin != null &&
                    this.Pin.Equals(input.Pin))
                ) && 
                (
                    this.Requestid == input.Requestid ||
                    (this.Requestid != null &&
                    this.Requestid.Equals(input.Requestid))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Created != null)
                    hashCode = hashCode * 59 + this.Created.GetHashCode();
                if (this.Delegates != null)
                    hashCode = hashCode * 59 + this.Delegates.GetHashCode();
                if (this.Info != null)
                    hashCode = hashCode * 59 + this.Info.GetHashCode();
                if (this.Pin != null)
                    hashCode = hashCode * 59 + this.Pin.GetHashCode();
                if (this.Requestid != null)
                    hashCode = hashCode * 59 + this.Requestid.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
