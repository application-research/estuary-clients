# IO.Swagger.Model.UtilContent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Active** | **bool?** |  | [optional] 
**Aggregate** | **bool?** |  | [optional] 
**AggregatedIn** | **int?** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] 
**Cid** | [**UtilDbCID**](UtilDbCID.md) |  | [optional] 
**CreatedAt** | **string** |  | [optional] 
**DagSplit** | **bool?** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] 
**DealStatus** | **string** |  | [optional] 
**Description** | **string** |  | [optional] 
**Failed** | **bool?** |  | [optional] 
**Id** | **int?** |  | [optional] 
**Location** | **string** |  | [optional] 
**Name** | **string** |  | [optional] 
**Offloaded** | **bool?** |  | [optional] 
**Origins** | **string** |  | [optional] 
**PinMeta** | **string** |  | [optional] 
**Pinning** | **bool?** |  | [optional] 
**PinningStatus** | **string** |  | [optional] 
**Replace** | **bool?** |  | [optional] 
**Replication** | **int?** |  | [optional] 
**Size** | **int?** |  | [optional] 
**SplitFrom** | **int?** |  | [optional] 
**Type** | [**UtilContentType**](UtilContentType.md) |  | [optional] 
**UpdatedAt** | **string** |  | [optional] 
**UserId** | **int?** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

