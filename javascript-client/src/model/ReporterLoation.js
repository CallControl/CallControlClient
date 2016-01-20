// require files in Node.js environment

if (typeof module === 'object' && module.exports) {
  
}




//export module
if ( typeof define === "function" && define.amd ) {
  define('ReporterLoation', ['jquery'],
    function($) {
      return ReporterLoation;
   });
}


var ReporterLoation = function ReporterLoation() { 
  var self = this;
  
  /**
   * datatype: String
   **/
  self.ipAddress = null;
  
  /**
   * datatype: Number
   **/
  self.latitude = null;
  
  /**
   * datatype: Number
   **/
  self.longitude = null;
  
  
  self.constructFromObject = function(data) {
    if (!data) {
      return;
    }
    
    self.ipAddress = data.IpAddress;
    
    self.latitude = data.Latitude;
    
    self.longitude = data.Longitude;
    
  }

  
  /**
   * @return {String}
   **/
  self.getIpAddress = function() {
    return self.ipAddress;
  }

  /**
   * @param {String} ipAddress
   **/
  self.setIpAddress = function (ipAddress) {
    self.ipAddress = ipAddress;
  }
  
  /**
   * @return {Number}
   **/
  self.getLatitude = function() {
    return self.latitude;
  }

  /**
   * @param {Number} latitude
   **/
  self.setLatitude = function (latitude) {
    self.latitude = latitude;
  }
  
  /**
   * @return {Number}
   **/
  self.getLongitude = function() {
    return self.longitude;
  }

  /**
   * @param {Number} longitude
   **/
  self.setLongitude = function (longitude) {
    self.longitude = longitude;
  }
  

  self.toJson = function () {
    return JSON.stringify(self);
  }
}

if (typeof module === 'object' && module.exports) {
  module.exports = ReporterLoation;
}
