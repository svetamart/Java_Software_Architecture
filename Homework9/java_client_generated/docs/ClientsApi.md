# ClientsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllClients**](ClientsApi.md#getAllClients) | **GET** /clients | Метод для получения списка всех клиентов

<a name="getAllClients"></a>
# **getAllClients**
> List&lt;Client&gt; getAllClients()

Метод для получения списка всех клиентов

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
try {
    List<Client> result = apiInstance.getAllClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getAllClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

