<?php
/**
 * Complaints
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
/**
 * Complaints Class Doc Comment
 *
 * @category    Class
 * @description Free service (with registration) which serves Government Do Not Call data via API \r\n            Search via phone number returns available data, reported name, total complaints
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Complaints implements ArrayAccess
{
    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'reported_caller_name' => 'string',
        'total_number_of_complaints' => 'int',
        'complaints_by_entity' => 'map[string,int]',
        'last_compaint_date' => '\DateTime',
        'tags' => 'string[]'
    );
  
    static function swaggerTypes() {
        return self::$swaggerTypes;
    }

    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'reported_caller_name' => 'ReportedCallerName',
        'total_number_of_complaints' => 'TotalNumberOfComplaints',
        'complaints_by_entity' => 'ComplaintsByEntity',
        'last_compaint_date' => 'LastCompaintDate',
        'tags' => 'Tags'
    );
  
    static function attributeMap() {
        return self::$attributeMap;
    }

    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'reported_caller_name' => 'setReportedCallerName',
        'total_number_of_complaints' => 'setTotalNumberOfComplaints',
        'complaints_by_entity' => 'setComplaintsByEntity',
        'last_compaint_date' => 'setLastCompaintDate',
        'tags' => 'setTags'
    );
  
    static function setters() {
        return self::$setters;
    }

    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'reported_caller_name' => 'getReportedCallerName',
        'total_number_of_complaints' => 'getTotalNumberOfComplaints',
        'complaints_by_entity' => 'getComplaintsByEntity',
        'last_compaint_date' => 'getLastCompaintDate',
        'tags' => 'getTags'
    );
  
    static function getters() {
        return self::$getters;
    }

    
    /**
      * $reported_caller_name Reported Caller Name
      * @var string
      */
    protected $reported_caller_name;
    
    /**
      * $total_number_of_complaints 
      * @var int
      */
    protected $total_number_of_complaints;
    
    /**
      * $complaints_by_entity 
      * @var map[string,int]
      */
    protected $complaints_by_entity;
    
    /**
      * $last_compaint_date 
      * @var \DateTime
      */
    protected $last_compaint_date;
    
    /**
      * $tags 
      * @var string[]
      */
    protected $tags;
    

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        
        if ($data != null) {
            $this->reported_caller_name = $data["reported_caller_name"];
            $this->total_number_of_complaints = $data["total_number_of_complaints"];
            $this->complaints_by_entity = $data["complaints_by_entity"];
            $this->last_compaint_date = $data["last_compaint_date"];
            $this->tags = $data["tags"];
        }
    }
    
    /**
     * Gets reported_caller_name
     * @return string
     */
    public function getReportedCallerName()
    {
        return $this->reported_caller_name;
    }
  
    /**
     * Sets reported_caller_name
     * @param string $reported_caller_name Reported Caller Name
     * @return $this
     */
    public function setReportedCallerName($reported_caller_name)
    {
        
        $this->reported_caller_name = $reported_caller_name;
        return $this;
    }
    
    /**
     * Gets total_number_of_complaints
     * @return int
     */
    public function getTotalNumberOfComplaints()
    {
        return $this->total_number_of_complaints;
    }
  
    /**
     * Sets total_number_of_complaints
     * @param int $total_number_of_complaints 
     * @return $this
     */
    public function setTotalNumberOfComplaints($total_number_of_complaints)
    {
        
        $this->total_number_of_complaints = $total_number_of_complaints;
        return $this;
    }
    
    /**
     * Gets complaints_by_entity
     * @return map[string,int]
     */
    public function getComplaintsByEntity()
    {
        return $this->complaints_by_entity;
    }
  
    /**
     * Sets complaints_by_entity
     * @param map[string,int] $complaints_by_entity 
     * @return $this
     */
    public function setComplaintsByEntity($complaints_by_entity)
    {
        
        $this->complaints_by_entity = $complaints_by_entity;
        return $this;
    }
    
    /**
     * Gets last_compaint_date
     * @return \DateTime
     */
    public function getLastCompaintDate()
    {
        return $this->last_compaint_date;
    }
  
    /**
     * Sets last_compaint_date
     * @param \DateTime $last_compaint_date 
     * @return $this
     */
    public function setLastCompaintDate($last_compaint_date)
    {
        
        $this->last_compaint_date = $last_compaint_date;
        return $this;
    }
    
    /**
     * Gets tags
     * @return string[]
     */
    public function getTags()
    {
        return $this->tags;
    }
  
    /**
     * Sets tags
     * @param string[] $tags 
     * @return $this
     */
    public function setTags($tags)
    {
        
        $this->tags = $tags;
        return $this;
    }
    
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset 
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->$offset);
    }
  
    /**
     * Gets offset.
     * @param  integer $offset Offset 
     * @return mixed 
     */
    public function offsetGet($offset)
    {
        return $this->$offset;
    }
  
    /**
     * Sets value based on offset.
     * @param  integer $offset Offset 
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        $this->$offset = $value;
    }
  
    /**
     * Unsets offset.
     * @param  integer $offset Offset 
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->$offset);
    }
  
    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) {
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        } else {
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
        }
    }
}
