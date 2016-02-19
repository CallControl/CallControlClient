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

  
  

  
  var Reputation = function Reputation() { 
    var self = this;
    
    /**
     * datatype: String
     **/
    self['CallType'] = null;
    
    /**
     * datatype: Integer
     **/
    self['Confidence'] = null;
    
    /**
     * datatype: Boolean
     **/
    self['IsSpam'] = null;
    
    /**
     * datatype: Date
     **/
    self['LastCompaintDate'] = null;
    
    /**
     * datatype: String
     **/
    self['ReportedCallerName'] = null;
    
    /**
     * datatype: [String]
     **/
    self['Tags'] = [];
    

    self.constructFromObject = function(data) {
      if (!data) {
        return this;
      }
      
      self['CallType'] = ApiClient.convertToType(data['CallType'], 'String');
      
      self['Confidence'] = ApiClient.convertToType(data['Confidence'], 'Integer');
      
      self['IsSpam'] = ApiClient.convertToType(data['IsSpam'], 'Boolean');
      
      self['LastCompaintDate'] = ApiClient.convertToType(data['LastCompaintDate'], 'Date');
      
      self['ReportedCallerName'] = ApiClient.convertToType(data['ReportedCallerName'], 'String');
      
      self['Tags'] = ApiClient.convertToType(data['Tags'], ['String']);
      
      return this;
    }

    
    /**
     * @return {String}
     **/
    self.getCallType = function() {
      return self['CallType'];
    }

    /**
     * @param {String} callType
     **/
    self.setCallType = function(callType) {
      self['CallType'] = callType;
    }
    
    /**
     * @return {Integer}
     **/
    self.getConfidence = function() {
      return self['Confidence'];
    }

    /**
     * @param {Integer} confidence
     **/
    self.setConfidence = function(confidence) {
      self['Confidence'] = confidence;
    }
    
    /**
     * @return {Boolean}
     **/
    self.getIsSpam = function() {
      return self['IsSpam'];
    }

    /**
     * @param {Boolean} isSpam
     **/
    self.setIsSpam = function(isSpam) {
      self['IsSpam'] = isSpam;
    }
    
    /**
     * @return {Date}
     **/
    self.getLastCompaintDate = function() {
      return self['LastCompaintDate'];
    }

    /**
     * @param {Date} lastCompaintDate
     **/
    self.setLastCompaintDate = function(lastCompaintDate) {
      self['LastCompaintDate'] = lastCompaintDate;
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
     * @return {[String]}
     **/
    self.getTags = function() {
      return self['Tags'];
    }

    /**
     * @param {[String]} tags
     **/
    self.setTags = function(tags) {
      self['Tags'] = tags;
    }
    

    self.toJson = function() {
      return JSON.stringify(self);
    }
  };

  if (module) {
    module.Reputation = Reputation;
  }

  return Reputation;
  
  
}));
