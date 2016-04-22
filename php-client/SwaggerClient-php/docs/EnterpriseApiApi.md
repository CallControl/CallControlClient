# Swagger\Client\EnterpriseApiApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseApiGetBlockList**](EnterpriseApiApi.md#enterpriseApiGetBlockList) | **GET** /api/2015-11-01/Enterprise/GetBlockList | Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
[**enterpriseApiGetUser**](EnterpriseApiApi.md#enterpriseApiGetUser) | **GET** /api/2015-11-01/Enterprise/GetUser/{phoneNumber} | Enterprise  GET: GetUser\r\n            Returns the current information from the user
[**enterpriseApiShouldBlock**](EnterpriseApiApi.md#enterpriseApiShouldBlock) | **GET** /api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber} | Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
[**enterpriseApiUpsertUser**](EnterpriseApiApi.md#enterpriseApiUpsertUser) | **POST** /api/2015-11-01/Enterprise/UpsertUser | 


# **enterpriseApiGetBlockList**
> string[] enterpriseApiGetBlockList($cached)

Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking

All \r\n            Try with api_key 'demo' for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EnterpriseApiApi();
$cached = true; // bool | 

try { 
    $result = $api_instance->enterpriseApiGetBlockList($cached);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnterpriseApiApi->enterpriseApiGetBlockList: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cached** | **bool**|  | [optional] 

### Return type

**string[]**

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterpriseApiGetUser**
> \Swagger\Client\Model\CallControlUser enterpriseApiGetUser($phone_number)

Enterprise  GET: GetUser\r\n            Returns the current information from the user



### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EnterpriseApiApi();
$phone_number = "phone_number_example"; // string | 

try { 
    $result = $api_instance->enterpriseApiGetUser($phone_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnterpriseApiApi->enterpriseApiGetUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**|  | 

### Return type

[**\Swagger\Client\Model\CallControlUser**](CallControlUser.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterpriseApiShouldBlock**
> string enterpriseApiShouldBlock($phone_number, $user_phone_number)

Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.

This returns information required to perform basic call blocking behaviors\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EnterpriseApiApi();
$phone_number = "phone_number_example"; // string | phone number to search
$user_phone_number = "user_phone_number_example"; // string | (OPTOPNAL) phone number of user to look up block rules

try { 
    $result = $api_instance->enterpriseApiShouldBlock($phone_number, $user_phone_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnterpriseApiApi->enterpriseApiShouldBlock: ', $e->getMessage(), "\n";
}
?>
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

# **enterpriseApiUpsertUser**
> \Swagger\Client\Model\Object enterpriseApiUpsertUser($user)



### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EnterpriseApiApi();
$user = new \Swagger\Client\Model\CallControlUser(); // \Swagger\Client\Model\CallControlUser | 

try { 
    $result = $api_instance->enterpriseApiUpsertUser($user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnterpriseApiApi->enterpriseApiUpsertUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**\Swagger\Client\Model\CallControlUser**](\Swagger\Client\Model\CallControlUser.md)|  | 

### Return type

[**\Swagger\Client\Model\Object**](Object.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

