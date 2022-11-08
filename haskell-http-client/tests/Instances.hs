{-# OPTIONS_GHC -fno-warn-unused-imports #-}

module Instances where

import Estuary.Model
import Estuary.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

-- * Models
 
instance Arbitrary CollectionsCollection where
  arbitrary =
    CollectionsCollection
      <$> arbitrary -- collectionsCollectionCid :: Maybe Text
      <*> arbitrary -- collectionsCollectionCreatedAt :: Maybe Text
      <*> arbitrary -- collectionsCollectionDescription :: Maybe Text
      <*> arbitrary -- collectionsCollectionName :: Maybe Text
      <*> arbitrary -- collectionsCollectionUserId :: Maybe Int
      <*> arbitrary -- collectionsCollectionUuid :: Maybe Text
    
instance Arbitrary MainChannelIDParam where
  arbitrary =
    MainChannelIDParam
      <$> arbitrary -- mainChannelIDParamId :: Maybe Int
      <*> arbitrary -- mainChannelIDParamInitiator :: Maybe Text
      <*> arbitrary -- mainChannelIDParamResponder :: Maybe Text
    
instance Arbitrary MainCreateCollectionBody where
  arbitrary =
    MainCreateCollectionBody
      <$> arbitrary -- mainCreateCollectionBodyDescription :: Maybe Text
      <*> arbitrary -- mainCreateCollectionBodyName :: Maybe Text
    
instance Arbitrary MainDeleteContentFromCollectionBody where
  arbitrary =
    MainDeleteContentFromCollectionBody
      <$> arbitrary -- mainDeleteContentFromCollectionBodyBy :: Maybe Text
      <*> arbitrary -- mainDeleteContentFromCollectionBodyValue :: Maybe Text
    
instance Arbitrary MainEstimateDealBody where
  arbitrary =
    MainEstimateDealBody
      <$> arbitrary -- mainEstimateDealBodyDurationBlks :: Maybe Int
      <*> arbitrary -- mainEstimateDealBodyReplication :: Maybe Int
      <*> arbitrary -- mainEstimateDealBodySize :: Maybe Int
      <*> arbitrary -- mainEstimateDealBodyVerified :: Maybe Bool
    
instance Arbitrary MainGetApiKeysResp where
  arbitrary =
    MainGetApiKeysResp
      <$> arbitrary -- mainGetApiKeysRespExpiry :: Maybe Text
      <*> arbitrary -- mainGetApiKeysRespLabel :: Maybe Text
      <*> arbitrary -- mainGetApiKeysRespToken :: Maybe Text
      <*> arbitrary -- mainGetApiKeysRespTokenHash :: Maybe Text
    
instance Arbitrary MainImportDealBody where
  arbitrary =
    MainImportDealBody
      <$> arbitrary -- mainImportDealBodyColuuid :: Maybe Text
      <*> arbitrary -- mainImportDealBodyDealIDs :: Maybe [Int]
      <*> arbitrary -- mainImportDealBodyDir :: Maybe Text
      <*> arbitrary -- mainImportDealBodyName :: Maybe Text
    
instance Arbitrary TypesIpfsPin where
  arbitrary =
    TypesIpfsPin
      <$> arbitrary -- typesIpfsPinCid :: Maybe Text
      <*> arbitrary -- typesIpfsPinMeta :: Maybe A.Value
      <*> arbitrary -- typesIpfsPinName :: Maybe Text
      <*> arbitrary -- typesIpfsPinOrigins :: Maybe [Text]
    
instance Arbitrary UtilContentAddIpfsBody where
  arbitrary =
    UtilContentAddIpfsBody
      <$> arbitrary -- utilContentAddIpfsBodyColuuid :: Maybe Text
      <*> arbitrary -- utilContentAddIpfsBodyDir :: Maybe Text
      <*> arbitrary -- utilContentAddIpfsBodyFilename :: Maybe Text
      <*> arbitrary -- utilContentAddIpfsBodyPeers :: Maybe [Text]
      <*> arbitrary -- utilContentAddIpfsBodyRoot :: Maybe Text
    
instance Arbitrary UtilContentAddResponse where
  arbitrary =
    UtilContentAddResponse
      <$> arbitrary -- utilContentAddResponseCid :: Maybe Text
      <*> arbitrary -- utilContentAddResponseEstuaryId :: Maybe Int
      <*> arbitrary -- utilContentAddResponseProviders :: Maybe [Text]
      <*> arbitrary -- utilContentAddResponseRetrievalUrl :: Maybe Text
    
instance Arbitrary UtilContentCreateBody where
  arbitrary =
    UtilContentCreateBody
      <$> arbitrary -- utilContentCreateBodyColuuid :: Maybe Text
      <*> arbitrary -- utilContentCreateBodyDir :: Maybe Text
      <*> arbitrary -- utilContentCreateBodyLocation :: Maybe Text
      <*> arbitrary -- utilContentCreateBodyName :: Maybe Text
      <*> arbitrary -- utilContentCreateBodyRoot :: Maybe Text
      <*> arbitrary -- utilContentCreateBodyType :: Maybe Int
    
instance Arbitrary UtilHttpError where
  arbitrary =
    UtilHttpError
      <$> arbitrary -- utilHttpErrorCode :: Maybe Int
      <*> arbitrary -- utilHttpErrorDetails :: Maybe Text
      <*> arbitrary -- utilHttpErrorReason :: Maybe Text
    


