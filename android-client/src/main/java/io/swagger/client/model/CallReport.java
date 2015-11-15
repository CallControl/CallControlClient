package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Call Report\n            PhoneNumber, \n            Caller name(optional), \n            Call category(optional), \n            Comment or tags(free text) (optional), \n            Unwanted call  - yes/no(optional),
 **/
@ApiModel(description = "Call Report\n            PhoneNumber, \n            Caller name(optional), \n            Call category(optional), \n            Comment or tags(free text) (optional), \n            Unwanted call  - yes/no(optional),")
public class CallReport  {
  
  @SerializedName("PhoneNumber")
  private String phoneNumber = null;
  @SerializedName("ReportedCallerName")
  private String reportedCallerName = null;
  @SerializedName("ReportedCallerId")
  private String reportedCallerId = null;
  public enum CallerTypeEnum {
     Unknown,  Telemarketing,  Collection_Agency,  Political,  Surveyor,  Prank_Call,  Fund_Raiser,  Other_Commercial,  Scam,  Pay_Phone,  Business,  Reminder_Notification_Call,  Junk_Fax,  Fax_Machine,  Spam_Text,  RoboCall,  NotSpam,  Callback, 
  };
  @SerializedName("CallerType")
  private CallerTypeEnum callerType = null;
  @SerializedName("Comment")
  private String comment = null;
  @SerializedName("UnwantedCall")
  private Boolean unwantedCall = null;
  @SerializedName("CallTime")
  private Date callTime = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReportedCallerName() {
    return reportedCallerName;
  }
  public void setReportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReportedCallerId() {
    return reportedCallerId;
  }
  public void setReportedCallerId(String reportedCallerId) {
    this.reportedCallerId = reportedCallerId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public CallerTypeEnum getCallerType() {
    return callerType;
  }
  public void setCallerType(CallerTypeEnum callerType) {
    this.callerType = callerType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getUnwantedCall() {
    return unwantedCall;
  }
  public void setUnwantedCall(Boolean unwantedCall) {
    this.unwantedCall = unwantedCall;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
    
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  reportedCallerName: ").append(reportedCallerName).append("\n");
    sb.append("  reportedCallerId: ").append(reportedCallerId).append("\n");
    sb.append("  callerType: ").append(callerType).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  unwantedCall: ").append(unwantedCall).append("\n");
    sb.append("  callTime: ").append(callTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
