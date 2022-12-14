# {{classname}}

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminInvitesCodePost**](ContentApi.md#AdminInvitesCodePost) | **Post** /admin/invites/{code} | Create an Estuary invite
[**AdminInvitesGet**](ContentApi.md#AdminInvitesGet) | **Get** /admin/invites | Get Estuary invites
[**ContentAddCarPost**](ContentApi.md#ContentAddCarPost) | **Post** /content/add-car | Upload content via a car file
[**ContentAddIpfsPost**](ContentApi.md#ContentAddIpfsPost) | **Post** /content/add-ipfs | Add IPFS object
[**ContentAddPost**](ContentApi.md#ContentAddPost) | **Post** /content/add | Upload a file
[**ContentAggregatedContentGet**](ContentApi.md#ContentAggregatedContentGet) | **Get** /content/aggregated/{content} | Get aggregated content stats
[**ContentAllDealsGet**](ContentApi.md#ContentAllDealsGet) | **Get** /content/all-deals | Get all deals for a user
[**ContentBwUsageContentGet**](ContentApi.md#ContentBwUsageContentGet) | **Get** /content/bw-usage/{content} | Get content bandwidth
[**ContentContentsGet**](ContentApi.md#ContentContentsGet) | **Get** /content/contents | Get user contents
[**ContentCreatePost**](ContentApi.md#ContentCreatePost) | **Post** /content/create | Add a new content
[**ContentDealsGet**](ContentApi.md#ContentDealsGet) | **Get** /content/deals | Content with deals
[**ContentEnsureReplicationDatacidGet**](ContentApi.md#ContentEnsureReplicationDatacidGet) | **Get** /content/ensure-replication/{datacid} | Ensure Replication
[**ContentFailuresContentGet**](ContentApi.md#ContentFailuresContentGet) | **Get** /content/failures/{content} | List all failures for a content
[**ContentIdGet**](ContentApi.md#ContentIdGet) | **Get** /content/{id} | Content
[**ContentImportdealPost**](ContentApi.md#ContentImportdealPost) | **Post** /content/importdeal | Import a deal
[**ContentListGet**](ContentApi.md#ContentListGet) | **Get** /content/list | List all pinned content
[**ContentReadContGet**](ContentApi.md#ContentReadContGet) | **Get** /content/read/{cont} | Read content
[**ContentStagingZonesGet**](ContentApi.md#ContentStagingZonesGet) | **Get** /content/staging-zones | Get staging zone for user, excluding its contents
[**ContentStagingZonesStagingZoneContentsGet**](ContentApi.md#ContentStagingZonesStagingZoneContentsGet) | **Get** /content/staging-zones/{staging_zone}/contents | Get contents for a staging zone
[**ContentStagingZonesStagingZoneGet**](ContentApi.md#ContentStagingZonesStagingZoneGet) | **Get** /content/staging-zones/{staging_zone} | Get staging zone without its contents field populated
[**ContentStatsGet**](ContentApi.md#ContentStatsGet) | **Get** /content/stats | Get content statistics
[**ContentStatusIdGet**](ContentApi.md#ContentStatusIdGet) | **Get** /content/status/{id} | Content Status

# **AdminInvitesCodePost**
> string AdminInvitesCodePost(ctx, code)
Create an Estuary invite

This endpoint is used to create an estuary invite.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **code** | **string**| Invite code to be created | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdminInvitesGet**
> string AdminInvitesGet(ctx, )
Get Estuary invites

This endpoint is used to list all estuary invites.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAddCarPost**
> string ContentAddCarPost(ctx, )
Upload content via a car file

This endpoint uploads content via a car file

### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAddIpfsPost**
> string ContentAddIpfsPost(ctx, body, optional)
Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**TypesIpfsPin**](TypesIpfsPin.md)| IPFS Body | 
 **optional** | ***ContentApiContentAddIpfsPostOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ContentApiContentAddIpfsPostOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ignoreDupes** | **optional.**| Ignore Dupes | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAddPost**
> string ContentAddPost(ctx, )
Upload a file

This endpoint uploads a file.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAggregatedContentGet**
> string ContentAggregatedContentGet(ctx, content)
Get aggregated content stats

This endpoint returns aggregated content stats

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **content** | **string**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAllDealsGet**
> string ContentAllDealsGet(ctx, begin, duration, all)
Get all deals for a user

This endpoint is used to get all deals for a user

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **begin** | **string**| Begin | 
  **duration** | **string**| Duration | 
  **all** | **string**| All | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentBwUsageContentGet**
> string ContentBwUsageContentGet(ctx, content)
Get content bandwidth

This endpoint returns content bandwidth

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **content** | **string**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentContentsGet**
> string ContentContentsGet(ctx, limit, offset)
Get user contents

This endpoint is used to get user contents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **limit** | **string**| limit | 
  **offset** | **string**| offset | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentCreatePost**
> string ContentCreatePost(ctx, body, optional)
Add a new content

This endpoint adds a new content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content | 
 **optional** | ***ContentApiContentCreatePostOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ContentApiContentCreatePostOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ignoreDupes** | **optional.**| Ignore Dupes | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentDealsGet**
> string ContentDealsGet(ctx, optional)
Content with deals

This endpoint lists all content with deals

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ContentApiContentDealsGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ContentApiContentDealsGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **optional.Int32**| Limit | 
 **offset** | **optional.Int32**| Offset | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentEnsureReplicationDatacidGet**
> string ContentEnsureReplicationDatacidGet(ctx, datacid)
Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **datacid** | **string**| Data CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentFailuresContentGet**
> string ContentFailuresContentGet(ctx, content)
List all failures for a content

This endpoint returns all failures for a content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **content** | **string**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentIdGet**
> string ContentIdGet(ctx, id)
Content

This endpoint returns a content by its ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **int32**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentImportdealPost**
> string ContentImportdealPost(ctx, body)
Import a deal

This endpoint imports a deal into the shuttle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MainImportDealBody**](MainImportDealBody.md)| Import a deal | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentListGet**
> string ContentListGet(ctx, )
List all pinned content

This endpoint lists all content

### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentReadContGet**
> string ContentReadContGet(ctx, cont)
Read content

This endpoint reads content from the blockstore

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **cont** | **string**| CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentStagingZonesGet**
> string ContentStagingZonesGet(ctx, )
Get staging zone for user, excluding its contents

This endpoint is used to get staging zone for user, excluding its contents.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentStagingZonesStagingZoneContentsGet**
> string ContentStagingZonesStagingZoneContentsGet(ctx, stagingZone, limit, offset)
Get contents for a staging zone

This endpoint is used to get the contents for a staging zone

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **stagingZone** | **int32**| Staging Zone Content ID | 
  **limit** | **string**| limit | 
  **offset** | **string**| offset | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentStagingZonesStagingZoneGet**
> string ContentStagingZonesStagingZoneGet(ctx, stagingZone)
Get staging zone without its contents field populated

This endpoint is used to get a staging zone, excluding its contents.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **stagingZone** | **int32**| Staging Zone Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentStatsGet**
> string ContentStatsGet(ctx, limit, offset)
Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **limit** | **string**| limit | 
  **offset** | **string**| offset | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentStatusIdGet**
> string ContentStatusIdGet(ctx, id)
Content Status

This endpoint returns the status of a content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **int32**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

