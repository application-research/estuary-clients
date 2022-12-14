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

class ApiGetApiKeysResp(object):
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
        'expiry': 'str',
        'label': 'str',
        'token': 'str',
        'token_hash': 'str'
    }

    attribute_map = {
        'expiry': 'expiry',
        'label': 'label',
        'token': 'token',
        'token_hash': 'tokenHash'
    }

    def __init__(self, expiry=None, label=None, token=None, token_hash=None):  # noqa: E501
        """ApiGetApiKeysResp - a model defined in Swagger"""  # noqa: E501
        self._expiry = None
        self._label = None
        self._token = None
        self._token_hash = None
        self.discriminator = None
        if expiry is not None:
            self.expiry = expiry
        if label is not None:
            self.label = label
        if token is not None:
            self.token = token
        if token_hash is not None:
            self.token_hash = token_hash

    @property
    def expiry(self):
        """Gets the expiry of this ApiGetApiKeysResp.  # noqa: E501


        :return: The expiry of this ApiGetApiKeysResp.  # noqa: E501
        :rtype: str
        """
        return self._expiry

    @expiry.setter
    def expiry(self, expiry):
        """Sets the expiry of this ApiGetApiKeysResp.


        :param expiry: The expiry of this ApiGetApiKeysResp.  # noqa: E501
        :type: str
        """

        self._expiry = expiry

    @property
    def label(self):
        """Gets the label of this ApiGetApiKeysResp.  # noqa: E501


        :return: The label of this ApiGetApiKeysResp.  # noqa: E501
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """Sets the label of this ApiGetApiKeysResp.


        :param label: The label of this ApiGetApiKeysResp.  # noqa: E501
        :type: str
        """

        self._label = label

    @property
    def token(self):
        """Gets the token of this ApiGetApiKeysResp.  # noqa: E501


        :return: The token of this ApiGetApiKeysResp.  # noqa: E501
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this ApiGetApiKeysResp.


        :param token: The token of this ApiGetApiKeysResp.  # noqa: E501
        :type: str
        """

        self._token = token

    @property
    def token_hash(self):
        """Gets the token_hash of this ApiGetApiKeysResp.  # noqa: E501


        :return: The token_hash of this ApiGetApiKeysResp.  # noqa: E501
        :rtype: str
        """
        return self._token_hash

    @token_hash.setter
    def token_hash(self, token_hash):
        """Sets the token_hash of this ApiGetApiKeysResp.


        :param token_hash: The token_hash of this ApiGetApiKeysResp.  # noqa: E501
        :type: str
        """

        self._token_hash = token_hash

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
        if issubclass(ApiGetApiKeysResp, dict):
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
        if not isinstance(other, ApiGetApiKeysResp):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other