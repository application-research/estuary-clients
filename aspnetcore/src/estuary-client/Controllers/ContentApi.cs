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
    public class ContentApiController : ControllerBase
    { 
        /// <summary>
        /// Get Estuary invites
        /// </summary>
        /// <remarks>This endpoint is used to list all estuary invites.</remarks>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//admin/invites")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("AdminInvitesGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult AdminInvitesGet()
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
        /// Create an Estuary invite
        /// </summary>
        /// <remarks>This endpoint is used to create an estuary invite.</remarks>
        /// <param name="code">Invite code to be created</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//admin/invites")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("AdminInvitesPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult AdminInvitesPost([FromRoute][Required]string code)
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
        /// Add Car object
        /// </summary>
        /// <remarks>This endpoint is used to add a car object to the network. The object can be a file or a directory.</remarks>
        /// <param name="body">Car</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <param name="filename">Filename</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//content/add-car")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentAddCarPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(UtilContentAddResponse), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentAddCarPost([FromBody]string body, [FromQuery]string ignoreDupes, [FromQuery]string filename)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UtilContentAddResponse));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"retrieval_url\" : \"retrieval_url\",\n  \"estuaryId\" : 0,\n  \"providers\" : [ \"providers\", \"providers\" ],\n  \"cid\" : \"cid\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<UtilContentAddResponse>(exampleJson)
                        : default(UtilContentAddResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Add IPFS object
        /// </summary>
        /// <remarks>This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.</remarks>
        /// <param name="body">IPFS Body</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//content/add-ipfs")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentAddIpfsPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentAddIpfsPost([FromBody]UtilContentAddIpfsBody body, [FromQuery]string ignoreDupes)
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
        /// Get aggregated content stats
        /// </summary>
        /// <remarks>This endpoint returns aggregated content stats</remarks>
        /// <param name="content">Content ID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/aggregated/{content}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentAggregatedContentGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentAggregatedContentGet([FromRoute][Required]string content)
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
        /// Get all deals for a user
        /// </summary>
        /// <remarks>This endpoint is used to get all deals for a user</remarks>
        /// <param name="begin">Begin</param>
        /// <param name="duration">Duration</param>
        /// <param name="all">All</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/all-deals")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentAllDealsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentAllDealsGet([FromQuery][Required()]string begin, [FromQuery][Required()]string duration, [FromQuery][Required()]string all)
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
        /// Get content bandwidth
        /// </summary>
        /// <remarks>This endpoint returns content bandwidth</remarks>
        /// <param name="content">Content ID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/bw-usage/{content}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentBwUsageContentGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentBwUsageContentGet([FromRoute][Required]string content)
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
        /// Add a new content
        /// </summary>
        /// <remarks>This endpoint adds a new content</remarks>
        /// <param name="body">Content</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//content/create")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentCreatePost")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentCreatePost([FromBody]UtilContentCreateBody body, [FromQuery]string ignoreDupes)
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
        /// Content with deals
        /// </summary>
        /// <remarks>This endpoint lists all content with deals</remarks>
        /// <param name="limit">Limit</param>
        /// <param name="offset">Offset</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/deals")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentDealsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentDealsGet([FromQuery]int? limit, [FromQuery]int? offset)
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
        /// Ensure Replication
        /// </summary>
        /// <remarks>This endpoint ensures that the content is replicated to the specified number of providers</remarks>
        /// <param name="datacid">Data CID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/ensure-replication/{datacid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentEnsureReplicationDatacidGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentEnsureReplicationDatacidGet([FromRoute][Required]string datacid)
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
        /// List all failures for a content
        /// </summary>
        /// <remarks>This endpoint returns all failures for a content</remarks>
        /// <param name="content">Content ID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/failures/{content}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentFailuresContentGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentFailuresContentGet([FromRoute][Required]string content)
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
        /// Content
        /// </summary>
        /// <remarks>This endpoint returns a content by its ID</remarks>
        /// <param name="id">Content ID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/{id}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentIdGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentIdGet([FromRoute][Required]int? id)
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
        /// Import a deal
        /// </summary>
        /// <remarks>This endpoint imports a deal into the shuttle.</remarks>
        /// <param name="body">Import a deal</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//content/importdeal")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentImportdealPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentImportdealPost([FromBody]MainImportDealBody body)
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
        /// List all pinned content
        /// </summary>
        /// <remarks>This endpoint lists all content</remarks>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/list")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentListGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentListGet()
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
        /// Read content
        /// </summary>
        /// <remarks>This endpoint reads content from the blockstore</remarks>
        /// <param name="cont">CID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/read/{cont}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentReadContGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentReadContGet([FromRoute][Required]string cont)
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
        /// Get staging zone for user
        /// </summary>
        /// <remarks>This endpoint is used to get staging zone for user.</remarks>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/staging-zones")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentStagingZonesGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentStagingZonesGet()
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
        /// Get content statistics
        /// </summary>
        /// <remarks>This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten</remarks>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/stats")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentStatsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentStatsGet([FromQuery][Required()]string limit, [FromQuery][Required()]string offset)
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
        /// Content Status
        /// </summary>
        /// <remarks>This endpoint returns the status of a content</remarks>
        /// <param name="id">Content ID</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//content/status/{id}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ContentStatusIdGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ContentStatusIdGet([FromRoute][Required]int? id)
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
    }
}
