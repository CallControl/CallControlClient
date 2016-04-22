package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
 **/

@ApiModel(description = "Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T07:24:15.167Z")
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
    VOIP("VOIP"),
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
  private String ipAddress = null;
  private Double latitude = null;
  private Double longitude = null;

  
  /**
   **/
  public CallReport phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PhoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  public CallReport reportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ReportedCallerName")
  public String getReportedCallerName() {
    return reportedCallerName;
  }
  public void setReportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
  }

  
  /**
   **/
  public CallReport reportedCallerId(String reportedCallerId) {
    this.reportedCallerId = reportedCallerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ReportedCallerId")
  public String getReportedCallerId() {
    return reportedCallerId;
  }
  public void setReportedCallerId(String reportedCallerId) {
    this.reportedCallerId = reportedCallerId;
  }

  
  /**
   **/
  public CallReport callerType(CallerTypeEnum callerType) {
    this.callerType = callerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("CallerType")
  public CallerTypeEnum getCallerType() {
    return callerType;
  }
  public void setCallerType(CallerTypeEnum callerType) {
    this.callerType = callerType;
  }

  
  /**
   **/
  public CallReport comment(String comment) {
    this.comment = comment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   **/
  public CallReport unwantedCall(Boolean unwantedCall) {
    this.unwantedCall = unwantedCall;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("UnwantedCall")
  public Boolean getUnwantedCall() {
    return unwantedCall;
  }
  public void setUnwantedCall(Boolean unwantedCall) {
    this.unwantedCall = unwantedCall;
  }

  
  /**
   **/
  public CallReport callTime(Date callTime) {
    this.callTime = callTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("CallTime")
  public Date getCallTime() {
    return callTime;
  }
  public void setCallTime(Date callTime) {
    this.callTime = callTime;
  }

  
  /**
   **/
  public CallReport reporter(String reporter) {
    this.reporter = reporter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Reporter")
  public String getReporter() {
    return reporter;
  }
  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  
  /**
   **/
  public CallReport ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("IpAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   **/
  public CallReport latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  public CallReport longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallReport callReport = (CallReport) o;
    return Objects.equals(this.phoneNumber, callReport.phoneNumber) &&
        Objects.equals(this.reportedCallerName, callReport.reportedCallerName) &&
        Objects.equals(this.reportedCallerId, callReport.reportedCallerId) &&
        Objects.equals(this.callerType, callReport.callerType) &&
        Objects.equals(this.comment, callReport.comment) &&
        Objects.equals(this.unwantedCall, callReport.unwantedCall) &&
        Objects.equals(this.callTime, callReport.callTime) &&
        Objects.equals(this.reporter, callReport.reporter) &&
        Objects.equals(this.ipAddress, callReport.ipAddress) &&
        Objects.equals(this.latitude, callReport.latitude) &&
        Objects.equals(this.longitude, callReport.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, reportedCallerName, reportedCallerId, callerType, comment, unwantedCall, callTime, reporter, ipAddress, latitude, longitude);
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
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

