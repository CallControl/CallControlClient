# CallControlApi.EnterpriseApiApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseApiGetBlockList**](EnterpriseApiApi.md#enterpriseApiGetBlockList) | **GET** /api/2015-11-01/Enterprise/GetBlockList | Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
[**enterpriseApiGetUser**](EnterpriseApiApi.md#enterpriseApiGetUser) | **GET** /api/2015-11-01/Enterprise/GetUser/{phoneNumber} | Enterprise  GET: GetUser\r\n            Returns the current information from the user
[**enterpriseApiShouldBlock**](EnterpriseApiApi.md#enterpriseApiShouldBlock) | **GET** /api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber} | Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
[**enterpriseApiUpsertUser**](EnterpriseApiApi.md#enterpriseApiUpsertUser) | **POST** /api/2015-11-01/Enterprise/UpsertUser | 


<a name="enterpriseApiGetBlockList"></a>
# **enterpriseApiGetBlockList**
> [&#39;String&#39;] enterpriseApiGetBlockList(opts)

Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking

All \r\n            Try with api_key &#39;demo&#39; for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234

### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.EnterpriseApiApi()

var opts = { 
  'cached': true // {Boolean} 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.enterpriseApiGetBlockList(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cached** | **Boolean**|  | [optional] 

### Return type

**[&#39;String&#39;]**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="enterpriseApiGetUser"></a>
# **enterpriseApiGetUser**
> CallControlUser enterpriseApiGetUser(phoneNumber)

Enterprise  GET: GetUser\r\n            Returns the current information from the user



### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.EnterpriseApiApi()

var phoneNumber = "phoneNumber_example"; // {String} 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.enterpriseApiGetUser(phoneNumber, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**|  | 

### Return type

[**CallControlUser**](CallControlUser.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="enterpriseApiShouldBlock"></a>
# **enterpriseApiShouldBlock**
> &#39;String&#39; enterpriseApiShouldBlock(phoneNumber, userPhoneNumber)

Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.

This returns information required to perform basic call blocking behaviors\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.EnterpriseApiApi()

var phoneNumber = "phoneNumber_example"; // {String} phone number to search

var userPhoneNumber = "userPhoneNumber_example"; // {String} (OPTOPNAL) phone number of user to look up block rules


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.enterpriseApiShouldBlock(phoneNumber, userPhoneNumber, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| phone number to search | 
 **userPhoneNumber** | **String**| (OPTOPNAL) phone number of user to look up block rules | 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="enterpriseApiUpsertUser"></a>
# **enterpriseApiUpsertUser**
> ModelObject enterpriseApiUpsertUser(user)



### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.EnterpriseApiApi()

var user = new CallControlApi.CallControlUser(); // {CallControlUser} 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.enterpriseApiUpsertUser(user, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**CallControlUser**](CallControlUser.md)|  | 

### Return type

[**ModelObject**](ModelObject.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

