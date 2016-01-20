package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.DoNotCallComplaints;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-20T17:12:46.004Z")
public class DoNotCallComplaintsApi {
  private ApiClient apiClient;

  public DoNotCallComplaintsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DoNotCallComplaintsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
   * This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param phoneNumber phone number to search
   * @return DoNotCallComplaints
   */
  public DoNotCallComplaints doNotCallComplaintsDoNotCallComplaints(String phoneNumber) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'phoneNumber' is set
     if (phoneNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling doNotCallComplaintsDoNotCallComplaints");
     }
     
    // create path and map variables
    String path = "/api/2015-11-01/DoNotCallComplaints/{phoneNumber}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DoNotCallComplaints> returnType = new GenericType<DoNotCallComplaints>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
