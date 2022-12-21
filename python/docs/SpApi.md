# estuary_client.SpApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storage_providers_claim_post**](SpApi.md#storage_providers_claim_post) | **POST** /storage-providers/claim | Claim Storage Provider
[**storage_providers_claim_sp_get**](SpApi.md#storage_providers_claim_sp_get) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**storage_providers_deals_sp_get**](SpApi.md#storage_providers_deals_sp_get) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
[**storage_providers_failures_sp_get**](SpApi.md#storage_providers_failures_sp_get) | **GET** /storage-providers/failures/{sp} | Get all storage providers
[**storage_providers_get**](SpApi.md#storage_providers_get) | **GET** /storage-providers | Get all storage providers
[**storage_providers_set_info_sp_put**](SpApi.md#storage_providers_set_info_sp_put) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**storage_providers_stats_sp_get**](SpApi.md#storage_providers_stats_sp_get) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
[**storage_providers_suspend_sp_post**](SpApi.md#storage_providers_suspend_sp_post) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**storage_providers_unsuspend_sp_put**](SpApi.md#storage_providers_unsuspend_sp_put) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

# **storage_providers_claim_post**
> GithubComApplicationResearchEstuaryApiV2ClaimResponse storage_providers_claim_post(body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
body = estuary_client.MinerClaimMinerBody() # MinerClaimMinerBody | Claim Storage Provider Body

try:
    # Claim Storage Provider
    api_response = api_instance.storage_providers_claim_post(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_claim_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_claim_sp_get**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storage_providers_claim_sp_get(sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
sp = 'sp_example' # str | Storage Provider claim message

try:
    # Get Claim Storage Provider
    api_response = api_instance.storage_providers_claim_sp_get(sp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_claim_sp_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **str**| Storage Provider claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_deals_sp_get**
> str storage_providers_deals_sp_get(sp, ignore_failed=ignore_failed)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
sp = 'sp_example' # str | Filter by storage provider
ignore_failed = 'ignore_failed_example' # str | Ignore Failed (optional)

try:
    # Get all storage providers deals
    api_response = api_instance.storage_providers_deals_sp_get(sp, ignore_failed=ignore_failed)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_deals_sp_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **str**| Filter by storage provider | 
 **ignore_failed** | **str**| Ignore Failed | [optional] 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_failures_sp_get**
> str storage_providers_failures_sp_get(sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
sp = 'sp_example' # str | Filter by storage provider

try:
    # Get all storage providers
    api_response = api_instance.storage_providers_failures_sp_get(sp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_failures_sp_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **str**| Filter by storage provider | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_get**
> list[ApiStorageProviderResp] storage_providers_get()

Get all storage providers

This endpoint returns all storage providers

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))

try:
    # Get all storage providers
    api_response = api_instance.storage_providers_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ApiStorageProviderResp]**](ApiStorageProviderResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_set_info_sp_put**
> storage_providers_set_info_sp_put(body, sp)

Set Storage Provider Info

This endpoint lets a user set storage provider info.

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
body = estuary_client.MinerMinerSetInfoParams() # MinerMinerSetInfoParams | Storage Provider set info params
sp = 'sp_example' # str | Storage Provider to set info for

try:
    # Set Storage Provider Info
    api_instance.storage_providers_set_info_sp_put(body, sp)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_set_info_sp_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params | 
 **sp** | **str**| Storage Provider to set info for | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_stats_sp_get**
> str storage_providers_stats_sp_get(sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
sp = 'sp_example' # str | Filter by storage provider

try:
    # Get storage provider stats
    api_response = api_instance.storage_providers_stats_sp_get(sp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_stats_sp_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **str**| Filter by storage provider | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_suspend_sp_post**
> dict(str, str) storage_providers_suspend_sp_post(body, sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
body = estuary_client.MinerSuspendMinerBody() # MinerSuspendMinerBody | Suspend Storage Provider Body
sp = 'sp_example' # str | Storage Provider to suspend

try:
    # Suspend Storage Provider
    api_response = api_instance.storage_providers_suspend_sp_post(body, sp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_suspend_sp_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body | 
 **sp** | **str**| Storage Provider to suspend | 

### Return type

**dict(str, str)**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storage_providers_unsuspend_sp_put**
> storage_providers_unsuspend_sp_put(sp)

Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

### Example
```python
from __future__ import print_function
import time
import estuary_client
from estuary_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary_client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary_client.SpApi(estuary_client.ApiClient(configuration))
sp = 'sp_example' # str | Storage Provider to unsuspend

try:
    # Unuspend Storage Provider
    api_instance.storage_providers_unsuspend_sp_put(sp)
except ApiException as e:
    print("Exception when calling SpApi->storage_providers_unsuspend_sp_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **str**| Storage Provider to unsuspend | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

