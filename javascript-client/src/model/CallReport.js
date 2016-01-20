// require files in Node.js environment
var ReporterLoation;
if (typeof module === 'object' && module.exports) {
  
  ReporterLoation = require('./ReporterLoation.js');
}



//export module
if ( typeof define === "function" && define.amd ) {     
	define('CallerTypeEnum', ['jquery'], function($) {
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
	self.PAY_PHONE = "Pay_Phone",
	
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


//export module
if ( typeof define === "function" && define.amd ) {
  define('CallReport', ['jquery''ReporterLoation'],
    function($ReporterLoation) {
      return CallReport;
   });
}

/**
 * Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
 **/
var CallReport = function CallReport() { 
  var self = this;
  
  /**
   * datatype: String
   **/
  self.phoneNumber = null;
  
  /**
   * datatype: String
   **/
  self.reportedCallerName = null;
  
  /**
   * datatype: String
   **/
  self.reportedCallerId = null;
  
  /**
   * datatype: CallerTypeEnum
   **/
  self.callerType = null;
  
  /**
   * datatype: String
   **/
  self.comment = null;
  
  /**
   * datatype: Boolean
   **/
  self.unwantedCall = null;
  
  /**
   * datatype: Date
   **/
  self.callTime = null;
  
  /**
   * datatype: String
   **/
  self.reporter = null;
  
  /**
   * datatype: ReporterLoation
   **/
  self.reporterLoation = new ReporterLoation();
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.phoneNumber = data.PhoneNumber;
    
    self.reportedCallerName = data.ReportedCallerName;
    
    self.reportedCallerId = data.ReportedCallerId;
    
    self.callerType = data.CallerType;
    
    self.comment = data.Comment;
    
    self.unwantedCall = data.UnwantedCall;
    
    self.callTime = data.CallTime;
    
    self.reporter = data.Reporter;
    
    self.reporterLoation.constructFromObject(data.ReporterLoation);
    
  }

  
  /**
   * @return {String}
   **/
  self.getPhoneNumber = function() {
    return self.phoneNumber;
  }

  /**
   * @param {String} phoneNumber
   **/
  self.setPhoneNumber = function (phoneNumber) {
    self.phoneNumber = phoneNumber;
  }
  
  /**
   * @return {String}
   **/
  self.getReportedCallerName = function() {
    return self.reportedCallerName;
  }

  /**
   * @param {String} reportedCallerName
   **/
  self.setReportedCallerName = function (reportedCallerName) {
    self.reportedCallerName = reportedCallerName;
  }
  
  /**
   * @return {String}
   **/
  self.getReportedCallerId = function() {
    return self.reportedCallerId;
  }

  /**
   * @param {String} reportedCallerId
   **/
  self.setReportedCallerId = function (reportedCallerId) {
    self.reportedCallerId = reportedCallerId;
  }
  
  /**
   * @return {CallerTypeEnum}
   **/
  self.getCallerType = function() {
    return self.callerType;
  }

  /**
   * @param {CallerTypeEnum} callerType
   **/
  self.setCallerType = function (callerType) {
    self.callerType = callerType;
  }
  
  /**
   * @return {String}
   **/
  self.getComment = function() {
    return self.comment;
  }

  /**
   * @param {String} comment
   **/
  self.setComment = function (comment) {
    self.comment = comment;
  }
  
  /**
   * @return {Boolean}
   **/
  self.getUnwantedCall = function() {
    return self.unwantedCall;
  }

  /**
   * @param {Boolean} unwantedCall
   **/
  self.setUnwantedCall = function (unwantedCall) {
    self.unwantedCall = unwantedCall;
  }
  
  /**
   * @return {Date}
   **/
  self.getCallTime = function() {
    return self.callTime;
  }

  /**
   * @param {Date} callTime
   **/
  self.setCallTime = function (callTime) {
    self.callTime = callTime;
  }
  
  /**
   * @return {String}
   **/
  self.getReporter = function() {
    return self.reporter;
  }

  /**
   * @param {String} reporter
   **/
  self.setReporter = function (reporter) {
    self.reporter = reporter;
  }
  
  /**
   * @return {ReporterLoation}
   **/
  self.getReporterLoation = function() {
    return self.reporterLoation;
  }

  /**
   * @param {ReporterLoation} reporterLoation
   **/
  self.setReporterLoation = function (reporterLoation) {
    self.reporterLoation = reporterLoation;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = CallReport;
}
