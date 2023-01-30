# coding: utf-8

"""
    Estuary API

    This is the API for the Estuary application.  # noqa: E501

    OpenAPI spec version: 0.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class PeeringPeeringPeer(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'addrs': 'list[str]',
        'connected': 'bool',
        'id': 'str'
    }

    attribute_map = {
        'addrs': 'Addrs',
        'connected': 'Connected',
        'id': 'ID'
    }

    def __init__(self, addrs=None, connected=None, id=None):  # noqa: E501
        """PeeringPeeringPeer - a model defined in Swagger"""  # noqa: E501
        self._addrs = None
        self._connected = None
        self._id = None
        self.discriminator = None
        if addrs is not None:
            self.addrs = addrs
        if connected is not None:
            self.connected = connected
        if id is not None:
            self.id = id

    @property
    def addrs(self):
        """Gets the addrs of this PeeringPeeringPeer.  # noqa: E501


        :return: The addrs of this PeeringPeeringPeer.  # noqa: E501
        :rtype: list[str]
        """
        return self._addrs

    @addrs.setter
    def addrs(self, addrs):
        """Sets the addrs of this PeeringPeeringPeer.


        :param addrs: The addrs of this PeeringPeeringPeer.  # noqa: E501
        :type: list[str]
        """

        self._addrs = addrs

    @property
    def connected(self):
        """Gets the connected of this PeeringPeeringPeer.  # noqa: E501


        :return: The connected of this PeeringPeeringPeer.  # noqa: E501
        :rtype: bool
        """
        return self._connected

    @connected.setter
    def connected(self, connected):
        """Sets the connected of this PeeringPeeringPeer.


        :param connected: The connected of this PeeringPeeringPeer.  # noqa: E501
        :type: bool
        """

        self._connected = connected

    @property
    def id(self):
        """Gets the id of this PeeringPeeringPeer.  # noqa: E501


        :return: The id of this PeeringPeeringPeer.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PeeringPeeringPeer.


        :param id: The id of this PeeringPeeringPeer.  # noqa: E501
        :type: str
        """

        self._id = id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PeeringPeeringPeer, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PeeringPeeringPeer):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other