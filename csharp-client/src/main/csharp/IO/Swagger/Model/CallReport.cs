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
    /// Call Report
    /// PhoneNumber, 
    /// Caller name(optional), 
    /// Call category(optional), 
    /// Comment or tags(free text) (optional), 
    /// Unwanted call  - yes/no(optional),
    /// </summary>
    [DataContract]
    public class CallReport
    {

        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name = "PhoneNumber", EmitDefaultValue = false)]
        public string PhoneNumber { get; set; }


        /// <summary>
        /// Gets or Sets ReportedCallerName
        /// </summary>
        [DataMember(Name = "ReportedCallerName", EmitDefaultValue = false)]
        public string ReportedCallerName { get; set; }


        /// <summary>
        /// Gets or Sets ReportedCallerId
        /// </summary>
        [DataMember(Name = "ReportedCallerId", EmitDefaultValue = false)]
        public string ReportedCallerId { get; set; }


        /// <summary>
        /// Gets or Sets CallerType
        /// </summary>
        [DataMember(Name = "CallerType", EmitDefaultValue = false)]
        public string CallerType { get; set; }


        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name = "Comment", EmitDefaultValue = false)]
        public string Comment { get; set; }


        /// <summary>
        /// Gets or Sets UnwantedCall
        /// </summary>
        [DataMember(Name = "UnwantedCall", EmitDefaultValue = false)]
        public bool? UnwantedCall { get; set; }


        /// <summary>
        /// Gets or Sets CallTime
        /// </summary>
        [DataMember(Name = "CallTime", EmitDefaultValue = false)]
        public DateTime? CallTime { get; set; }



        /// <summary>
        /// Get the string presentation of the object
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
