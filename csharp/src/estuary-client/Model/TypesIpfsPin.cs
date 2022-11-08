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
    /// TypesIpfsPin
    /// </summary>
    [DataContract]
    public partial class TypesIpfsPin :  IEquatable<TypesIpfsPin>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TypesIpfsPin" /> class.
        /// </summary>
        /// <param name="cid">cid.</param>
        /// <param name="meta">meta.</param>
        /// <param name="name">name.</param>
        /// <param name="origins">origins.</param>
        public TypesIpfsPin(string cid = default(string), Object meta = default(Object), string name = default(string), List<string> origins = default(List<string>))
        {
            this.Cid = cid;
            this.Meta = meta;
            this.Name = name;
            this.Origins = origins;
        }
        
        /// <summary>
        /// Gets or Sets Cid
        /// </summary>
        [DataMember(Name="cid", EmitDefaultValue=false)]
        public string Cid { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name="meta", EmitDefaultValue=false)]
        public Object Meta { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Origins
        /// </summary>
        [DataMember(Name="origins", EmitDefaultValue=false)]
        public List<string> Origins { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
            return this.Equals(input as TypesIpfsPin);
        }

        /// <summary>
        /// Returns true if TypesIpfsPin instances are equal
        /// </summary>
        /// <param name="input">Instance of TypesIpfsPin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TypesIpfsPin input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Cid == input.Cid ||
                    (this.Cid != null &&
                    this.Cid.Equals(input.Cid))
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Origins == input.Origins ||
                    this.Origins != null &&
                    this.Origins.SequenceEqual(input.Origins)
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
                if (this.Cid != null)
                    hashCode = hashCode * 59 + this.Cid.GetHashCode();
                if (this.Meta != null)
                    hashCode = hashCode * 59 + this.Meta.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Origins != null)
                    hashCode = hashCode * 59 + this.Origins.GetHashCode();
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
