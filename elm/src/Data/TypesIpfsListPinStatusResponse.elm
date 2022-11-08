{-
   Estuary API
   This is the API for the Estuary application.

   OpenAPI spec version: 0.0.0
   

   NOTE: This file is auto generated by the swagger code generator program.
   https://github.com/swagger-api/swagger-codegen.git
   Do not edit this file manually.
-}


module Data.TypesIpfsListPinStatusResponse exposing (TypesIpfsListPinStatusResponse, typesIpfsListPinStatusResponseDecoder, typesIpfsListPinStatusResponseEncoder)

import Data.TypesIpfsPinStatusResponse exposing (TypesIpfsPinStatusResponse, typesIpfsPinStatusResponseDecoder, typesIpfsPinStatusResponseEncoder)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (decode, optional, required)
import Json.Encode as Encode
import Maybe exposing (map, withDefault)




type alias TypesIpfsListPinStatusResponse =
    { count : Maybe Int
    , results : Maybe (List TypesIpfsPinStatusResponse)
    }


typesIpfsListPinStatusResponseDecoder : Decoder TypesIpfsListPinStatusResponse
typesIpfsListPinStatusResponseDecoder =
    decode TypesIpfsListPinStatusResponse
        |> optional "count" (Decode.nullable Decode.int) Nothing
        |> optional "results" (Decode.nullable (Decode.list typesIpfsPinStatusResponseDecoder)) Nothing



typesIpfsListPinStatusResponseEncoder : TypesIpfsListPinStatusResponse -> Encode.Value
typesIpfsListPinStatusResponseEncoder model =
    Encode.object
        [ ( "count", withDefault Encode.null (map Encode.int model.count) )
        , ( "results", withDefault Encode.null (map (Encode.list << List.map typesIpfsPinStatusResponseEncoder) model.results) )
        ]


