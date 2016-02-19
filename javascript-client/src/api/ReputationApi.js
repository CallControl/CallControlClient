(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient', '../model/CallReport', '../model/Reputation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CallReport'), require('../model/Reputation'));
  } else {
    // Browser globals (root is window)
    if (!root.CallControlApi) {
      root.CallControlApi = {};
    }
    root.CallControlApi.ReputationApi = factory(root.CallControlApi.ApiClient, root.CallControlApi.CallReport, root.CallControlApi.Reputation);
  }
}(this, function(ApiClient, CallReport, Reputation) {
  'use strict';

  var ReputationApi = function ReputationApi(apiClient) {
    this.apiClient = apiClient || ApiClient.default;

    var self = this;
    
    
    /**
     * Report: report spam calls received to better tune our algorithms based upon spam calls you receive
     * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
     * @param {CallReport}  callReport [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
     * @param {function} callback the callback function, accepting three arguments: error, data, response
     */
    self.reputationReport = function(callReport, callback) {
      var postBody = callReport;
      
      // verify the required parameter 'callReport' is set
      if (callReport == null) {
        throw "Missing the required parameter 'callReport' when calling reputationReport";
      }
      

      
      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var contentTypes = ['application/json', 'text/json', 'application/xml', 'text/xml', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'text/json', 'application/xml', 'text/xml'];
      var returnType = null;

      return this.apiClient.callApi(
        '/api/2015-11-01/Report', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        contentTypes, accepts, returnType, callback
      );
      
    }
    
    /**
     * Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.
     * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
     * @param {String}  phoneNumber phone number to search
     * @param {function} callback the callback function, accepting three arguments: error, data, response
     *   data is of type: Reputation
     */
    self.reputationReputation = function(phoneNumber, callback) {
      var postBody = null;
      
      // verify the required parameter 'phoneNumber' is set
      if (phoneNumber == null) {
        throw "Missing the required parameter 'phoneNumber' when calling reputationReputation";
      }
      

      
      var pathParams = {
        'phoneNumber': phoneNumber
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var contentTypes = [];
      var accepts = ['application/json', 'text/json', 'application/xml', 'text/xml'];
      var returnType = Reputation;

      return this.apiClient.callApi(
        '/api/2015-11-01/Reputation/{phoneNumber}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        contentTypes, accepts, returnType, callback
      );
      
    }
    
    
  };

  return ReputationApi;
}));
