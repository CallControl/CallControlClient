package io.swagger.client.model;

import java.util.*;
import java.util.Map;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Free service (with registration) which serves Government Do Not Call data via API \n            Search via phone number returns available data, reported name, total complaints
 **/
@ApiModel(description = "Free service (with registration) which serves Government Do Not Call data via API \n            Search via phone number returns available data, reported name, total complaints")
public class DoNotCallComplaints  {
  
  @SerializedName("ReportedCallerName")
  private String reportedCallerName = null;
  @SerializedName("TotalNumberOfComplaints")
  private Integer totalNumberOfComplaints = null;
  @SerializedName("ComplaintsByGovEntity")
  private Map<String, Integer> complaintsByGovEntity = null;
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
  public Map<String, Integer> getComplaintsByGovEntity() {
    return complaintsByGovEntity;
  }
  public void setComplaintsByGovEntity(Map<String, Integer> complaintsByGovEntity) {
    this.complaintsByGovEntity = complaintsByGovEntity;
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
    sb.append("class DoNotCallComplaints {\n");
    
    sb.append("  reportedCallerName: ").append(reportedCallerName).append("\n");
    sb.append("  totalNumberOfComplaints: ").append(totalNumberOfComplaints).append("\n");
    sb.append("  complaintsByGovEntity: ").append(complaintsByGovEntity).append("\n");
    sb.append("  lastCompaintDate: ").append(lastCompaintDate).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
