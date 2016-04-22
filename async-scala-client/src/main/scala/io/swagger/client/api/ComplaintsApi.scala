package io.swagger.client.api

import io.swagger.client.model.Complaints
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ComplaintsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def complaintsComplaints(phoneNumber: String)(implicit reader: ClientResponseReader[Complaints]): Future[Complaints] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Complaints/{phoneNumber}")
        replaceAll ("\\{" + "phoneNumber" + "\\}",phoneNumber.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
