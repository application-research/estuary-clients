# UtilContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Active** | **bool** |  | [optional] [default to null]
**Aggregate** | **bool** |  | [optional] [default to null]
**AggregatedIn** | **int32** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] [default to null]
**Cid** | [***UtilDbCid**](util.DbCID.md) |  | [optional] [default to null]
**CreatedAt** | **string** |  | [optional] [default to null]
**DagSplit** | **bool** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] [default to null]
**DealStatus** | **string** |  | [optional] [default to null]
**Description** | **string** |  | [optional] [default to null]
**Failed** | **bool** |  | [optional] [default to null]
**Id** | **int32** |  | [optional] [default to null]
**Location** | **string** |  | [optional] [default to null]
**Name** | **string** |  | [optional] [default to null]
**Offloaded** | **bool** |  | [optional] [default to null]
**Origins** | **string** |  | [optional] [default to null]
**PinMeta** | **string** |  | [optional] [default to null]
**Pinning** | **bool** |  | [optional] [default to null]
**PinningStatus** | **string** |  | [optional] [default to null]
**Replace** | **bool** |  | [optional] [default to null]
**Replication** | **int32** |  | [optional] [default to null]
**Size** | **int32** |  | [optional] [default to null]
**SplitFrom** | **int32** |  | [optional] [default to null]
**Type_** | [***UtilContentType**](util.ContentType.md) |  | [optional] [default to null]
**UpdatedAt** | **string** |  | [optional] [default to null]
**UserId** | **int32** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

