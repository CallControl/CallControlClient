package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-14T23:02:22.377Z")
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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reputation {\n");
    
    sb.append("    callType: ").append(StringUtil.toIndentedString(callType)).append("\n");
    sb.append("    confidence: ").append(StringUtil.toIndentedString(confidence)).append("\n");
    sb.append("    isSpam: ").append(StringUtil.toIndentedString(isSpam)).append("\n");
    sb.append("    lastCompaintDate: ").append(StringUtil.toIndentedString(lastCompaintDate)).append("\n");
    sb.append("    reportedCallerName: ").append(StringUtil.toIndentedString(reportedCallerName)).append("\n");
    sb.append("    tags: ").append(StringUtil.toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
