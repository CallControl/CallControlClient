(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient', '../model/CallControlUser', '../model/ModelObject'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CallControlUser'), require('../model/ModelObject'));
  } else {
    // Browser globals (root is window)
    if (!root.CallControlApi) {
      root.CallControlApi = {};
    }
    root.CallControlApi.EnterpriseApiApi = factory(root.CallControlApi.ApiClient, root.CallControlApi.CallControlUser, root.CallControlApi.ModelObject);
  }
}(this, function(ApiClient, CallControlUser, ModelObject) {
  'use strict';

  /**
   * EnterpriseApi service.
   * @module api/EnterpriseApiApi
   * @version 2015-11-01
   */

  /**
   * Constructs a new EnterpriseApiApi. 
   * @alias module:api/EnterpriseApiApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance}
   * if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the enterpriseApiGetBlockList operation.
     * @callback module:api/EnterpriseApiApi~enterpriseApiGetBlockListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
     * All \r\n            Try with api_key &#39;demo&#39; for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.cached 
     * @param {module:api/EnterpriseApiApi~enterpriseApiGetBlockListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {Array.<'String'>}
     */
    this.enterpriseApiGetBlockList = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'cached': opts['cached']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json', 'text/json', 'application/xml', 'text/xml'];
      var returnType = ['String'];

      return this.apiClient.callApi(
        '/api/2015-11-01/Enterprise/GetBlockList', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the enterpriseApiGetUser operation.
     * @callback module:api/EnterpriseApiApi~enterpriseApiGetUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CallControlUser} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enterprise  GET: GetUser\r\n            Returns the current information from the user
     * 
     * @param {String} phoneNumber 
     * @param {module:api/EnterpriseApiApi~enterpriseApiGetUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/CallControlUser}
     */
    this.enterpriseApiGetUser = function(phoneNumber, callback) {
      var postBody = null;

      // verify the required parameter 'phoneNumber' is set
      if (phoneNumber == undefined || phoneNumber == null) {
        throw "Missing the required parameter 'phoneNumber' when calling enterpriseApiGetUser";
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
      var returnType = CallControlUser;

      return this.apiClient.callApi(
        '/api/2015-11-01/Enterprise/GetUser/{phoneNumber}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the enterpriseApiShouldBlock operation.
     * @callback module:api/EnterpriseApiApi~enterpriseApiShouldBlockCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
     * This returns information required to perform basic call blocking behaviors\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
     * @param {String} phoneNumber phone number to search
     * @param {String} userPhoneNumber (OPTOPNAL) phone number of user to look up block rules
     * @param {module:api/EnterpriseApiApi~enterpriseApiShouldBlockCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {'String'}
     */
    this.enterpriseApiShouldBlock = function(phoneNumber, userPhoneNumber, callback) {
      var postBody = null;

      // verify the required parameter 'phoneNumber' is set
      if (phoneNumber == undefined || phoneNumber == null) {
        throw "Missing the required parameter 'phoneNumber' when calling enterpriseApiShouldBlock";
      }

      // verify the required parameter 'userPhoneNumber' is set
      if (userPhoneNumber == undefined || userPhoneNumber == null) {
        throw "Missing the required parameter 'userPhoneNumber' when calling enterpriseApiShouldBlock";
      }


      var pathParams = {
        'phoneNumber': phoneNumber,
        'userPhoneNumber': userPhoneNumber
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
      var returnType = 'String';

      return this.apiClient.callApi(
        '/api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the enterpriseApiUpsertUser operation.
     * @callback module:api/EnterpriseApiApi~enterpriseApiUpsertUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ModelObject} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/CallControlUser} user 
     * @param {module:api/EnterpriseApiApi~enterpriseApiUpsertUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/ModelObject}
     */
    this.enterpriseApiUpsertUser = function(user, callback) {
      var postBody = user;

      // verify the required parameter 'user' is set
      if (user == undefined || user == null) {
        throw "Missing the required parameter 'user' when calling enterpriseApiUpsertUser";
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
      var returnType = ModelObject;

      return this.apiClient.callApi(
        '/api/2015-11-01/Enterprise/UpsertUser', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
