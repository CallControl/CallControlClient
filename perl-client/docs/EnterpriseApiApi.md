# WWW::SwaggerClient::EnterpriseApiApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::EnterpriseApiApi;
```

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterprise_api_get_block_list**](EnterpriseApiApi.md#enterprise_api_get_block_list) | **GET** /api/2015-11-01/Enterprise/GetBlockList | Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
[**enterprise_api_get_user**](EnterpriseApiApi.md#enterprise_api_get_user) | **GET** /api/2015-11-01/Enterprise/GetUser/{phoneNumber} | Enterprise  GET: GetUser\r\n            Returns the current information from the user
[**enterprise_api_should_block**](EnterpriseApiApi.md#enterprise_api_should_block) | **GET** /api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber} | Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
[**enterprise_api_upsert_user**](EnterpriseApiApi.md#enterprise_api_upsert_user) | **POST** /api/2015-11-01/Enterprise/UpsertUser | 


# **enterprise_api_get_block_list**
> ARRAY[string] enterprise_api_get_block_list(cached => $cached)

Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking

All \r\n            Try with api_key 'demo' for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234

### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::EnterpriseApiApi->new();
my $cached = 1; # boolean | 

eval { 
    my $result = $api_instance->enterprise_api_get_block_list(cached => $cached);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnterpriseApiApi->enterprise_api_get_block_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cached** | **boolean**|  | [optional] 

### Return type

**ARRAY[string]**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_api_get_user**
> CallControlUser enterprise_api_get_user(phone_number => $phone_number)

Enterprise  GET: GetUser\r\n            Returns the current information from the user



### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::EnterpriseApiApi->new();
my $phone_number = 'phone_number_example'; # string | 

eval { 
    my $result = $api_instance->enterprise_api_get_user(phone_number => $phone_number);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnterpriseApiApi->enterprise_api_get_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**|  | 

### Return type

[**CallControlUser**](CallControlUser.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_api_should_block**
> string enterprise_api_should_block(phone_number => $phone_number, user_phone_number => $user_phone_number)

Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.

This returns information required to perform basic call blocking behaviors\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::EnterpriseApiApi->new();
my $phone_number = 'phone_number_example'; # string | phone number to search
my $user_phone_number = 'user_phone_number_example'; # string | (OPTOPNAL) phone number of user to look up block rules

eval { 
    my $result = $api_instance->enterprise_api_should_block(phone_number => $phone_number, user_phone_number => $user_phone_number);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnterpriseApiApi->enterprise_api_should_block: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| phone number to search | 
 **user_phone_number** | **string**| (OPTOPNAL) phone number of user to look up block rules | 

### Return type

**string**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_api_upsert_user**
> Object enterprise_api_upsert_user(user => $user)



### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::EnterpriseApiApi->new();
my $user = WWW::SwaggerClient::Object::CallControlUser->new(); # CallControlUser | 

eval { 
    my $result = $api_instance->enterprise_api_upsert_user(user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnterpriseApiApi->enterprise_api_upsert_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**CallControlUser**](CallControlUser.md)|  | 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

