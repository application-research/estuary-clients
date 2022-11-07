# \ContentApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**content_add_car_post**](ContentApi.md#content_add_car_post) | **Post** /content/add-car | Add Car object
[**content_add_ipfs_post**](ContentApi.md#content_add_ipfs_post) | **Post** /content/add-ipfs | Add IPFS object
[**content_add_post**](ContentApi.md#content_add_post) | **Post** /content/add | Add new content
[**content_aggregated_content_get**](ContentApi.md#content_aggregated_content_get) | **Get** /content/aggregated/{content} | Get aggregated content stats
[**content_all_deals_get**](ContentApi.md#content_all_deals_get) | **Get** /content/all-deals | Get all deals for a user
[**content_bw_usage_content_get**](ContentApi.md#content_bw_usage_content_get) | **Get** /content/bw-usage/{content} | Get content bandwidth
[**content_create_post**](ContentApi.md#content_create_post) | **Post** /content/create | Add a new content
[**content_deals_get**](ContentApi.md#content_deals_get) | **Get** /content/deals | Content with deals
[**content_ensure_replication_datacid_get**](ContentApi.md#content_ensure_replication_datacid_get) | **Get** /content/ensure-replication/{datacid} | Ensure Replication
[**content_failures_content_get**](ContentApi.md#content_failures_content_get) | **Get** /content/failures/{content} | List all failures for a content
[**content_id_get**](ContentApi.md#content_id_get) | **Get** /content/{id} | Content
[**content_importdeal_post**](ContentApi.md#content_importdeal_post) | **Post** /content/importdeal | Import a deal
[**content_list_get**](ContentApi.md#content_list_get) | **Get** /content/list | List all pinned content
[**content_read_cont_get**](ContentApi.md#content_read_cont_get) | **Get** /content/read/{cont} | Read content
[**content_staging_zones_get**](ContentApi.md#content_staging_zones_get) | **Get** /content/staging-zones | Get staging zone for user
[**content_stats_get**](ContentApi.md#content_stats_get) | **Get** /content/stats | Get content statistics
[**content_status_id_get**](ContentApi.md#content_status_id_get) | **Get** /content/status/{id} | Content Status


# **content_add_car_post**
> String content_add_car_post(ctx, body, optional)
Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **body** | **String**| Car | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| Car | 
 **ignore_dupes** | **String**| Ignore Dupes | 
 **filename** | **String**| Filename | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_add_ipfs_post**
> String content_add_ipfs_post(ctx, body, optional)
Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body | 
 **ignore_dupes** | **String**| Ignore Dupes | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_add_post**
> ::models::UtilContentAddResponse content_add_post(ctx, data, optional)
Add new content

This endpoint is used to upload new content.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **data** | **File**| File to upload | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | **File**| File to upload | 
 **filename** | **String**| Filenam to use for upload | 
 **coluuid** | **String**| Collection UUID | 
 **replication** | **i32**| Replication value | 
 **ignore_dupes** | **String**| Ignore Dupes true/false | 
 **lazy_provide** | **String**| Lazy Provide true/false | 
 **dir** | **String**| Directory | 

### Return type

[**::models::UtilContentAddResponse**](util.ContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_aggregated_content_get**
> String content_aggregated_content_get(ctx, content)
Get aggregated content stats

This endpoint returns aggregated content stats

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **content** | **String**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_all_deals_get**
> String content_all_deals_get(ctx, begin, duration, all)
Get all deals for a user

This endpoint is used to get all deals for a user

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **begin** | **String**| Begin | 
  **duration** | **String**| Duration | 
  **all** | **String**| All | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_bw_usage_content_get**
> String content_bw_usage_content_get(ctx, content)
Get content bandwidth

This endpoint returns content bandwidth

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **content** | **String**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_create_post**
> String content_create_post(ctx, req, optional)
Add a new content

This endpoint adds a new content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **req** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content | 
 **ignore_dupes** | **String**| Ignore Dupes | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_deals_get**
> String content_deals_get(ctx, optional)
Content with deals

This endpoint lists all content with deals

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| Limit | 
 **offset** | **i32**| Offset | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_ensure_replication_datacid_get**
> String content_ensure_replication_datacid_get(ctx, datacid)
Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **datacid** | **String**| Data CID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_failures_content_get**
> String content_failures_content_get(ctx, content)
List all failures for a content

This endpoint returns all failures for a content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **content** | **String**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_id_get**
> String content_id_get(ctx, id)
Content

This endpoint returns a content by its ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **id** | **i32**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_importdeal_post**
> String content_importdeal_post(ctx, body)
Import a deal

This endpoint imports a deal into the shuttle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **body** | [**MainImportDealBody**](MainImportDealBody.md)| Import a deal | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_list_get**
> String content_list_get(ctx, )
List all pinned content

This endpoint lists all content

### Required Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_read_cont_get**
> String content_read_cont_get(ctx, cont)
Read content

This endpoint reads content from the blockstore

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **cont** | **String**| CID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_staging_zones_get**
> String content_staging_zones_get(ctx, )
Get staging zone for user

This endpoint is used to get staging zone for user.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_stats_get**
> String content_stats_get(ctx, limit, offset)
Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **limit** | **String**| limit | 
  **offset** | **String**| offset | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_status_id_get**
> String content_status_id_get(ctx, id)
Content Status

This endpoint returns the status of a content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **id** | **i32**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

