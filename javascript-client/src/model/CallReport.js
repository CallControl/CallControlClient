(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define([undefined, '../ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(undefined, require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CallControlApi) {
      root.CallControlApi = {};
    }
    factory(root.CallControlApi, root.CallControlApi.ApiClient);
  }
}(this, function(module, ApiClient) {
  'use strict';

  
  
//export module
if ( typeof define === "function" && define.amd ) {
	define('CallerTypeEnum', [], function() {
        return CallerTypeEnum;
	 });
}

var CallerTypeEnum = function CallerTypeEnum() {
	var self = this;


	/**
	 * @const
	 */
	self.UNKNOWN = "Unknown",
	
	/**
	 * @const
	 */
	self.TELEMARKETING = "Telemarketing",
	
	/**
	 * @const
	 */
	self.COLLECTION_AGENCY = "Collection_Agency",
	
	/**
	 * @const
	 */
	self.POLITICAL = "Political",
	
	/**
	 * @const
	 */
	self.SURVEYOR = "Surveyor",
	
	/**
	 * @const
	 */
	self.PRANK_CALL = "Prank_Call",
	
	/**
	 * @const
	 */
	self.FUND_RAISER = "Fund_Raiser",
	
	/**
	 * @const
	 */
	self.OTHER_COMMERCIAL = "Other_Commercial",
	
	/**
	 * @const
	 */
	self.SCAM = "Scam",
	
	/**
	 * @const
	 */
	self.VOIP = "VOIP",
	
	/**
	 * @const
	 */
	self.BUSINESS = "Business",
	
	/**
	 * @const
	 */
	self.REMINDER_NOTIFICATION_CALL = "Reminder_Notification_Call",
	
	/**
	 * @const
	 */
	self.JUNK_FAX = "Junk_Fax",
	
	/**
	 * @const
	 */
	self.FAX_MACHINE = "Fax_Machine",
	
	/**
	 * @const
	 */
	self.SPAM_TEXT = "Spam_Text",
	
	/**
	 * @const
	 */
	self.ROBOCALL = "RoboCall",
	
	/**
	 * @const
	 */
	self.NOTSPAM = "NotSpam",
	
	/**
	 * @const
	 */
	self.CALLBACK = "Callback";

}


  /**
   * Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
   **/
  var CallReport = function CallReport() { 
    var self = this;
    
    /**
     * datatype: String
     **/
    self['PhoneNumber'] = null;
    
    /**
     * datatype: String
     **/
    self['ReportedCallerName'] = null;
    
    /**
     * datatype: String
     **/
    self['ReportedCallerId'] = null;
    
    /**
     * datatype: CallerTypeEnum
     **/
    self['CallerType'] = null;
    
    /**
     * datatype: String
     **/
    self['Comment'] = null;
    
    /**
     * datatype: Boolean
     **/
    self['UnwantedCall'] = null;
    
    /**
     * datatype: Date
     **/
    self['CallTime'] = null;
    
    /**
     * datatype: String
     **/
    self['Reporter'] = null;
    
    /**
     * datatype: String
     **/
    self['IpAddress'] = null;
    
    /**
     * datatype: Number
     **/
    self['Latitude'] = null;
    
    /**
     * datatype: Number
     **/
    self['Longitude'] = null;
    

    self.constructFromObject = function(data) {
      if (!data) {
        return this;
      }
      
      self['PhoneNumber'] = ApiClient.convertToType(data['PhoneNumber'], 'String');
      
      self['ReportedCallerName'] = ApiClient.convertToType(data['ReportedCallerName'], 'String');
      
      self['ReportedCallerId'] = ApiClient.convertToType(data['ReportedCallerId'], 'String');
      
      self['CallerType'] = ApiClient.convertToType(data['CallerType'], 'String');
      
      self['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
      
      self['UnwantedCall'] = ApiClient.convertToType(data['UnwantedCall'], 'Boolean');
      
      self['CallTime'] = ApiClient.convertToType(data['CallTime'], 'Date');
      
      self['Reporter'] = ApiClient.convertToType(data['Reporter'], 'String');
      
      self['IpAddress'] = ApiClient.convertToType(data['IpAddress'], 'String');
      
      self['Latitude'] = ApiClient.convertToType(data['Latitude'], 'Number');
      
      self['Longitude'] = ApiClient.convertToType(data['Longitude'], 'Number');
      
      return this;
    }

    
    /**
     * @return {String}
     **/
    self.getPhoneNumber = function() {
      return self['PhoneNumber'];
    }

    /**
     * @param {String} phoneNumber
     **/
    self.setPhoneNumber = function(phoneNumber) {
      self['PhoneNumber'] = phoneNumber;
    }
    
    /**
     * @return {String}
     **/
    self.getReportedCallerName = function() {
      return self['ReportedCallerName'];
    }

    /**
     * @param {String} reportedCallerName
     **/
    self.setReportedCallerName = function(reportedCallerName) {
      self['ReportedCallerName'] = reportedCallerName;
    }
    
    /**
     * @return {String}
     **/
    self.getReportedCallerId = function() {
      return self['ReportedCallerId'];
    }

    /**
     * @param {String} reportedCallerId
     **/
    self.setReportedCallerId = function(reportedCallerId) {
      self['ReportedCallerId'] = reportedCallerId;
    }
    
    /**
     * @return {CallerTypeEnum}
     **/
    self.getCallerType = function() {
      return self['CallerType'];
    }

    /**
     * @param {CallerTypeEnum} callerType
     **/
    self.setCallerType = function(callerType) {
      self['CallerType'] = callerType;
    }
    
    /**
     * @return {String}
     **/
    self.getComment = function() {
      return self['Comment'];
    }

    /**
     * @param {String} comment
     **/
    self.setComment = function(comment) {
      self['Comment'] = comment;
    }
    
    /**
     * @return {Boolean}
     **/
    self.getUnwantedCall = function() {
      return self['UnwantedCall'];
    }

    /**
     * @param {Boolean} unwantedCall
     **/
    self.setUnwantedCall = function(unwantedCall) {
      self['UnwantedCall'] = unwantedCall;
    }
    
    /**
     * @return {Date}
     **/
    self.getCallTime = function() {
      return self['CallTime'];
    }

    /**
     * @param {Date} callTime
     **/
    self.setCallTime = function(callTime) {
      self['CallTime'] = callTime;
    }
    
    /**
     * @return {String}
     **/
    self.getReporter = function() {
      return self['Reporter'];
    }

    /**
     * @param {String} reporter
     **/
    self.setReporter = function(reporter) {
      self['Reporter'] = reporter;
    }
    
    /**
     * @return {String}
     **/
    self.getIpAddress = function() {
      return self['IpAddress'];
    }

    /**
     * @param {String} ipAddress
     **/
    self.setIpAddress = function(ipAddress) {
      self['IpAddress'] = ipAddress;
    }
    
    /**
     * @return {Number}
     **/
    self.getLatitude = function() {
      return self['Latitude'];
    }

    /**
     * @param {Number} latitude
     **/
    self.setLatitude = function(latitude) {
      self['Latitude'] = latitude;
    }
    
    /**
     * @return {Number}
     **/
    self.getLongitude = function() {
      return self['Longitude'];
    }

    /**
     * @param {Number} longitude
     **/
    self.setLongitude = function(longitude) {
      self['Longitude'] = longitude;
    }
    

    self.toJson = function() {
      return JSON.stringify(self);
    }
  };

  if (module) {
    module.CallReport = CallReport;
  }

  return CallReport;
  
  
}));
