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
    public partial class QuietHour :  IEquatable<QuietHour>
    { 
        public enum  {
            
            [EnumMember(Value = "Sunday")]
            Sunday,
            
            [EnumMember(Value = "Monday")]
            Monday,
            
            [EnumMember(Value = "Tuesday")]
            Tuesday,
            
            [EnumMember(Value = "Wednesday")]
            Wednesday,
            
            [EnumMember(Value = "Thursday")]
            Thursday,
            
            [EnumMember(Value = "Friday")]
            Friday,
            
            [EnumMember(Value = "Saturday")]
            Saturday
        }

    
        /// <summary>
        /// Initializes a new instance of the <see cref="QuietHour" /> class.
        /// Initializes a new instance of the <see cref="QuietHour" />class.
        /// </summary>
        /// <param name="DayOfWeekList">DayOfWeekList.</param>
        /// <param name="StartHourLocal">StartHourLocal.</param>
        /// <param name="StartMinLocal">StartMinLocal.</param>
        /// <param name="DurationMin">DurationMin.</param>
        /// <param name="TimeZoneName">TimeZoneName.</param>

        public QuietHour(List<DayOfWeekListEnum?> DayOfWeekList = null, int? StartHourLocal = null, int? StartMinLocal = null, int? DurationMin = null, string TimeZoneName = null)
        {
            this.DayOfWeekList = DayOfWeekList;
            this.StartHourLocal = StartHourLocal;
            this.StartMinLocal = StartMinLocal;
            this.DurationMin = DurationMin;
            this.TimeZoneName = TimeZoneName;
            
        }
        
    
        /// <summary>
        /// Gets or Sets DayOfWeekList
        /// </summary>
        [DataMember(Name="DayOfWeekList", EmitDefaultValue=false)]
        public List<string> DayOfWeekList { get; set; }
    
        /// <summary>
        /// Gets or Sets StartHourLocal
        /// </summary>
        [DataMember(Name="StartHourLocal", EmitDefaultValue=false)]
        public int? StartHourLocal { get; set; }
    
        /// <summary>
        /// Gets or Sets StartMinLocal
        /// </summary>
        [DataMember(Name="StartMinLocal", EmitDefaultValue=false)]
        public int? StartMinLocal { get; set; }
    
        /// <summary>
        /// Gets or Sets DurationMin
        /// </summary>
        [DataMember(Name="DurationMin", EmitDefaultValue=false)]
        public int? DurationMin { get; set; }
    
        /// <summary>
        /// Gets or Sets TimeZoneName
        /// </summary>
        [DataMember(Name="TimeZoneName", EmitDefaultValue=false)]
        public string TimeZoneName { get; set; }
    
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class QuietHour {\n");
            sb.Append("  DayOfWeekList: ").Append(DayOfWeekList).Append("\n");
            sb.Append("  StartHourLocal: ").Append(StartHourLocal).Append("\n");
            sb.Append("  StartMinLocal: ").Append(StartMinLocal).Append("\n");
            sb.Append("  DurationMin: ").Append(DurationMin).Append("\n");
            sb.Append("  TimeZoneName: ").Append(TimeZoneName).Append("\n");
            
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
            return this.Equals(obj as QuietHour);
        }

        /// <summary>
        /// Returns true if QuietHour instances are equal
        /// </summary>
        /// <param name="other">Instance of QuietHour to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(QuietHour other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.DayOfWeekList == other.DayOfWeekList ||
                    this.DayOfWeekList != null &&
                    this.DayOfWeekList.SequenceEqual(other.DayOfWeekList)
                ) && 
                (
                    this.StartHourLocal == other.StartHourLocal ||
                    this.StartHourLocal != null &&
                    this.StartHourLocal.Equals(other.StartHourLocal)
                ) && 
                (
                    this.StartMinLocal == other.StartMinLocal ||
                    this.StartMinLocal != null &&
                    this.StartMinLocal.Equals(other.StartMinLocal)
                ) && 
                (
                    this.DurationMin == other.DurationMin ||
                    this.DurationMin != null &&
                    this.DurationMin.Equals(other.DurationMin)
                ) && 
                (
                    this.TimeZoneName == other.TimeZoneName ||
                    this.TimeZoneName != null &&
                    this.TimeZoneName.Equals(other.TimeZoneName)
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
                
                if (this.DayOfWeekList != null)
                    hash = hash * 59 + this.DayOfWeekList.GetHashCode();
                
                if (this.StartHourLocal != null)
                    hash = hash * 59 + this.StartHourLocal.GetHashCode();
                
                if (this.StartMinLocal != null)
                    hash = hash * 59 + this.StartMinLocal.GetHashCode();
                
                if (this.DurationMin != null)
                    hash = hash * 59 + this.DurationMin.GetHashCode();
                
                if (this.TimeZoneName != null)
                    hash = hash * 59 + this.TimeZoneName.GetHashCode();
                
                return hash;
            }
        }

    }
}
