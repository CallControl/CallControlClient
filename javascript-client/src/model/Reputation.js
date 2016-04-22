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
    root.CallControlApi.Reputation = factory(root.CallControlApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The Reputation model module.
   * @module model/Reputation
   * @version 2015-11-01
   */

  /**
   * Constructs a new <code>Reputation</code>.
   * @alias module:model/Reputation
   * @class
   */
  var exports = function() {







  };

  /**
   * Constructs a <code>Reputation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Reputation} obj Optional instance to populate.
   * @return {module:model/Reputation} The populated <code>Reputation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) { 
      obj = obj || new exports();

      if (data.hasOwnProperty('CallType')) {
        obj['CallType'] = ApiClient.convertToType(data['CallType'], 'String');
      }
      if (data.hasOwnProperty('Confidence')) {
        obj['Confidence'] = ApiClient.convertToType(data['Confidence'], 'Integer');
      }
      if (data.hasOwnProperty('IsSpam')) {
        obj['IsSpam'] = ApiClient.convertToType(data['IsSpam'], 'Boolean');
      }
      if (data.hasOwnProperty('LastCompaintDate')) {
        obj['LastCompaintDate'] = ApiClient.convertToType(data['LastCompaintDate'], 'Date');
      }
      if (data.hasOwnProperty('ReportedCallerName')) {
        obj['ReportedCallerName'] = ApiClient.convertToType(data['ReportedCallerName'], 'String');
      }
      if (data.hasOwnProperty('Tags')) {
        obj['Tags'] = ApiClient.convertToType(data['Tags'], ['String']);
      }
    }
    return obj;
  }


  /**
   * @member {String} CallType
   */
  exports.prototype['CallType'] = undefined;

  /**
   * @member {Integer} Confidence
   */
  exports.prototype['Confidence'] = undefined;

  /**
   * @member {Boolean} IsSpam
   */
  exports.prototype['IsSpam'] = undefined;

  /**
   * @member {Date} LastCompaintDate
   */
  exports.prototype['LastCompaintDate'] = undefined;

  /**
   * @member {String} ReportedCallerName
   */
  exports.prototype['ReportedCallerName'] = undefined;

  /**
   * @member {Array.<String>} Tags
   */
  exports.prototype['Tags'] = undefined;




  return exports;
}));
