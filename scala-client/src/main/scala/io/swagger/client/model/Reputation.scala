package io.swagger.client.model

import org.joda.time.DateTime



case class Reputation (
  callType: String,
  confidence: Integer,
  isSpam: Boolean,
  lastCompaintDate: DateTime,
  reportedCallerName: String,
  tags: List[String])
  
