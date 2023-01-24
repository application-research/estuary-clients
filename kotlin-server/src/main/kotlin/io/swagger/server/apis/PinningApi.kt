/**
* Estuary API
* This is the API for the Estuary application.
*
* OpenAPI spec version: 0.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.route

import estuary-client.Paths
import estuary-client.infrastructure.ApiPrincipal


import io.swagger.server.models.TypesIpfsListPinStatusResponse
import io.swagger.server.models.TypesIpfsPin
import io.swagger.server.models.TypesIpfsPinStatusResponse
import io.swagger.server.models.UtilHttpError

@KtorExperimentalLocationsAPI
fun Route.PinningApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    get<Paths.pinningPinsGet> {  _: Paths.pinningPinsGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "count" : 0,
  "results" : [ {
    "pin" : {
      "meta" : "",
      "name" : "name",
      "origins" : [ "origins", "origins" ],
      "cid" : "cid"
    },
    "created" : "created",
    "requestid" : "requestid",
    "delegates" : [ "delegates", "delegates" ],
    "content" : {
      "aggregatedIn" : 6,
      "offloaded" : true,
      "replication" : 5,
      "pinning" : true,
      "pinMeta" : "pinMeta",
      "replace" : true,
      "active" : true,
      "description" : "description",
      "dagSplit" : true,
      "dealStatus" : "dealStatus",
      "failed" : true,
      "type" : 7,
      "userId" : 9,
      "aggregate" : true,
      "createdAt" : "createdAt",
      "pinningStatus" : "pinningStatus",
      "size" : 5,
      "splitFrom" : 2,
      "name" : "name",
      "origins" : "origins",
      "location" : "location",
      "id" : 1,
      "cid" : {
        "cid" : { }
      },
      "updatedAt" : "updatedAt"
    },
    "info" : "",
    "status" : "pinning"
  }, {
    "pin" : {
      "meta" : "",
      "name" : "name",
      "origins" : [ "origins", "origins" ],
      "cid" : "cid"
    },
    "created" : "created",
    "requestid" : "requestid",
    "delegates" : [ "delegates", "delegates" ],
    "content" : {
      "aggregatedIn" : 6,
      "offloaded" : true,
      "replication" : 5,
      "pinning" : true,
      "pinMeta" : "pinMeta",
      "replace" : true,
      "active" : true,
      "description" : "description",
      "dagSplit" : true,
      "dealStatus" : "dealStatus",
      "failed" : true,
      "type" : 7,
      "userId" : 9,
      "aggregate" : true,
      "createdAt" : "createdAt",
      "pinningStatus" : "pinningStatus",
      "size" : 5,
      "splitFrom" : 2,
      "name" : "name",
      "origins" : "origins",
      "location" : "location",
      "id" : 1,
      "cid" : {
        "cid" : { }
      },
      "updatedAt" : "updatedAt"
    },
    "info" : "",
    "status" : "pinning"
  } ]
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    delete<Paths.pinningPinsPinidDelete> {  _: Paths.pinningPinsPinidDelete ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    get<Paths.pinningPinsPinidGet> {  _: Paths.pinningPinsPinidGet ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    post<Paths.pinningPinsPinidPost> {  _: Paths.pinningPinsPinidPost ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    post<Paths.pinningPinsPost> {  _: Paths.pinningPinsPost ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
}
