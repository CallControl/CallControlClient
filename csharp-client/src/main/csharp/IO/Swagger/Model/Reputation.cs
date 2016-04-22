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
    public partial class Reputation :  IEquatable<Reputation>
    { 
    
        /// <summary>
        /// Initializes a new instance of the <see cref="Reputation" /> class.
        /// Initializes a new instance of the <see cref="Reputation" />class.
        /// </summary>
        /// <param name="Confidence">Confidence.</param>
        /// <param name="IsSpam">IsSpam.</param>
        /// <param name="LastCompaintDate">LastCompaintDate.</param>
        /// <param name="ReportedCallerName">ReportedCallerName.</param>
        /// <param name="Tags">Tags.</param>

        public Reputation(int? Confidence = null, bool? IsSpam = null, DateTime? LastCompaintDate = null, string ReportedCallerName = null, List<string> Tags = null)
        {
            this.Confidence = Confidence;
            this.IsSpam = IsSpam;
            this.LastCompaintDate = LastCompaintDate;
            this.ReportedCallerName = ReportedCallerName;
            this.Tags = Tags;
            
        }
        
    
        /// <summary>
        /// Gets or Sets CallType
        /// </summary>
        [DataMember(Name="CallType", EmitDefaultValue=false)]
        public string CallType { get; private set; }
    
        /// <summary>
        /// Gets or Sets Confidence
        /// </summary>
        [DataMember(Name="Confidence", EmitDefaultValue=false)]
        public int? Confidence { get; set; }
    
        /// <summary>
        /// Gets or Sets IsSpam
        /// </summary>
        [DataMember(Name="IsSpam", EmitDefaultValue=false)]
        public bool? IsSpam { get; set; }
    
        /// <summary>
        /// Gets or Sets LastCompaintDate
        /// </summary>
        [DataMember(Name="LastCompaintDate", EmitDefaultValue=false)]
        public DateTime? LastCompaintDate { get; set; }
    
        /// <summary>
        /// Gets or Sets ReportedCallerName
        /// </summary>
        [DataMember(Name="ReportedCallerName", EmitDefaultValue=false)]
        public string ReportedCallerName { get; set; }
    
        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name="Tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }
    
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Reputation {\n");
            sb.Append("  CallType: ").Append(CallType).Append("\n");
            sb.Append("  Confidence: ").Append(Confidence).Append("\n");
            sb.Append("  IsSpam: ").Append(IsSpam).Append("\n");
            sb.Append("  LastCompaintDate: ").Append(LastCompaintDate).Append("\n");
            sb.Append("  ReportedCallerName: ").Append(ReportedCallerName).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            
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
            return this.Equals(obj as Reputation);
        }

        /// <summary>
        /// Returns true if Reputation instances are equal
        /// </summary>
        /// <param name="other">Instance of Reputation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Reputation other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.CallType == other.CallType ||
                    this.CallType != null &&
                    this.CallType.Equals(other.CallType)
                ) && 
                (
                    this.Confidence == other.Confidence ||
                    this.Confidence != null &&
                    this.Confidence.Equals(other.Confidence)
                ) && 
                (
                    this.IsSpam == other.IsSpam ||
                    this.IsSpam != null &&
                    this.IsSpam.Equals(other.IsSpam)
                ) && 
                (
                    this.LastCompaintDate == other.LastCompaintDate ||
                    this.LastCompaintDate != null &&
                    this.LastCompaintDate.Equals(other.LastCompaintDate)
                ) && 
                (
                    this.ReportedCallerName == other.ReportedCallerName ||
                    this.ReportedCallerName != null &&
                    this.ReportedCallerName.Equals(other.ReportedCallerName)
                ) && 
                (
                    this.Tags == other.Tags ||
                    this.Tags != null &&
                    this.Tags.SequenceEqual(other.Tags)
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
                
                if (this.CallType != null)
                    hash = hash * 59 + this.CallType.GetHashCode();
                
                if (this.Confidence != null)
                    hash = hash * 59 + this.Confidence.GetHashCode();
                
                if (this.IsSpam != null)
                    hash = hash * 59 + this.IsSpam.GetHashCode();
                
                if (this.LastCompaintDate != null)
                    hash = hash * 59 + this.LastCompaintDate.GetHashCode();
                
                if (this.ReportedCallerName != null)
                    hash = hash * 59 + this.ReportedCallerName.GetHashCode();
                
                if (this.Tags != null)
                    hash = hash * 59 + this.Tags.GetHashCode();
                
                return hash;
            }
        }

    }
}
