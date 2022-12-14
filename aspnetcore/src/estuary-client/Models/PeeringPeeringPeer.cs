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
    public partial class PeeringPeeringPeer : IEquatable<PeeringPeeringPeer>
    { 
        /// <summary>
        /// Gets or Sets Addrs
        /// </summary>

        [DataMember(Name="Addrs")]
        public List<string> Addrs { get; set; }

        /// <summary>
        /// Gets or Sets Connected
        /// </summary>

        [DataMember(Name="Connected")]
        public bool? Connected { get; set; }

        /// <summary>
        /// Gets or Sets ID
        /// </summary>

        [DataMember(Name="ID")]
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
            return obj.GetType() == GetType() && Equals((PeeringPeeringPeer)obj);
        }

        /// <summary>
        /// Returns true if PeeringPeeringPeer instances are equal
        /// </summary>
        /// <param name="other">Instance of PeeringPeeringPeer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeeringPeeringPeer other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Addrs == other.Addrs ||
                    Addrs != null &&
                    Addrs.SequenceEqual(other.Addrs)
                ) && 
                (
                    Connected == other.Connected ||
                    Connected != null &&
                    Connected.Equals(other.Connected)
                ) && 
                (
                    ID == other.ID ||
                    ID != null &&
                    ID.Equals(other.ID)
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
                    if (Addrs != null)
                    hashCode = hashCode * 59 + Addrs.GetHashCode();
                    if (Connected != null)
                    hashCode = hashCode * 59 + Connected.GetHashCode();
                    if (ID != null)
                    hashCode = hashCode * 59 + ID.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PeeringPeeringPeer left, PeeringPeeringPeer right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PeeringPeeringPeer left, PeeringPeeringPeer right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
