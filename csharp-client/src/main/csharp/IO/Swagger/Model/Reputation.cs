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
    /// 
    /// </summary>
    [DataContract]
    public class Reputation
    {

        /// <summary>
        /// Gets or Sets CallType
        /// </summary>
        [DataMember(Name = "CallType", EmitDefaultValue = false)]
        public string CallType { get; set; }


        /// <summary>
        /// Gets or Sets Confidence
        /// </summary>
        [DataMember(Name = "Confidence", EmitDefaultValue = false)]
        public int? Confidence { get; set; }


        /// <summary>
        /// Gets or Sets IsSpam
        /// </summary>
        [DataMember(Name = "IsSpam", EmitDefaultValue = false)]
        public bool? IsSpam { get; set; }


        /// <summary>
        /// Gets or Sets LastCompaintDate
        /// </summary>
        [DataMember(Name = "LastCompaintDate", EmitDefaultValue = false)]
        public DateTime? LastCompaintDate { get; set; }


        /// <summary>
        /// Gets or Sets ReportedCallerName
        /// </summary>
        [DataMember(Name = "ReportedCallerName", EmitDefaultValue = false)]
        public string ReportedCallerName { get; set; }


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
        /// Get the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

    }
}
