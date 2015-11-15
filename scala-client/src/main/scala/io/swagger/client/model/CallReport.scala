package io.swagger.client.model

import org.joda.time.DateTime



case class CallReport (
  PhoneNumber: String,
  ReportedCallerName: String,
  ReportedCallerId: String,
  CallerType: String,
  Comment: String,
  UnwantedCall: Boolean,
  CallTime: DateTime)
  
