# WWW::SwaggerClient::ReputationApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ReputationApi;
```

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reputation_report**](ReputationApi.md#reputation_report) | **POST** /api/2015-11-01/Report | Report: report spam calls received to better tune our algorithms based upon spam calls you receive
[**reputation_reputation**](ReputationApi.md#reputation_reputation) | **GET** /api/2015-11-01/Reputation/{phoneNumber} | Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.


# **reputation_report**
> reputation_report(call_report => $call_report)

Report: report spam calls received to better tune our algorithms based upon spam calls you receive

This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::ReputationApi->new();
my $call_report = WWW::SwaggerClient::Object::CallReport->new(); # CallReport | [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),

eval { 
    $api_instance->reputation_report(call_report => $call_report);
};
if ($@) {
    warn "Exception when calling ReputationApi->reputation_report: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_report** | [**CallReport**](CallReport.md)| [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional), | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reputation_reputation**
> Reputation reputation_reputation(phone_number => $phone_number)

Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.

This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::ReputationApi->new();
my $phone_number = 'phone_number_example'; # string | phone number to search

eval { 
    my $result = $api_instance->reputation_reputation(phone_number => $phone_number);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReputationApi->reputation_reputation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| phone number to search | 

### Return type

[**Reputation**](Reputation.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

