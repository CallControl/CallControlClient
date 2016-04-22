(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient', '../model/Complaints'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Complaints'));
  } else {
    // Browser globals (root is window)
    if (!root.CallControlApi) {
      root.CallControlApi = {};
    }
    root.CallControlApi.ComplaintsApi = factory(root.CallControlApi.ApiClient, root.CallControlApi.Complaints);
  }
}(this, function(ApiClient, Complaints) {
  'use strict';

  /**
   * Complaints service.
   * @module api/ComplaintsApi
   * @version 2015-11-01
   */

  /**
   * Constructs a new ComplaintsApi. 
   * @alias module:api/ComplaintsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance}
   * if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the complaintsComplaints operation.
     * @callback module:api/ComplaintsApi~complaintsComplaintsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Complaints} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
     * This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
     * @param {String} phoneNumber phone number to search
     * @param {module:api/ComplaintsApi~complaintsComplaintsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/Complaints}
     */
    this.complaintsComplaints = function(phoneNumber, callback) {
      var postBody = null;

      // verify the required parameter 'phoneNumber' is set
      if (phoneNumber == undefined || phoneNumber == null) {
        throw "Missing the required parameter 'phoneNumber' when calling complaintsComplaints";
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
      var returnType = Complaints;

      return this.apiClient.callApi(
        '/api/2015-11-01/Complaints/{phoneNumber}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
