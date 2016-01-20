// require files in Node.js environment
var $, DoNotCallComplaints;
if (typeof module === 'object' && module.exports) {
  $ = require('jquery');
  DoNotCallComplaints = require('../model/DoNotCallComplaints.js');
}

// export module for AMD
if ( typeof define === "function" && define.amd ) {     
	define(['jquery', 'DoNotCallComplaints'], function($, DoNotCallComplaints) {
        return DoNotCallComplaintsApi;
	 });
}

var DoNotCallComplaintsApi = function DoNotCallComplaintsApi() {
	var self = this;
  
  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
   * This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param {String}  phoneNumber phone number to search
   * @param {function} callback the callback function
   * @return DoNotCallComplaints
   */
  self.doNotCallComplaintsDoNotCallComplaints = function(phoneNumber, callback) {
    var postBody = null;
    var postBinaryBody = null;
    
     // verify the required parameter 'phoneNumber' is set
     if (phoneNumber == null) {
        //throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling doNotCallComplaintsDoNotCallComplaints");
        var errorRequiredMsg = "Missing the required parameter 'phoneNumber' when calling doNotCallComplaintsDoNotCallComplaints";
        throw errorRequiredMsg;
     }
     
    // create path and map variables
    var basePath = 'https://www.callcontrol.com';
    // if basePath ends with a /, remove it as path starts with a leading /
    if (basePath.substring(basePath.length-1, basePath.length)=='/') {
    	basePath = basePath.substring(0, basePath.length-1);
    }
    
    var path = basePath + replaceAll(replaceAll("/api/2015-11-01/DoNotCallComplaints/{phoneNumber}", "\\{format\\}","json")
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
        * @returns DoNotCallComplaints
        */
      
      var myResponse = new DoNotCallComplaints();
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
  module.exports = DoNotCallComplaintsApi;
}
