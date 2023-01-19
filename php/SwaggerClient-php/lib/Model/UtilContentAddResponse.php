<?php
/**
 * UtilContentAddResponse
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
 * Swagger Codegen version: 3.0.37
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
 * UtilContentAddResponse Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class UtilContentAddResponse implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'util.ContentAddResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'cid' => 'string',
'estuary_id' => 'int',
'estuary_retrieval_url' => 'string',
'providers' => 'string[]',
'retrieval_url' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'cid' => null,
'estuary_id' => null,
'estuary_retrieval_url' => null,
'providers' => null,
'retrieval_url' => null    ];

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
        'cid' => 'cid',
'estuary_id' => 'estuaryId',
'estuary_retrieval_url' => 'estuary_retrieval_url',
'providers' => 'providers',
'retrieval_url' => 'retrieval_url'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cid' => 'setCid',
'estuary_id' => 'setEstuaryId',
'estuary_retrieval_url' => 'setEstuaryRetrievalUrl',
'providers' => 'setProviders',
'retrieval_url' => 'setRetrievalUrl'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cid' => 'getCid',
'estuary_id' => 'getEstuaryId',
'estuary_retrieval_url' => 'getEstuaryRetrievalUrl',
'providers' => 'getProviders',
'retrieval_url' => 'getRetrievalUrl'    ];

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
        $this->container['cid'] = isset($data['cid']) ? $data['cid'] : null;
        $this->container['estuary_id'] = isset($data['estuary_id']) ? $data['estuary_id'] : null;
        $this->container['estuary_retrieval_url'] = isset($data['estuary_retrieval_url']) ? $data['estuary_retrieval_url'] : null;
        $this->container['providers'] = isset($data['providers']) ? $data['providers'] : null;
        $this->container['retrieval_url'] = isset($data['retrieval_url']) ? $data['retrieval_url'] : null;
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
     * Gets cid
     *
     * @return string
     */
    public function getCid()
    {
        return $this->container['cid'];
    }

    /**
     * Sets cid
     *
     * @param string $cid cid
     *
     * @return $this
     */
    public function setCid($cid)
    {
        $this->container['cid'] = $cid;

        return $this;
    }

    /**
     * Gets estuary_id
     *
     * @return int
     */
    public function getEstuaryId()
    {
        return $this->container['estuary_id'];
    }

    /**
     * Sets estuary_id
     *
     * @param int $estuary_id estuary_id
     *
     * @return $this
     */
    public function setEstuaryId($estuary_id)
    {
        $this->container['estuary_id'] = $estuary_id;

        return $this;
    }

    /**
     * Gets estuary_retrieval_url
     *
     * @return string
     */
    public function getEstuaryRetrievalUrl()
    {
        return $this->container['estuary_retrieval_url'];
    }

    /**
     * Sets estuary_retrieval_url
     *
     * @param string $estuary_retrieval_url estuary_retrieval_url
     *
     * @return $this
     */
    public function setEstuaryRetrievalUrl($estuary_retrieval_url)
    {
        $this->container['estuary_retrieval_url'] = $estuary_retrieval_url;

        return $this;
    }

    /**
     * Gets providers
     *
     * @return string[]
     */
    public function getProviders()
    {
        return $this->container['providers'];
    }

    /**
     * Sets providers
     *
     * @param string[] $providers providers
     *
     * @return $this
     */
    public function setProviders($providers)
    {
        $this->container['providers'] = $providers;

        return $this;
    }

    /**
     * Gets retrieval_url
     *
     * @return string
     */
    public function getRetrievalUrl()
    {
        return $this->container['retrieval_url'];
    }

    /**
     * Sets retrieval_url
     *
     * @param string $retrieval_url retrieval_url
     *
     * @return $this
     */
    public function setRetrievalUrl($retrieval_url)
    {
        $this->container['retrieval_url'] = $retrieval_url;

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
