{-
   Estuary API

   This is the API for the Estuary application.

   OpenAPI spec version: 2.0
   Estuary API API version: 0.0.0
   Generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
-}

{-|
Module : Estuary.API.Pinning
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Estuary.API.Pinning where

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


-- ** Pinning

-- *** pinningPinsGet

-- | @GET \/pinning\/pins@
-- 
-- List all pin status objects
-- 
-- This endpoint lists all pin status objects
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
pinningPinsGet 
  :: EstuaryRequest PinningPinsGet MimeNoContent Text MimeJSON
pinningPinsGet =
  _mkRequest "GET" ["/pinning/pins"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data PinningPinsGet  
-- | @application/json@
instance Produces PinningPinsGet MimeJSON


-- *** pinningPinsPinidDelete

-- | @DELETE \/pinning\/pins\/{pinid}@
-- 
-- Delete a pinned object
-- 
-- This endpoint deletes a pinned object.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
pinningPinsPinidDelete 
  :: Pinid -- ^ "pinid" -  Pin ID
  -> EstuaryRequest PinningPinsPinidDelete MimeNoContent Text MimeJSON
pinningPinsPinidDelete (Pinid pinid) =
  _mkRequest "DELETE" ["/pinning/pins/",toPath pinid]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data PinningPinsPinidDelete  
-- | @application/json@
instance Produces PinningPinsPinidDelete MimeJSON


-- *** pinningPinsPinidGet

-- | @GET \/pinning\/pins\/{pinid}@
-- 
-- Get a pin status object
-- 
-- This endpoint returns a pin status object.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
pinningPinsPinidGet 
  :: Pinid -- ^ "pinid" -  cid
  -> EstuaryRequest PinningPinsPinidGet MimeNoContent Text MimeJSON
pinningPinsPinidGet (Pinid pinid) =
  _mkRequest "GET" ["/pinning/pins/",toPath pinid]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)

data PinningPinsPinidGet  
-- | @application/json@
instance Produces PinningPinsPinidGet MimeJSON


-- *** pinningPinsPinidPost

-- | @POST \/pinning\/pins\/{pinid}@
-- 
-- Replace a pinned object
-- 
-- This endpoint replaces a pinned object.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
pinningPinsPinidPost 
  :: (Consumes PinningPinsPinidPost contentType, MimeRender contentType Cid2)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> Pinid -- ^ "pinid" -  Pin ID
  -> Cid2 -- ^ "cid" -  CID of new pin
  -> EstuaryRequest PinningPinsPinidPost contentType Text MimeJSON
pinningPinsPinidPost _ (Pinid pinid) cid =
  _mkRequest "POST" ["/pinning/pins/",toPath pinid]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setBodyParam` cid

data PinningPinsPinidPost 

-- | /Body Param/ "cid" - CID of new pin
instance HasBodyParam PinningPinsPinidPost Cid2

-- | /Body Param/ "name" - Name (filename) of new pin
instance HasBodyParam PinningPinsPinidPost Name2

-- | /Body Param/ "origins" - Origins of new pin
instance HasBodyParam PinningPinsPinidPost Origins2

-- | /Body Param/ "meta" - Meta information of new pin
instance HasBodyParam PinningPinsPinidPost Meta2 
-- | @application/json@
instance Produces PinningPinsPinidPost MimeJSON


-- *** pinningPinsPost

-- | @POST \/pinning\/pins@
-- 
-- Add and pin object
-- 
-- This endpoint adds a pin to the IPFS daemon.
-- 
-- AuthMethod: 'AuthApiKeyBearerAuth'
-- 
pinningPinsPost 
  :: (Consumes PinningPinsPost contentType, MimeRender contentType TypesIpfsPin)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> TypesIpfsPin -- ^ "pin" -  Pin Body {cid:cid, name:name}
  -> EstuaryRequest PinningPinsPost contentType Text MimeJSON
pinningPinsPost _ pin =
  _mkRequest "POST" ["/pinning/pins"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyBearerAuth)
    `setBodyParam` pin

data PinningPinsPost 

-- | /Body Param/ "pin" - Pin Body {cid:cid, name:name}
instance HasBodyParam PinningPinsPost TypesIpfsPin 
-- | @application/json@
instance Produces PinningPinsPost MimeJSON

