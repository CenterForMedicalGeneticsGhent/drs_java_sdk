# HealthApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHealthHealthGet**](HealthApi.md#getHealthHealthGet) | **GET** /health | Check if the API is running correctly

<a name="getHealthHealthGet"></a>
# **getHealthHealthGet**
> Object getHealthHealthGet()

Check if the API is running correctly

Health check for the API

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthApi;


HealthApi apiInstance = new HealthApi();
try {
    Object result = apiInstance.getHealthHealthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthApi#getHealthHealthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

