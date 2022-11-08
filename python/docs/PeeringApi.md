# estuary-client.PeeringApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_peering_peers_delete**](PeeringApi.md#admin_peering_peers_delete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**admin_peering_peers_get**](PeeringApi.md#admin_peering_peers_get) | **GET** /admin/peering/peers | List all Peering peers
[**admin_peering_peers_post**](PeeringApi.md#admin_peering_peers_post) | **POST** /admin/peering/peers | Add peers on Peering Service
[**admin_peering_start_post**](PeeringApi.md#admin_peering_start_post) | **POST** /admin/peering/start | Start Peering
[**admin_peering_status_get**](PeeringApi.md#admin_peering_status_get) | **GET** /admin/peering/status | Check Peering Status
[**admin_peering_stop_post**](PeeringApi.md#admin_peering_stop_post) | **POST** /admin/peering/stop | Stop Peering


# **admin_peering_peers_delete**
> str admin_peering_peers_delete(peer_ids)

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```python
from __future__ import print_function
import time
import estuary-client
from estuary-client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary-client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary-client.PeeringApi(estuary-client.ApiClient(configuration))
peer_ids = [estuary-client.list[bool]()] # list[bool] | Peer ids

try:
    # Remove peers on Peering Service
    api_response = api_instance.admin_peering_peers_delete(peer_ids)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PeeringApi->admin_peering_peers_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peer_ids** | **list[bool]**| Peer ids | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_peering_peers_get**
> str admin_peering_peers_get()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```python
from __future__ import print_function
import time
import estuary-client
from estuary-client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary-client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary-client.PeeringApi(estuary-client.ApiClient(configuration))

try:
    # List all Peering peers
    api_response = api_instance.admin_peering_peers_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PeeringApi->admin_peering_peers_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_peering_peers_post**
> str admin_peering_peers_post()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```python
from __future__ import print_function
import time
import estuary-client
from estuary-client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary-client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary-client.PeeringApi(estuary-client.ApiClient(configuration))

try:
    # Add peers on Peering Service
    api_response = api_instance.admin_peering_peers_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PeeringApi->admin_peering_peers_post: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_peering_start_post**
> str admin_peering_start_post()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```python
from __future__ import print_function
import time
import estuary-client
from estuary-client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary-client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary-client.PeeringApi(estuary-client.ApiClient(configuration))

try:
    # Start Peering
    api_response = api_instance.admin_peering_start_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PeeringApi->admin_peering_start_post: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_peering_status_get**
> str admin_peering_status_get()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```python
from __future__ import print_function
import time
import estuary-client
from estuary-client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary-client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary-client.PeeringApi(estuary-client.ApiClient(configuration))

try:
    # Check Peering Status
    api_response = api_instance.admin_peering_status_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PeeringApi->admin_peering_status_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_peering_stop_post**
> str admin_peering_stop_post()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```python
from __future__ import print_function
import time
import estuary-client
from estuary-client.rest import ApiException
from pprint import pprint

# Configure API key authorization: bearerAuth
configuration = estuary-client.Configuration()
configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Authorization'] = 'Bearer'

# create an instance of the API class
api_instance = estuary-client.PeeringApi(estuary-client.ApiClient(configuration))

try:
    # Stop Peering
    api_response = api_instance.admin_peering_stop_post()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PeeringApi->admin_peering_stop_post: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

