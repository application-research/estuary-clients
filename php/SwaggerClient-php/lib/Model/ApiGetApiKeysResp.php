<?php
/**
 * ApiGetApiKeysResp
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 3.0.39
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * ApiGetApiKeysResp Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class ApiGetApiKeysResp implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'api.getApiKeysResp';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'expiry' => 'string',
'is_session' => 'bool',
'label' => 'string',
'token' => 'string',
'token_hash' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'expiry' => null,
'is_session' => null,
'label' => null,
'token' => null,
'token_hash' => null    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'expiry' => 'expiry',
'is_session' => 'isSession',
'label' => 'label',
'token' => 'token',
'token_hash' => 'tokenHash'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'expiry' => 'setExpiry',
'is_session' => 'setIsSession',
'label' => 'setLabel',
'token' => 'setToken',
'token_hash' => 'setTokenHash'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'expiry' => 'getExpiry',
'is_session' => 'getIsSession',
'label' => 'getLabel',
'token' => 'getToken',
'token_hash' => 'getTokenHash'    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['expiry'] = isset($data['expiry']) ? $data['expiry'] : null;
        $this->container['is_session'] = isset($data['is_session']) ? $data['is_session'] : null;
        $this->container['label'] = isset($data['label']) ? $data['label'] : null;
        $this->container['token'] = isset($data['token']) ? $data['token'] : null;
        $this->container['token_hash'] = isset($data['token_hash']) ? $data['token_hash'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets expiry
     *
     * @return string
     */
    public function getExpiry()
    {
        return $this->container['expiry'];
    }

    /**
     * Sets expiry
     *
     * @param string $expiry expiry
     *
     * @return $this
     */
    public function setExpiry($expiry)
    {
        $this->container['expiry'] = $expiry;

        return $this;
    }

    /**
     * Gets is_session
     *
     * @return bool
     */
    public function getIsSession()
    {
        return $this->container['is_session'];
    }

    /**
     * Sets is_session
     *
     * @param bool $is_session is_session
     *
     * @return $this
     */
    public function setIsSession($is_session)
    {
        $this->container['is_session'] = $is_session;

        return $this;
    }

    /**
     * Gets label
     *
     * @return string
     */
    public function getLabel()
    {
        return $this->container['label'];
    }

    /**
     * Sets label
     *
     * @param string $label label
     *
     * @return $this
     */
    public function setLabel($label)
    {
        $this->container['label'] = $label;

        return $this;
    }

    /**
     * Gets token
     *
     * @return string
     */
    public function getToken()
    {
        return $this->container['token'];
    }

    /**
     * Sets token
     *
     * @param string $token token
     *
     * @return $this
     */
    public function setToken($token)
    {
        $this->container['token'] = $token;

        return $this;
    }

    /**
     * Gets token_hash
     *
     * @return string
     */
    public function getTokenHash()
    {
        return $this->container['token_hash'];
    }

    /**
     * Sets token_hash
     *
     * @param string $token_hash token_hash
     *
     * @return $this
     */
    public function setTokenHash($token_hash)
    {
        $this->container['token_hash'] = $token_hash;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    #[\ReturnTypeWillChange] 
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    #[\ReturnTypeWillChange] 
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    #[\ReturnTypeWillChange] 
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    #[\ReturnTypeWillChange] 
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}
