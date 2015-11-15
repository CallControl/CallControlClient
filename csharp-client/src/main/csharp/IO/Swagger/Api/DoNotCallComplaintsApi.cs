using System;
using System.IO;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDoNotCallComplaintsApi
    {
        
        /// <summary>
        /// 
        /// DoNotCallComplaints
        /// Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
        /// </summary>
        /// <remarks>
        /// This is the main funciton to get data out of the call control reporting system
        /// Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>DoNotCallComplaints</returns>
        DoNotCallComplaints DoNotCallComplaintsDoNotCallComplaints (string phoneNumber);
  
        /// <summary>
        /// 
        /// DoNotCallComplaints
        /// Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
        /// </summary>
        /// <remarks>
        /// This is the main funciton to get data out of the call control reporting system
        /// Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>DoNotCallComplaints</returns>
        System.Threading.Tasks.Task<DoNotCallComplaints> DoNotCallComplaintsDoNotCallComplaintsAsync (string phoneNumber);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DoNotCallComplaintsApi : IDoNotCallComplaintsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DoNotCallComplaintsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DoNotCallComplaintsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DoNotCallComplaintsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DoNotCallComplaintsApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        
        /// <summary>
        /// 
        /// DoNotCallComplaints
        /// Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints. This is the main funciton to get data out of the call control reporting system
        /// Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param> 
        /// <returns>DoNotCallComplaints</returns>            
        public DoNotCallComplaints DoNotCallComplaintsDoNotCallComplaints (string phoneNumber)
        {
            
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null) throw new ApiException(400, "Missing required parameter 'phoneNumber' when calling DoNotCallComplaintsDoNotCallComplaints");
            
    
            var path_ = "/api/2015-11-01/DoNotCallComplaints/{phoneNumber}";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "text/json", "application/xml", "text/xml"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            if (phoneNumber != null) pathParams.Add("phoneNumber", ApiClient.ParameterToString(phoneNumber)); // path parameter
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DoNotCallComplaints) ApiClient.Deserialize(response, typeof(DoNotCallComplaints));
        }
    
        /// <summary>
        /// 
        /// DoNotCallComplaints
        /// Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints. This is the main funciton to get data out of the call control reporting system
        /// Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>DoNotCallComplaints</returns>
        public async System.Threading.Tasks.Task<DoNotCallComplaints> DoNotCallComplaintsDoNotCallComplaintsAsync (string phoneNumber)
        {
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null) throw new ApiException(400, "Missing required parameter 'phoneNumber' when calling DoNotCallComplaintsDoNotCallComplaints");
            
    
            var path_ = "/api/2015-11-01/DoNotCallComplaints/{phoneNumber}";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "text/json", "application/xml", "text/xml"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            if (phoneNumber != null) pathParams.Add("phoneNumber", ApiClient.ParameterToString(phoneNumber)); // path parameter
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.Content, response.Content);

            return (DoNotCallComplaints) ApiClient.Deserialize(response, typeof(DoNotCallComplaints));
        }
        
    }
    
}
