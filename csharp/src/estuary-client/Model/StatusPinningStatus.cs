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
    /// Defines status.PinningStatus
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusPinningStatus
    {
        /// <summary>
        /// Enum Pinning for value: pinning
        /// </summary>
        [EnumMember(Value = "pinning")]
        Pinning = 1,
        /// <summary>
        /// Enum Pinned for value: pinned
        /// </summary>
        [EnumMember(Value = "pinned")]
        Pinned = 2,
        /// <summary>
        /// Enum Failed for value: failed
        /// </summary>
        [EnumMember(Value = "failed")]
        Failed = 3,
        /// <summary>
        /// Enum Queued for value: queued
        /// </summary>
        [EnumMember(Value = "queued")]
        Queued = 4,
        /// <summary>
        /// Enum Offloaded for value: offloaded
        /// </summary>
        [EnumMember(Value = "offloaded")]
        Offloaded = 5    }
}