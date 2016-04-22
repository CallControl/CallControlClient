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
    root.CallControlApi.CallReport = factory(root.CallControlApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The CallReport model module.
   * @module model/CallReport
   * @version 2015-11-01
   */

  /**
   * Constructs a new <code>CallReport</code>.
   * Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
   * @alias module:model/CallReport
   * @class
   */
  var exports = function() {












  };

  /**
   * Constructs a <code>CallReport</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CallReport} obj Optional instance to populate.
   * @return {module:model/CallReport} The populated <code>CallReport</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) { 
      obj = obj || new exports();

      if (data.hasOwnProperty('PhoneNumber')) {
        obj['PhoneNumber'] = ApiClient.convertToType(data['PhoneNumber'], 'String');
      }
      if (data.hasOwnProperty('ReportedCallerName')) {
        obj['ReportedCallerName'] = ApiClient.convertToType(data['ReportedCallerName'], 'String');
      }
      if (data.hasOwnProperty('ReportedCallerId')) {
        obj['ReportedCallerId'] = ApiClient.convertToType(data['ReportedCallerId'], 'String');
      }
      if (data.hasOwnProperty('CallerType')) {
        obj['CallerType'] = ApiClient.convertToType(data['CallerType'], 'String');
      }
      if (data.hasOwnProperty('Comment')) {
        obj['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
      }
      if (data.hasOwnProperty('UnwantedCall')) {
        obj['UnwantedCall'] = ApiClient.convertToType(data['UnwantedCall'], 'Boolean');
      }
      if (data.hasOwnProperty('CallTime')) {
        obj['CallTime'] = ApiClient.convertToType(data['CallTime'], 'Date');
      }
      if (data.hasOwnProperty('Reporter')) {
        obj['Reporter'] = ApiClient.convertToType(data['Reporter'], 'String');
      }
      if (data.hasOwnProperty('IpAddress')) {
        obj['IpAddress'] = ApiClient.convertToType(data['IpAddress'], 'String');
      }
      if (data.hasOwnProperty('Latitude')) {
        obj['Latitude'] = ApiClient.convertToType(data['Latitude'], 'Number');
      }
      if (data.hasOwnProperty('Longitude')) {
        obj['Longitude'] = ApiClient.convertToType(data['Longitude'], 'Number');
      }
    }
    return obj;
  }


  /**
   * @member {String} PhoneNumber
   */
  exports.prototype['PhoneNumber'] = undefined;

  /**
   * @member {String} ReportedCallerName
   */
  exports.prototype['ReportedCallerName'] = undefined;

  /**
   * @member {String} ReportedCallerId
   */
  exports.prototype['ReportedCallerId'] = undefined;

  /**
   * @member {module:model/CallReport.CallerTypeEnum} CallerType
   */
  exports.prototype['CallerType'] = undefined;

  /**
   * @member {String} Comment
   */
  exports.prototype['Comment'] = undefined;

  /**
   * @member {Boolean} UnwantedCall
   */
  exports.prototype['UnwantedCall'] = undefined;

  /**
   * @member {Date} CallTime
   */
  exports.prototype['CallTime'] = undefined;

  /**
   * @member {String} Reporter
   */
  exports.prototype['Reporter'] = undefined;

  /**
   * @member {String} IpAddress
   */
  exports.prototype['IpAddress'] = undefined;

  /**
   * @member {Number} Latitude
   */
  exports.prototype['Latitude'] = undefined;

  /**
   * @member {Number} Longitude
   */
  exports.prototype['Longitude'] = undefined;


  /**
   * Allowed values for the <code>CallerType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CallerTypeEnum = { 
    /**
     * value: Unknown
     * @const
     */
    UNKNOWN: "Unknown",
    
    /**
     * value: Telemarketing
     * @const
     */
    TELEMARKETING: "Telemarketing",
    
    /**
     * value: Collection_Agency
     * @const
     */
    COLLECTION_AGENCY: "Collection_Agency",
    
    /**
     * value: Political
     * @const
     */
    POLITICAL: "Political",
    
    /**
     * value: Surveyor
     * @const
     */
    SURVEYOR: "Surveyor",
    
    /**
     * value: Prank_Call
     * @const
     */
    PRANK_CALL: "Prank_Call",
    
    /**
     * value: Fund_Raiser
     * @const
     */
    FUND_RAISER: "Fund_Raiser",
    
    /**
     * value: Other_Commercial
     * @const
     */
    OTHER_COMMERCIAL: "Other_Commercial",
    
    /**
     * value: Scam
     * @const
     */
    SCAM: "Scam",
    
    /**
     * value: VOIP
     * @const
     */
    VOIP: "VOIP",
    
    /**
     * value: Business
     * @const
     */
    BUSINESS: "Business",
    
    /**
     * value: Reminder_Notification_Call
     * @const
     */
    REMINDER_NOTIFICATION_CALL: "Reminder_Notification_Call",
    
    /**
     * value: Junk_Fax
     * @const
     */
    JUNK_FAX: "Junk_Fax",
    
    /**
     * value: Fax_Machine
     * @const
     */
    FAX_MACHINE: "Fax_Machine",
    
    /**
     * value: Spam_Text
     * @const
     */
    SPAM_TEXT: "Spam_Text",
    
    /**
     * value: RoboCall
     * @const
     */
    ROBOCALL: "RoboCall",
    
    /**
     * value: NotSpam
     * @const
     */
    NOTSPAM: "NotSpam",
    
    /**
     * value: Callback
     * @const
     */
    CALLBACK: "Callback"
  };

  return exports;
}));
