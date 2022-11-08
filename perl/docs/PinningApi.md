# WWW::SwaggerClient::PinningApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::PinningApi;
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinning_pins_get**](PinningApi.md#pinning_pins_get) | **GET** /pinning/pins | List all pin status objects
[**pinning_pins_pinid_delete**](PinningApi.md#pinning_pins_pinid_delete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinning_pins_pinid_get**](PinningApi.md#pinning_pins_pinid_get) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinning_pins_pinid_post**](PinningApi.md#pinning_pins_pinid_post) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinning_pins_post**](PinningApi.md#pinning_pins_post) | **POST** /pinning/pins | Add and pin object


# **pinning_pins_get**
> TypesIpfsListPinStatusResponse pinning_pins_get()

List all pin status objects

This endpoint lists all pin status objects

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::PinningApi;
my $api_instance = WWW::SwaggerClient::PinningApi->new(

    # Configure API key authorization: bearerAuth
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);


eval { 
    my $result = $api_instance->pinning_pins_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinningApi->pinning_pins_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TypesIpfsListPinStatusResponse**](TypesIpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_delete**
> pinning_pins_pinid_delete(pinid => $pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::PinningApi;
my $api_instance = WWW::SwaggerClient::PinningApi->new(

    # Configure API key authorization: bearerAuth
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $pinid = 'pinid_example'; # string | Pin ID

eval { 
    $api_instance->pinning_pins_pinid_delete(pinid => $pinid);
};
if ($@) {
    warn "Exception when calling PinningApi->pinning_pins_pinid_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string**| Pin ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_get**
> TypesIpfsPinStatusResponse pinning_pins_pinid_get(pinid => $pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::PinningApi;
my $api_instance = WWW::SwaggerClient::PinningApi->new(

    # Configure API key authorization: bearerAuth
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $pinid = 'pinid_example'; # string | cid

eval { 
    my $result = $api_instance->pinning_pins_pinid_get(pinid => $pinid);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinningApi->pinning_pins_pinid_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string**| cid | 

### Return type

[**TypesIpfsPinStatusResponse**](TypesIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_post**
> TypesIpfsPinStatusResponse pinning_pins_pinid_post(pinid => $pinid, cid => $cid, name => $name, origins => $origins, meta => $meta)

Replace a pinned object

This endpoint replaces a pinned object.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::PinningApi;
my $api_instance = WWW::SwaggerClient::PinningApi->new(

    # Configure API key authorization: bearerAuth
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $pinid = 'pinid_example'; # string | Pin ID
my $cid = WWW::SwaggerClient::Object::string->new(); # string | CID of new pin
my $name = WWW::SwaggerClient::Object::string->new(); # string | Name (filename) of new pin
my $origins = WWW::SwaggerClient::Object::string->new(); # string | Origins of new pin
my $meta = WWW::SwaggerClient::Object::string->new(); # string | Meta information of new pin

eval { 
    my $result = $api_instance->pinning_pins_pinid_post(pinid => $pinid, cid => $cid, name => $name, origins => $origins, meta => $meta);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinningApi->pinning_pins_pinid_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string**| Pin ID | 
 **cid** | **string**| CID of new pin | 
 **name** | **string**| Name (filename) of new pin | [optional] 
 **origins** | **string**| Origins of new pin | [optional] 
 **meta** | **string**| Meta information of new pin | [optional] 

### Return type

[**TypesIpfsPinStatusResponse**](TypesIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_post**
> TypesIpfsPinStatusResponse pinning_pins_post(pin => $pin)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::PinningApi;
my $api_instance = WWW::SwaggerClient::PinningApi->new(

    # Configure API key authorization: bearerAuth
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $pin = WWW::SwaggerClient::Object::TypesIpfsPin->new(); # TypesIpfsPin | Pin Body {cid:cid, name:name}

eval { 
    my $result = $api_instance->pinning_pins_post(pin => $pin);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PinningApi->pinning_pins_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**TypesIpfsPin**](TypesIpfsPin.md)| Pin Body {cid:cid, name:name} | 

### Return type

[**TypesIpfsPinStatusResponse**](TypesIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

