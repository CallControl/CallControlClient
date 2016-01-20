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
    public interface IDoNotCallComplaintsApi
    {
        
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
        /// </summary>
        /// <remarks>
        /// This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>DoNotCallComplaints</returns>
        DoNotCallComplaints DoNotCallComplaintsDoNotCallComplaints (string phoneNumber);
  
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
        /// </summary>
        /// <remarks>
        /// This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>ApiResponse of DoNotCallComplaints</returns>
        ApiResponse<DoNotCallComplaints> DoNotCallComplaintsDoNotCallComplaintsWithHttpInfo (string phoneNumber);

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
        /// </summary>
        /// <remarks>
        /// This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of DoNotCallComplaints</returns>
        System.Threading.Tasks.Task<DoNotCallComplaints> DoNotCallComplaintsDoNotCallComplaintsAsync (string phoneNumber);

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
        /// </summary>
        /// <remarks>
        /// This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </remarks>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of ApiResponse (DoNotCallComplaints)</returns>
        System.Threading.Tasks.Task<ApiResponse<DoNotCallComplaints>> DoNotCallComplaintsDoNotCallComplaintsAsyncWithHttpInfo (string phoneNumber);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DoNotCallComplaintsApi : IDoNotCallComplaintsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DoNotCallComplaintsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DoNotCallComplaintsApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DoNotCallComplaintsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DoNotCallComplaintsApi(Configuration configuration = null)
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
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints. This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param> 
        /// <returns>DoNotCallComplaints</returns>
        public DoNotCallComplaints DoNotCallComplaintsDoNotCallComplaints (string phoneNumber)
        {
             ApiResponse<DoNotCallComplaints> response = DoNotCallComplaintsDoNotCallComplaintsWithHttpInfo(phoneNumber);
             return response.Data;
        }

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints. This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param> 
        /// <returns>ApiResponse of DoNotCallComplaints</returns>
        public ApiResponse< DoNotCallComplaints > DoNotCallComplaintsDoNotCallComplaintsWithHttpInfo (string phoneNumber)
        {
            
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null) throw new ApiException(400, "Missing required parameter 'phoneNumber' when calling DoNotCallComplaintsDoNotCallComplaints");
            
    
            var path_ = "/api/2015-11-01/DoNotCallComplaints/{phoneNumber}";
    
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
                throw new ApiException (statusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.Content, response.Content);
            else if (statusCode == 0)
                throw new ApiException (statusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.ErrorMessage, response.ErrorMessage);
    
            return new ApiResponse<DoNotCallComplaints>(statusCode,
                response.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (DoNotCallComplaints) Configuration.ApiClient.Deserialize(response, typeof(DoNotCallComplaints)));
            
        }
    
        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints. This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of DoNotCallComplaints</returns>
        public async System.Threading.Tasks.Task<DoNotCallComplaints> DoNotCallComplaintsDoNotCallComplaintsAsync (string phoneNumber)
        {
             ApiResponse<DoNotCallComplaints> response = await DoNotCallComplaintsDoNotCallComplaintsAsyncWithHttpInfo(phoneNumber);
             return response.Data;

        }

        /// <summary>
        /// &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints. This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
        /// </summary>
        /// <param name="phoneNumber">phone number to search</param>
        /// <returns>Task of ApiResponse (DoNotCallComplaints)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DoNotCallComplaints>> DoNotCallComplaintsDoNotCallComplaintsAsyncWithHttpInfo (string phoneNumber)
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
                throw new ApiException (statusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.Content, response.Content);
            else if (statusCode == 0)
                throw new ApiException (statusCode, "Error calling DoNotCallComplaintsDoNotCallComplaints: " + response.ErrorMessage, response.ErrorMessage);

            return new ApiResponse<DoNotCallComplaints>(statusCode,
                response.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (DoNotCallComplaints) Configuration.ApiClient.Deserialize(response, typeof(DoNotCallComplaints)));
            
        }
        
    }
    
}
