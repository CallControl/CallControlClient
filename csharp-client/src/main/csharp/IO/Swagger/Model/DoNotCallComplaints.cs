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
    /// Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
    /// </summary>
    [DataContract]
    public class DoNotCallComplaints :  IEquatable<DoNotCallComplaints>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DoNotCallComplaints" /> class.
        /// </summary>
        public DoNotCallComplaints()
        {
            
        }

        
        /// <summary>
        /// Reported Caller Name
        /// </summary>
        /// <value>Reported Caller Name</value>
        [DataMember(Name="ReportedCallerName", EmitDefaultValue=false)]
        public string ReportedCallerName { get; set; }
  
        
        /// <summary>
        /// Gets or Sets TotalNumberOfComplaints
        /// </summary>
        [DataMember(Name="TotalNumberOfComplaints", EmitDefaultValue=false)]
        public int? TotalNumberOfComplaints { get; set; }
  
        
        /// <summary>
        /// Gets or Sets ComplaintsByEntity
        /// </summary>
        [DataMember(Name="ComplaintsByEntity", EmitDefaultValue=false)]
        public Dictionary<string, int?> ComplaintsByEntity { get; set; }
  
        
        /// <summary>
        /// Gets or Sets LastCompaintDate
        /// </summary>
        [DataMember(Name="LastCompaintDate", EmitDefaultValue=false)]
        public DateTime? LastCompaintDate { get; set; }
  
        
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
            sb.Append("class DoNotCallComplaints {\n");
            sb.Append("  ReportedCallerName: ").Append(ReportedCallerName).Append("\n");
            sb.Append("  TotalNumberOfComplaints: ").Append(TotalNumberOfComplaints).Append("\n");
            sb.Append("  ComplaintsByEntity: ").Append(ComplaintsByEntity).Append("\n");
            sb.Append("  LastCompaintDate: ").Append(LastCompaintDate).Append("\n");
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
            return this.Equals(obj as DoNotCallComplaints);
        }

        /// <summary>
        /// Returns true if DoNotCallComplaints instances are equal
        /// </summary>
        /// <param name="other">Instance of DoNotCallComplaints to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DoNotCallComplaints other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ReportedCallerName == other.ReportedCallerName ||
                    this.ReportedCallerName != null &&
                    this.ReportedCallerName.Equals(other.ReportedCallerName)
                ) && 
                (
                    this.TotalNumberOfComplaints == other.TotalNumberOfComplaints ||
                    this.TotalNumberOfComplaints != null &&
                    this.TotalNumberOfComplaints.Equals(other.TotalNumberOfComplaints)
                ) && 
                (
                    this.ComplaintsByEntity == other.ComplaintsByEntity ||
                    this.ComplaintsByEntity != null &&
                    this.ComplaintsByEntity.SequenceEqual(other.ComplaintsByEntity)
                ) && 
                (
                    this.LastCompaintDate == other.LastCompaintDate ||
                    this.LastCompaintDate != null &&
                    this.LastCompaintDate.Equals(other.LastCompaintDate)
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
                
                if (this.ReportedCallerName != null)
                    hash = hash * 57 + this.ReportedCallerName.GetHashCode();
                
                if (this.TotalNumberOfComplaints != null)
                    hash = hash * 57 + this.TotalNumberOfComplaints.GetHashCode();
                
                if (this.ComplaintsByEntity != null)
                    hash = hash * 57 + this.ComplaintsByEntity.GetHashCode();
                
                if (this.LastCompaintDate != null)
                    hash = hash * 57 + this.LastCompaintDate.GetHashCode();
                
                if (this.Tags != null)
                    hash = hash * 57 + this.Tags.GetHashCode();
                
                return hash;
            }
        }

    }
}
