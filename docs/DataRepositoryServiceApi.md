# DataRepositoryServiceApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteObjectGa4ghDrsV1ObjectsObjectIdDelete**](DataRepositoryServiceApi.md#deleteObjectGa4ghDrsV1ObjectsObjectIdDelete) | **DELETE** /ga4gh/drs/v1/objects/{object_id} | Delete a DrsObject
[**getObjectAliasGa4ghDrsV1ObjectsGet**](DataRepositoryServiceApi.md#getObjectAliasGa4ghDrsV1ObjectsGet) | **GET** /ga4gh/drs/v1/objects | Query DrsObjects on alias
[**getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet**](DataRepositoryServiceApi.md#getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet) | **GET** /ga4gh/drs/v1/objects/{object_id}/access/{access_id} | Get a URL for fetching bytes
[**getObjectGa4ghDrsV1ObjectsObjectIdGet**](DataRepositoryServiceApi.md#getObjectGa4ghDrsV1ObjectsObjectIdGet) | **GET** /ga4gh/drs/v1/objects/{object_id} | Retrieve a DrsObject
[**postObjectGa4ghDrsV1ObjectsPost**](DataRepositoryServiceApi.md#postObjectGa4ghDrsV1ObjectsPost) | **POST** /ga4gh/drs/v1/objects | Create a new DrsObject
[**putObjectGa4ghDrsV1ObjectsObjectIdPut**](DataRepositoryServiceApi.md#putObjectGa4ghDrsV1ObjectsObjectIdPut) | **PUT** /ga4gh/drs/v1/objects/{object_id} | Update a DrsObject

<a name="deleteObjectGa4ghDrsV1ObjectsObjectIdDelete"></a>
# **deleteObjectGa4ghDrsV1ObjectsObjectIdDelete**
> BasicResponse deleteObjectGa4ghDrsV1ObjectsObjectIdDelete(objectId)

Delete a DrsObject

Delete a &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60; index entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRepositoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: OAuth2PasswordBearer
ApiKeyAuth OAuth2PasswordBearer = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//OAuth2PasswordBearer.setApiKeyPrefix("Token");

DataRepositoryServiceApi apiInstance = new DataRepositoryServiceApi();
String objectId = "objectId_example"; // String | 
try {
    BasicResponse result = apiInstance.deleteObjectGa4ghDrsV1ObjectsObjectIdDelete(objectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRepositoryServiceApi#deleteObjectGa4ghDrsV1ObjectsObjectIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**|  |

### Return type

[**BasicResponse**](BasicResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectAliasGa4ghDrsV1ObjectsGet"></a>
# **getObjectAliasGa4ghDrsV1ObjectsGet**
> List&lt;DrsObject&gt; getObjectAliasGa4ghDrsV1ObjectsGet(alias)

Query DrsObjects on alias

Returns all objects that correspond to the list of aliases passed through         the request. The query is regex compatible.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRepositoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: OAuth2PasswordBearer
ApiKeyAuth OAuth2PasswordBearer = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//OAuth2PasswordBearer.setApiKeyPrefix("Token");

DataRepositoryServiceApi apiInstance = new DataRepositoryServiceApi();
List<String> alias = Arrays.asList("alias_example"); // List<String> | The alias(ses) on which to query DrsObjects (regex compatible)
try {
    List<DrsObject> result = apiInstance.getObjectAliasGa4ghDrsV1ObjectsGet(alias);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRepositoryServiceApi#getObjectAliasGa4ghDrsV1ObjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | [**List&lt;String&gt;**](String.md)| The alias(ses) on which to query DrsObjects (regex compatible) |

### Return type

[**List&lt;DrsObject&gt;**](DrsObject.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet"></a>
# **getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet**
> AccessURL getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet(objectId, accessId)

Get a URL for fetching bytes

Returns a URL that can be used to fetch the bytes of a &#x60;DrsObject&#x60;.                     This method only needs to be called when using an &#x60;AccessMethod&#x60; that contains an &#x60;access_id&#x60;                     (e.g., for servers that use signed URLs for fetching object bytes).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRepositoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: OAuth2PasswordBearer
ApiKeyAuth OAuth2PasswordBearer = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//OAuth2PasswordBearer.setApiKeyPrefix("Token");

DataRepositoryServiceApi apiInstance = new DataRepositoryServiceApi();
String objectId = "objectId_example"; // String | ```DrsObject``` identifier
String accessId = "accessId_example"; // String | An `access_id` from the `access_methods` list of a `DrsObject`
try {
    AccessURL result = apiInstance.getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet(objectId, accessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRepositoryServiceApi#getObjectGa4ghDrsV1ObjectsObjectIdAccessAccessIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60; identifier |
 **accessId** | **String**| An &#x60;access_id&#x60; from the &#x60;access_methods&#x60; list of a &#x60;DrsObject&#x60; |

### Return type

[**AccessURL**](AccessURL.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectGa4ghDrsV1ObjectsObjectIdGet"></a>
# **getObjectGa4ghDrsV1ObjectsObjectIdGet**
> DrsObject getObjectGa4ghDrsV1ObjectsObjectIdGet(objectId, expand)

Retrieve a DrsObject

Returns object metadata, and a list of access methods that can be used to fetch object bytes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRepositoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: OAuth2PasswordBearer
ApiKeyAuth OAuth2PasswordBearer = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//OAuth2PasswordBearer.setApiKeyPrefix("Token");

DataRepositoryServiceApi apiInstance = new DataRepositoryServiceApi();
String objectId = "objectId_example"; // String | ```DrsObject``` identifier
Boolean expand = true; // Boolean | If false and the object_id refers to a bundle, then the ContentsObject array contains only         those objects directly contained in the bundle. That is, if the bundle contains other bundles,         those other bundles are not recursively included in the result. If true and the object_id refers to a bundle,         then the entire set of objects in the bundle is expanded. That is, if the bundle contains aother bundles,         then those other bundles are recursively expanded and included in the result.         Recursion continues through the entire sub-tree of the bundle.         If the object_id refers to a blob, then the query parameter is ignored.
try {
    DrsObject result = apiInstance.getObjectGa4ghDrsV1ObjectsObjectIdGet(objectId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRepositoryServiceApi#getObjectGa4ghDrsV1ObjectsObjectIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60; identifier |
 **expand** | **Boolean**| If false and the object_id refers to a bundle, then the ContentsObject array contains only         those objects directly contained in the bundle. That is, if the bundle contains other bundles,         those other bundles are not recursively included in the result. If true and the object_id refers to a bundle,         then the entire set of objects in the bundle is expanded. That is, if the bundle contains aother bundles,         then those other bundles are recursively expanded and included in the result.         Recursion continues through the entire sub-tree of the bundle.         If the object_id refers to a blob, then the query parameter is ignored. |

### Return type

[**DrsObject**](DrsObject.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postObjectGa4ghDrsV1ObjectsPost"></a>
# **postObjectGa4ghDrsV1ObjectsPost**
> BasicResponse postObjectGa4ghDrsV1ObjectsPost(body)

Create a new DrsObject

POST a requested ID to create an object that corresponds to this ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRepositoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: OAuth2PasswordBearer
ApiKeyAuth OAuth2PasswordBearer = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//OAuth2PasswordBearer.setApiKeyPrefix("Token");

DataRepositoryServiceApi apiInstance = new DataRepositoryServiceApi();
DrsObject body = new DrsObject(); // DrsObject | 
try {
    BasicResponse result = apiInstance.postObjectGa4ghDrsV1ObjectsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRepositoryServiceApi#postObjectGa4ghDrsV1ObjectsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DrsObject**](DrsObject.md)|  |

### Return type

[**BasicResponse**](BasicResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putObjectGa4ghDrsV1ObjectsObjectIdPut"></a>
# **putObjectGa4ghDrsV1ObjectsObjectIdPut**
> BasicResponse putObjectGa4ghDrsV1ObjectsObjectIdPut(body, objectId)

Update a DrsObject

Update the &#x60;&#x60;&#x60;DrsObject&#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRepositoryServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: OAuth2PasswordBearer
ApiKeyAuth OAuth2PasswordBearer = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
OAuth2PasswordBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//OAuth2PasswordBearer.setApiKeyPrefix("Token");

DataRepositoryServiceApi apiInstance = new DataRepositoryServiceApi();
DrsObject body = new DrsObject(); // DrsObject | 
String objectId = "objectId_example"; // String | 
try {
    BasicResponse result = apiInstance.putObjectGa4ghDrsV1ObjectsObjectIdPut(body, objectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRepositoryServiceApi#putObjectGa4ghDrsV1ObjectsObjectIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DrsObject**](DrsObject.md)|  |
 **objectId** | **String**|  |

### Return type

[**BasicResponse**](BasicResponse.md)

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

