# EstuaryClient.UtilContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** |  | [optional] 
**aggregate** | **Boolean** |  | [optional] 
**aggregatedIn** | **Number** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] 
**cid** | [**UtilDbCID**](UtilDbCID.md) |  | [optional] 
**createdAt** | **String** |  | [optional] 
**dagSplit** | **Boolean** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] 
**dealStatus** | **String** |  | [optional] 
**description** | **String** |  | [optional] 
**failed** | **Boolean** |  | [optional] 
**id** | **Number** |  | [optional] 
**location** | **String** |  | [optional] 
**name** | **String** |  | [optional] 
**offloaded** | **Boolean** |  | [optional] 
**origins** | **String** |  | [optional] 
**pinMeta** | **String** |  | [optional] 
**pinning** | **Boolean** |  | [optional] 
**pinningStatus** | **String** |  | [optional] 
**replace** | **Boolean** |  | [optional] 
**replication** | **Number** |  | [optional] 
**size** | **Number** |  | [optional] 
**splitFrom** | **Number** |  | [optional] 
**type** | [**UtilContentType**](UtilContentType.md) |  | [optional] 
**updatedAt** | **String** |  | [optional] 
**userId** | **Number** |  | [optional] 
