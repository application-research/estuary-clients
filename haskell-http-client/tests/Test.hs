{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import Estuary.Model
import Estuary.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 5) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy CollectionsCollection)
      propMimeEq MimeJSON (Proxy :: Proxy MainChannelIDParam)
      propMimeEq MimeJSON (Proxy :: Proxy MainCreateCollectionBody)
      propMimeEq MimeJSON (Proxy :: Proxy MainDeleteContentFromCollectionBody)
      propMimeEq MimeJSON (Proxy :: Proxy MainEstimateDealBody)
      propMimeEq MimeJSON (Proxy :: Proxy MainGetApiKeysResp)
      propMimeEq MimeJSON (Proxy :: Proxy MainImportDealBody)
      propMimeEq MimeJSON (Proxy :: Proxy TypesIpfsListPinStatusResponse)
      propMimeEq MimeJSON (Proxy :: Proxy TypesIpfsPin)
      propMimeEq MimeJSON (Proxy :: Proxy TypesIpfsPinStatusResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UtilContentAddIpfsBody)
      propMimeEq MimeJSON (Proxy :: Proxy UtilContentAddResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UtilContentCreateBody)
      propMimeEq MimeJSON (Proxy :: Proxy UtilHttpError)
      
