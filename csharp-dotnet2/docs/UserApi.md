# IO.Swagger.Api.UserApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserApiKeysGet**](UserApi.md#userapikeysget) | **GET** /user/api-keys | Get API keys for a user
[**UserApiKeysKeyDelete**](UserApi.md#userapikeyskeydelete) | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
[**UserApiKeysPost**](UserApi.md#userapikeyspost) | **POST** /user/api-keys | Create API keys for a user
[**UserExportGet**](UserApi.md#userexportget) | **GET** /user/export | Export user data
[**UserStatsGet**](UserApi.md#userstatsget) | **GET** /user/stats | Create API keys for a user


<a name="userapikeysget"></a>
# **UserApiKeysGet**
> List<MainGetApiKeysResp> UserApiKeysGet ()

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserApiKeysGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Get API keys for a user
                List&lt;MainGetApiKeysResp&gt; result = apiInstance.UserApiKeysGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserApiKeysGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<MainGetApiKeysResp>**](MainGetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userapikeyskeydelete"></a>
# **UserApiKeysKeyDelete**
> void UserApiKeysKeyDelete (string key)

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserApiKeysKeyDeleteExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new UserApi();
            var key = key_example;  // string | Key

            try
            {
                // Revoke a User API Key.
                apiInstance.UserApiKeysKeyDelete(key);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserApiKeysKeyDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **string**| Key | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userapikeyspost"></a>
# **UserApiKeysPost**
> MainGetApiKeysResp UserApiKeysPost ()

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserApiKeysPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Create API keys for a user
                MainGetApiKeysResp result = apiInstance.UserApiKeysPost();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserApiKeysPost: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MainGetApiKeysResp**](MainGetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userexportget"></a>
# **UserExportGet**
> string UserExportGet ()

Export user data

This endpoint is used to get API keys for a user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserExportGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Export user data
                string result = apiInstance.UserExportGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserExportGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="userstatsget"></a>
# **UserStatsGet**
> MainUserStatsResponse UserStatsGet ()

Create API keys for a user

This endpoint is used to create API keys for a user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserStatsGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Create API keys for a user
                MainUserStatsResponse result = apiInstance.UserStatsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserStatsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MainUserStatsResponse**](MainUserStatsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

