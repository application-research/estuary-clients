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
    /// ApiClaimMsgResponse
    /// </summary>
    [DataContract]
        public partial class ApiClaimMsgResponse :  IEquatable<ApiClaimMsgResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiClaimMsgResponse" /> class.
        /// </summary>
        /// <param name="hexmsg">hexmsg.</param>
        public ApiClaimMsgResponse(string hexmsg = default(string))
        {
            this.Hexmsg = hexmsg;
        }
        
        /// <summary>
        /// Gets or Sets Hexmsg
        /// </summary>
        [DataMember(Name="hexmsg", EmitDefaultValue=false)]
        public string Hexmsg { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiClaimMsgResponse {\n");
            sb.Append("  Hexmsg: ").Append(Hexmsg).Append("\n");
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
            return this.Equals(input as ApiClaimMsgResponse);
        }

        /// <summary>
        /// Returns true if ApiClaimMsgResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiClaimMsgResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiClaimMsgResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Hexmsg == input.Hexmsg ||
                    (this.Hexmsg != null &&
                    this.Hexmsg.Equals(input.Hexmsg))
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
                if (this.Hexmsg != null)
                    hashCode = hashCode * 59 + this.Hexmsg.GetHashCode();
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