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
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// Fetch viewer details
        /// </summary>
        /// <remarks>This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.</remarks>
        /// <response code="200">OK</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("//api.estuary.tech//viewer")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("ViewerGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(UtilViewerResponse), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(UtilHttpError), description: "Unauthorized")]
        [SwaggerResponse(statusCode: 500, type: typeof(UtilHttpError), description: "Internal Server Error")]
        public virtual IActionResult ViewerGet()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UtilViewerResponse));

            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(UtilHttpError));

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UtilHttpError));
            string exampleJson = null;
            exampleJson = "{\n  \"settings\" : {\n    \"dealDuration\" : 1,\n    \"replication\" : 2,\n    \"dealMakingDisabled\" : true,\n    \"flags\" : 5,\n    \"verified\" : true,\n    \"fileStagingThreshold\" : 5,\n    \"uploadEndpoints\" : [ \"uploadEndpoints\", \"uploadEndpoints\" ],\n    \"contentAddingDisabled\" : true\n  },\n  \"address\" : \"address\",\n  \"auth_expiry\" : \"auth_expiry\",\n  \"perms\" : 6,\n  \"id\" : 0,\n  \"miners\" : [ \"miners\", \"miners\" ],\n  \"username\" : \"username\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<UtilViewerResponse>(exampleJson)
                        : default(UtilViewerResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}