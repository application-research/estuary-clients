{-
   Estuary API
   This is the API for the Estuary application.

   OpenAPI spec version: 0.0.0
   

   NOTE: This file is auto generated by the swagger code generator program.
   https://github.com/swagger-api/swagger-codegen.git
   Do not edit this file manually.
-}


module Request.Collections exposing (collectionsColuuidCommitPost, collectionsColuuidContentsDelete, collectionsColuuidDelete, collectionsColuuidGet, collectionsColuuidPost, collectionsFsAddPost, collectionsGet, collectionsPost)

import Data.MainDeleteContentFromCollectionBody exposing (MainDeleteContentFromCollectionBody, mainDeleteContentFromCollectionBodyEncoder)
import Data.MainCreateCollectionBody exposing (MainCreateCollectionBody, mainCreateCollectionBodyEncoder)
import Data.CollectionsCollection exposing (CollectionsCollection, collectionsCollectionDecoder)
import Data.UtilHttpError exposing (UtilHttpError, utilHttpErrorDecoder)
import Data.String exposing (Decode.string, String, stringDecoder)
import Data.Int exposing (Encode.int, Int)
import Http
import Json.Decode as Decode


basePath : String
basePath =
    "https://api.estuary.tech"


{-
   This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
-}
collectionsColuuidCommitPost : String -> Http.Request String
collectionsColuuidCommitPost coluuid =
    { method = "POST"
    , url = basePath ++ "/collections/" ++ coluuid ++ "/commit"
    , headers = []
    , body = Http.emptyBody
    , expect = Http.expectJson Decode.string
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
-}
collectionsColuuidContentsDelete : String -> String -> MainDeleteContentFromCollectionBody -> Http.Request String
collectionsColuuidContentsDelete coluuid contentid model =
    { method = "DELETE"
    , url = basePath ++ "/collections/" ++ coluuid ++ "/contents"
    , headers = []
    , body = Http.jsonBody <| mainDeleteContentFromCollectionBodyEncoder model
    , expect = Http.expectJson Decode.string
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint is used to delete an existing collection.
-}
collectionsColuuidDelete : String -> Http.Request 
collectionsColuuidDelete coluuid =
    { method = "DELETE"
    , url = basePath ++ "/collections/" ++ coluuid
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint is used to get contents in a collection. If no colpath query param is passed
-}
collectionsColuuidGet : String -> Http.Request String
collectionsColuuidGet coluuid =
    { method = "GET"
    , url = basePath ++ "/collections/" ++ coluuid
    , headers = []
    , body = Http.emptyBody
    , expect = Http.expectJson Decode.string
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
-}
collectionsColuuidPost : String -> Int -> Http.Request String
collectionsColuuidPost coluuid model =
    { method = "POST"
    , url = basePath ++ "/collections/" ++ coluuid
    , headers = []
    , body = Http.jsonBody <| Encode.int model
    , expect = Http.expectJson stringDecoder
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint adds a file to a collection
-}
collectionsFsAddPost : Http.Request 
collectionsFsAddPost =
    { method = "POST"
    , url = basePath ++ "/collections/fs/add"
    , headers = []
    , body = Http.emptyBody
    , expect = 
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
-}
collectionsGet : Http.Request (List CollectionsCollection)
collectionsGet =
    { method = "GET"
    , url = basePath ++ "/collections/"
    , headers = []
    , body = Http.emptyBody
    , expect = Http.expectJson (Decode.list collectionsCollectionDecoder)
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


{-
   This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
-}
collectionsPost : MainCreateCollectionBody -> Http.Request CollectionsCollection
collectionsPost model =
    { method = "POST"
    , url = basePath ++ "/collections/"
    , headers = []
    , body = Http.jsonBody <| mainCreateCollectionBodyEncoder model
    , expect = Http.expectJson collectionsCollectionDecoder
    , timeout = Just 30000
    , withCredentials = False
    }
        |> Http.request


