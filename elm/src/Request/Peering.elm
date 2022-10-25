{-
   Estuary API
   This is the API for the Estuary application.

   OpenAPI spec version: 0.0.0
   

   NOTE: This file is auto generated by the swagger code generator program.
   https://github.com/swagger-api/swagger-codegen.git
   Do not edit this file manually.
-}


module Request.Peering exposing (adminPeeringPeersDelete, adminPeeringPeersGet, adminPeeringPeersPost, adminPeeringStartPost, adminPeeringStatusGet, adminPeeringStopPost)

import Data.String exposing (Encode.string, String)
import Http
import Json.Decode as Decode


basePath : String
basePath =
    "https://api.estuary.tech"


{-
   This endpoint can be used to remove a Peer from the Peering Service
-}
adminPeeringPeersDelete : String -> Http.Request 
adminPeeringPeersDelete model =
    { method = "DELETE"
    , url = basePath ++ "/admin/peering/peers"
    , headers = []
    , body = Http.jsonBody <| Encode.string model
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint can be used to list all peers on Peering Service
-}
adminPeeringPeersGet : Http.Request 
adminPeeringPeersGet =
    { method = "GET"
    , url = basePath ++ "/admin/peering/peers"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint can be used to add a Peer from the Peering Service
-}
adminPeeringPeersPost : Http.Request 
adminPeeringPeersPost =
    { method = "POST"
    , url = basePath ++ "/admin/peering/peers"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint can be used to start the Peering Service
-}
adminPeeringStartPost : Http.Request 
adminPeeringStartPost =
    { method = "POST"
    , url = basePath ++ "/admin/peering/start"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint can be used to check the Peering status
-}
adminPeeringStatusGet : Http.Request 
adminPeeringStatusGet =
    { method = "GET"
    , url = basePath ++ "/admin/peering/status"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint can be used to stop the Peering Service
-}
adminPeeringStopPost : Http.Request 
adminPeeringStopPost =
    { method = "POST"
    , url = basePath ++ "/admin/peering/stop"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


