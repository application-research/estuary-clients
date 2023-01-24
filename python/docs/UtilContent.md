# UtilContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**aggregate** | **bool** |  | [optional] 
**aggregated_in** | **int** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] 
**cid** | [**UtilDbCID**](UtilDbCID.md) |  | [optional] 
**created_at** | **str** |  | [optional] 
**dag_split** | **bool** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] 
**deal_status** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**failed** | **bool** |  | [optional] 
**id** | **int** |  | [optional] 
**location** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**offloaded** | **bool** |  | [optional] 
**origins** | **str** |  | [optional] 
**pin_meta** | **str** |  | [optional] 
**pinning** | **bool** |  | [optional] 
**pinning_status** | **str** |  | [optional] 
**replace** | **bool** |  | [optional] 
**replication** | **int** |  | [optional] 
**size** | **int** |  | [optional] 
**split_from** | **int** |  | [optional] 
**type** | [**UtilContentType**](UtilContentType.md) |  | [optional] 
**updated_at** | **str** |  | [optional] 
**user_id** | **int** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

