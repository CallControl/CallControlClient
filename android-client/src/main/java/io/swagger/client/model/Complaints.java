package io.swagger.client.model;

import java.util.*;
import java.util.Date;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
 **/
@ApiModel(description = "Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints")
public class Complaints  {
  
  @SerializedName("ReportedCallerName")
  private String reportedCallerName = null;
  @SerializedName("TotalNumberOfComplaints")
  private Integer totalNumberOfComplaints = null;
  @SerializedName("ComplaintsByEntity")
  private Map<String, Integer> complaintsByEntity = null;
  @SerializedName("LastCompaintDate")
  private Date lastCompaintDate = null;
  @SerializedName("Tags")
  private List<String> tags = null;

  
  /**
   * Reported Caller Name
   **/
  @ApiModelProperty(value = "Reported Caller Name")
  public String getReportedCallerName() {
    return reportedCallerName;
  }
  public void setReportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalNumberOfComplaints() {
    return totalNumberOfComplaints;
  }
  public void setTotalNumberOfComplaints(Integer totalNumberOfComplaints) {
    this.totalNumberOfComplaints = totalNumberOfComplaints;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Integer> getComplaintsByEntity() {
    return complaintsByEntity;
  }
  public void setComplaintsByEntity(Map<String, Integer> complaintsByEntity) {
    this.complaintsByEntity = complaintsByEntity;
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
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complaints {\n");
    
    sb.append("  reportedCallerName: ").append(reportedCallerName).append("\n");
    sb.append("  totalNumberOfComplaints: ").append(totalNumberOfComplaints).append("\n");
    sb.append("  complaintsByEntity: ").append(complaintsByEntity).append("\n");
    sb.append("  lastCompaintDate: ").append(lastCompaintDate).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
