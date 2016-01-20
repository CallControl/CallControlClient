using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
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
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param>
        /// <returns></returns>
        void ReputationReport (CallReport callReport);
  
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ReputationReportWithHttpInfo (CallReport callReport);

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ReputationReportAsync (CallReport callReport);

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ReputationReportAsyncWithHttpInfo (CallReport callReport);
        
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API.
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Reputation</returns>
        Reputation ReputationReputation (string phoneNumber);
  
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API.
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>ApiResponse of Reputation</returns>
        ApiResponse<Reputation> ReputationReputationWithHttpInfo (string phoneNumber);

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API.
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of Reputation</returns>
        System.Threading.Tasks.Task<Reputation> ReputationReputationAsync (string phoneNumber);

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API.
        /// </summary>
        /// <remarks>
        /// This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of ApiResponse (Reputation)</returns>
        System.Threading.Tasks.Task<ApiResponse<Reputation>> ReputationReputationAsyncWithHttpInfo (string phoneNumber);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ReputationApi : IReputationApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReputationApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ReputationApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ReputationApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ReputationApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default; 
            else
                this.Configuration = configuration;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuraiton.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }
    
        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }
   
        
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param> 
        /// <returns></returns>
        public void ReputationReport (CallReport callReport)
        {
             ReputationReportWithHttpInfo(callReport);
        }

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param> 
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> ReputationReportWithHttpInfo (CallReport callReport)
        {
            
            // verify the required parameter 'callReport' is set
            if (callReport == null) throw new ApiException(400, "Missing required parameter 'callReport' when calling ReputationReport");
            
    
            var path_ = "/api/2015-11-01/Report";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "text/json", "application/xml", "text/xml"
            };
            String http_header_accept = Configuration.ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", Configuration.ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            postBody = Configuration.ApiClient.Serialize(callReport); // http body (model) parameter
            

            
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) Configuration.ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams);

            int statusCode = (int) response.StatusCode;
    
            if (statusCode >= 400)
                throw new ApiException (statusCode, "Error calling ReputationReport: " + response.Content, response.Content);
            else if (statusCode == 0)
                throw new ApiException (statusCode, "Error calling ReputationReport: " + response.ErrorMessage, response.ErrorMessage);
    
            
            return new ApiResponse<Object>(statusCode,
                response.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }
    
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ReputationReportAsync (CallReport callReport)
        {
             await ReputationReportAsyncWithHttpInfo(callReport);

        }

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="callReport">[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> ReputationReportAsyncWithHttpInfo (CallReport callReport)
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
            String http_header_accept = Configuration.ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", Configuration.ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            postBody = Configuration.ApiClient.Serialize(callReport); // http body (model) parameter
            

            

            // make the HTTP request
            IRestResponse response = (IRestResponse) await Configuration.ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams);

            int statusCode = (int) response.StatusCode;
 
            if (statusCode >= 400)
                throw new ApiException (statusCode, "Error calling ReputationReport: " + response.Content, response.Content);
            else if (statusCode == 0)
                throw new ApiException (statusCode, "Error calling ReputationReport: " + response.ErrorMessage, response.ErrorMessage);

            
            return new ApiResponse<Object>(statusCode,
                response.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }
        
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API. This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param> 
        /// <returns>Reputation</returns>
        public Reputation ReputationReputation (string phoneNumber)
        {
             ApiResponse<Reputation> response = ReputationReputationWithHttpInfo(phoneNumber);
             return response.Data;
        }

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API. This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param> 
        /// <returns>ApiResponse of Reputation</returns>
        public ApiResponse< Reputation > ReputationReputationWithHttpInfo (string phoneNumber)
        {
            
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null) throw new ApiException(400, "Missing required parameter 'phoneNumber' when calling ReputationReputation");
            
    
            var path_ = "/api/2015-11-01/Reputation/{phoneNumber}";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "text/json", "application/xml", "text/xml"
            };
            String http_header_accept = Configuration.ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", Configuration.ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            if (phoneNumber != null) pathParams.Add("phoneNumber", Configuration.ApiClient.ParameterToString(phoneNumber)); // path parameter
            
            
            
            
            

            
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) Configuration.ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams);

            int statusCode = (int) response.StatusCode;
    
            if (statusCode >= 400)
                throw new ApiException (statusCode, "Error calling ReputationReputation: " + response.Content, response.Content);
            else if (statusCode == 0)
                throw new ApiException (statusCode, "Error calling ReputationReputation: " + response.ErrorMessage, response.ErrorMessage);
    
            return new ApiResponse<Reputation>(statusCode,
                response.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Reputation) Configuration.ApiClient.Deserialize(response, typeof(Reputation)));
            
        }
    
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API. This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of Reputation</returns>
        public async System.Threading.Tasks.Task<Reputation> ReputationReputationAsync (string phoneNumber)
        {
             ApiResponse<Reputation> response = await ReputationReputationAsyncWithHttpInfo(phoneNumber);
             return response.Data;

        }

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API. This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of ApiResponse (Reputation)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Reputation>> ReputationReputationAsyncWithHttpInfo (string phoneNumber)
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
            String http_header_accept = Configuration.ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", Configuration.ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            if (phoneNumber != null) pathParams.Add("phoneNumber", Configuration.ApiClient.ParameterToString(phoneNumber)); // path parameter
            
            
            
            
            

            

            // make the HTTP request
            IRestResponse response = (IRestResponse) await Configuration.ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams);

            int statusCode = (int) response.StatusCode;
 
            if (statusCode >= 400)
                throw new ApiException (statusCode, "Error calling ReputationReputation: " + response.Content, response.Content);
            else if (statusCode == 0)
                throw new ApiException (statusCode, "Error calling ReputationReputation: " + response.ErrorMessage, response.ErrorMessage);

            return new ApiResponse<Reputation>(statusCode,
                response.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Reputation) Configuration.ApiClient.Deserialize(response, typeof(Reputation)));
            
        }
        
    }
    
}
