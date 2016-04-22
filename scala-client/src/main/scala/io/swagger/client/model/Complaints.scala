package io.swagger.client.model

import org.joda.time.DateTime



case class Complaints (
  /* Reported Caller Name */
  reportedCallerName: String,
  totalNumberOfComplaints: Integer,
  complaintsByEntity: Map[String, Integer],
  lastCompaintDate: DateTime,
  tags: List[String])
  
