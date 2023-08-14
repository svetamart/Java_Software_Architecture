# CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCloudByID**](CloudsApi.md#cancelCloudByID) | **DELETE** /clouds/{cloud_id} | Метод отмены заказа на облако по ID
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Создание заказа в облаке
[**getAllClouds**](CloudsApi.md#getAllClouds) | **GET** /clouds | Метод получения списка ресурсов на облаке
[**getCloudByID**](CloudsApi.md#getCloudByID) | **GET** /clouds/{cloud_id} | Метод получения заказа на облако по ID
[**updateCloudByID**](CloudsApi.md#updateCloudByID) | **PUT** /clouds/{cloud_id} | Метод обновления заказа на облако по ID

<a name="cancelCloudByID"></a>
# **cancelCloudByID**
> cancelCloudByID(cloudId)

Метод отмены заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    apiInstance.cancelCloudByID(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#cancelCloudByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCloud"></a>
# **createCloud**
> Clouds createCloud(body)

Создание заказа в облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
Error body = new Error(); // Error | 
try {
    Clouds result = apiInstance.createCloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  | [optional]

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllClouds"></a>
# **getAllClouds**
> Clouds getAllClouds()

Метод получения списка ресурсов на облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Clouds result = apiInstance.getAllClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getAllClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCloudByID"></a>
# **getCloudByID**
> Clouds getCloudByID(cloudId)

Метод получения заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    Clouds result = apiInstance.getCloudByID(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getCloudByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCloudByID"></a>
# **updateCloudByID**
> Cloud updateCloudByID(cloudId, body)

Метод обновления заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
Cloud body = new Cloud(); // Cloud | 
try {
    Cloud result = apiInstance.updateCloudByID(cloudId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#updateCloudByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |
 **body** | [**Cloud**](Cloud.md)|  | [optional]

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

