# CallControlApi.ComplaintsApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complaintsComplaints**](ComplaintsApi.md#complaintsComplaints) | **GET** /api/2015-11-01/Complaints/{phoneNumber} | Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.


<a name="complaintsComplaints"></a>
# **complaintsComplaints**
> Complaints complaintsComplaints(phoneNumber)

Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.

This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```javascript
var CallControlApi = require('call-control-api');

var apiInstance = new CallControlApi.ComplaintsApi()

var phoneNumber = "phoneNumber_example"; // {String} phone number to search


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.complaintsComplaints(phoneNumber, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| phone number to search | 

### Return type

[**Complaints**](Complaints.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

