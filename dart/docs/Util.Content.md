# swagger.model.UtilContent

## Load the model package
```dart
import 'package:swagger/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] [default to null]
**aggregate** | **bool** |  | [optional] [default to null]
**aggregatedIn** | **int** | TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler | [optional] [default to null]
**cid** | [**UtilDbCID**](UtilDbCID.md) |  | [optional] [default to null]
**createdAt** | **String** |  | [optional] [default to null]
**dagSplit** | **bool** | If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) | [optional] [default to null]
**dealStatus** | **String** |  | [optional] [default to null]
**description** | **String** |  | [optional] [default to null]
**failed** | **bool** |  | [optional] [default to null]
**id** | **int** |  | [optional] [default to null]
**location** | **String** |  | [optional] [default to null]
**name** | **String** |  | [optional] [default to null]
**offloaded** | **bool** |  | [optional] [default to null]
**origins** | **String** |  | [optional] [default to null]
**pinMeta** | **String** |  | [optional] [default to null]
**pinning** | **bool** |  | [optional] [default to null]
**pinningStatus** | **String** |  | [optional] [default to null]
**replace** | **bool** |  | [optional] [default to null]
**replication** | **int** |  | [optional] [default to null]
**size** | **int** |  | [optional] [default to null]
**splitFrom** | **int** |  | [optional] [default to null]
**type** | [**UtilContentType**](UtilContentType.md) |  | [optional] [default to null]
**updatedAt** | **String** |  | [optional] [default to null]
**userId** | **int** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

