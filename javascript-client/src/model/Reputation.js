// require files in Node.js environment

if (typeof module === 'object' && module.exports) {
  
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('Reputation', ['jquery'],
    function($) {
      return Reputation;
   });
}


var Reputation = function Reputation() { 
  var self = this;
  
  /**
   * datatype: String
   **/
  self.callType = null;
  
  /**
   * datatype: Integer
   **/
  self.confidence = null;
  
  /**
   * datatype: Boolean
   **/
  self.isSpam = null;
  
  /**
   * datatype: Date
   **/
  self.lastCompaintDate = null;
  
  /**
   * datatype: String
   **/
  self.reportedCallerName = null;
  
  /**
   * datatype: Array
   **/
  self.tags = [];
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.callType = data.CallType;
    
    self.confidence = data.Confidence;
    
    self.isSpam = data.IsSpam;
    
    self.lastCompaintDate = data.LastCompaintDate;
    
    self.reportedCallerName = data.ReportedCallerName;
    
    self.tags = new Array();
    
  }

  
  /**
   * @return {String}
   **/
  self.getCallType = function() {
    return self.callType;
  }

  /**
   * @param {String} callType
   **/
  self.setCallType = function (callType) {
    self.callType = callType;
  }
  
  /**
   * @return {Integer}
   **/
  self.getConfidence = function() {
    return self.confidence;
  }

  /**
   * @param {Integer} confidence
   **/
  self.setConfidence = function (confidence) {
    self.confidence = confidence;
  }
  
  /**
   * @return {Boolean}
   **/
  self.getIsSpam = function() {
    return self.isSpam;
  }

  /**
   * @param {Boolean} isSpam
   **/
  self.setIsSpam = function (isSpam) {
    self.isSpam = isSpam;
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
  module.exports = Reputation;
}
