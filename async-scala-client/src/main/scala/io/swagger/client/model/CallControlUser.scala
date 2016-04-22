package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CallControlUser (
  PhoneNumber: String,
  PhoneNumbeRegion: String,
  WhiteList: List[String],
  BlackList: List[String],
  QuietHourList: List[QuietHour],
  UseCommunityBlacklist: Boolean,
  BreakThroughQhWithMultipleCalls: Boolean,
  WhiteListBreaksQh: Boolean,
  BlockBehavior: String,
  Email: String,
  Age: Integer,
  Gender: String,
  Salutation: String,
  FirstName: String,
  MiddleName: String,
  LastName: String,
  Suffix: String
  
)
