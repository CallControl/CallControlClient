package io.swagger.client.api

import io.swagger.client.model.CallControlUser
import io.swagger.client.model.ModelObject
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class EnterpriseApiApi(val defBasePath: String = "https://www.callcontrol.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
   * All \r\n            Try with api_key &#39;demo&#39; for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234
   * @param cached  (optional)
   * @return List[String]
   */
  def enterpriseApiGetBlockList (cached: Boolean) : Option[List[String]] = {
    // create path and map variables
    val path = "/api/2015-11-01/Enterprise/GetBlockList".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(cached) != "null") queryParams += "cached" -> cached.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[String]).asInstanceOf[List[String]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Enterprise  GET: GetUser\r\n            Returns the current information from the user
   * 
   * @param phoneNumber  
   * @return CallControlUser
   */
  def enterpriseApiGetUser (phoneNumber: String) : Option[CallControlUser] = {
    // create path and map variables
    val path = "/api/2015-11-01/Enterprise/GetUser/{phoneNumber}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "phoneNumber" + "\\}",apiInvoker.escape(phoneNumber))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[CallControlUser]).asInstanceOf[CallControlUser])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
   * This returns information required to perform basic call blocking behaviors\r\n            Try with api_key &#39;demo&#39; and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
   * @param phoneNumber phone number to search 
   * @param userPhoneNumber (OPTOPNAL) phone number of user to look up block rules 
   * @return String
   */
  def enterpriseApiShouldBlock (phoneNumber: String, userPhoneNumber: String) : Option[String] = {
    // create path and map variables
    val path = "/api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "phoneNumber" + "\\}",apiInvoker.escape(phoneNumber))

    .replaceAll("\\{" + "userPhoneNumber" + "\\}",apiInvoker.escape(userPhoneNumber))

    

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * 
   * 
   * @param user  
   * @return ModelObject
   */
  def enterpriseApiUpsertUser (user: CallControlUser) : Option[ModelObject] = {
    // create path and map variables
    val path = "/api/2015-11-01/Enterprise/UpsertUser".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = user

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[ModelObject]).asInstanceOf[ModelObject])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
