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
    public partial class MinerClaimMinerBody : IEquatable<MinerClaimMinerBody>
    { 
        /// <summary>
        /// Gets or Sets Claim
        /// </summary>

        [DataMember(Name="claim")]
        public string Claim { get; set; }

        /// <summary>
        /// Gets or Sets Miner
        /// </summary>

        [DataMember(Name="miner")]
        public AddressAddress Miner { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>

        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MinerClaimMinerBody {\n");
            sb.Append("  Claim: ").Append(Claim).Append("\n");
            sb.Append("  Miner: ").Append(Miner).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MinerClaimMinerBody)obj);
        }

        /// <summary>
        /// Returns true if MinerClaimMinerBody instances are equal
        /// </summary>
        /// <param name="other">Instance of MinerClaimMinerBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MinerClaimMinerBody other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Claim == other.Claim ||
                    Claim != null &&
                    Claim.Equals(other.Claim)
                ) && 
                (
                    Miner == other.Miner ||
                    Miner != null &&
                    Miner.Equals(other.Miner)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
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
                    if (Claim != null)
                    hashCode = hashCode * 59 + Claim.GetHashCode();
                    if (Miner != null)
                    hashCode = hashCode * 59 + Miner.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MinerClaimMinerBody left, MinerClaimMinerBody right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MinerClaimMinerBody left, MinerClaimMinerBody right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
