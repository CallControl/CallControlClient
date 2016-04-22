package io.swagger.client.model;

import io.swagger.client.model.QuietHour;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CallControlUser  {
  
  @SerializedName("PhoneNumber")
  private String phoneNumber = null;
  @SerializedName("PhoneNumbeRegion")
  private String phoneNumbeRegion = null;
  @SerializedName("WhiteList")
  private List<String> whiteList = null;
  @SerializedName("BlackList")
  private List<String> blackList = null;
  @SerializedName("QuietHourList")
  private List<QuietHour> quietHourList = null;
  @SerializedName("UseCommunityBlacklist")
  private Boolean useCommunityBlacklist = null;
  @SerializedName("BreakThroughQhWithMultipleCalls")
  private Boolean breakThroughQhWithMultipleCalls = null;
  @SerializedName("WhiteListBreaksQh")
  private Boolean whiteListBreaksQh = null;
  public enum BlockBehaviorEnum {
     allow,  voiceMail,  block, 
  };
  @SerializedName("BlockBehavior")
  private BlockBehaviorEnum blockBehavior = null;
  @SerializedName("Email")
  private String email = null;
  @SerializedName("Age")
  private Integer age = null;
  @SerializedName("Gender")
  private String gender = null;
  @SerializedName("Salutation")
  private String salutation = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("MiddleName")
  private String middleName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("Suffix")
  private String suffix = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneNumbeRegion() {
    return phoneNumbeRegion;
  }
  public void setPhoneNumbeRegion(String phoneNumbeRegion) {
    this.phoneNumbeRegion = phoneNumbeRegion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getWhiteList() {
    return whiteList;
  }
  public void setWhiteList(List<String> whiteList) {
    this.whiteList = whiteList;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getBlackList() {
    return blackList;
  }
  public void setBlackList(List<String> blackList) {
    this.blackList = blackList;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<QuietHour> getQuietHourList() {
    return quietHourList;
  }
  public void setQuietHourList(List<QuietHour> quietHourList) {
    this.quietHourList = quietHourList;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getUseCommunityBlacklist() {
    return useCommunityBlacklist;
  }
  public void setUseCommunityBlacklist(Boolean useCommunityBlacklist) {
    this.useCommunityBlacklist = useCommunityBlacklist;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBreakThroughQhWithMultipleCalls() {
    return breakThroughQhWithMultipleCalls;
  }
  public void setBreakThroughQhWithMultipleCalls(Boolean breakThroughQhWithMultipleCalls) {
    this.breakThroughQhWithMultipleCalls = breakThroughQhWithMultipleCalls;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getWhiteListBreaksQh() {
    return whiteListBreaksQh;
  }
  public void setWhiteListBreaksQh(Boolean whiteListBreaksQh) {
    this.whiteListBreaksQh = whiteListBreaksQh;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BlockBehaviorEnum getBlockBehavior() {
    return blockBehavior;
  }
  public void setBlockBehavior(BlockBehaviorEnum blockBehavior) {
    this.blockBehavior = blockBehavior;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallControlUser {\n");
    
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  phoneNumbeRegion: ").append(phoneNumbeRegion).append("\n");
    sb.append("  whiteList: ").append(whiteList).append("\n");
    sb.append("  blackList: ").append(blackList).append("\n");
    sb.append("  quietHourList: ").append(quietHourList).append("\n");
    sb.append("  useCommunityBlacklist: ").append(useCommunityBlacklist).append("\n");
    sb.append("  breakThroughQhWithMultipleCalls: ").append(breakThroughQhWithMultipleCalls).append("\n");
    sb.append("  whiteListBreaksQh: ").append(whiteListBreaksQh).append("\n");
    sb.append("  blockBehavior: ").append(blockBehavior).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  age: ").append(age).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  salutation: ").append(salutation).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  middleName: ").append(middleName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  suffix: ").append(suffix).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
