# SwaggerClient::UtilContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **BOOLEAN** |  | [optional] 
**aggregate** | **BOOLEAN** |  | [optional] 
**aggregated_in** | **Integer** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] 
**cid** | [**UtilDbCID**](UtilDbCID.md) |  | [optional] 
**created_at** | **String** |  | [optional] 
**dag_split** | **BOOLEAN** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] 
**deal_status** | **String** |  | [optional] 
**description** | **String** |  | [optional] 
**failed** | **BOOLEAN** |  | [optional] 
**id** | **Integer** |  | [optional] 
**location** | **String** |  | [optional] 
**name** | **String** |  | [optional] 
**offloaded** | **BOOLEAN** |  | [optional] 
**origins** | **String** |  | [optional] 
**pin_meta** | **String** |  | [optional] 
**pinning** | **BOOLEAN** |  | [optional] 
**pinning_status** | **String** |  | [optional] 
**replace** | **BOOLEAN** |  | [optional] 
**replication** | **Integer** |  | [optional] 
**size** | **Integer** |  | [optional] 
**split_from** | **Integer** |  | [optional] 
**type** | [**UtilContentType**](UtilContentType.md) |  | [optional] 
**updated_at** | **String** |  | [optional] 
**user_id** | **Integer** |  | [optional] 

