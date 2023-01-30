# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from estuary-client.models.base_model_ import Model
from estuary-client.models.pinner_ipfs_pin import PinnerIpfsPin  # noqa: F401,E501
from estuary-client.models.status_pinning_status import StatusPinningStatus  # noqa: F401,E501
from estuary-client.models.util_content import UtilContent  # noqa: F401,E501
from estuary-client import util


class PinnerIpfsPinStatusResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, content: UtilContent=None, created: str=None, delegates: List[str]=None, info: Dict=None, pin: PinnerIpfsPin=None, requestid: str=None, status: StatusPinningStatus=None):  # noqa: E501
        """PinnerIpfsPinStatusResponse - a model defined in Swagger

        :param content: The content of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type content: UtilContent
        :param created: The created of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type created: str
        :param delegates: The delegates of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type delegates: List[str]
        :param info: The info of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type info: Dict
        :param pin: The pin of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type pin: PinnerIpfsPin
        :param requestid: The requestid of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type requestid: str
        :param status: The status of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :type status: StatusPinningStatus
        """
        self.swagger_types = {
            'content': UtilContent,
            'created': str,
            'delegates': List[str],
            'info': Dict,
            'pin': PinnerIpfsPin,
            'requestid': str,
            'status': StatusPinningStatus
        }

        self.attribute_map = {
            'content': 'content',
            'created': 'created',
            'delegates': 'delegates',
            'info': 'info',
            'pin': 'pin',
            'requestid': 'requestid',
            'status': 'status'
        }
        self._content = content
        self._created = created
        self._delegates = delegates
        self._info = info
        self._pin = pin
        self._requestid = requestid
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'PinnerIpfsPinStatusResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The pinner.IpfsPinStatusResponse of this PinnerIpfsPinStatusResponse.  # noqa: E501
        :rtype: PinnerIpfsPinStatusResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> UtilContent:
        """Gets the content of this PinnerIpfsPinStatusResponse.


        :return: The content of this PinnerIpfsPinStatusResponse.
        :rtype: UtilContent
        """
        return self._content

    @content.setter
    def content(self, content: UtilContent):
        """Sets the content of this PinnerIpfsPinStatusResponse.


        :param content: The content of this PinnerIpfsPinStatusResponse.
        :type content: UtilContent
        """

        self._content = content

    @property
    def created(self) -> str:
        """Gets the created of this PinnerIpfsPinStatusResponse.


        :return: The created of this PinnerIpfsPinStatusResponse.
        :rtype: str
        """
        return self._created

    @created.setter
    def created(self, created: str):
        """Sets the created of this PinnerIpfsPinStatusResponse.


        :param created: The created of this PinnerIpfsPinStatusResponse.
        :type created: str
        """

        self._created = created

    @property
    def delegates(self) -> List[str]:
        """Gets the delegates of this PinnerIpfsPinStatusResponse.


        :return: The delegates of this PinnerIpfsPinStatusResponse.
        :rtype: List[str]
        """
        return self._delegates

    @delegates.setter
    def delegates(self, delegates: List[str]):
        """Sets the delegates of this PinnerIpfsPinStatusResponse.


        :param delegates: The delegates of this PinnerIpfsPinStatusResponse.
        :type delegates: List[str]
        """

        self._delegates = delegates

    @property
    def info(self) -> Dict:
        """Gets the info of this PinnerIpfsPinStatusResponse.


        :return: The info of this PinnerIpfsPinStatusResponse.
        :rtype: Dict
        """
        return self._info

    @info.setter
    def info(self, info: Dict):
        """Sets the info of this PinnerIpfsPinStatusResponse.


        :param info: The info of this PinnerIpfsPinStatusResponse.
        :type info: Dict
        """

        self._info = info

    @property
    def pin(self) -> PinnerIpfsPin:
        """Gets the pin of this PinnerIpfsPinStatusResponse.


        :return: The pin of this PinnerIpfsPinStatusResponse.
        :rtype: PinnerIpfsPin
        """
        return self._pin

    @pin.setter
    def pin(self, pin: PinnerIpfsPin):
        """Sets the pin of this PinnerIpfsPinStatusResponse.


        :param pin: The pin of this PinnerIpfsPinStatusResponse.
        :type pin: PinnerIpfsPin
        """

        self._pin = pin

    @property
    def requestid(self) -> str:
        """Gets the requestid of this PinnerIpfsPinStatusResponse.


        :return: The requestid of this PinnerIpfsPinStatusResponse.
        :rtype: str
        """
        return self._requestid

    @requestid.setter
    def requestid(self, requestid: str):
        """Sets the requestid of this PinnerIpfsPinStatusResponse.


        :param requestid: The requestid of this PinnerIpfsPinStatusResponse.
        :type requestid: str
        """

        self._requestid = requestid

    @property
    def status(self) -> StatusPinningStatus:
        """Gets the status of this PinnerIpfsPinStatusResponse.


        :return: The status of this PinnerIpfsPinStatusResponse.
        :rtype: StatusPinningStatus
        """
        return self._status

    @status.setter
    def status(self, status: StatusPinningStatus):
        """Sets the status of this PinnerIpfsPinStatusResponse.


        :param status: The status of this PinnerIpfsPinStatusResponse.
        :type status: StatusPinningStatus
        """

        self._status = status
