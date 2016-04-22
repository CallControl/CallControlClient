package io.swagger.client.api

import io.swagger.client.model.CallReport
import io.swagger.client.model.Reputation
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ReputationApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def reputationReport(callReport: CallReport)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CallReport]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Report"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(callReport))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def reputationReputation(phoneNumber: String)(implicit reader: ClientResponseReader[Reputation]): Future[Reputation] = {
    // create path and map variables
    val path = (addFmt("/api/2015-11-01/Reputation/{phoneNumber}")
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
