package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T07:24:15.167Z")
public class Reputation   {
  
  private String callType = null;
  private Integer confidence = null;
  private Boolean isSpam = null;
  private Date lastCompaintDate = null;
  private String reportedCallerName = null;
  private List<String> tags = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("CallType")
  public String getCallType() {
    return callType;
  }

  
  /**
   **/
  public Reputation confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Confidence")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  
  /**
   **/
  public Reputation isSpam(Boolean isSpam) {
    this.isSpam = isSpam;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("IsSpam")
  public Boolean getIsSpam() {
    return isSpam;
  }
  public void setIsSpam(Boolean isSpam) {
    this.isSpam = isSpam;
  }

  
  /**
   **/
  public Reputation lastCompaintDate(Date lastCompaintDate) {
    this.lastCompaintDate = lastCompaintDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("LastCompaintDate")
  public Date getLastCompaintDate() {
    return lastCompaintDate;
  }
  public void setLastCompaintDate(Date lastCompaintDate) {
    this.lastCompaintDate = lastCompaintDate;
  }

  
  /**
   **/
  public Reputation reportedCallerName(String reportedCallerName) {
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
  public Reputation tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reputation reputation = (Reputation) o;
    return Objects.equals(this.callType, reputation.callType) &&
        Objects.equals(this.confidence, reputation.confidence) &&
        Objects.equals(this.isSpam, reputation.isSpam) &&
        Objects.equals(this.lastCompaintDate, reputation.lastCompaintDate) &&
        Objects.equals(this.reportedCallerName, reputation.reportedCallerName) &&
        Objects.equals(this.tags, reputation.tags);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

