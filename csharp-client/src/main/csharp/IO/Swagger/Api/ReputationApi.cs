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
    public interface IReputationApi
    {
        
        /// <summary>
        /// 
        /// Report report spam calls received to better tune our algorithms based upon spam calls you receive
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors
        ///     Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="callReport">[FromBody] Call Report
        ///   PhoneNumber, 
        ///   Caller name(optional), 
        ///   Call category(optional), 
        ///   Comment or tags(free text) (optional), 
        ///   Unwanted call  - yes/no(optional),</param>
        /// <returns></returns>
        void ReputationReport (CallReport callReport);
  
        /// <summary>
        /// 
        /// Report report spam calls received to better tune our algorithms based upon spam calls you receive
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="callReport">[FromBody] Call Report
        /// PhoneNumber, 
        /// Caller name(optional), 
        /// Call category(optional), 
        /// Comment or tags(free text) (optional), 
        /// Unwanted call  - yes/no(optional),</param>
        /// <returns></returns>
        System.Threading.Tasks.Task ReputationReportAsync (CallReport callReport);
        
        /// <summary>
        /// 
        /// Reputation&lt;/b&gt;
        /// 
        /// Premium service which returns a reputation informaiton of a phone number via API.
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Reputation</returns>
        Reputation ReputationReputation (string phoneNumber);
  
        /// <summary>
        /// 
        /// Reputation&lt;/b&gt;
        /// 
        /// Premium service which returns a reputation informaiton of a phone number via API.
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Reputation</returns>
        System.Threading.Tasks.Task<Reputation> ReputationReputationAsync (string phoneNumber);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ReputationApi : IReputationApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReputationApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ReputationApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ReputationApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ReputationApi(String basePath)
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
        /// Report report spam calls received to better tune our algorithms based upon spam calls you receive This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="callReport">[FromBody] Call Report
        /// PhoneNumber, 
        /// Caller name(optional), 
        /// Call category(optional), 
        /// Comment or tags(free text) (optional), 
        /// Unwanted call  - yes/no(optional),</param> 
        /// <returns></returns>            
        public void ReputationReport (CallReport callReport)
        {
            
            // verify the required parameter 'callReport' is set
            if (callReport == null) throw new ApiException(400, "Missing required parameter 'callReport' when calling ReputationReport");
            
    
            var path_ = "/api/2015-11-01/Report";
    
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
            
            
            
            
            postBody = ApiClient.Serialize(callReport); // http body (model) parameter
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ReputationReport: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ReputationReport: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// 
        /// Report report spam calls received to better tune our algorithms based upon spam calls you receive This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="callReport">[FromBody] Call Report
        /// PhoneNumber, 
        /// Caller name(optional), 
        /// Call category(optional), 
        /// Comment or tags(free text) (optional), 
        /// Unwanted call  - yes/no(optional),</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task ReputationReportAsync (CallReport callReport)
        {
            // verify the required parameter 'callReport' is set
            if (callReport == null) throw new ApiException(400, "Missing required parameter 'callReport' when calling ReputationReport");
            
    
            var path_ = "/api/2015-11-01/Report";
    
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
            
            
            
            
            postBody = ApiClient.Serialize(callReport); // http body (model) parameter
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ReputationReport: " + response.Content, response.Content);

            
            return;
        }
        
        /// <summary>
        /// 
        /// Reputation&lt;/b&gt;
        /// Premium service which returns a reputation informaiton of a phone number via API. This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param> 
        /// <returns>Reputation</returns>            
        public Reputation ReputationReputation (string phoneNumber)
        {
            
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null) throw new ApiException(400, "Missing required parameter 'phoneNumber' when calling ReputationReputation");
            
    
            var path_ = "/api/2015-11-01/Reputation/{phoneNumber}";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ReputationReputation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ReputationReputation: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Reputation) ApiClient.Deserialize(response, typeof(Reputation));
        }
    
        /// <summary>
        /// 
        /// Reputation&lt;/b&gt;
        /// Premium service which returns a reputation informaiton of a phone number via API. This returns information required to perform basic call blocking behaviors
        /// Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Reputation</returns>
        public async System.Threading.Tasks.Task<Reputation> ReputationReputationAsync (string phoneNumber)
        {
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null) throw new ApiException(400, "Missing required parameter 'phoneNumber' when calling ReputationReputation");
            
    
            var path_ = "/api/2015-11-01/Reputation/{phoneNumber}";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ReputationReputation: " + response.Content, response.Content);

            return (Reputation) ApiClient.Deserialize(response, typeof(Reputation));
        }
        
    }
    
}
