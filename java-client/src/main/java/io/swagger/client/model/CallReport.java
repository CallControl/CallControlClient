package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Call Report\n            PhoneNumber, \n            Caller name(optional), \n            Call category(optional), \n            Comment or tags(free text) (optional), \n            Unwanted call  - yes/no(optional),
 **/
@ApiModel(description = "Call Report\n            PhoneNumber, \n            Caller name(optional), \n            Call category(optional), \n            Comment or tags(free text) (optional), \n            Unwanted call  - yes/no(optional),")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-14T23:02:22.377Z")
public class CallReport   {
  
  private String phoneNumber = null;
  private String reportedCallerName = null;
  private String reportedCallerId = null;

public enum CallerTypeEnum {
  UNKNOWN("Unknown"),
  TELEMARKETING("Telemarketing"),
  COLLECTION_AGENCY("Collection_Agency"),
  POLITICAL("Political"),
  SURVEYOR("Surveyor"),
  PRANK_CALL("Prank_Call"),
  FUND_RAISER("Fund_Raiser"),
  OTHER_COMMERCIAL("Other_Commercial"),
  SCAM("Scam"),
  PAY_PHONE("Pay_Phone"),
  BUSINESS("Business"),
  REMINDER_NOTIFICATION_CALL("Reminder_Notification_Call"),
  JUNK_FAX("Junk_Fax"),
  FAX_MACHINE("Fax_Machine"),
  SPAM_TEXT("Spam_Text"),
  ROBOCALL("RoboCall"),
  NOTSPAM("NotSpam"),
  CALLBACK("Callback");

  private String value;

  CallerTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private CallerTypeEnum callerType = null;
  private String comment = null;
  private Boolean unwantedCall = null;
  private Date callTime = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("PhoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ReportedCallerName")
  public String getReportedCallerName() {
    return reportedCallerName;
  }
  public void setReportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ReportedCallerId")
  public String getReportedCallerId() {
    return reportedCallerId;
  }
  public void setReportedCallerId(String reportedCallerId) {
    this.reportedCallerId = reportedCallerId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("CallerType")
  public CallerTypeEnum getCallerType() {
    return callerType;
  }
  public void setCallerType(CallerTypeEnum callerType) {
    this.callerType = callerType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("UnwantedCall")
  public Boolean getUnwantedCall() {
    return unwantedCall;
  }
  public void setUnwantedCall(Boolean unwantedCall) {
    this.unwantedCall = unwantedCall;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("CallTime")
  public Date getCallTime() {
    return callTime;
  }
  public void setCallTime(Date callTime) {
    this.callTime = callTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallReport {\n");
    
    sb.append("    phoneNumber: ").append(StringUtil.toIndentedString(phoneNumber)).append("\n");
    sb.append("    reportedCallerName: ").append(StringUtil.toIndentedString(reportedCallerName)).append("\n");
    sb.append("    reportedCallerId: ").append(StringUtil.toIndentedString(reportedCallerId)).append("\n");
    sb.append("    callerType: ").append(StringUtil.toIndentedString(callerType)).append("\n");
    sb.append("    comment: ").append(StringUtil.toIndentedString(comment)).append("\n");
    sb.append("    unwantedCall: ").append(StringUtil.toIndentedString(unwantedCall)).append("\n");
    sb.append("    callTime: ").append(StringUtil.toIndentedString(callTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
