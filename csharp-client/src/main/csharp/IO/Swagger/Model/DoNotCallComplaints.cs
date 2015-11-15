using System;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model
{

    /// <summary>
    /// Free service (with registration) which serves Government Do Not Call data via API 
    ///           Search via phone number returns available data, reported name, total complaints
    /// </summary>
    [DataContract]
    public class DoNotCallComplaints
    {

        /// <summary>
        /// Reported Caller Name
        /// </summary>
        /// <value>Reported Caller Name</value>
        [DataMember(Name = "ReportedCallerName", EmitDefaultValue = false)]
        public string ReportedCallerName { get; set; }


        /// <summary>
        /// Gets or Sets TotalNumberOfComplaints
        /// </summary>
        [DataMember(Name = "TotalNumberOfComplaints", EmitDefaultValue = false)]
        public int? TotalNumberOfComplaints { get; set; }


        /// <summary>
        /// Gets or Sets ComplaintsByGovEntity
        /// </summary>
        [DataMember(Name = "ComplaintsByGovEntity", EmitDefaultValue = false)]
        public Dictionary<string, int?> ComplaintsByGovEntity { get; set; }


        /// <summary>
        /// Gets or Sets LastCompaintDate
        /// </summary>
        [DataMember(Name = "LastCompaintDate", EmitDefaultValue = false)]
        public DateTime? LastCompaintDate { get; set; }


        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "Tags", EmitDefaultValue = false)]
        public List<string> Tags { get; set; }



        /// <summary>
        /// Get the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DoNotCallComplaints {\n");

            sb.Append("  ReportedCallerName: ").Append(ReportedCallerName).Append("\n");

            sb.Append("  TotalNumberOfComplaints: ").Append(TotalNumberOfComplaints).Append("\n");

            sb.Append("  ComplaintsByGovEntity: ").Append(ComplaintsByGovEntity).Append("\n");

            sb.Append("  LastCompaintDate: ").Append(LastCompaintDate).Append("\n");

            sb.Append("  Tags: ").Append(Tags).Append("\n");

            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Get the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

    }
}
