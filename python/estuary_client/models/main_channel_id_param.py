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

class MainChannelIDParam(object):
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
        'id': 'int',
        'initiator': 'str',
        'responder': 'str'
    }

    attribute_map = {
        'id': 'id',
        'initiator': 'initiator',
        'responder': 'responder'
    }

    def __init__(self, id=None, initiator=None, responder=None):  # noqa: E501
        """MainChannelIDParam - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._initiator = None
        self._responder = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if initiator is not None:
            self.initiator = initiator
        if responder is not None:
            self.responder = responder

    @property
    def id(self):
        """Gets the id of this MainChannelIDParam.  # noqa: E501


        :return: The id of this MainChannelIDParam.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this MainChannelIDParam.


        :param id: The id of this MainChannelIDParam.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def initiator(self):
        """Gets the initiator of this MainChannelIDParam.  # noqa: E501


        :return: The initiator of this MainChannelIDParam.  # noqa: E501
        :rtype: str
        """
        return self._initiator

    @initiator.setter
    def initiator(self, initiator):
        """Sets the initiator of this MainChannelIDParam.


        :param initiator: The initiator of this MainChannelIDParam.  # noqa: E501
        :type: str
        """

        self._initiator = initiator

    @property
    def responder(self):
        """Gets the responder of this MainChannelIDParam.  # noqa: E501


        :return: The responder of this MainChannelIDParam.  # noqa: E501
        :rtype: str
        """
        return self._responder

    @responder.setter
    def responder(self, responder):
        """Sets the responder of this MainChannelIDParam.


        :param responder: The responder of this MainChannelIDParam.  # noqa: E501
        :type: str
        """

        self._responder = responder

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
        if issubclass(MainChannelIDParam, dict):
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
        if not isinstance(other, MainChannelIDParam):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
