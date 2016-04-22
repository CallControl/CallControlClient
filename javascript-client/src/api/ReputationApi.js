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

  /**
   * Reputation service.
   * @module api/ReputationApi
   * @version 2015-11-01
   */

  /**
   * Constructs a new ReputationApi. 
   * @alias module:api/ReputationApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance}
   * if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the reputationReport operation.
     * @callback module:api/ReputationApi~reputationReportCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Report: report spam calls received to better tune our algorithms based upon spam calls you receive
     * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
     * @param {module:model/CallReport} callReport [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
     * @param {module:api/ReputationApi~reputationReportCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.reputationReport = function(callReport, callback) {
      var postBody = callReport;

      // verify the required parameter 'callReport' is set
      if (callReport == undefined || callReport == null) {
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

      var authNames = [];
      var contentTypes = ['application/json', 'text/json', 'application/xml', 'text/xml', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'text/json', 'application/xml', 'text/xml'];
      var returnType = null;

      return this.apiClient.callApi(
        '/api/2015-11-01/Report', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the reputationReputation operation.
     * @callback module:api/ReputationApi~reputationReputationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Reputation} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.
     * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
     * @param {String} phoneNumber phone number to search
     * @param {module:api/ReputationApi~reputationReputationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/Reputation}
     */
    this.reputationReputation = function(phoneNumber, callback) {
      var postBody = null;

      // verify the required parameter 'phoneNumber' is set
      if (phoneNumber == undefined || phoneNumber == null) {
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

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json', 'text/json', 'application/xml', 'text/xml'];
      var returnType = Reputation;

      return this.apiClient.callApi(
        '/api/2015-11-01/Reputation/{phoneNumber}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
