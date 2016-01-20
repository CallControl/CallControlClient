package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ReporterLoation;
import java.util.Date;



/**
 * Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
 **/

@ApiModel(description = "Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-20T17:12:46.004Z")
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
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CallerTypeEnum callerType = null;
  private String comment = null;
  private Boolean unwantedCall = null;
  private Date callTime = null;
  private String reporter = null;
  private ReporterLoation reporterLoation = null;

  
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Reporter")
  public String getReporter() {
    return reporter;
  }
  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ReporterLoation")
  public ReporterLoation getReporterLoation() {
    return reporterLoation;
  }
  public void setReporterLoation(ReporterLoation reporterLoation) {
    this.reporterLoation = reporterLoation;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallReport callReport = (CallReport) o;

    return true && Objects.equals(phoneNumber, callReport.phoneNumber) &&
        Objects.equals(reportedCallerName, callReport.reportedCallerName) &&
        Objects.equals(reportedCallerId, callReport.reportedCallerId) &&
        Objects.equals(callerType, callReport.callerType) &&
        Objects.equals(comment, callReport.comment) &&
        Objects.equals(unwantedCall, callReport.unwantedCall) &&
        Objects.equals(callTime, callReport.callTime) &&
        Objects.equals(reporter, callReport.reporter) &&
        Objects.equals(reporterLoation, callReport.reporterLoation)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, reportedCallerName, reportedCallerId, callerType, comment, unwantedCall, callTime, reporter, reporterLoation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallReport {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    reportedCallerName: ").append(toIndentedString(reportedCallerName)).append("\n");
    sb.append("    reportedCallerId: ").append(toIndentedString(reportedCallerId)).append("\n");
    sb.append("    callerType: ").append(toIndentedString(callerType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    unwantedCall: ").append(toIndentedString(unwantedCall)).append("\n");
    sb.append("    callTime: ").append(toIndentedString(callTime)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    reporterLoation: ").append(toIndentedString(reporterLoation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

