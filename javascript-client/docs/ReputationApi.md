# CallControlApi.ReputationApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reputationReport**](ReputationApi.md#reputationReport) | **POST** /api/2015-11-01/Report | Report: report spam calls received to better tune our algorithms based upon spam calls you receive
[**reputationReputation**](ReputationApi.md#reputationReputation) | **GET** /api/2015-11-01/Reputation/{phoneNumber} | Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.


<a name="reputationReport"></a>
# **reputationReport**
> reputationReport(callReport)

Report: report spam calls received to better tune our algorithms based upon spam calls you receive

This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.ReputationApi()

var callReport = new CallControlApi.CallReport(); // {CallReport} [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
api.reputationReport(callReport, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callReport** | [**CallReport**](CallReport.md)| [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional), | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="reputationReputation"></a>
# **reputationReputation**
> Reputation reputationReputation(phoneNumber)

Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.

This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.ReputationApi()

var phoneNumber = "phoneNumber_example"; // {String} phone number to search


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.reputationReputation(phoneNumber, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| phone number to search | 

### Return type

[**Reputation**](Reputation.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

