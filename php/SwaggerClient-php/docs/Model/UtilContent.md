# UtilContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**aggregate** | **bool** |  | [optional] 
**aggregated_in** | **int** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] 
**cid** | [**\Swagger\Client\Model\UtilDbCID**](UtilDbCID.md) |  | [optional] 
**created_at** | **string** |  | [optional] 
**dag_split** | **bool** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] 
**deal_status** | **string** |  | [optional] 
**description** | **string** |  | [optional] 
**failed** | **bool** |  | [optional] 
**id** | **int** |  | [optional] 
**location** | **string** |  | [optional] 
**name** | **string** |  | [optional] 
**offloaded** | **bool** |  | [optional] 
**origins** | **string** |  | [optional] 
**pin_meta** | **string** |  | [optional] 
**pinning** | **bool** |  | [optional] 
**pinning_status** | **string** |  | [optional] 
**replace** | **bool** |  | [optional] 
**replication** | **int** |  | [optional] 
**size** | **int** |  | [optional] 
**split_from** | **int** |  | [optional] 
**type** | [**\Swagger\Client\Model\UtilContentType**](UtilContentType.md) |  | [optional] 
**updated_at** | **string** |  | [optional] 
**user_id** | **int** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

