package io.swagger.client.api

import io.swagger.client.model.DoNotCallComplaints
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class DoNotCallComplaintsApi(val defBasePath: String = "https://www.callcontrol.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * &lt;br /&gt;\r\n&lt;b&gt;DoNotCallComplaints&lt;/b&gt;\r\n&lt;br /&gt;Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
   * This is the main funciton to get data out of the call control reporting system&lt;br /&gt;\r\n            Try with api_key &#39;demo&#39; and phone number 12674070100 (spam) 12061231234 (not spam)
   * @param phoneNumber phone number to search
   * @return DoNotCallComplaints
   */
  def doNotCallComplaintsDoNotCallComplaints (phoneNumber: String) : Option[DoNotCallComplaints] = {
    // create path and map variables
    val path = "/api/2015-11-01/DoNotCallComplaints/{phoneNumber}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "phoneNumber" + "\\}",apiInvoker.escape(phoneNumber))

    

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
           Some(ApiInvoker.deserialize(s, "", classOf[DoNotCallComplaints]).asInstanceOf[DoNotCallComplaints])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
