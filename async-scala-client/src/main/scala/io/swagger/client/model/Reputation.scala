package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Reputation (
  CallType: String,
  Confidence: Integer,
  IsSpam: Boolean,
  LastCompaintDate: DateTime,
  ReportedCallerName: String,
  Tags: List[String]
  
)
