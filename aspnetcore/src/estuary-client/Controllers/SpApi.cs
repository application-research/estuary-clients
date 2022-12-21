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
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using estuary-client.Attributes;
using estuary-client.Security;
using Microsoft.AspNetCore.Authorization;
using estuary-client.Models;

namespace estuary-client.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class SpApiController : ControllerBase
    { 
        /// <summary>
        /// Claim Storage Provider
        /// </summary>
        /// <remarks>This endpoint lets a user claim a storage provider</remarks>
        /// <param name="body">Claim Storage Provider Body</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//storage-providers/claim")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersClaimPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(GithubComApplicationResearchEstuaryApiV2ClaimResponse), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersClaimPost([FromBody]MinerClaimMinerBody body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GithubComApplicationResearchEstuaryApiV2ClaimResponse));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"success\" : true\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<GithubComApplicationResearchEstuaryApiV2ClaimResponse>(exampleJson)
                        : default(GithubComApplicationResearchEstuaryApiV2ClaimResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get Claim Storage Provider
        /// </summary>
        /// <remarks>This endpoint lets a user get the message in order to claim a storage provider</remarks>
        /// <param name="sp">Storage Provider claim message</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//storage-providers/claim/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersClaimSpGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersClaimSpGet([FromRoute][Required]string sp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"hexmsg\" : \"hexmsg\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>(exampleJson)
                        : default(GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all storage providers deals
        /// </summary>
        /// <remarks>This endpoint returns all storage providers deals</remarks>
        /// <param name="sp">Filter by storage provider</param>
        /// <param name="ignoreFailed">Ignore Failed</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//storage-providers/deals/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersDealsSpGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersDealsSpGet([FromRoute][Required]string sp, [FromQuery]string ignoreFailed)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "\"\"";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<string>(exampleJson)
                        : default(string);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all storage providers
        /// </summary>
        /// <remarks>This endpoint returns all storage providers</remarks>
        /// <param name="sp">Filter by storage provider</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//storage-providers/failures/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersFailuresSpGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersFailuresSpGet([FromRoute][Required]string sp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "\"\"";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<string>(exampleJson)
                        : default(string);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all storage providers
        /// </summary>
        /// <remarks>This endpoint returns all storage providers</remarks>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//storage-providers")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<ApiStorageProviderResp>), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ApiStorageProviderResp>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "[ {\n  \"name\" : \"name\",\n  \"suspendedReason\" : \"suspendedReason\",\n  \"addr\" : { },\n  \"version\" : \"version\",\n  \"suspended\" : true\n}, {\n  \"name\" : \"name\",\n  \"suspendedReason\" : \"suspendedReason\",\n  \"addr\" : { },\n  \"version\" : \"version\",\n  \"suspended\" : true\n} ]";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<List<ApiStorageProviderResp>>(exampleJson)
                        : default(List<ApiStorageProviderResp>);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Set Storage Provider Info
        /// </summary>
        /// <remarks>This endpoint lets a user set storage provider info.</remarks>
        /// <param name="body">Storage Provider set info params</param>
        /// <param name="sp">Storage Provider to set info for</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPut]
        [Route("//api.estuary.tech//storage-providers/set-info/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersSetInfoSpPut")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersSetInfoSpPut([FromBody]MinerMinerSetInfoParams body, [FromRoute][Required]string sp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get storage provider stats
        /// </summary>
        /// <remarks>This endpoint returns storage provider stats</remarks>
        /// <param name="sp">Filter by storage provider</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//storage-providers/stats/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersStatsSpGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersStatsSpGet([FromRoute][Required]string sp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "\"\"";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<string>(exampleJson)
                        : default(string);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Suspend Storage Provider
        /// </summary>
        /// <remarks>This endpoint lets a user suspend a storage provider.</remarks>
        /// <param name="body">Suspend Storage Provider Body</param>
        /// <param name="sp">Storage Provider to suspend</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//storage-providers/suspend/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersSuspendSpPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(Dictionary<string, string>), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersSuspendSpPost([FromBody]MinerSuspendMinerBody body, [FromRoute][Required]string sp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Dictionary<string, string>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"key\" : \"\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<Dictionary<string, string>>(exampleJson)
                        : default(Dictionary<string, string>);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Unuspend Storage Provider
        /// </summary>
        /// <remarks>This endpoint lets a user unsuspend a Storage Provider.</remarks>
        /// <param name="sp">Storage Provider to unsuspend</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPut]
        [Route("//api.estuary.tech//storage-providers/unsuspend/{sp}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("StorageProvidersUnsuspendSpPut")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult StorageProvidersUnsuspendSpPut([FromRoute][Required]string sp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));

            throw new NotImplementedException();
        }
    }
}
