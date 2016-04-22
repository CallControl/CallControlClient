# SwaggerClient::ReputationApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reputation_report**](ReputationApi.md#reputation_report) | **POST** /api/2015-11-01/Report | Report: report spam calls received to better tune our algorithms based upon spam calls you receive
[**reputation_reputation**](ReputationApi.md#reputation_reputation) | **GET** /api/2015-11-01/Reputation/{phoneNumber} | Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.


# **reputation_report**
> reputation_report(call_report)

Report: report spam calls received to better tune our algorithms based upon spam calls you receive

This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ReputationApi.new

call_report = SwaggerClient::CallReport.new # CallReport | [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),


begin
  #Report: report spam calls received to better tune our algorithms based upon spam calls you receive
  api_instance.reputation_report(call_report)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ReputationApi->reputation_report: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_report** | [**CallReport**](CallReport.md)| [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional), | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml



# **reputation_reputation**
> Reputation reputation_reputation(phone_number)

Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.

This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ReputationApi.new

phone_number = "phone_number_example" # String | phone number to search


begin
  #Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.
  result = api_instance.reputation_reputation(phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ReputationApi->reputation_reputation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| phone number to search | 

### Return type

[**Reputation**](Reputation.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml



