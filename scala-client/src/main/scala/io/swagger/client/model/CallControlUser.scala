package io.swagger.client.model




case class CallControlUser (
  phoneNumber: String,
  phoneNumbeRegion: String,
  whiteList: List[String],
  blackList: List[String],
  quietHourList: List[QuietHour],
  useCommunityBlacklist: Boolean,
  breakThroughQhWithMultipleCalls: Boolean,
  whiteListBreaksQh: Boolean,
  blockBehavior: String,
  email: String,
  age: Integer,
  gender: String,
  salutation: String,
  firstName: String,
  middleName: String,
  lastName: String,
  suffix: String)
  
