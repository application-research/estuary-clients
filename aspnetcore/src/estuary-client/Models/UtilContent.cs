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
    public partial class UtilContent : IEquatable<UtilContent>
    { 
        /// <summary>
        /// Gets or Sets Active
        /// </summary>

        [DataMember(Name="active")]
        public bool? Active { get; set; }

        /// <summary>
        /// Gets or Sets Aggregate
        /// </summary>

        [DataMember(Name="aggregate")]
        public bool? Aggregate { get; set; }

        /// <summary>
        /// TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler
        /// </summary>
        /// <value>TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler</value>

        [DataMember(Name="aggregatedIn")]
        public int? AggregatedIn { get; set; }

        /// <summary>
        /// Gets or Sets Cid
        /// </summary>

        [DataMember(Name="cid")]
        public UtilDbCID Cid { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>

        [DataMember(Name="createdAt")]
        public string CreatedAt { get; set; }

        /// <summary>
        /// If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
        /// </summary>
        /// <value>If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)</value>

        [DataMember(Name="dagSplit")]
        public bool? DagSplit { get; set; }

        /// <summary>
        /// Gets or Sets DealStatus
        /// </summary>

        [DataMember(Name="dealStatus")]
        public string DealStatus { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>

        [DataMember(Name="description")]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Failed
        /// </summary>

        [DataMember(Name="failed")]
        public bool? Failed { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>

        [DataMember(Name="id")]
        public int? Id { get; set; }

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
        /// Gets or Sets Offloaded
        /// </summary>

        [DataMember(Name="offloaded")]
        public bool? Offloaded { get; set; }

        /// <summary>
        /// Gets or Sets Origins
        /// </summary>

        [DataMember(Name="origins")]
        public string Origins { get; set; }

        /// <summary>
        /// Gets or Sets PinMeta
        /// </summary>

        [DataMember(Name="pinMeta")]
        public string PinMeta { get; set; }

        /// <summary>
        /// Gets or Sets Pinning
        /// </summary>

        [DataMember(Name="pinning")]
        public bool? Pinning { get; set; }

        /// <summary>
        /// Gets or Sets PinningStatus
        /// </summary>

        [DataMember(Name="pinningStatus")]
        public string PinningStatus { get; set; }

        /// <summary>
        /// Gets or Sets Replace
        /// </summary>

        [DataMember(Name="replace")]
        public bool? Replace { get; set; }

        /// <summary>
        /// Gets or Sets Replication
        /// </summary>

        [DataMember(Name="replication")]
        public int? Replication { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>

        [DataMember(Name="size")]
        public int? Size { get; set; }

        /// <summary>
        /// Gets or Sets SplitFrom
        /// </summary>

        [DataMember(Name="splitFrom")]
        public int? SplitFrom { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>

        [DataMember(Name="type")]
        public UtilContentType Type { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>

        [DataMember(Name="updatedAt")]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>

        [DataMember(Name="userId")]
        public int? UserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UtilContent {\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  Aggregate: ").Append(Aggregate).Append("\n");
            sb.Append("  AggregatedIn: ").Append(AggregatedIn).Append("\n");
            sb.Append("  Cid: ").Append(Cid).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  DagSplit: ").Append(DagSplit).Append("\n");
            sb.Append("  DealStatus: ").Append(DealStatus).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Failed: ").Append(Failed).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Offloaded: ").Append(Offloaded).Append("\n");
            sb.Append("  Origins: ").Append(Origins).Append("\n");
            sb.Append("  PinMeta: ").Append(PinMeta).Append("\n");
            sb.Append("  Pinning: ").Append(Pinning).Append("\n");
            sb.Append("  PinningStatus: ").Append(PinningStatus).Append("\n");
            sb.Append("  Replace: ").Append(Replace).Append("\n");
            sb.Append("  Replication: ").Append(Replication).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  SplitFrom: ").Append(SplitFrom).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((UtilContent)obj);
        }

        /// <summary>
        /// Returns true if UtilContent instances are equal
        /// </summary>
        /// <param name="other">Instance of UtilContent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UtilContent other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Active == other.Active ||
                    Active != null &&
                    Active.Equals(other.Active)
                ) && 
                (
                    Aggregate == other.Aggregate ||
                    Aggregate != null &&
                    Aggregate.Equals(other.Aggregate)
                ) && 
                (
                    AggregatedIn == other.AggregatedIn ||
                    AggregatedIn != null &&
                    AggregatedIn.Equals(other.AggregatedIn)
                ) && 
                (
                    Cid == other.Cid ||
                    Cid != null &&
                    Cid.Equals(other.Cid)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    CreatedAt != null &&
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    DagSplit == other.DagSplit ||
                    DagSplit != null &&
                    DagSplit.Equals(other.DagSplit)
                ) && 
                (
                    DealStatus == other.DealStatus ||
                    DealStatus != null &&
                    DealStatus.Equals(other.DealStatus)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Failed == other.Failed ||
                    Failed != null &&
                    Failed.Equals(other.Failed)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
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
                    Offloaded == other.Offloaded ||
                    Offloaded != null &&
                    Offloaded.Equals(other.Offloaded)
                ) && 
                (
                    Origins == other.Origins ||
                    Origins != null &&
                    Origins.Equals(other.Origins)
                ) && 
                (
                    PinMeta == other.PinMeta ||
                    PinMeta != null &&
                    PinMeta.Equals(other.PinMeta)
                ) && 
                (
                    Pinning == other.Pinning ||
                    Pinning != null &&
                    Pinning.Equals(other.Pinning)
                ) && 
                (
                    PinningStatus == other.PinningStatus ||
                    PinningStatus != null &&
                    PinningStatus.Equals(other.PinningStatus)
                ) && 
                (
                    Replace == other.Replace ||
                    Replace != null &&
                    Replace.Equals(other.Replace)
                ) && 
                (
                    Replication == other.Replication ||
                    Replication != null &&
                    Replication.Equals(other.Replication)
                ) && 
                (
                    Size == other.Size ||
                    Size != null &&
                    Size.Equals(other.Size)
                ) && 
                (
                    SplitFrom == other.SplitFrom ||
                    SplitFrom != null &&
                    SplitFrom.Equals(other.SplitFrom)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
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
                    if (Active != null)
                    hashCode = hashCode * 59 + Active.GetHashCode();
                    if (Aggregate != null)
                    hashCode = hashCode * 59 + Aggregate.GetHashCode();
                    if (AggregatedIn != null)
                    hashCode = hashCode * 59 + AggregatedIn.GetHashCode();
                    if (Cid != null)
                    hashCode = hashCode * 59 + Cid.GetHashCode();
                    if (CreatedAt != null)
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (DagSplit != null)
                    hashCode = hashCode * 59 + DagSplit.GetHashCode();
                    if (DealStatus != null)
                    hashCode = hashCode * 59 + DealStatus.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Failed != null)
                    hashCode = hashCode * 59 + Failed.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Location != null)
                    hashCode = hashCode * 59 + Location.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Offloaded != null)
                    hashCode = hashCode * 59 + Offloaded.GetHashCode();
                    if (Origins != null)
                    hashCode = hashCode * 59 + Origins.GetHashCode();
                    if (PinMeta != null)
                    hashCode = hashCode * 59 + PinMeta.GetHashCode();
                    if (Pinning != null)
                    hashCode = hashCode * 59 + Pinning.GetHashCode();
                    if (PinningStatus != null)
                    hashCode = hashCode * 59 + PinningStatus.GetHashCode();
                    if (Replace != null)
                    hashCode = hashCode * 59 + Replace.GetHashCode();
                    if (Replication != null)
                    hashCode = hashCode * 59 + Replication.GetHashCode();
                    if (Size != null)
                    hashCode = hashCode * 59 + Size.GetHashCode();
                    if (SplitFrom != null)
                    hashCode = hashCode * 59 + SplitFrom.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(UtilContent left, UtilContent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UtilContent left, UtilContent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
