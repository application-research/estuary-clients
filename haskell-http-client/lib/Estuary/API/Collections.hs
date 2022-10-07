{-
   Estuary API

   This is the API for the Estuary application.

   OpenAPI spec version: 2.0
   Estuary API API version: 0.0.0
   Generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
-}

{-|
Module : Estuary.API.Collections
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Estuary.API.Collections where

import Estuary.Core
import Estuary.MimeTypes
import Estuary.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Collections

-- *** collectionsColuuidCommitPost

-- | @POST \/collections\/{coluuid}\/commit@
-- 
-- Produce a CID of the collection contents
-- 
-- This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
collectionsColuuidCommitPost 
  :: Coluuid -- ^ "coluuid" -  coluuid
  -> EstuaryRequest CollectionsColuuidCommitPost MimeNoContent Text MimeJSON
collectionsColuuidCommitPost (Coluuid coluuid) =
  _mkRequest "POST" ["/collections/",toPath coluuid,"/commit"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data CollectionsColuuidCommitPost  
-- | @application/json@
instance Produces CollectionsColuuidCommitPost MimeJSON


-- *** collectionsColuuidDelete

-- | @DELETE \/collections\/{coluuid}@
-- 
-- Deletes a collection
-- 
-- This endpoint is used to delete an existing collection.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
collectionsColuuidDelete 
  :: Coluuid -- ^ "coluuid" -  Collection ID
  -> EstuaryRequest CollectionsColuuidDelete MimeNoContent NoContent MimeNoContent
collectionsColuuidDelete (Coluuid coluuid) =
  _mkRequest "DELETE" ["/collections/",toPath coluuid]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data CollectionsColuuidDelete  

-- *** collectionsColuuidGet

-- | @GET \/collections\/{coluuid}@
-- 
-- Get contents in a collection
-- 
-- This endpoint is used to get contents in a collection. If no colpath query param is passed
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
collectionsColuuidGet 
  :: Coluuid -- ^ "coluuid" -  Collection UUID
  -> EstuaryRequest CollectionsColuuidGet MimeNoContent Text MimeJSON
collectionsColuuidGet (Coluuid coluuid) =
  _mkRequest "GET" ["/collections/{coluuid}"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setQuery` toQuery ("coluuid", Just coluuid)

data CollectionsColuuidGet  

-- | /Optional Param/ "dir" - Directory
instance HasOptionalParam CollectionsColuuidGet Dir where
  applyOptionalParam req (Dir xs) =
    req `setQuery` toQuery ("dir", Just xs)
-- | @application/json@
instance Produces CollectionsColuuidGet MimeJSON


-- *** collectionsColuuidPost

-- | @POST \/collections\/{coluuid}@
-- 
-- Add contents to a collection
-- 
-- This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
collectionsColuuidPost 
  :: (Consumes CollectionsColuuidPost MimeJSON, MimeRender MimeJSON Body)
  => Body -- ^ "body" -  Content IDs to add to collection
  -> EstuaryRequest CollectionsColuuidPost MimeJSON ((Map.Map String Text)) MimeJSON
collectionsColuuidPost body =
  _mkRequest "POST" ["/collections/{coluuid}"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setBodyParam` body

data CollectionsColuuidPost 

-- | /Body Param/ "body" - Content IDs to add to collection
instance HasBodyParam CollectionsColuuidPost Body 

-- | @application/json@
instance Consumes CollectionsColuuidPost MimeJSON

-- | @application/json@
instance Produces CollectionsColuuidPost MimeJSON


-- *** collectionsFsAddPost

-- | @POST \/collections\/fs\/add@
-- 
-- Add a file to a collection
-- 
-- This endpoint adds a file to a collection
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
collectionsFsAddPost 
  :: Coluuid -- ^ "coluuid" -  Collection ID
  -> Content -- ^ "content" -  Content
  -> Path -- ^ "path" -  Path to file
  -> EstuaryRequest CollectionsFsAddPost MimeNoContent res MimeJSON
collectionsFsAddPost (Coluuid coluuid) (Content content) (Path path) =
  _mkRequest "POST" ["/collections/fs/add"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setQuery` toQuery ("coluuid", Just coluuid)
    `setQuery` toQuery ("content", Just content)
    `setQuery` toQuery ("path", Just path)

data CollectionsFsAddPost  
-- | @application/json@
instance Produces CollectionsFsAddPost MimeJSON


-- *** collectionsGet

-- | @GET \/collections\/@
-- 
-- List all collections
-- 
-- This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
collectionsGet 
  :: Id -- ^ "id" -  User ID
  -> EstuaryRequest CollectionsGet MimeNoContent [MainCollection] MimeJSON
collectionsGet (Id id) =
  _mkRequest "GET" ["/collections/"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data CollectionsGet  
-- | @application/json@
instance Produces CollectionsGet MimeJSON


-- *** collectionsPost

-- | @POST \/collections\/@
-- 
-- Create a new collection
-- 
-- This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
collectionsPost 
  :: (Consumes CollectionsPost contentType, MimeRender contentType MainCreateCollectionBody)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> MainCreateCollectionBody -- ^ "body" -  Collection name and description
  -> EstuaryRequest CollectionsPost contentType MainCollection MimeJSON
collectionsPost _ body =
  _mkRequest "POST" ["/collections/"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setBodyParam` body

data CollectionsPost 

-- | /Body Param/ "body" - Collection name and description
instance HasBodyParam CollectionsPost MainCreateCollectionBody 
-- | @application/json@
instance Produces CollectionsPost MimeJSON
