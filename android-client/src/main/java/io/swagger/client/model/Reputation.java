package io.swagger.client.model;

import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Reputation  {
  
  @SerializedName("CallType")
  private String callType = null;
  @SerializedName("Confidence")
  private Integer confidence = null;
  @SerializedName("IsSpam")
  private Boolean isSpam = null;
  @SerializedName("LastCompaintDate")
  private Date lastCompaintDate = null;
  @SerializedName("ReportedCallerName")
  private String reportedCallerName = null;
  @SerializedName("Tags")
  private List<String> tags = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCallType() {
    return callType;
  }
  public void setCallType(String callType) {
    this.callType = callType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsSpam() {
    return isSpam;
  }
  public void setIsSpam(Boolean isSpam) {
    this.isSpam = isSpam;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getLastCompaintDate() {
    return lastCompaintDate;
  }
  public void setLastCompaintDate(Date lastCompaintDate) {
    this.lastCompaintDate = lastCompaintDate;
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
    
    sb.append("  callType: ").append(callType).append("\n");
    sb.append("  confidence: ").append(confidence).append("\n");
    sb.append("  isSpam: ").append(isSpam).append("\n");
    sb.append("  lastCompaintDate: ").append(lastCompaintDate).append("\n");
    sb.append("  reportedCallerName: ").append(reportedCallerName).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
