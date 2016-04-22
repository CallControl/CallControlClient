# SwaggerClient::EnterpriseApiApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterprise_api_get_block_list**](EnterpriseApiApi.md#enterprise_api_get_block_list) | **GET** /api/2015-11-01/Enterprise/GetBlockList | Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
[**enterprise_api_get_user**](EnterpriseApiApi.md#enterprise_api_get_user) | **GET** /api/2015-11-01/Enterprise/GetUser/{phoneNumber} | Enterprise  GET: GetUser\r\n            Returns the current information from the user
[**enterprise_api_should_block**](EnterpriseApiApi.md#enterprise_api_should_block) | **GET** /api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber} | Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
[**enterprise_api_upsert_user**](EnterpriseApiApi.md#enterprise_api_upsert_user) | **POST** /api/2015-11-01/Enterprise/UpsertUser | 


# **enterprise_api_get_block_list**
> Array&lt;String&gt; enterprise_api_get_block_list(opts)

Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking

All \r\n            Try with api_key 'demo' for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EnterpriseApiApi.new

opts = { 
  cached: true # BOOLEAN | 
}

begin
  #Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
  result = api_instance.enterprise_api_get_block_list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EnterpriseApiApi->enterprise_api_get_block_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cached** | **BOOLEAN**|  | [optional] 

### Return type

**Array&lt;String&gt;**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml



# **enterprise_api_get_user**
> CallControlUser enterprise_api_get_user(phone_number)

Enterprise  GET: GetUser\r\n            Returns the current information from the user



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EnterpriseApiApi.new

phone_number = "phone_number_example" # String | 


begin
  #Enterprise  GET: GetUser\r\n            Returns the current information from the user
  result = api_instance.enterprise_api_get_user(phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EnterpriseApiApi->enterprise_api_get_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**|  | 

### Return type

[**CallControlUser**](CallControlUser.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml



# **enterprise_api_should_block**
> String enterprise_api_should_block(phone_number, user_phone_number)

Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.

This returns information required to perform basic call blocking behaviors\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EnterpriseApiApi.new

phone_number = "phone_number_example" # String | phone number to search

user_phone_number = "user_phone_number_example" # String | (OPTOPNAL) phone number of user to look up block rules


begin
  #Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
  result = api_instance.enterprise_api_should_block(phone_number, user_phone_number)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EnterpriseApiApi->enterprise_api_should_block: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **String**| phone number to search | 
 **user_phone_number** | **String**| (OPTOPNAL) phone number of user to look up block rules | 

### Return type

**String**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml



# **enterprise_api_upsert_user**
> Object enterprise_api_upsert_user(user)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EnterpriseApiApi.new

user = SwaggerClient::CallControlUser.new # CallControlUser | 


begin
  result = api_instance.enterprise_api_upsert_user(user)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EnterpriseApiApi->enterprise_api_upsert_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**CallControlUser**](CallControlUser.md)|  | 

### Return type

**Object**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml



