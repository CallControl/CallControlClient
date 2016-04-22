(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CallControlApi) {
      root.CallControlApi = {};
    }
    root.CallControlApi.Complaints = factory(root.CallControlApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The Complaints model module.
   * @module model/Complaints
   * @version 2015-11-01
   */

  /**
   * Constructs a new <code>Complaints</code>.
   * Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
   * @alias module:model/Complaints
   * @class
   */
  var exports = function() {






  };

  /**
   * Constructs a <code>Complaints</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Complaints} obj Optional instance to populate.
   * @return {module:model/Complaints} The populated <code>Complaints</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) { 
      obj = obj || new exports();

      if (data.hasOwnProperty('ReportedCallerName')) {
        obj['ReportedCallerName'] = ApiClient.convertToType(data['ReportedCallerName'], 'String');
      }
      if (data.hasOwnProperty('TotalNumberOfComplaints')) {
        obj['TotalNumberOfComplaints'] = ApiClient.convertToType(data['TotalNumberOfComplaints'], 'Integer');
      }
      if (data.hasOwnProperty('ComplaintsByEntity')) {
        obj['ComplaintsByEntity'] = ApiClient.convertToType(data['ComplaintsByEntity'], {'String': 'Integer'});
      }
      if (data.hasOwnProperty('LastCompaintDate')) {
        obj['LastCompaintDate'] = ApiClient.convertToType(data['LastCompaintDate'], 'Date');
      }
      if (data.hasOwnProperty('Tags')) {
        obj['Tags'] = ApiClient.convertToType(data['Tags'], ['String']);
      }
    }
    return obj;
  }


  /**
   * Reported Caller Name
   * @member {String} ReportedCallerName
   */
  exports.prototype['ReportedCallerName'] = undefined;

  /**
   * @member {Integer} TotalNumberOfComplaints
   */
  exports.prototype['TotalNumberOfComplaints'] = undefined;

  /**
   * @member {Object.<String, Integer>} ComplaintsByEntity
   */
  exports.prototype['ComplaintsByEntity'] = undefined;

  /**
   * @member {Date} LastCompaintDate
   */
  exports.prototype['LastCompaintDate'] = undefined;

  /**
   * @member {Array.<String>} Tags
   */
  exports.prototype['Tags'] = undefined;




  return exports;
}));
