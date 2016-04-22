package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CallReport (
  PhoneNumber: String,
  ReportedCallerName: String,
  ReportedCallerId: String,
  CallerType: String,
  Comment: String,
  UnwantedCall: Boolean,
  CallTime: DateTime,
  Reporter: String,
  IpAddress: String,
  Latitude: Double,
  Longitude: Double
  
)
