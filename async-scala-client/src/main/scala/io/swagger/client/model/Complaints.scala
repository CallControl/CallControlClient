package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Complaints (
  ReportedCallerName: String,  // Reported Caller Name
  TotalNumberOfComplaints: Integer,
  ComplaintsByEntity: Map[String, Integer],
  LastCompaintDate: DateTime,
  Tags: List[String]
  
)
