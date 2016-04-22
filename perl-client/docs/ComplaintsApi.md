# WWW::SwaggerClient::ComplaintsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ComplaintsApi;
```

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complaints_complaints**](ComplaintsApi.md#complaints_complaints) | **GET** /api/2015-11-01/Complaints/{phoneNumber} | Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.


# **complaints_complaints**
> Complaints complaints_complaints(phone_number => $phone_number)

Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.

This is the main funciton to get data out of the call control reporting system<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::ComplaintsApi->new();
my $phone_number = 'phone_number_example'; # string | phone number to search

eval { 
    my $result = $api_instance->complaints_complaints(phone_number => $phone_number);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ComplaintsApi->complaints_complaints: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| phone number to search | 

### Return type

[**Complaints**](Complaints.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

