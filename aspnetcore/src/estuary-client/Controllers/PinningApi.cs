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
    public class PinningApiController : ControllerBase
    { 
        /// <summary>
        /// List all pin status objects
        /// </summary>
        /// <remarks>This endpoint lists all pin status objects</remarks>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//pinning/pins")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(TypesIpfsListPinStatusResponse), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(UtilHttpError), description: "Bad Request")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult PinningPinsGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TypesIpfsListPinStatusResponse));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"count\" : 0,\n  \"results\" : [ {\n    \"pin\" : {\n      \"meta\" : \"\",\n      \"name\" : \"name\",\n      \"origins\" : [ \"origins\", \"origins\" ],\n      \"cid\" : \"cid\"\n    },\n    \"created\" : \"created\",\n    \"requestid\" : \"requestid\",\n    \"delegates\" : [ \"delegates\", \"delegates\" ],\n    \"info\" : \"\",\n    \"status\" : \"pinning\"\n  }, {\n    \"pin\" : {\n      \"meta\" : \"\",\n      \"name\" : \"name\",\n      \"origins\" : [ \"origins\", \"origins\" ],\n      \"cid\" : \"cid\"\n    },\n    \"created\" : \"created\",\n    \"requestid\" : \"requestid\",\n    \"delegates\" : [ \"delegates\", \"delegates\" ],\n    \"info\" : \"\",\n    \"status\" : \"pinning\"\n  } ]\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<TypesIpfsListPinStatusResponse>(exampleJson)
                        : default(TypesIpfsListPinStatusResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete a pinned object
        /// </summary>
        /// <remarks>This endpoint deletes a pinned object.</remarks>
        /// <param name="pinid">Pin ID</param>
        /// <response code="202">Accepted</response>
        /// <response code="500">Internal Server Error</response>
        [HttpDelete]
        [Route("//api.estuary.tech//pinning/pins/{pinid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPinidDelete")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult PinningPinsPinidDelete([FromRoute][Required]string pinid)
        { 
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202);

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get a pin status object
        /// </summary>
        /// <remarks>This endpoint returns a pin status object.</remarks>
        /// <param name="pinid">cid</param>
        /// <response code="200">OK</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//pinning/pins/{pinid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPinidGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(TypesIpfsPinStatusResponse), description: "OK")]
        [SwaggerResponse(statusCode: 404, type: typeof(UtilHttpError), description: "Not Found")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult PinningPinsPinidGet([FromRoute][Required]string pinid)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TypesIpfsPinStatusResponse));

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"pin\" : {\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"info\" : \"\",\n  \"status\" : \"pinning\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<TypesIpfsPinStatusResponse>(exampleJson)
                        : default(TypesIpfsPinStatusResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Replace a pinned object
        /// </summary>
        /// <remarks>This endpoint replaces a pinned object.</remarks>
        /// <param name="body">New pin</param>
        /// <param name="pinid">Pin ID to be replaced</param>
        /// <response code="202">Accepted</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//pinning/pins/{pinid}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPinidPost")]
        [SwaggerResponse(statusCode: 202, type: typeof(TypesIpfsPinStatusResponse), description: "Accepted")]
        [SwaggerResponse(statusCode: 404, type: typeof(UtilHttpError), description: "Not Found")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult PinningPinsPinidPost([FromBody]TypesIpfsPin body, [FromRoute][Required]string pinid)
        { 
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(TypesIpfsPinStatusResponse));

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"pin\" : {\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"info\" : \"\",\n  \"status\" : \"pinning\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<TypesIpfsPinStatusResponse>(exampleJson)
                        : default(TypesIpfsPinStatusResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Add and pin object
        /// </summary>
        /// <remarks>This endpoint adds a pin to the IPFS daemon.</remarks>
        /// <param name="body">Pin Body {cid:cid, name:name}</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <param name="overwrite">Overwrite conflicting files in collections</param>
        /// <response code="202">Accepted</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("//api.estuary.tech//pinning/pins")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("PinningPinsPost")]
        [SwaggerResponse(statusCode: 202, type: typeof(TypesIpfsPinStatusResponse), description: "Accepted")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult PinningPinsPost([FromBody]TypesIpfsPin body, [FromQuery]string ignoreDupes, [FromQuery]string overwrite)
        { 
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(TypesIpfsPinStatusResponse));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"pin\" : {\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"info\" : \"\",\n  \"status\" : \"pinning\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<TypesIpfsPinStatusResponse>(exampleJson)
                        : default(TypesIpfsPinStatusResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
