# CONTENT_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**content_add_car_post**](CONTENT_API.md#content_add_car_post) | **Post** /content/add-car | Add Car object
[**content_add_ipfs_post**](CONTENT_API.md#content_add_ipfs_post) | **Post** /content/add-ipfs | Add IPFS object
[**content_add_post**](CONTENT_API.md#content_add_post) | **Post** /content/add | Add new content
[**content_aggregated_content_get**](CONTENT_API.md#content_aggregated_content_get) | **Get** /content/aggregated/{content} | Get aggregated content stats
[**content_all_deals_get**](CONTENT_API.md#content_all_deals_get) | **Get** /content/all-deals | Get all deals for a user
[**content_bw_usage_content_get**](CONTENT_API.md#content_bw_usage_content_get) | **Get** /content/bw-usage/{content} | Get content bandwidth
[**content_create_post**](CONTENT_API.md#content_create_post) | **Post** /content/create | Add a new content
[**content_deals_get**](CONTENT_API.md#content_deals_get) | **Get** /content/deals | Content with deals
[**content_ensure_replication_datacid_get**](CONTENT_API.md#content_ensure_replication_datacid_get) | **Get** /content/ensure-replication/{datacid} | Ensure Replication
[**content_failures_content_get**](CONTENT_API.md#content_failures_content_get) | **Get** /content/failures/{content} | List all failures for a content
[**content_importdeal_post**](CONTENT_API.md#content_importdeal_post) | **Post** /content/importdeal | Import a deal
[**content_list_get**](CONTENT_API.md#content_list_get) | **Get** /content/list | List all pinned content
[**content_read_cont_get**](CONTENT_API.md#content_read_cont_get) | **Get** /content/read/{cont} | Read content
[**content_staging_zones_get**](CONTENT_API.md#content_staging_zones_get) | **Get** /content/staging-zones | Get staging zone for user
[**content_stats_get**](CONTENT_API.md#content_stats_get) | **Get** /content/stats | Get content statistics
[**content_status_id_get**](CONTENT_API.md#content_status_id_get) | **Get** /content/status/{id} | Content Status


# **content_add_car_post**
> content_add_car_post (body: STRING_32 ; filename:  detachable STRING_32 ; commp:  detachable STRING_32 ; size:  detachable STRING_32 )
	

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **STRING_32**| Car | 
 **filename** | **STRING_32**| Filename | [optional] 
 **commp** | **STRING_32**| Commp | [optional] 
 **size** | **STRING_32**| Size | [optional] 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_add_ipfs_post**
> content_add_ipfs_post (body: UTIL_CONTENT_ADD_IPFS_BODY )
	

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UTIL_CONTENT_ADD_IPFS_BODY**](UTIL_CONTENT_ADD_IPFS_BODY.md)| IPFS Body | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_add_post**
> content_add_post (file: FILE ; coluuid: STRING_32 ; dir: STRING_32 ): detachable UTIL_CONTENT_ADD_RESPONSE
	

Add new content

This endpoint is used to upload new content.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **FILE**| File to upload | 
 **coluuid** | **STRING_32**| Collection UUID | 
 **dir** | **STRING_32**| Directory | 

### Return type

[**UTIL_CONTENT_ADD_RESPONSE**](util.ContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_aggregated_content_get**
> content_aggregated_content_get (content: STRING_32 ): detachable STRING_32
	

Get aggregated content stats

This endpoint returns aggregated content stats


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **STRING_32**| Content ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_all_deals_get**
> content_all_deals_get (begin: STRING_32 ; duration: STRING_32 ; var_all: STRING_32 )
	

Get all deals for a user

This endpoint is used to get all deals for a user


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **STRING_32**| Begin | 
 **duration** | **STRING_32**| Duration | 
 **var_all** | **STRING_32**| All | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_bw_usage_content_get**
> content_bw_usage_content_get (content: STRING_32 )
	

Get content bandwidth

This endpoint returns content bandwidth


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **STRING_32**| Content ID | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_create_post**
> content_create_post (body: STRING_32 )
	

Add a new content

This endpoint adds a new content


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **STRING_32**| Content | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_deals_get**
> content_deals_get (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 )
	

Content with deals

This endpoint lists all content with deals


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Limit | [optional] 
 **offset** | **INTEGER_32**| Offset | [optional] 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_ensure_replication_datacid_get**
> content_ensure_replication_datacid_get (datacid: STRING_32 )
	

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **STRING_32**| Data CID | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_failures_content_get**
> content_failures_content_get (content: STRING_32 ): detachable STRING_32
	

List all failures for a content

This endpoint returns all failures for a content


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **STRING_32**| Content ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_importdeal_post**
> content_importdeal_post (body: MAIN_IMPORT_DEAL_BODY )
	

Import a deal

This endpoint imports a deal into the shuttle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MAIN_IMPORT_DEAL_BODY**](MAIN_IMPORT_DEAL_BODY.md)| Import a deal | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_list_get**
> content_list_get : detachable LIST [STRING_32]
	

List all pinned content

This endpoint lists all content


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [STRING_32]**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_read_cont_get**
> content_read_cont_get (cont: STRING_32 )
	

Read content

This endpoint reads content from the blockstore


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cont** | **STRING_32**| CID | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_staging_zones_get**
> content_staging_zones_get 
	

Get staging zone for user

This endpoint is used to get staging zone for user.


### Parameters
This endpoint does not need any parameter.

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_stats_get**
> content_stats_get (limit: STRING_32 )
	

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **STRING_32**| limit | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **content_status_id_get**
> content_status_id_get (id: INTEGER_32 )
	

Content Status

This endpoint returns the status of a content


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **INTEGER_32**| Content ID | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

