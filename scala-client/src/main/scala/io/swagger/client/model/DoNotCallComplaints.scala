package io.swagger.client.model

import org.joda.time.DateTime



case class DoNotCallComplaints (
  /* Reported Caller Name */
  ReportedCallerName: String,
  TotalNumberOfComplaints: Integer,
  ComplaintsByGovEntity: Map[String, Integer],
  LastCompaintDate: DateTime,
  Tags: List[String])
  
