using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace IO.Swagger.Model
{
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class CallControlUser :  IEquatable<CallControlUser>
    { 
    
        /// <summary>
        /// Gets or Sets BlockBehavior
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum BlockBehaviorEnum {
            
            [EnumMember(Value = "allow")]
            Allow,
            
            [EnumMember(Value = "voiceMail")]
            Voicemail,
            
            [EnumMember(Value = "block")]
            Block
        }

    
        /// <summary>
        /// Gets or Sets BlockBehavior
        /// </summary>
        [DataMember(Name="BlockBehavior", EmitDefaultValue=false)]
        public BlockBehaviorEnum? BlockBehavior { get; set; }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CallControlUser" /> class.
        /// Initializes a new instance of the <see cref="CallControlUser" />class.
        /// </summary>
        /// <param name="PhoneNumber">PhoneNumber.</param>
        /// <param name="PhoneNumbeRegion">PhoneNumbeRegion.</param>
        /// <param name="WhiteList">WhiteList.</param>
        /// <param name="BlackList">BlackList.</param>
        /// <param name="QuietHourList">QuietHourList.</param>
        /// <param name="UseCommunityBlacklist">UseCommunityBlacklist.</param>
        /// <param name="BreakThroughQhWithMultipleCalls">BreakThroughQhWithMultipleCalls.</param>
        /// <param name="WhiteListBreaksQh">WhiteListBreaksQh.</param>
        /// <param name="BlockBehavior">BlockBehavior.</param>
        /// <param name="Email">Email.</param>
        /// <param name="Age">Age.</param>
        /// <param name="Gender">Gender.</param>
        /// <param name="Salutation">Salutation.</param>
        /// <param name="FirstName">FirstName.</param>
        /// <param name="MiddleName">MiddleName.</param>
        /// <param name="LastName">LastName.</param>
        /// <param name="Suffix">Suffix.</param>

        public CallControlUser(string PhoneNumber = null, string PhoneNumbeRegion = null, List<string> WhiteList = null, List<string> BlackList = null, List<QuietHour> QuietHourList = null, bool? UseCommunityBlacklist = null, bool? BreakThroughQhWithMultipleCalls = null, bool? WhiteListBreaksQh = null, BlockBehaviorEnum? BlockBehavior = null, string Email = null, int? Age = null, string Gender = null, string Salutation = null, string FirstName = null, string MiddleName = null, string LastName = null, string Suffix = null)
        {
            this.PhoneNumber = PhoneNumber;
            this.PhoneNumbeRegion = PhoneNumbeRegion;
            this.WhiteList = WhiteList;
            this.BlackList = BlackList;
            this.QuietHourList = QuietHourList;
            this.UseCommunityBlacklist = UseCommunityBlacklist;
            this.BreakThroughQhWithMultipleCalls = BreakThroughQhWithMultipleCalls;
            this.WhiteListBreaksQh = WhiteListBreaksQh;
            this.BlockBehavior = BlockBehavior;
            this.Email = Email;
            this.Age = Age;
            this.Gender = Gender;
            this.Salutation = Salutation;
            this.FirstName = FirstName;
            this.MiddleName = MiddleName;
            this.LastName = LastName;
            this.Suffix = Suffix;
            
        }
        
    
        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name="PhoneNumber", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }
    
        /// <summary>
        /// Gets or Sets PhoneNumbeRegion
        /// </summary>
        [DataMember(Name="PhoneNumbeRegion", EmitDefaultValue=false)]
        public string PhoneNumbeRegion { get; set; }
    
        /// <summary>
        /// Gets or Sets WhiteList
        /// </summary>
        [DataMember(Name="WhiteList", EmitDefaultValue=false)]
        public List<string> WhiteList { get; set; }
    
        /// <summary>
        /// Gets or Sets BlackList
        /// </summary>
        [DataMember(Name="BlackList", EmitDefaultValue=false)]
        public List<string> BlackList { get; set; }
    
        /// <summary>
        /// Gets or Sets QuietHourList
        /// </summary>
        [DataMember(Name="QuietHourList", EmitDefaultValue=false)]
        public List<QuietHour> QuietHourList { get; set; }
    
        /// <summary>
        /// Gets or Sets UseCommunityBlacklist
        /// </summary>
        [DataMember(Name="UseCommunityBlacklist", EmitDefaultValue=false)]
        public bool? UseCommunityBlacklist { get; set; }
    
        /// <summary>
        /// Gets or Sets BreakThroughQhWithMultipleCalls
        /// </summary>
        [DataMember(Name="BreakThroughQhWithMultipleCalls", EmitDefaultValue=false)]
        public bool? BreakThroughQhWithMultipleCalls { get; set; }
    
        /// <summary>
        /// Gets or Sets WhiteListBreaksQh
        /// </summary>
        [DataMember(Name="WhiteListBreaksQh", EmitDefaultValue=false)]
        public bool? WhiteListBreaksQh { get; set; }
    
        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name="Email", EmitDefaultValue=false)]
        public string Email { get; set; }
    
        /// <summary>
        /// Gets or Sets Age
        /// </summary>
        [DataMember(Name="Age", EmitDefaultValue=false)]
        public int? Age { get; set; }
    
        /// <summary>
        /// Gets or Sets Gender
        /// </summary>
        [DataMember(Name="Gender", EmitDefaultValue=false)]
        public string Gender { get; set; }
    
        /// <summary>
        /// Gets or Sets Salutation
        /// </summary>
        [DataMember(Name="Salutation", EmitDefaultValue=false)]
        public string Salutation { get; set; }
    
        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name="FirstName", EmitDefaultValue=false)]
        public string FirstName { get; set; }
    
        /// <summary>
        /// Gets or Sets MiddleName
        /// </summary>
        [DataMember(Name="MiddleName", EmitDefaultValue=false)]
        public string MiddleName { get; set; }
    
        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name="LastName", EmitDefaultValue=false)]
        public string LastName { get; set; }
    
        /// <summary>
        /// Gets or Sets Suffix
        /// </summary>
        [DataMember(Name="Suffix", EmitDefaultValue=false)]
        public string Suffix { get; set; }
    
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CallControlUser {\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  PhoneNumbeRegion: ").Append(PhoneNumbeRegion).Append("\n");
            sb.Append("  WhiteList: ").Append(WhiteList).Append("\n");
            sb.Append("  BlackList: ").Append(BlackList).Append("\n");
            sb.Append("  QuietHourList: ").Append(QuietHourList).Append("\n");
            sb.Append("  UseCommunityBlacklist: ").Append(UseCommunityBlacklist).Append("\n");
            sb.Append("  BreakThroughQhWithMultipleCalls: ").Append(BreakThroughQhWithMultipleCalls).Append("\n");
            sb.Append("  WhiteListBreaksQh: ").Append(WhiteListBreaksQh).Append("\n");
            sb.Append("  BlockBehavior: ").Append(BlockBehavior).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Age: ").Append(Age).Append("\n");
            sb.Append("  Gender: ").Append(Gender).Append("\n");
            sb.Append("  Salutation: ").Append(Salutation).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  MiddleName: ").Append(MiddleName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Suffix: ").Append(Suffix).Append("\n");
            
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as CallControlUser);
        }

        /// <summary>
        /// Returns true if CallControlUser instances are equal
        /// </summary>
        /// <param name="other">Instance of CallControlUser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CallControlUser other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.PhoneNumber == other.PhoneNumber ||
                    this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(other.PhoneNumber)
                ) && 
                (
                    this.PhoneNumbeRegion == other.PhoneNumbeRegion ||
                    this.PhoneNumbeRegion != null &&
                    this.PhoneNumbeRegion.Equals(other.PhoneNumbeRegion)
                ) && 
                (
                    this.WhiteList == other.WhiteList ||
                    this.WhiteList != null &&
                    this.WhiteList.SequenceEqual(other.WhiteList)
                ) && 
                (
                    this.BlackList == other.BlackList ||
                    this.BlackList != null &&
                    this.BlackList.SequenceEqual(other.BlackList)
                ) && 
                (
                    this.QuietHourList == other.QuietHourList ||
                    this.QuietHourList != null &&
                    this.QuietHourList.SequenceEqual(other.QuietHourList)
                ) && 
                (
                    this.UseCommunityBlacklist == other.UseCommunityBlacklist ||
                    this.UseCommunityBlacklist != null &&
                    this.UseCommunityBlacklist.Equals(other.UseCommunityBlacklist)
                ) && 
                (
                    this.BreakThroughQhWithMultipleCalls == other.BreakThroughQhWithMultipleCalls ||
                    this.BreakThroughQhWithMultipleCalls != null &&
                    this.BreakThroughQhWithMultipleCalls.Equals(other.BreakThroughQhWithMultipleCalls)
                ) && 
                (
                    this.WhiteListBreaksQh == other.WhiteListBreaksQh ||
                    this.WhiteListBreaksQh != null &&
                    this.WhiteListBreaksQh.Equals(other.WhiteListBreaksQh)
                ) && 
                (
                    this.BlockBehavior == other.BlockBehavior ||
                    this.BlockBehavior != null &&
                    this.BlockBehavior.Equals(other.BlockBehavior)
                ) && 
                (
                    this.Email == other.Email ||
                    this.Email != null &&
                    this.Email.Equals(other.Email)
                ) && 
                (
                    this.Age == other.Age ||
                    this.Age != null &&
                    this.Age.Equals(other.Age)
                ) && 
                (
                    this.Gender == other.Gender ||
                    this.Gender != null &&
                    this.Gender.Equals(other.Gender)
                ) && 
                (
                    this.Salutation == other.Salutation ||
                    this.Salutation != null &&
                    this.Salutation.Equals(other.Salutation)
                ) && 
                (
                    this.FirstName == other.FirstName ||
                    this.FirstName != null &&
                    this.FirstName.Equals(other.FirstName)
                ) && 
                (
                    this.MiddleName == other.MiddleName ||
                    this.MiddleName != null &&
                    this.MiddleName.Equals(other.MiddleName)
                ) && 
                (
                    this.LastName == other.LastName ||
                    this.LastName != null &&
                    this.LastName.Equals(other.LastName)
                ) && 
                (
                    this.Suffix == other.Suffix ||
                    this.Suffix != null &&
                    this.Suffix.Equals(other.Suffix)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                
                if (this.PhoneNumber != null)
                    hash = hash * 59 + this.PhoneNumber.GetHashCode();
                
                if (this.PhoneNumbeRegion != null)
                    hash = hash * 59 + this.PhoneNumbeRegion.GetHashCode();
                
                if (this.WhiteList != null)
                    hash = hash * 59 + this.WhiteList.GetHashCode();
                
                if (this.BlackList != null)
                    hash = hash * 59 + this.BlackList.GetHashCode();
                
                if (this.QuietHourList != null)
                    hash = hash * 59 + this.QuietHourList.GetHashCode();
                
                if (this.UseCommunityBlacklist != null)
                    hash = hash * 59 + this.UseCommunityBlacklist.GetHashCode();
                
                if (this.BreakThroughQhWithMultipleCalls != null)
                    hash = hash * 59 + this.BreakThroughQhWithMultipleCalls.GetHashCode();
                
                if (this.WhiteListBreaksQh != null)
                    hash = hash * 59 + this.WhiteListBreaksQh.GetHashCode();
                
                if (this.BlockBehavior != null)
                    hash = hash * 59 + this.BlockBehavior.GetHashCode();
                
                if (this.Email != null)
                    hash = hash * 59 + this.Email.GetHashCode();
                
                if (this.Age != null)
                    hash = hash * 59 + this.Age.GetHashCode();
                
                if (this.Gender != null)
                    hash = hash * 59 + this.Gender.GetHashCode();
                
                if (this.Salutation != null)
                    hash = hash * 59 + this.Salutation.GetHashCode();
                
                if (this.FirstName != null)
                    hash = hash * 59 + this.FirstName.GetHashCode();
                
                if (this.MiddleName != null)
                    hash = hash * 59 + this.MiddleName.GetHashCode();
                
                if (this.LastName != null)
                    hash = hash * 59 + this.LastName.GetHashCode();
                
                if (this.Suffix != null)
                    hash = hash * 59 + this.Suffix.GetHashCode();
                
                return hash;
            }
        }

    }
}
