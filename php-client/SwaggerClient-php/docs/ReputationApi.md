# Swagger\Client\ReputationApi

All URIs are relative to *https://www.callcontrol.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reputationReport**](ReputationApi.md#reputationReport) | **POST** /api/2015-11-01/Report | Report: report spam calls received to better tune our algorithms based upon spam calls you receive
[**reputationReputation**](ReputationApi.md#reputationReputation) | **GET** /api/2015-11-01/Reputation/{phoneNumber} | Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.


# **reputationReport**
> reputationReport($call_report)

Report: report spam calls received to better tune our algorithms based upon spam calls you receive

This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ReputationApi();
$call_report = new \Swagger\Client\Model\CallReport(); // \Swagger\Client\Model\CallReport | [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),

try { 
    $api_instance->reputationReport($call_report);
} catch (Exception $e) {
    echo 'Exception when calling ReputationApi->reputationReport: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **call_report** | [**\Swagger\Client\Model\CallReport**](\Swagger\Client\Model\CallReport.md)| [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional), | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reputationReputation**
> \Swagger\Client\Model\Reputation reputationReputation($phone_number)

Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.

This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ReputationApi();
$phone_number = "phone_number_example"; // string | phone number to search

try { 
    $result = $api_instance->reputationReputation($phone_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReputationApi->reputationReputation: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **string**| phone number to search | 

### Return type

[**\Swagger\Client\Model\Reputation**](Reputation.md)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

