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
    /// PeeringPeeringPeer
    /// </summary>
    [DataContract]
        public partial class PeeringPeeringPeer :  IEquatable<PeeringPeeringPeer>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PeeringPeeringPeer" /> class.
        /// </summary>
        /// <param name="addrs">addrs.</param>
        /// <param name="connected">connected.</param>
        /// <param name="iD">iD.</param>
        public PeeringPeeringPeer(List<string> addrs = default(List<string>), bool? connected = default(bool?), string iD = default(string))
        {
            this.Addrs = addrs;
            this.Connected = connected;
            this.ID = iD;
        }
        
        /// <summary>
        /// Gets or Sets Addrs
        /// </summary>
        [DataMember(Name="Addrs", EmitDefaultValue=false)]
        public List<string> Addrs { get; set; }

        /// <summary>
        /// Gets or Sets Connected
        /// </summary>
        [DataMember(Name="Connected", EmitDefaultValue=false)]
        public bool? Connected { get; set; }

        /// <summary>
        /// Gets or Sets ID
        /// </summary>
        [DataMember(Name="ID", EmitDefaultValue=false)]
        public string ID { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PeeringPeeringPeer {\n");
            sb.Append("  Addrs: ").Append(Addrs).Append("\n");
            sb.Append("  Connected: ").Append(Connected).Append("\n");
            sb.Append("  ID: ").Append(ID).Append("\n");
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
            return this.Equals(input as PeeringPeeringPeer);
        }

        /// <summary>
        /// Returns true if PeeringPeeringPeer instances are equal
        /// </summary>
        /// <param name="input">Instance of PeeringPeeringPeer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeeringPeeringPeer input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Addrs == input.Addrs ||
                    this.Addrs != null &&
                    input.Addrs != null &&
                    this.Addrs.SequenceEqual(input.Addrs)
                ) && 
                (
                    this.Connected == input.Connected ||
                    (this.Connected != null &&
                    this.Connected.Equals(input.Connected))
                ) && 
                (
                    this.ID == input.ID ||
                    (this.ID != null &&
                    this.ID.Equals(input.ID))
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
                if (this.Addrs != null)
                    hashCode = hashCode * 59 + this.Addrs.GetHashCode();
                if (this.Connected != null)
                    hashCode = hashCode * 59 + this.Connected.GetHashCode();
                if (this.ID != null)
                    hashCode = hashCode * 59 + this.ID.GetHashCode();
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