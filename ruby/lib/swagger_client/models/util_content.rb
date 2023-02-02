=begin
#Estuary API

#This is the API for the Estuary application.

OpenAPI spec version: 0.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.40
=end

require 'date'

module SwaggerClient
  class UtilContent
    attr_accessor :active

    attr_accessor :aggregate

    # TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
    attr_accessor :aggregated_in

    attr_accessor :cid

    attr_accessor :created_at

    # If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
    attr_accessor :dag_split

    attr_accessor :deal_status

    attr_accessor :description

    attr_accessor :failed

    attr_accessor :id

    attr_accessor :location

    attr_accessor :name

    attr_accessor :offloaded

    attr_accessor :origins

    attr_accessor :pin_meta

    attr_accessor :pinning

    attr_accessor :pinning_status

    attr_accessor :replace

    attr_accessor :replication

    attr_accessor :size

    attr_accessor :split_from

    attr_accessor :type

    attr_accessor :updated_at

    attr_accessor :user_id

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'active' => :'active',
        :'aggregate' => :'aggregate',
        :'aggregated_in' => :'aggregatedIn',
        :'cid' => :'cid',
        :'created_at' => :'createdAt',
        :'dag_split' => :'dagSplit',
        :'deal_status' => :'dealStatus',
        :'description' => :'description',
        :'failed' => :'failed',
        :'id' => :'id',
        :'location' => :'location',
        :'name' => :'name',
        :'offloaded' => :'offloaded',
        :'origins' => :'origins',
        :'pin_meta' => :'pinMeta',
        :'pinning' => :'pinning',
        :'pinning_status' => :'pinningStatus',
        :'replace' => :'replace',
        :'replication' => :'replication',
        :'size' => :'size',
        :'split_from' => :'splitFrom',
        :'type' => :'type',
        :'updated_at' => :'updatedAt',
        :'user_id' => :'userId'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'active' => :'Object',
        :'aggregate' => :'Object',
        :'aggregated_in' => :'Object',
        :'cid' => :'Object',
        :'created_at' => :'Object',
        :'dag_split' => :'Object',
        :'deal_status' => :'Object',
        :'description' => :'Object',
        :'failed' => :'Object',
        :'id' => :'Object',
        :'location' => :'Object',
        :'name' => :'Object',
        :'offloaded' => :'Object',
        :'origins' => :'Object',
        :'pin_meta' => :'Object',
        :'pinning' => :'Object',
        :'pinning_status' => :'Object',
        :'replace' => :'Object',
        :'replication' => :'Object',
        :'size' => :'Object',
        :'split_from' => :'Object',
        :'type' => :'Object',
        :'updated_at' => :'Object',
        :'user_id' => :'Object'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end
  
    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerClient::UtilContent` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerClient::UtilContent`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'active')
        self.active = attributes[:'active']
      end

      if attributes.key?(:'aggregate')
        self.aggregate = attributes[:'aggregate']
      end

      if attributes.key?(:'aggregated_in')
        self.aggregated_in = attributes[:'aggregated_in']
      end

      if attributes.key?(:'cid')
        self.cid = attributes[:'cid']
      end

      if attributes.key?(:'created_at')
        self.created_at = attributes[:'created_at']
      end

      if attributes.key?(:'dag_split')
        self.dag_split = attributes[:'dag_split']
      end

      if attributes.key?(:'deal_status')
        self.deal_status = attributes[:'deal_status']
      end

      if attributes.key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.key?(:'failed')
        self.failed = attributes[:'failed']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'location')
        self.location = attributes[:'location']
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'offloaded')
        self.offloaded = attributes[:'offloaded']
      end

      if attributes.key?(:'origins')
        self.origins = attributes[:'origins']
      end

      if attributes.key?(:'pin_meta')
        self.pin_meta = attributes[:'pin_meta']
      end

      if attributes.key?(:'pinning')
        self.pinning = attributes[:'pinning']
      end

      if attributes.key?(:'pinning_status')
        self.pinning_status = attributes[:'pinning_status']
      end

      if attributes.key?(:'replace')
        self.replace = attributes[:'replace']
      end

      if attributes.key?(:'replication')
        self.replication = attributes[:'replication']
      end

      if attributes.key?(:'size')
        self.size = attributes[:'size']
      end

      if attributes.key?(:'split_from')
        self.split_from = attributes[:'split_from']
      end

      if attributes.key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.key?(:'updated_at')
        self.updated_at = attributes[:'updated_at']
      end

      if attributes.key?(:'user_id')
        self.user_id = attributes[:'user_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          active == o.active &&
          aggregate == o.aggregate &&
          aggregated_in == o.aggregated_in &&
          cid == o.cid &&
          created_at == o.created_at &&
          dag_split == o.dag_split &&
          deal_status == o.deal_status &&
          description == o.description &&
          failed == o.failed &&
          id == o.id &&
          location == o.location &&
          name == o.name &&
          offloaded == o.offloaded &&
          origins == o.origins &&
          pin_meta == o.pin_meta &&
          pinning == o.pinning &&
          pinning_status == o.pinning_status &&
          replace == o.replace &&
          replication == o.replication &&
          size == o.size &&
          split_from == o.split_from &&
          type == o.type &&
          updated_at == o.updated_at &&
          user_id == o.user_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [active, aggregate, aggregated_in, cid, created_at, dag_split, deal_status, description, failed, id, location, name, offloaded, origins, pin_meta, pinning, pinning_status, replace, replication, size, split_from, type, updated_at, user_id].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        elsif attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        SwaggerClient.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end  end
end
