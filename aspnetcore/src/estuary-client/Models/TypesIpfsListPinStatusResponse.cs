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
    public partial class TypesIpfsListPinStatusResponse : IEquatable<TypesIpfsListPinStatusResponse>
    { 
        /// <summary>
        /// Gets or Sets Count
        /// </summary>

        [DataMember(Name="count")]
        public int? Count { get; set; }

        /// <summary>
        /// Gets or Sets Results
        /// </summary>

        [DataMember(Name="results")]
        public List<TypesIpfsPinStatusResponse> Results { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TypesIpfsListPinStatusResponse {\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Results: ").Append(Results).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TypesIpfsListPinStatusResponse)obj);
        }

        /// <summary>
        /// Returns true if TypesIpfsListPinStatusResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of TypesIpfsListPinStatusResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TypesIpfsListPinStatusResponse other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Count == other.Count ||
                    Count != null &&
                    Count.Equals(other.Count)
                ) && 
                (
                    Results == other.Results ||
                    Results != null &&
                    Results.SequenceEqual(other.Results)
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
                    if (Count != null)
                    hashCode = hashCode * 59 + Count.GetHashCode();
                    if (Results != null)
                    hashCode = hashCode * 59 + Results.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TypesIpfsListPinStatusResponse left, TypesIpfsListPinStatusResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TypesIpfsListPinStatusResponse left, TypesIpfsListPinStatusResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
