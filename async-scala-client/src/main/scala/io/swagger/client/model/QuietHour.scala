package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class QuietHour (
  DayOfWeekList: List[String],
  StartHourLocal: Integer,
  StartMinLocal: Integer,
  DurationMin: Integer,
  TimeZoneName: String
  
)
