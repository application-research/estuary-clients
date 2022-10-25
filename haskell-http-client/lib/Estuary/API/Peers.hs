{-
   Estuary API

   This is the API for the Estuary application.

   OpenAPI spec version: 2.0
   Estuary API API version: 0.0.0
   Generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
-}

{-|
Module : Estuary.API.Peers
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Estuary.API.Peers where

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


-- ** Peers

-- *** adminPeeringPeersDelete1

-- | @DELETE \/admin\/peering\/peers@
-- 
-- Remove peers on Peering Service
-- 
-- This endpoint can be used to remove a Peer from the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringPeersDelete1 
  :: (Consumes AdminPeeringPeersDelete1 contentType, MimeRender contentType Body)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> Body -- ^ "body" -  Peer ids
  -> EstuaryRequest AdminPeeringPeersDelete1 contentType res MimeJSON
adminPeeringPeersDelete1 _ body =
  _mkRequest "DELETE" ["/admin/peering/peers"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setBodyParam` body

data AdminPeeringPeersDelete1 

-- | /Body Param/ "body" - Peer ids
instance HasBodyParam AdminPeeringPeersDelete1 Body 
-- | @application/json@
instance Produces AdminPeeringPeersDelete1 MimeJSON


-- *** adminPeeringPeersGet1

-- | @GET \/admin\/peering\/peers@
-- 
-- List all Peering peers
-- 
-- This endpoint can be used to list all peers on Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringPeersGet1 
  :: EstuaryRequest AdminPeeringPeersGet1 MimeNoContent res MimeJSON
adminPeeringPeersGet1 =
  _mkRequest "GET" ["/admin/peering/peers"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringPeersGet1  
-- | @application/json@
instance Produces AdminPeeringPeersGet1 MimeJSON


-- *** adminPeeringPeersPost1

-- | @POST \/admin\/peering\/peers@
-- 
-- Add peers on Peering Service
-- 
-- This endpoint can be used to add a Peer from the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringPeersPost1 
  :: EstuaryRequest AdminPeeringPeersPost1 MimeNoContent res MimeJSON
adminPeeringPeersPost1 =
  _mkRequest "POST" ["/admin/peering/peers"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringPeersPost1  
-- | @application/json@
instance Produces AdminPeeringPeersPost1 MimeJSON


-- *** adminPeeringStartPost1

-- | @POST \/admin\/peering\/start@
-- 
-- Start Peering
-- 
-- This endpoint can be used to start the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringStartPost1 
  :: EstuaryRequest AdminPeeringStartPost1 MimeNoContent res MimeJSON
adminPeeringStartPost1 =
  _mkRequest "POST" ["/admin/peering/start"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringStartPost1  
-- | @application/json@
instance Produces AdminPeeringStartPost1 MimeJSON


-- *** adminPeeringStatusGet1

-- | @GET \/admin\/peering\/status@
-- 
-- Check Peering Status
-- 
-- This endpoint can be used to check the Peering status
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringStatusGet1 
  :: EstuaryRequest AdminPeeringStatusGet1 MimeNoContent res MimeJSON
adminPeeringStatusGet1 =
  _mkRequest "GET" ["/admin/peering/status"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringStatusGet1  
-- | @application/json@
instance Produces AdminPeeringStatusGet1 MimeJSON


-- *** adminPeeringStopPost1

-- | @POST \/admin\/peering\/stop@
-- 
-- Stop Peering
-- 
-- This endpoint can be used to stop the Peering Service
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
adminPeeringStopPost1 
  :: EstuaryRequest AdminPeeringStopPost1 MimeNoContent res MimeJSON
adminPeeringStopPost1 =
  _mkRequest "POST" ["/admin/peering/stop"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data AdminPeeringStopPost1  
-- | @application/json@
instance Produces AdminPeeringStopPost1 MimeJSON

