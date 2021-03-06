<?php
/**
 * QuietHour
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
 * QuietHour Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class QuietHour implements ArrayAccess
{
    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'day_of_week_list' => 'string[]',
        'start_hour_local' => 'int',
        'start_min_local' => 'int',
        'duration_min' => 'int',
        'time_zone_name' => 'string'
    );
  
    static function swaggerTypes() {
        return self::$swaggerTypes;
    }

    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'day_of_week_list' => 'DayOfWeekList',
        'start_hour_local' => 'StartHourLocal',
        'start_min_local' => 'StartMinLocal',
        'duration_min' => 'DurationMin',
        'time_zone_name' => 'TimeZoneName'
    );
  
    static function attributeMap() {
        return self::$attributeMap;
    }

    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'day_of_week_list' => 'setDayOfWeekList',
        'start_hour_local' => 'setStartHourLocal',
        'start_min_local' => 'setStartMinLocal',
        'duration_min' => 'setDurationMin',
        'time_zone_name' => 'setTimeZoneName'
    );
  
    static function setters() {
        return self::$setters;
    }

    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'day_of_week_list' => 'getDayOfWeekList',
        'start_hour_local' => 'getStartHourLocal',
        'start_min_local' => 'getStartMinLocal',
        'duration_min' => 'getDurationMin',
        'time_zone_name' => 'getTimeZoneName'
    );
  
    static function getters() {
        return self::$getters;
    }

    
    /**
      * $day_of_week_list 
      * @var string[]
      */
    protected $day_of_week_list;
    
    /**
      * $start_hour_local 
      * @var int
      */
    protected $start_hour_local;
    
    /**
      * $start_min_local 
      * @var int
      */
    protected $start_min_local;
    
    /**
      * $duration_min 
      * @var int
      */
    protected $duration_min;
    
    /**
      * $time_zone_name 
      * @var string
      */
    protected $time_zone_name;
    

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        
        if ($data != null) {
            $this->day_of_week_list = $data["day_of_week_list"];
            $this->start_hour_local = $data["start_hour_local"];
            $this->start_min_local = $data["start_min_local"];
            $this->duration_min = $data["duration_min"];
            $this->time_zone_name = $data["time_zone_name"];
        }
    }
    
    /**
     * Gets day_of_week_list
     * @return string[]
     */
    public function getDayOfWeekList()
    {
        return $this->day_of_week_list;
    }
  
    /**
     * Sets day_of_week_list
     * @param string[] $day_of_week_list 
     * @return $this
     */
    public function setDayOfWeekList($day_of_week_list)
    {
        
        $this->day_of_week_list = $day_of_week_list;
        return $this;
    }
    
    /**
     * Gets start_hour_local
     * @return int
     */
    public function getStartHourLocal()
    {
        return $this->start_hour_local;
    }
  
    /**
     * Sets start_hour_local
     * @param int $start_hour_local 
     * @return $this
     */
    public function setStartHourLocal($start_hour_local)
    {
        
        $this->start_hour_local = $start_hour_local;
        return $this;
    }
    
    /**
     * Gets start_min_local
     * @return int
     */
    public function getStartMinLocal()
    {
        return $this->start_min_local;
    }
  
    /**
     * Sets start_min_local
     * @param int $start_min_local 
     * @return $this
     */
    public function setStartMinLocal($start_min_local)
    {
        
        $this->start_min_local = $start_min_local;
        return $this;
    }
    
    /**
     * Gets duration_min
     * @return int
     */
    public function getDurationMin()
    {
        return $this->duration_min;
    }
  
    /**
     * Sets duration_min
     * @param int $duration_min 
     * @return $this
     */
    public function setDurationMin($duration_min)
    {
        
        $this->duration_min = $duration_min;
        return $this;
    }
    
    /**
     * Gets time_zone_name
     * @return string
     */
    public function getTimeZoneName()
    {
        return $this->time_zone_name;
    }
  
    /**
     * Sets time_zone_name
     * @param string $time_zone_name 
     * @return $this
     */
    public function setTimeZoneName($time_zone_name)
    {
        
        $this->time_zone_name = $time_zone_name;
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
