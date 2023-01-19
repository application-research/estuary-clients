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

class TypesIpfsPinStatusResponse(object):
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
        'created': 'str',
        'delegates': 'list[str]',
        'info': 'dict(str, object)',
        'pin': 'TypesIpfsPin',
        'requestid': 'str',
        'status': 'TypesPinningStatus'
    }

    attribute_map = {
        'created': 'created',
        'delegates': 'delegates',
        'info': 'info',
        'pin': 'pin',
        'requestid': 'requestid',
        'status': 'status'
    }

    def __init__(self, created=None, delegates=None, info=None, pin=None, requestid=None, status=None):  # noqa: E501
        """TypesIpfsPinStatusResponse - a model defined in Swagger"""  # noqa: E501
        self._created = None
        self._delegates = None
        self._info = None
        self._pin = None
        self._requestid = None
        self._status = None
        self.discriminator = None
        if created is not None:
            self.created = created
        if delegates is not None:
            self.delegates = delegates
        if info is not None:
            self.info = info
        if pin is not None:
            self.pin = pin
        if requestid is not None:
            self.requestid = requestid
        if status is not None:
            self.status = status

    @property
    def created(self):
        """Gets the created of this TypesIpfsPinStatusResponse.  # noqa: E501


        :return: The created of this TypesIpfsPinStatusResponse.  # noqa: E501
        :rtype: str
        """
        return self._created

    @created.setter
    def created(self, created):
        """Sets the created of this TypesIpfsPinStatusResponse.


        :param created: The created of this TypesIpfsPinStatusResponse.  # noqa: E501
        :type: str
        """

        self._created = created

    @property
    def delegates(self):
        """Gets the delegates of this TypesIpfsPinStatusResponse.  # noqa: E501


        :return: The delegates of this TypesIpfsPinStatusResponse.  # noqa: E501
        :rtype: list[str]
        """
        return self._delegates

    @delegates.setter
    def delegates(self, delegates):
        """Sets the delegates of this TypesIpfsPinStatusResponse.


        :param delegates: The delegates of this TypesIpfsPinStatusResponse.  # noqa: E501
        :type: list[str]
        """

        self._delegates = delegates

    @property
    def info(self):
        """Gets the info of this TypesIpfsPinStatusResponse.  # noqa: E501


        :return: The info of this TypesIpfsPinStatusResponse.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._info

    @info.setter
    def info(self, info):
        """Sets the info of this TypesIpfsPinStatusResponse.


        :param info: The info of this TypesIpfsPinStatusResponse.  # noqa: E501
        :type: dict(str, object)
        """

        self._info = info

    @property
    def pin(self):
        """Gets the pin of this TypesIpfsPinStatusResponse.  # noqa: E501


        :return: The pin of this TypesIpfsPinStatusResponse.  # noqa: E501
        :rtype: TypesIpfsPin
        """
        return self._pin

    @pin.setter
    def pin(self, pin):
        """Sets the pin of this TypesIpfsPinStatusResponse.


        :param pin: The pin of this TypesIpfsPinStatusResponse.  # noqa: E501
        :type: TypesIpfsPin
        """

        self._pin = pin

    @property
    def requestid(self):
        """Gets the requestid of this TypesIpfsPinStatusResponse.  # noqa: E501


        :return: The requestid of this TypesIpfsPinStatusResponse.  # noqa: E501
        :rtype: str
        """
        return self._requestid

    @requestid.setter
    def requestid(self, requestid):
        """Sets the requestid of this TypesIpfsPinStatusResponse.


        :param requestid: The requestid of this TypesIpfsPinStatusResponse.  # noqa: E501
        :type: str
        """

        self._requestid = requestid

    @property
    def status(self):
        """Gets the status of this TypesIpfsPinStatusResponse.  # noqa: E501


        :return: The status of this TypesIpfsPinStatusResponse.  # noqa: E501
        :rtype: TypesPinningStatus
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this TypesIpfsPinStatusResponse.


        :param status: The status of this TypesIpfsPinStatusResponse.  # noqa: E501
        :type: TypesPinningStatus
        """

        self._status = status

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
        if issubclass(TypesIpfsPinStatusResponse, dict):
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
        if not isinstance(other, TypesIpfsPinStatusResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
