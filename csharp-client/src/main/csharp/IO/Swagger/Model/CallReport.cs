using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model
{

    /// <summary>
    /// Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),
    /// </summary>
    [DataContract]
    public class CallReport :  IEquatable<CallReport>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CallReport" /> class.
        /// </summary>
        public CallReport()
        {
            
        }

        
        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name="PhoneNumber", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ReportedCallerName
        /// </summary>
        [DataMember(Name="ReportedCallerName", EmitDefaultValue=false)]
        public string ReportedCallerName { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ReportedCallerId
        /// </summary>
        [DataMember(Name="ReportedCallerId", EmitDefaultValue=false)]
        public string ReportedCallerId { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CallerType
        /// </summary>
        [DataMember(Name="CallerType", EmitDefaultValue=false)]
        public string CallerType { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name="Comment", EmitDefaultValue=false)]
        public string Comment { get; set; }
  
        
        /// <summary>
        /// Gets or Sets UnwantedCall
        /// </summary>
        [DataMember(Name="UnwantedCall", EmitDefaultValue=false)]
        public bool? UnwantedCall { get; set; }
  
        
        /// <summary>
        /// Gets or Sets CallTime
        /// </summary>
        [DataMember(Name="CallTime", EmitDefaultValue=false)]
        public DateTime? CallTime { get; set; }
  
        
        /// <summary>
        /// Gets or Sets Reporter
        /// </summary>
        [DataMember(Name="Reporter", EmitDefaultValue=false)]
        public string Reporter { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ReporterLoation
        /// </summary>
        [DataMember(Name="ReporterLoation", EmitDefaultValue=false)]
        public ReporterLoation ReporterLoation { get; set; }
  
        
  
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CallReport {\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  ReportedCallerName: ").Append(ReportedCallerName).Append("\n");
            sb.Append("  ReportedCallerId: ").Append(ReportedCallerId).Append("\n");
            sb.Append("  CallerType: ").Append(CallerType).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  UnwantedCall: ").Append(UnwantedCall).Append("\n");
            sb.Append("  CallTime: ").Append(CallTime).Append("\n");
            sb.Append("  Reporter: ").Append(Reporter).Append("\n");
            sb.Append("  ReporterLoation: ").Append(ReporterLoation).Append("\n");
            
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
            return this.Equals(obj as CallReport);
        }

        /// <summary>
        /// Returns true if CallReport instances are equal
        /// </summary>
        /// <param name="other">Instance of CallReport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CallReport other)
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
                    this.ReportedCallerName == other.ReportedCallerName ||
                    this.ReportedCallerName != null &&
                    this.ReportedCallerName.Equals(other.ReportedCallerName)
                ) && 
                (
                    this.ReportedCallerId == other.ReportedCallerId ||
                    this.ReportedCallerId != null &&
                    this.ReportedCallerId.Equals(other.ReportedCallerId)
                ) && 
                (
                    this.CallerType == other.CallerType ||
                    this.CallerType != null &&
                    this.CallerType.Equals(other.CallerType)
                ) && 
                (
                    this.Comment == other.Comment ||
                    this.Comment != null &&
                    this.Comment.Equals(other.Comment)
                ) && 
                (
                    this.UnwantedCall == other.UnwantedCall ||
                    this.UnwantedCall != null &&
                    this.UnwantedCall.Equals(other.UnwantedCall)
                ) && 
                (
                    this.CallTime == other.CallTime ||
                    this.CallTime != null &&
                    this.CallTime.Equals(other.CallTime)
                ) && 
                (
                    this.Reporter == other.Reporter ||
                    this.Reporter != null &&
                    this.Reporter.Equals(other.Reporter)
                ) && 
                (
                    this.ReporterLoation == other.ReporterLoation ||
                    this.ReporterLoation != null &&
                    this.ReporterLoation.Equals(other.ReporterLoation)
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
                    hash = hash * 57 + this.PhoneNumber.GetHashCode();
                
                if (this.ReportedCallerName != null)
                    hash = hash * 57 + this.ReportedCallerName.GetHashCode();
                
                if (this.ReportedCallerId != null)
                    hash = hash * 57 + this.ReportedCallerId.GetHashCode();
                
                if (this.CallerType != null)
                    hash = hash * 57 + this.CallerType.GetHashCode();
                
                if (this.Comment != null)
                    hash = hash * 57 + this.Comment.GetHashCode();
                
                if (this.UnwantedCall != null)
                    hash = hash * 57 + this.UnwantedCall.GetHashCode();
                
                if (this.CallTime != null)
                    hash = hash * 57 + this.CallTime.GetHashCode();
                
                if (this.Reporter != null)
                    hash = hash * 57 + this.Reporter.GetHashCode();
                
                if (this.ReporterLoation != null)
                    hash = hash * 57 + this.ReporterLoation.GetHashCode();
                
                return hash;
            }
        }

    }
}
