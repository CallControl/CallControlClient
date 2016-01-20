package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;
import java.util.Map;



/**
 * Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
 **/

@ApiModel(description = "Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-20T17:12:46.004Z")
public class DoNotCallComplaints   {
  
  private String reportedCallerName = null;
  private Integer totalNumberOfComplaints = null;
  private Map<String, Integer> complaintsByEntity = new HashMap<String, Integer>();
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
  @JsonProperty("ComplaintsByEntity")
  public Map<String, Integer> getComplaintsByEntity() {
    return complaintsByEntity;
  }
  public void setComplaintsByEntity(Map<String, Integer> complaintsByEntity) {
    this.complaintsByEntity = complaintsByEntity;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoNotCallComplaints doNotCallComplaints = (DoNotCallComplaints) o;

    return true && Objects.equals(reportedCallerName, doNotCallComplaints.reportedCallerName) &&
        Objects.equals(totalNumberOfComplaints, doNotCallComplaints.totalNumberOfComplaints) &&
        Objects.equals(complaintsByEntity, doNotCallComplaints.complaintsByEntity) &&
        Objects.equals(lastCompaintDate, doNotCallComplaints.lastCompaintDate) &&
        Objects.equals(tags, doNotCallComplaints.tags)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportedCallerName, totalNumberOfComplaints, complaintsByEntity, lastCompaintDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoNotCallComplaints {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

