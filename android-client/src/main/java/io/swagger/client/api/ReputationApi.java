package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.CallReport;
import io.swagger.client.model.Reputation;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ReputationApi {
  String basePath = "https://www.callcontrol.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;Report:&lt;/b&gt; report spam calls received to better tune our algorithms based upon spam calls you receive
   * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param callReport [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
   * @return void
   */
  public void  reputationReport (CallReport callReport) throws ApiException {
    Object postBody = callReport;
    
    // verify the required parameter 'callReport' is set
    if (callReport == null) {
       throw new ApiException(400, "Missing the required parameter 'callReport' when calling reputationReport");
    }
    

    // create path and map variables
    String path = "/api/2015-11-01/Report".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;Reputation&lt;/b&gt;\r\n&lt;br /&gt;\r\n            Premium service which returns a reputation informaiton of a phone number via API.
   * This returns information required to perform basic call blocking behaviors&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param phoneNumber phone number to search
   * @return Reputation
   */
  public Reputation  reputationReputation (String phoneNumber) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling reputationReputation");
    }
    

    // create path and map variables
    String path = "/api/2015-11-01/Reputation/{phoneNumber}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "phoneNumber" + "\\}", apiInvoker.escapeString(phoneNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Reputation) ApiInvoker.deserialize(response, "", Reputation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
