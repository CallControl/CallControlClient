package io.swagger.client.api

import io.swagger.client.model.CallControlUser
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class EnterpriseApiApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def enterpriseApiGetBlockList(cached: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[String]]): Future[List[String]] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Enterprise/GetBlockList"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(cached != null) cached.foreach { v => queryParams += "cached" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def enterpriseApiGetUser(phoneNumber: String)(implicit reader: ClientResponseReader[CallControlUser]): Future[CallControlUser] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Enterprise/GetUser/{phoneNumber}")
        replaceAll ("\\{" + "phoneNumber" + "\\}",phoneNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def enterpriseApiShouldBlock(phoneNumber: String,
      userPhoneNumber: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber}")
        replaceAll ("\\{" + "phoneNumber" + "\\}",phoneNumber.toString)
        replaceAll ("\\{" + "userPhoneNumber" + "\\}",userPhoneNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def enterpriseApiUpsertUser(user: CallControlUser)(implicit reader: ClientResponseReader[Object], writer: RequestWriter[CallControlUser]): Future[Object] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Enterprise/UpsertUser"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
