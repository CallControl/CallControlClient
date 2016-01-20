package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-20T17:12:46.004Z")
public class Reputation   {
  
  private String callType = null;
  private Integer confidence = null;
  private Boolean isSpam = null;
  private Date lastCompaintDate = null;
  private String reportedCallerName = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CallType")
  public String getCallType() {
    return callType;
  }
  public void setCallType(String callType) {
    this.callType = callType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Confidence")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("IsSpam")
  public Boolean getIsSpam() {
    return isSpam;
  }
  public void setIsSpam(Boolean isSpam) {
    this.isSpam = isSpam;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("LastCompaintDate")
  public Date getLastCompaintDate() {
    return lastCompaintDate;
  }
  public void setLastCompaintDate(Date lastCompaintDate) {
    this.lastCompaintDate = lastCompaintDate;
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
  @JsonProperty("Tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reputation reputation = (Reputation) o;

    return true && Objects.equals(callType, reputation.callType) &&
        Objects.equals(confidence, reputation.confidence) &&
        Objects.equals(isSpam, reputation.isSpam) &&
        Objects.equals(lastCompaintDate, reputation.lastCompaintDate) &&
        Objects.equals(reportedCallerName, reputation.reportedCallerName) &&
        Objects.equals(tags, reputation.tags)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(callType, confidence, isSpam, lastCompaintDate, reportedCallerName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reputation {\n");
    
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    isSpam: ").append(toIndentedString(isSpam)).append("\n");
    sb.append("    lastCompaintDate: ").append(toIndentedString(lastCompaintDate)).append("\n");
    sb.append("    reportedCallerName: ").append(toIndentedString(reportedCallerName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

