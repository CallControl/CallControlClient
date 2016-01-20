// require files in Node.js environment

if (typeof module === 'object' && module.exports) {
  
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('DoNotCallComplaints', ['jquery'],
    function($) {
      return DoNotCallComplaints;
   });
}

/**
 * Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
 **/
var DoNotCallComplaints = function DoNotCallComplaints() { 
  var self = this;
  
  /**
   * Reported Caller Name
   * datatype: String
   **/
  self.reportedCallerName = null;
  
  /**
   * datatype: Integer
   **/
  self.totalNumberOfComplaints = null;
  
  /**
   * datatype: Object<String, Integer>
   **/
  self.complaintsByEntity = {};
  
  /**
   * datatype: Date
   **/
  self.lastCompaintDate = null;
  
  /**
   * datatype: Array
   **/
  self.tags = [];
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.reportedCallerName = data.ReportedCallerName;
    
    self.totalNumberOfComplaints = data.TotalNumberOfComplaints;
    
    self.complaintsByEntity = {}
    
    self.lastCompaintDate = data.LastCompaintDate;
    
    self.tags = new Array();
    
  }

  
  /**
   * get Reported Caller Name
   * @return {String}
   **/
  self.getReportedCallerName = function() {
    return self.reportedCallerName;
  }

  /**
   * set Reported Caller Name
   * @param {String} reportedCallerName
   **/
  self.setReportedCallerName = function (reportedCallerName) {
    self.reportedCallerName = reportedCallerName;
  }
  
  /**
   * @return {Integer}
   **/
  self.getTotalNumberOfComplaints = function() {
    return self.totalNumberOfComplaints;
  }

  /**
   * @param {Integer} totalNumberOfComplaints
   **/
  self.setTotalNumberOfComplaints = function (totalNumberOfComplaints) {
    self.totalNumberOfComplaints = totalNumberOfComplaints;
  }
  
  /**
   * @return {Object&lt;String, Integer&gt;}
   **/
  self.getComplaintsByEntity = function() {
    return self.complaintsByEntity;
  }

  /**
   * @param {Object&lt;String, Integer&gt;} complaintsByEntity
   **/
  self.setComplaintsByEntity = function (complaintsByEntity) {
    self.complaintsByEntity = complaintsByEntity;
  }
  
  /**
   * @return {Date}
   **/
  self.getLastCompaintDate = function() {
    return self.lastCompaintDate;
  }

  /**
   * @param {Date} lastCompaintDate
   **/
  self.setLastCompaintDate = function (lastCompaintDate) {
    self.lastCompaintDate = lastCompaintDate;
  }
  
  /**
   * @return {Array}
   **/
  self.getTags = function() {
    return self.tags;
  }

  /**
   * @param {Array} tags
   **/
  self.setTags = function (tags) {
    self.tags = tags;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = DoNotCallComplaints;
}
