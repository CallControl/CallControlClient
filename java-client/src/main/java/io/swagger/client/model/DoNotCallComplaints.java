package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import java.util.Map;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Free service (with registration) which serves Government Do Not Call data via API \n            Search via phone number returns available data, reported name, total complaints
 **/
@ApiModel(description = "Free service (with registration) which serves Government Do Not Call data via API \n            Search via phone number returns available data, reported name, total complaints")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-14T23:02:22.377Z")
public class DoNotCallComplaints   {
  
  private String reportedCallerName = null;
  private Integer totalNumberOfComplaints = null;
  private Map<String, Integer> complaintsByGovEntity = new HashMap<String, Integer>();
  private Date lastCompaintDate = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   * Reported Caller Name
   **/
  @ApiModelProperty(value = "Reported Caller Name")
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
  @JsonProperty("TotalNumberOfComplaints")
  public Integer getTotalNumberOfComplaints() {
    return totalNumberOfComplaints;
  }
  public void setTotalNumberOfComplaints(Integer totalNumberOfComplaints) {
    this.totalNumberOfComplaints = totalNumberOfComplaints;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ComplaintsByGovEntity")
  public Map<String, Integer> getComplaintsByGovEntity() {
    return complaintsByGovEntity;
  }
  public void setComplaintsByGovEntity(Map<String, Integer> complaintsByGovEntity) {
    this.complaintsByGovEntity = complaintsByGovEntity;
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
    sb.append("class DoNotCallComplaints {\n");
    
    sb.append("    reportedCallerName: ").append(StringUtil.toIndentedString(reportedCallerName)).append("\n");
    sb.append("    totalNumberOfComplaints: ").append(StringUtil.toIndentedString(totalNumberOfComplaints)).append("\n");
    sb.append("    complaintsByGovEntity: ").append(StringUtil.toIndentedString(complaintsByGovEntity)).append("\n");
    sb.append("    lastCompaintDate: ").append(StringUtil.toIndentedString(lastCompaintDate)).append("\n");
    sb.append("    tags: ").append(StringUtil.toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
