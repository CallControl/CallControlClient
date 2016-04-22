package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.QuietHour;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T07:24:15.167Z")
public class CallControlUser   {
  
  private String phoneNumber = null;
  private String phoneNumbeRegion = null;
  private List<String> whiteList = new ArrayList<String>();
  private List<String> blackList = new ArrayList<String>();
  private List<QuietHour> quietHourList = new ArrayList<QuietHour>();
  private Boolean useCommunityBlacklist = null;
  private Boolean breakThroughQhWithMultipleCalls = null;
  private Boolean whiteListBreaksQh = null;


  public enum BlockBehaviorEnum {
    ALLOW("allow"),
    VOICEMAIL("voiceMail"),
    BLOCK("block");

    private String value;

    BlockBehaviorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private BlockBehaviorEnum blockBehavior = null;
  private String email = null;
  private Integer age = null;
  private String gender = null;
  private String salutation = null;
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private String suffix = null;

  
  /**
   **/
  public CallControlUser phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PhoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  public CallControlUser phoneNumbeRegion(String phoneNumbeRegion) {
    this.phoneNumbeRegion = phoneNumbeRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PhoneNumbeRegion")
  public String getPhoneNumbeRegion() {
    return phoneNumbeRegion;
  }
  public void setPhoneNumbeRegion(String phoneNumbeRegion) {
    this.phoneNumbeRegion = phoneNumbeRegion;
  }

  
  /**
   **/
  public CallControlUser whiteList(List<String> whiteList) {
    this.whiteList = whiteList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("WhiteList")
  public List<String> getWhiteList() {
    return whiteList;
  }
  public void setWhiteList(List<String> whiteList) {
    this.whiteList = whiteList;
  }

  
  /**
   **/
  public CallControlUser blackList(List<String> blackList) {
    this.blackList = blackList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("BlackList")
  public List<String> getBlackList() {
    return blackList;
  }
  public void setBlackList(List<String> blackList) {
    this.blackList = blackList;
  }

  
  /**
   **/
  public CallControlUser quietHourList(List<QuietHour> quietHourList) {
    this.quietHourList = quietHourList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("QuietHourList")
  public List<QuietHour> getQuietHourList() {
    return quietHourList;
  }
  public void setQuietHourList(List<QuietHour> quietHourList) {
    this.quietHourList = quietHourList;
  }

  
  /**
   **/
  public CallControlUser useCommunityBlacklist(Boolean useCommunityBlacklist) {
    this.useCommunityBlacklist = useCommunityBlacklist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("UseCommunityBlacklist")
  public Boolean getUseCommunityBlacklist() {
    return useCommunityBlacklist;
  }
  public void setUseCommunityBlacklist(Boolean useCommunityBlacklist) {
    this.useCommunityBlacklist = useCommunityBlacklist;
  }

  
  /**
   **/
  public CallControlUser breakThroughQhWithMultipleCalls(Boolean breakThroughQhWithMultipleCalls) {
    this.breakThroughQhWithMultipleCalls = breakThroughQhWithMultipleCalls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("BreakThroughQhWithMultipleCalls")
  public Boolean getBreakThroughQhWithMultipleCalls() {
    return breakThroughQhWithMultipleCalls;
  }
  public void setBreakThroughQhWithMultipleCalls(Boolean breakThroughQhWithMultipleCalls) {
    this.breakThroughQhWithMultipleCalls = breakThroughQhWithMultipleCalls;
  }

  
  /**
   **/
  public CallControlUser whiteListBreaksQh(Boolean whiteListBreaksQh) {
    this.whiteListBreaksQh = whiteListBreaksQh;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("WhiteListBreaksQh")
  public Boolean getWhiteListBreaksQh() {
    return whiteListBreaksQh;
  }
  public void setWhiteListBreaksQh(Boolean whiteListBreaksQh) {
    this.whiteListBreaksQh = whiteListBreaksQh;
  }

  
  /**
   **/
  public CallControlUser blockBehavior(BlockBehaviorEnum blockBehavior) {
    this.blockBehavior = blockBehavior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("BlockBehavior")
  public BlockBehaviorEnum getBlockBehavior() {
    return blockBehavior;
  }
  public void setBlockBehavior(BlockBehaviorEnum blockBehavior) {
    this.blockBehavior = blockBehavior;
  }

  
  /**
   **/
  public CallControlUser email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public CallControlUser age(Integer age) {
    this.age = age;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  
  /**
   **/
  public CallControlUser gender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /**
   **/
  public CallControlUser salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Salutation")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  /**
   **/
  public CallControlUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("FirstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  public CallControlUser middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("MiddleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   **/
  public CallControlUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("LastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  public CallControlUser suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallControlUser callControlUser = (CallControlUser) o;
    return Objects.equals(this.phoneNumber, callControlUser.phoneNumber) &&
        Objects.equals(this.phoneNumbeRegion, callControlUser.phoneNumbeRegion) &&
        Objects.equals(this.whiteList, callControlUser.whiteList) &&
        Objects.equals(this.blackList, callControlUser.blackList) &&
        Objects.equals(this.quietHourList, callControlUser.quietHourList) &&
        Objects.equals(this.useCommunityBlacklist, callControlUser.useCommunityBlacklist) &&
        Objects.equals(this.breakThroughQhWithMultipleCalls, callControlUser.breakThroughQhWithMultipleCalls) &&
        Objects.equals(this.whiteListBreaksQh, callControlUser.whiteListBreaksQh) &&
        Objects.equals(this.blockBehavior, callControlUser.blockBehavior) &&
        Objects.equals(this.email, callControlUser.email) &&
        Objects.equals(this.age, callControlUser.age) &&
        Objects.equals(this.gender, callControlUser.gender) &&
        Objects.equals(this.salutation, callControlUser.salutation) &&
        Objects.equals(this.firstName, callControlUser.firstName) &&
        Objects.equals(this.middleName, callControlUser.middleName) &&
        Objects.equals(this.lastName, callControlUser.lastName) &&
        Objects.equals(this.suffix, callControlUser.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneNumbeRegion, whiteList, blackList, quietHourList, useCommunityBlacklist, breakThroughQhWithMultipleCalls, whiteListBreaksQh, blockBehavior, email, age, gender, salutation, firstName, middleName, lastName, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallControlUser {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumbeRegion: ").append(toIndentedString(phoneNumbeRegion)).append("\n");
    sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
    sb.append("    blackList: ").append(toIndentedString(blackList)).append("\n");
    sb.append("    quietHourList: ").append(toIndentedString(quietHourList)).append("\n");
    sb.append("    useCommunityBlacklist: ").append(toIndentedString(useCommunityBlacklist)).append("\n");
    sb.append("    breakThroughQhWithMultipleCalls: ").append(toIndentedString(breakThroughQhWithMultipleCalls)).append("\n");
    sb.append("    whiteListBreaksQh: ").append(toIndentedString(whiteListBreaksQh)).append("\n");
    sb.append("    blockBehavior: ").append(toIndentedString(blockBehavior)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

