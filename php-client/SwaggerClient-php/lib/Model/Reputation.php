<?php
/**
 * Reputation
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
 * Reputation Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Reputation implements ArrayAccess
{
    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'call_type' => 'string',
        'confidence' => 'int',
        'is_spam' => 'bool',
        'last_compaint_date' => '\DateTime',
        'reported_caller_name' => 'string',
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
        'call_type' => 'CallType',
        'confidence' => 'Confidence',
        'is_spam' => 'IsSpam',
        'last_compaint_date' => 'LastCompaintDate',
        'reported_caller_name' => 'ReportedCallerName',
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
        'call_type' => 'setCallType',
        'confidence' => 'setConfidence',
        'is_spam' => 'setIsSpam',
        'last_compaint_date' => 'setLastCompaintDate',
        'reported_caller_name' => 'setReportedCallerName',
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
        'call_type' => 'getCallType',
        'confidence' => 'getConfidence',
        'is_spam' => 'getIsSpam',
        'last_compaint_date' => 'getLastCompaintDate',
        'reported_caller_name' => 'getReportedCallerName',
        'tags' => 'getTags'
    );
  
    static function getters() {
        return self::$getters;
    }

    
    /**
      * $call_type 
      * @var string
      */
    protected $call_type;
    
    /**
      * $confidence 
      * @var int
      */
    protected $confidence;
    
    /**
      * $is_spam 
      * @var bool
      */
    protected $is_spam;
    
    /**
      * $last_compaint_date 
      * @var \DateTime
      */
    protected $last_compaint_date;
    
    /**
      * $reported_caller_name 
      * @var string
      */
    protected $reported_caller_name;
    
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
            $this->call_type = $data["call_type"];
            $this->confidence = $data["confidence"];
            $this->is_spam = $data["is_spam"];
            $this->last_compaint_date = $data["last_compaint_date"];
            $this->reported_caller_name = $data["reported_caller_name"];
            $this->tags = $data["tags"];
        }
    }
    
    /**
     * Gets call_type
     * @return string
     */
    public function getCallType()
    {
        return $this->call_type;
    }
  
    /**
     * Sets call_type
     * @param string $call_type 
     * @return $this
     */
    public function setCallType($call_type)
    {
        
        $this->call_type = $call_type;
        return $this;
    }
    
    /**
     * Gets confidence
     * @return int
     */
    public function getConfidence()
    {
        return $this->confidence;
    }
  
    /**
     * Sets confidence
     * @param int $confidence 
     * @return $this
     */
    public function setConfidence($confidence)
    {
        
        $this->confidence = $confidence;
        return $this;
    }
    
    /**
     * Gets is_spam
     * @return bool
     */
    public function getIsSpam()
    {
        return $this->is_spam;
    }
  
    /**
     * Sets is_spam
     * @param bool $is_spam 
     * @return $this
     */
    public function setIsSpam($is_spam)
    {
        
        $this->is_spam = $is_spam;
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
     * Gets reported_caller_name
     * @return string
     */
    public function getReportedCallerName()
    {
        return $this->reported_caller_name;
    }
  
    /**
     * Sets reported_caller_name
     * @param string $reported_caller_name 
     * @return $this
     */
    public function setReportedCallerName($reported_caller_name)
    {
        
        $this->reported_caller_name = $reported_caller_name;
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