# Swagger\Client\SpApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storageProvidersClaimPost**](SpApi.md#storageprovidersclaimpost) | **POST** /storage-providers/claim | Claim Storage Provider
[**storageProvidersClaimSpGet**](SpApi.md#storageprovidersclaimspget) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**storageProvidersDealsSpGet**](SpApi.md#storageprovidersdealsspget) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
[**storageProvidersFailuresSpGet**](SpApi.md#storageprovidersfailuresspget) | **GET** /storage-providers/failures/{sp} | Get all storage providers
[**storageProvidersGet**](SpApi.md#storageprovidersget) | **GET** /storage-providers | Get all storage providers
[**storageProvidersSetInfoSpPut**](SpApi.md#storageproviderssetinfospput) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**storageProvidersStatsSpGet**](SpApi.md#storageprovidersstatsspget) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
[**storageProvidersSuspendSpPost**](SpApi.md#storageproviderssuspendsppost) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**storageProvidersUnsuspendSpPut**](SpApi.md#storageprovidersunsuspendspput) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

# **storageProvidersClaimPost**
> \Swagger\Client\Model\GithubComApplicationResearchEstuaryApiV2ClaimResponse storageProvidersClaimPost($body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\MinerClaimMinerBody(); // \Swagger\Client\Model\MinerClaimMinerBody | Claim Storage Provider Body

try {
    $result = $apiInstance->storageProvidersClaimPost($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersClaimPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\MinerClaimMinerBody**](../Model/MinerClaimMinerBody.md)| Claim Storage Provider Body |

### Return type

[**\Swagger\Client\Model\GithubComApplicationResearchEstuaryApiV2ClaimResponse**](../Model/GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersClaimSpGet**
> \Swagger\Client\Model\GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storageProvidersClaimSpGet($sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sp = "sp_example"; // string | Storage Provider claim message

try {
    $result = $apiInstance->storageProvidersClaimSpGet($sp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersClaimSpGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Storage Provider claim message |

### Return type

[**\Swagger\Client\Model\GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](../Model/GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersDealsSpGet**
> string storageProvidersDealsSpGet($sp, $ignore_failed)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sp = "sp_example"; // string | Filter by storage provider
$ignore_failed = "ignore_failed_example"; // string | Ignore Failed

try {
    $result = $apiInstance->storageProvidersDealsSpGet($sp, $ignore_failed);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersDealsSpGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Filter by storage provider |
 **ignore_failed** | **string**| Ignore Failed | [optional]

### Return type

**string**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersFailuresSpGet**
> string storageProvidersFailuresSpGet($sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sp = "sp_example"; // string | Filter by storage provider

try {
    $result = $apiInstance->storageProvidersFailuresSpGet($sp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersFailuresSpGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Filter by storage provider |

### Return type

**string**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersGet**
> \Swagger\Client\Model\ApiStorageProviderResp[] storageProvidersGet()

Get all storage providers

This endpoint returns all storage providers

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->storageProvidersGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ApiStorageProviderResp[]**](../Model/ApiStorageProviderResp.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersSetInfoSpPut**
> storageProvidersSetInfoSpPut($body, $sp)

Set Storage Provider Info

This endpoint lets a user set storage provider info.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\MinerMinerSetInfoParams(); // \Swagger\Client\Model\MinerMinerSetInfoParams | Storage Provider set info params
$sp = "sp_example"; // string | Storage Provider to set info for

try {
    $apiInstance->storageProvidersSetInfoSpPut($body, $sp);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersSetInfoSpPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\MinerMinerSetInfoParams**](../Model/MinerMinerSetInfoParams.md)| Storage Provider set info params |
 **sp** | **string**| Storage Provider to set info for |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersStatsSpGet**
> string storageProvidersStatsSpGet($sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sp = "sp_example"; // string | Filter by storage provider

try {
    $result = $apiInstance->storageProvidersStatsSpGet($sp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersStatsSpGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Filter by storage provider |

### Return type

**string**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersSuspendSpPost**
> map[string,string] storageProvidersSuspendSpPost($body, $sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$body = new \Swagger\Client\Model\MinerSuspendMinerBody(); // \Swagger\Client\Model\MinerSuspendMinerBody | Suspend Storage Provider Body
$sp = "sp_example"; // string | Storage Provider to suspend

try {
    $result = $apiInstance->storageProvidersSuspendSpPost($body, $sp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersSuspendSpPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\MinerSuspendMinerBody**](../Model/MinerSuspendMinerBody.md)| Suspend Storage Provider Body |
 **sp** | **string**| Storage Provider to suspend |

### Return type

**map[string,string]**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **storageProvidersUnsuspendSpPut**
> storageProvidersUnsuspendSpPut($sp)

Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
// Configure API key authorization: bearerAuth
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');

$apiInstance = new Swagger\Client\Api\SpApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sp = "sp_example"; // string | Storage Provider to unsuspend

try {
    $apiInstance->storageProvidersUnsuspendSpPut($sp);
} catch (Exception $e) {
    echo 'Exception when calling SpApi->storageProvidersUnsuspendSpPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Storage Provider to unsuspend |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

