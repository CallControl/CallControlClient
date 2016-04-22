package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
 **/

@ApiModel(description = "Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T07:24:15.167Z")
public class Complaints   {
  
  private String reportedCallerName = null;
  private Integer totalNumberOfComplaints = null;
  private Map<String, Integer> complaintsByEntity = new HashMap<String, Integer>();
  private Date lastCompaintDate = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   * Reported Caller Name
   **/
  public Complaints reportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reported Caller Name")
  @JsonProperty("ReportedCallerName")
  public String getReportedCallerName() {
    return reportedCallerName;
  }
  public void setReportedCallerName(String reportedCallerName) {
    this.reportedCallerName = reportedCallerName;
  }

  
  /**
   **/
  public Complaints totalNumberOfComplaints(Integer totalNumberOfComplaints) {
    this.totalNumberOfComplaints = totalNumberOfComplaints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("TotalNumberOfComplaints")
  public Integer getTotalNumberOfComplaints() {
    return totalNumberOfComplaints;
  }
  public void setTotalNumberOfComplaints(Integer totalNumberOfComplaints) {
    this.totalNumberOfComplaints = totalNumberOfComplaints;
  }

  
  /**
   **/
  public Complaints complaintsByEntity(Map<String, Integer> complaintsByEntity) {
    this.complaintsByEntity = complaintsByEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ComplaintsByEntity")
  public Map<String, Integer> getComplaintsByEntity() {
    return complaintsByEntity;
  }
  public void setComplaintsByEntity(Map<String, Integer> complaintsByEntity) {
    this.complaintsByEntity = complaintsByEntity;
  }

  
  /**
   **/
  public Complaints lastCompaintDate(Date lastCompaintDate) {
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
  public Complaints tags(List<String> tags) {
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
    Complaints complaints = (Complaints) o;
    return Objects.equals(this.reportedCallerName, complaints.reportedCallerName) &&
        Objects.equals(this.totalNumberOfComplaints, complaints.totalNumberOfComplaints) &&
        Objects.equals(this.complaintsByEntity, complaints.complaintsByEntity) &&
        Objects.equals(this.lastCompaintDate, complaints.lastCompaintDate) &&
        Objects.equals(this.tags, complaints.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportedCallerName, totalNumberOfComplaints, complaintsByEntity, lastCompaintDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complaints {\n");
    
    sb.append("    reportedCallerName: ").append(toIndentedString(reportedCallerName)).append("\n");
    sb.append("    totalNumberOfComplaints: ").append(toIndentedString(totalNumberOfComplaints)).append("\n");
    sb.append("    complaintsByEntity: ").append(toIndentedString(complaintsByEntity)).append("\n");
    sb.append("    lastCompaintDate: ").append(toIndentedString(lastCompaintDate)).append("\n");
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

