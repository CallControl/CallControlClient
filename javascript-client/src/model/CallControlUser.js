(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient', './QuietHour'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./QuietHour'));
  } else {
    // Browser globals (root is window)
    if (!root.CallControlApi) {
      root.CallControlApi = {};
    }
    root.CallControlApi.CallControlUser = factory(root.CallControlApi.ApiClient, root.CallControlApi.QuietHour);
  }
}(this, function(ApiClient, QuietHour) {
  'use strict';

  /**
   * The CallControlUser model module.
   * @module model/CallControlUser
   * @version 2015-11-01
   */

  /**
   * Constructs a new <code>CallControlUser</code>.
   * @alias module:model/CallControlUser
   * @class
   */
  var exports = function() {


















  };

  /**
   * Constructs a <code>CallControlUser</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CallControlUser} obj Optional instance to populate.
   * @return {module:model/CallControlUser} The populated <code>CallControlUser</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) { 
      obj = obj || new exports();

      if (data.hasOwnProperty('PhoneNumber')) {
        obj['PhoneNumber'] = ApiClient.convertToType(data['PhoneNumber'], 'String');
      }
      if (data.hasOwnProperty('PhoneNumbeRegion')) {
        obj['PhoneNumbeRegion'] = ApiClient.convertToType(data['PhoneNumbeRegion'], 'String');
      }
      if (data.hasOwnProperty('WhiteList')) {
        obj['WhiteList'] = ApiClient.convertToType(data['WhiteList'], ['String']);
      }
      if (data.hasOwnProperty('BlackList')) {
        obj['BlackList'] = ApiClient.convertToType(data['BlackList'], ['String']);
      }
      if (data.hasOwnProperty('QuietHourList')) {
        obj['QuietHourList'] = ApiClient.convertToType(data['QuietHourList'], [QuietHour]);
      }
      if (data.hasOwnProperty('UseCommunityBlacklist')) {
        obj['UseCommunityBlacklist'] = ApiClient.convertToType(data['UseCommunityBlacklist'], 'Boolean');
      }
      if (data.hasOwnProperty('BreakThroughQhWithMultipleCalls')) {
        obj['BreakThroughQhWithMultipleCalls'] = ApiClient.convertToType(data['BreakThroughQhWithMultipleCalls'], 'Boolean');
      }
      if (data.hasOwnProperty('WhiteListBreaksQh')) {
        obj['WhiteListBreaksQh'] = ApiClient.convertToType(data['WhiteListBreaksQh'], 'Boolean');
      }
      if (data.hasOwnProperty('BlockBehavior')) {
        obj['BlockBehavior'] = ApiClient.convertToType(data['BlockBehavior'], 'String');
      }
      if (data.hasOwnProperty('Email')) {
        obj['Email'] = ApiClient.convertToType(data['Email'], 'String');
      }
      if (data.hasOwnProperty('Age')) {
        obj['Age'] = ApiClient.convertToType(data['Age'], 'Integer');
      }
      if (data.hasOwnProperty('Gender')) {
        obj['Gender'] = ApiClient.convertToType(data['Gender'], 'String');
      }
      if (data.hasOwnProperty('Salutation')) {
        obj['Salutation'] = ApiClient.convertToType(data['Salutation'], 'String');
      }
      if (data.hasOwnProperty('FirstName')) {
        obj['FirstName'] = ApiClient.convertToType(data['FirstName'], 'String');
      }
      if (data.hasOwnProperty('MiddleName')) {
        obj['MiddleName'] = ApiClient.convertToType(data['MiddleName'], 'String');
      }
      if (data.hasOwnProperty('LastName')) {
        obj['LastName'] = ApiClient.convertToType(data['LastName'], 'String');
      }
      if (data.hasOwnProperty('Suffix')) {
        obj['Suffix'] = ApiClient.convertToType(data['Suffix'], 'String');
      }
    }
    return obj;
  }


  /**
   * @member {String} PhoneNumber
   */
  exports.prototype['PhoneNumber'] = undefined;

  /**
   * @member {String} PhoneNumbeRegion
   */
  exports.prototype['PhoneNumbeRegion'] = undefined;

  /**
   * @member {Array.<String>} WhiteList
   */
  exports.prototype['WhiteList'] = undefined;

  /**
   * @member {Array.<String>} BlackList
   */
  exports.prototype['BlackList'] = undefined;

  /**
   * @member {Array.<module:model/QuietHour>} QuietHourList
   */
  exports.prototype['QuietHourList'] = undefined;

  /**
   * @member {Boolean} UseCommunityBlacklist
   */
  exports.prototype['UseCommunityBlacklist'] = undefined;

  /**
   * @member {Boolean} BreakThroughQhWithMultipleCalls
   */
  exports.prototype['BreakThroughQhWithMultipleCalls'] = undefined;

  /**
   * @member {Boolean} WhiteListBreaksQh
   */
  exports.prototype['WhiteListBreaksQh'] = undefined;

  /**
   * @member {module:model/CallControlUser.BlockBehaviorEnum} BlockBehavior
   */
  exports.prototype['BlockBehavior'] = undefined;

  /**
   * @member {String} Email
   */
  exports.prototype['Email'] = undefined;

  /**
   * @member {Integer} Age
   */
  exports.prototype['Age'] = undefined;

  /**
   * @member {String} Gender
   */
  exports.prototype['Gender'] = undefined;

  /**
   * @member {String} Salutation
   */
  exports.prototype['Salutation'] = undefined;

  /**
   * @member {String} FirstName
   */
  exports.prototype['FirstName'] = undefined;

  /**
   * @member {String} MiddleName
   */
  exports.prototype['MiddleName'] = undefined;

  /**
   * @member {String} LastName
   */
  exports.prototype['LastName'] = undefined;

  /**
   * @member {String} Suffix
   */
  exports.prototype['Suffix'] = undefined;


  /**
   * Allowed values for the <code>BlockBehavior</code> property.
   * @enum {String}
   * @readonly
   */
  exports.BlockBehaviorEnum = { 
    /**
     * value: allow
     * @const
     */
    ALLOW: "allow",
    
    /**
     * value: voiceMail
     * @const
     */
    VOICEMAIL: "voiceMail",
    
    /**
     * value: block
     * @const
     */
    BLOCK: "block"
  };

  return exports;
}));
