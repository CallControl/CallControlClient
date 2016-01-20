// require files in Node.js environment
var $, CallReport, Reputation;
if (typeof module === 'object' && module.exports) {
  $ = require('jquery');
  CallReport = require('../model/CallReport.js');
  Reputation = require('../model/Reputation.js');
}

// export module for AMD
if ( typeof define === "function" && define.amd ) {     
	define(['jquery', 'CallReport', 'Reputation'], function($, CallReport, Reputation) {
        return ReputationApi;
	 });
}

var ReputationApi = function ReputationApi() {
	var self = this;
  
  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
   * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param {CallReport}  callReport [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
   * @param {function} callback the callback function
   * @return void
   */
  self.reputationReport = function(callReport, callback) {
    var postBody = JSON.stringify(callReport);
    var postBinaryBody = null;
    
     // verify the required parameter 'callReport' is set
     if (callReport == null) {
        //throw new ApiException(400, "Missing the required parameter 'callReport' when calling reputationReport");
        var errorRequiredMsg = "Missing the required parameter 'callReport' when calling reputationReport";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'https://www.callcontrol.com';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/api/2015-11-01/Report", "\\{format\\}","json"));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "POST", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      if (callback) {
        callback(response, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API.
   * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param {String}  phoneNumber phone number to search
   * @param {function} callback the callback function
   * @return Reputation
   */
  self.reputationReputation = function(phoneNumber, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'phoneNumber' is set
     if (phoneNumber == null) {
        //throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling reputationReputation");
        var errorRequiredMsg = "Missing the required parameter 'phoneNumber' when calling reputationReputation";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'https://www.callcontrol.com';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/api/2015-11-01/Reputation/{phoneNumber}", "\\{format\\}","json")
, "\\{" + "phoneNumber" + "\\}", encodeURIComponent(phoneNumber.toString()));

    var queryParams = {};
    var headerParams =  {};
    var formParams =  {};

    
    
    

    path += createQueryString(queryParams);

    var options = {type: "GET", async: true, contentType: "application/json", dataType: "json", data: postBody};
    var request = $.ajax(path, options);

    request.fail(function(jqXHR, textStatus, errorThrown){
      if (callback) {
        var error = errorThrown || textStatus || jqXHR.statusText || 'error';
        callback(null, textStatus, jqXHR, error);
      }
    });
		
    request.done(function(response, textStatus, jqXHR){
      
      /**
        * @returns Reputation
        */
      
      var myResponse = new Reputation();
      myResponse.constructFromObject(response);
      if (callback) {
        callback(myResponse, textStatus, jqXHR);
      }
      
    });
 
    return request;
  }
  
  

 	function replaceAll (haystack, needle, replace) {
		var result= haystack;
		if (needle !=null && replace!=null) {
			result= haystack.replace(new RegExp(needle, 'g'), replace);
		}
		return result;
	}

 	function createQueryString (queryParams) {
		var queryString ='';
		var i = 0;
		for (var queryParamName in queryParams) {
			if (i==0) {
				queryString += '?' ;
			} else {
				queryString += '&' ;
			}
			
			queryString +=  queryParamName + '=' + encodeURIComponent(queryParams[queryParamName]);
			i++;
		}
		
		return queryString;
	}
}

// export module for Node.js
if (typeof module === 'object' && module.exports) {
  module.exports = ReputationApi;
}
