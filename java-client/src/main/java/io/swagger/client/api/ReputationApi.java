package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.CallReport;
import io.swagger.client.model.Reputation;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-14T23:02:22.377Z")
public class ReputationApi {
  private ApiClient apiClient;

  public ReputationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReputationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * &lt;br /&gt;\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
   * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param callReport [FromBody] Call Report\n            PhoneNumber, \n            Caller name(optional), \n            Call category(optional), \n            Comment or tags(free text) (optional), \n            Unwanted call  - yes/no(optional),
   * @return void
   */
  public void reputationReport (CallReport callReport) throws ApiException {
    Object postBody = callReport;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'callReport' is set
     if (callReport == null) {
        throw new ApiException(400, "Missing the required parameter 'callReport' when calling reputationReport");
     }
     
    // create path and map variables
    String path = "/api/2015-11-01/Report".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json", "application/xml", "text/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * &lt;br /&gt;\n&lt;b&gt;Reputation&lt;/b&gt;\n&lt;br /&gt;\n            Premium service which returns a reputation informaiton of a phone number via API.
   * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param phoneNumber phone number to search
   * @return Reputation
   */
  public Reputation reputationReputation (String phoneNumber) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'phoneNumber' is set
     if (phoneNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling reputationReputation");
     }
     
    // create path and map variables
    String path = "/api/2015-11-01/Reputation/{phoneNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json", "application/xml", "text/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Reputation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
