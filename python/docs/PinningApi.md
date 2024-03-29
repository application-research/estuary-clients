# estuary_client.PinningApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinning_pins_get**](PinningApi.md#pinning_pins_get) | **GET** /pinning/pins | List all pin status objects
[**pinning_pins_pinid_delete**](PinningApi.md#pinning_pins_pinid_delete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinning_pins_pinid_get**](PinningApi.md#pinning_pins_pinid_get) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinning_pins_pinid_post**](PinningApi.md#pinning_pins_pinid_post) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinning_pins_post**](PinningApi.md#pinning_pins_post) | **POST** /pinning/pins | Add and pin object

# **pinning_pins_get**
> PinnerIpfsListPinStatusResponse pinning_pins_get()

List all pin status objects

This endpoint lists all pin status objects

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
api_instance = estuary_client.PinningApi(estuary_client.ApiClient(configuration))

try:
    # List all pin status objects
    api_response = api_instance.pinning_pins_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PinningApi->pinning_pins_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PinnerIpfsListPinStatusResponse**](PinnerIpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_delete**
> pinning_pins_pinid_delete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

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
api_instance = estuary_client.PinningApi(estuary_client.ApiClient(configuration))
pinid = 'pinid_example' # str | Pin ID

try:
    # Delete a pinned object
    api_instance.pinning_pins_pinid_delete(pinid)
except ApiException as e:
    print("Exception when calling PinningApi->pinning_pins_pinid_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **str**| Pin ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_get**
> PinnerIpfsPinStatusResponse pinning_pins_pinid_get(pinid)

Get a pin status object

This endpoint returns a pin status object.

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
api_instance = estuary_client.PinningApi(estuary_client.ApiClient(configuration))
pinid = 'pinid_example' # str | cid

try:
    # Get a pin status object
    api_response = api_instance.pinning_pins_pinid_get(pinid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PinningApi->pinning_pins_pinid_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **str**| cid | 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_post**
> PinnerIpfsPinStatusResponse pinning_pins_pinid_post(body, pinid)

Replace a pinned object

This endpoint replaces a pinned object.

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
api_instance = estuary_client.PinningApi(estuary_client.ApiClient(configuration))
body = estuary_client.PinnerIpfsPin() # PinnerIpfsPin | New pin
pinid = 'pinid_example' # str | Pin ID to be replaced

try:
    # Replace a pinned object
    api_response = api_instance.pinning_pins_pinid_post(body, pinid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PinningApi->pinning_pins_pinid_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| New pin | 
 **pinid** | **str**| Pin ID to be replaced | 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_post**
> PinnerIpfsPinStatusResponse pinning_pins_post(body, ignore_dupes=ignore_dupes, overwrite=overwrite)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

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
api_instance = estuary_client.PinningApi(estuary_client.ApiClient(configuration))
body = estuary_client.PinnerIpfsPin() # PinnerIpfsPin | Pin Body {cid:cid, name:name}
ignore_dupes = 'ignore_dupes_example' # str | Ignore Dupes (optional)
overwrite = 'overwrite_example' # str | Overwrite conflicting files in collections (optional)

try:
    # Add and pin object
    api_response = api_instance.pinning_pins_post(body, ignore_dupes=ignore_dupes, overwrite=overwrite)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PinningApi->pinning_pins_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| Pin Body {cid:cid, name:name} | 
 **ignore_dupes** | **str**| Ignore Dupes | [optional] 
 **overwrite** | **str**| Overwrite conflicting files in collections | [optional] 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

