package io.swagger.client.model

import org.joda.time.DateTime



case class CallReport (
  phoneNumber: String,
  reportedCallerName: String,
  reportedCallerId: String,
  callerType: String,
  comment: String,
  unwantedCall: Boolean,
  callTime: DateTime,
  reporter: String,
  ipAddress: String,
  latitude: Double,
  longitude: Double)
  
