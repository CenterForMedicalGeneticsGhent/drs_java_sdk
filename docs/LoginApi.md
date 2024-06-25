# LoginApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginTokenPost**](LoginApi.md#loginTokenPost) | **POST** /token | Login

<a name="loginTokenPost"></a>
# **loginTokenPost**
> Token loginTokenPost(grantType, username, password, scope, clientId, clientSecret)

Login

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LoginApi;


LoginApi apiInstance = new LoginApi();
String grantType = "grantType_example"; // String | 
String username = "username_example"; // String | 
String password = "password_example"; // String | 
String scope = "scope_example"; // String | 
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    Token result = apiInstance.loginTokenPost(grantType, username, password, scope, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  |
 **username** | **String**|  |
 **password** | **String**|  |
 **scope** | **String**|  |
 **clientId** | **String**|  |
 **clientSecret** | **String**|  |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

