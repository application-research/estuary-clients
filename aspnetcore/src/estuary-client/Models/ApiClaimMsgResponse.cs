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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace estuary-client.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class ApiClaimMsgResponse : IEquatable<ApiClaimMsgResponse>
    { 
        /// <summary>
        /// Gets or Sets Hexmsg
        /// </summary>

        [DataMember(Name="hexmsg")]
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((ApiClaimMsgResponse)obj);
        }

        /// <summary>
        /// Returns true if ApiClaimMsgResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ApiClaimMsgResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiClaimMsgResponse other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Hexmsg == other.Hexmsg ||
                    Hexmsg != null &&
                    Hexmsg.Equals(other.Hexmsg)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Hexmsg != null)
                    hashCode = hashCode * 59 + Hexmsg.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApiClaimMsgResponse left, ApiClaimMsgResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApiClaimMsgResponse left, ApiClaimMsgResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}