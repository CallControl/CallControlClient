package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T07:24:15.167Z")
public class QuietHour   {
  


  public enum DayOfWeekListEnum {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    DayOfWeekListEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<DayOfWeekListEnum> dayOfWeekList = new ArrayList<DayOfWeekListEnum>();
  private Integer startHourLocal = null;
  private Integer startMinLocal = null;
  private Integer durationMin = null;
  private String timeZoneName = null;

  
  /**
   **/
  public QuietHour dayOfWeekList(List<DayOfWeekListEnum> dayOfWeekList) {
    this.dayOfWeekList = dayOfWeekList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("DayOfWeekList")
  public List<DayOfWeekListEnum> getDayOfWeekList() {
    return dayOfWeekList;
  }
  public void setDayOfWeekList(List<DayOfWeekListEnum> dayOfWeekList) {
    this.dayOfWeekList = dayOfWeekList;
  }

  
  /**
   **/
  public QuietHour startHourLocal(Integer startHourLocal) {
    this.startHourLocal = startHourLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("StartHourLocal")
  public Integer getStartHourLocal() {
    return startHourLocal;
  }
  public void setStartHourLocal(Integer startHourLocal) {
    this.startHourLocal = startHourLocal;
  }

  
  /**
   **/
  public QuietHour startMinLocal(Integer startMinLocal) {
    this.startMinLocal = startMinLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("StartMinLocal")
  public Integer getStartMinLocal() {
    return startMinLocal;
  }
  public void setStartMinLocal(Integer startMinLocal) {
    this.startMinLocal = startMinLocal;
  }

  
  /**
   **/
  public QuietHour durationMin(Integer durationMin) {
    this.durationMin = durationMin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("DurationMin")
  public Integer getDurationMin() {
    return durationMin;
  }
  public void setDurationMin(Integer durationMin) {
    this.durationMin = durationMin;
  }

  
  /**
   **/
  public QuietHour timeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("TimeZoneName")
  public String getTimeZoneName() {
    return timeZoneName;
  }
  public void setTimeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuietHour quietHour = (QuietHour) o;
    return Objects.equals(this.dayOfWeekList, quietHour.dayOfWeekList) &&
        Objects.equals(this.startHourLocal, quietHour.startHourLocal) &&
        Objects.equals(this.startMinLocal, quietHour.startMinLocal) &&
        Objects.equals(this.durationMin, quietHour.durationMin) &&
        Objects.equals(this.timeZoneName, quietHour.timeZoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeekList, startHourLocal, startMinLocal, durationMin, timeZoneName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuietHour {\n");
    
    sb.append("    dayOfWeekList: ").append(toIndentedString(dayOfWeekList)).append("\n");
    sb.append("    startHourLocal: ").append(toIndentedString(startHourLocal)).append("\n");
    sb.append("    startMinLocal: ").append(toIndentedString(startMinLocal)).append("\n");
    sb.append("    durationMin: ").append(toIndentedString(durationMin)).append("\n");
    sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
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

