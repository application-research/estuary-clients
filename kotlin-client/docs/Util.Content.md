# UtilContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | [**kotlin.Boolean**](.md) |  |  [optional]
**aggregate** | [**kotlin.Boolean**](.md) |  |  [optional]
**aggregatedIn** | [**kotlin.Int**](.md) | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler |  [optional]
**cid** | [**UtilDbCID**](UtilDbCID.md) |  |  [optional]
**createdAt** | [**kotlin.String**](.md) |  |  [optional]
**dagSplit** | [**kotlin.Boolean**](.md) | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) |  [optional]
**dealStatus** | [**kotlin.String**](.md) |  |  [optional]
**description** | [**kotlin.String**](.md) |  |  [optional]
**failed** | [**kotlin.Boolean**](.md) |  |  [optional]
**id** | [**kotlin.Int**](.md) |  |  [optional]
**location** | [**kotlin.String**](.md) |  |  [optional]
**name** | [**kotlin.String**](.md) |  |  [optional]
**offloaded** | [**kotlin.Boolean**](.md) |  |  [optional]
**origins** | [**kotlin.String**](.md) |  |  [optional]
**pinMeta** | [**kotlin.String**](.md) |  |  [optional]
**pinning** | [**kotlin.Boolean**](.md) |  |  [optional]
**pinningStatus** | [**kotlin.String**](.md) |  |  [optional]
**replace** | [**kotlin.Boolean**](.md) |  |  [optional]
**replication** | [**kotlin.Int**](.md) |  |  [optional]
**size** | [**kotlin.Int**](.md) |  |  [optional]
**splitFrom** | [**kotlin.Int**](.md) |  |  [optional]
**type** | [**UtilContentType**](UtilContentType.md) |  |  [optional]
**updatedAt** | [**kotlin.String**](.md) |  |  [optional]
**userId** | [**kotlin.Int**](.md) |  |  [optional]
