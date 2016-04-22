package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class QuietHour  {
  
  @SerializedName("DayOfWeekList")
  private List<String> dayOfWeekList = null;
  @SerializedName("StartHourLocal")
  private Integer startHourLocal = null;
  @SerializedName("StartMinLocal")
  private Integer startMinLocal = null;
  @SerializedName("DurationMin")
  private Integer durationMin = null;
  @SerializedName("TimeZoneName")
  private String timeZoneName = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<DayOfWeekListEnum> getDayOfWeekList() {
    return dayOfWeekList;
  }
  public void setDayOfWeekList(List<DayOfWeekListEnum> dayOfWeekList) {
    this.dayOfWeekList = dayOfWeekList;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartHourLocal() {
    return startHourLocal;
  }
  public void setStartHourLocal(Integer startHourLocal) {
    this.startHourLocal = startHourLocal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartMinLocal() {
    return startMinLocal;
  }
  public void setStartMinLocal(Integer startMinLocal) {
    this.startMinLocal = startMinLocal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDurationMin() {
    return durationMin;
  }
  public void setDurationMin(Integer durationMin) {
    this.durationMin = durationMin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeZoneName() {
    return timeZoneName;
  }
  public void setTimeZoneName(String timeZoneName) {
    this.timeZoneName = timeZoneName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuietHour {\n");
    
    sb.append("  dayOfWeekList: ").append(dayOfWeekList).append("\n");
    sb.append("  startHourLocal: ").append(startHourLocal).append("\n");
    sb.append("  startMinLocal: ").append(startMinLocal).append("\n");
    sb.append("  durationMin: ").append(durationMin).append("\n");
    sb.append("  timeZoneName: ").append(timeZoneName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
