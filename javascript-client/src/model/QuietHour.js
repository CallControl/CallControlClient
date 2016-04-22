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
    root.CallControlApi.QuietHour = factory(root.CallControlApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The QuietHour model module.
   * @module model/QuietHour
   * @version 2015-11-01
   */

  /**
   * Constructs a new <code>QuietHour</code>.
   * @alias module:model/QuietHour
   * @class
   */
  var exports = function() {






  };

  /**
   * Constructs a <code>QuietHour</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/QuietHour} obj Optional instance to populate.
   * @return {module:model/QuietHour} The populated <code>QuietHour</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) { 
      obj = obj || new exports();

      if (data.hasOwnProperty('DayOfWeekList')) {
        obj['DayOfWeekList'] = ApiClient.convertToType(data['DayOfWeekList'], ['String']);
      }
      if (data.hasOwnProperty('StartHourLocal')) {
        obj['StartHourLocal'] = ApiClient.convertToType(data['StartHourLocal'], 'Integer');
      }
      if (data.hasOwnProperty('StartMinLocal')) {
        obj['StartMinLocal'] = ApiClient.convertToType(data['StartMinLocal'], 'Integer');
      }
      if (data.hasOwnProperty('DurationMin')) {
        obj['DurationMin'] = ApiClient.convertToType(data['DurationMin'], 'Integer');
      }
      if (data.hasOwnProperty('TimeZoneName')) {
        obj['TimeZoneName'] = ApiClient.convertToType(data['TimeZoneName'], 'String');
      }
    }
    return obj;
  }


  /**
   * @member {Array.<module:model/QuietHour.DayOfWeekListEnum>} DayOfWeekList
   */
  exports.prototype['DayOfWeekList'] = undefined;

  /**
   * @member {Integer} StartHourLocal
   */
  exports.prototype['StartHourLocal'] = undefined;

  /**
   * @member {Integer} StartMinLocal
   */
  exports.prototype['StartMinLocal'] = undefined;

  /**
   * @member {Integer} DurationMin
   */
  exports.prototype['DurationMin'] = undefined;

  /**
   * @member {String} TimeZoneName
   */
  exports.prototype['TimeZoneName'] = undefined;



  /**
   * Allowed values for the <code>dayOfWeekList</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DayOfWeekListEnum = { 
    /**
     * value: Sunday
     * @const
     */
    SUNDAY: "Sunday",
    
    /**
     * value: Monday
     * @const
     */
    MONDAY: "Monday",
    
    /**
     * value: Tuesday
     * @const
     */
    TUESDAY: "Tuesday",
    
    /**
     * value: Wednesday
     * @const
     */
    WEDNESDAY: "Wednesday",
    
    /**
     * value: Thursday
     * @const
     */
    THURSDAY: "Thursday",
    
    /**
     * value: Friday
     * @const
     */
    FRIDAY: "Friday",
    
    /**
     * value: Saturday
     * @const
     */
    SATURDAY: "Saturday"
  };*/

  return exports;
}));
