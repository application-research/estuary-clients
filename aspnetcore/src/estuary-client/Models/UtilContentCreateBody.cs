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
    public partial class UtilContentCreateBody : IEquatable<UtilContentCreateBody>
    { 
        /// <summary>
        /// Gets or Sets Coluuid
        /// </summary>

        [DataMember(Name="coluuid")]
        public string Coluuid { get; set; }

        /// <summary>
        /// Gets or Sets Dir
        /// </summary>

        [DataMember(Name="dir")]
        public string Dir { get; set; }

        /// <summary>
        /// Gets or Sets Location
        /// </summary>

        [DataMember(Name="location")]
        public string Location { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>

        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Root
        /// </summary>

        [DataMember(Name="root")]
        public string Root { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>

        [DataMember(Name="type")]
        public int? Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UtilContentCreateBody {\n");
            sb.Append("  Coluuid: ").Append(Coluuid).Append("\n");
            sb.Append("  Dir: ").Append(Dir).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Root: ").Append(Root).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UtilContentCreateBody)obj);
        }

        /// <summary>
        /// Returns true if UtilContentCreateBody instances are equal
        /// </summary>
        /// <param name="other">Instance of UtilContentCreateBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UtilContentCreateBody other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Coluuid == other.Coluuid ||
                    Coluuid != null &&
                    Coluuid.Equals(other.Coluuid)
                ) && 
                (
                    Dir == other.Dir ||
                    Dir != null &&
                    Dir.Equals(other.Dir)
                ) && 
                (
                    Location == other.Location ||
                    Location != null &&
                    Location.Equals(other.Location)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Root == other.Root ||
                    Root != null &&
                    Root.Equals(other.Root)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (Coluuid != null)
                    hashCode = hashCode * 59 + Coluuid.GetHashCode();
                    if (Dir != null)
                    hashCode = hashCode * 59 + Dir.GetHashCode();
                    if (Location != null)
                    hashCode = hashCode * 59 + Location.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Root != null)
                    hashCode = hashCode * 59 + Root.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UtilContentCreateBody left, UtilContentCreateBody right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UtilContentCreateBody left, UtilContentCreateBody right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
