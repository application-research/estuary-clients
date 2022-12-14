# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from estuary-client.models.base_model_ import Model
from estuary-client import util


class MinerSuspendMinerBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, reason: str=None):  # noqa: E501
        """MinerSuspendMinerBody - a model defined in Swagger

        :param reason: The reason of this MinerSuspendMinerBody.  # noqa: E501
        :type reason: str
        """
        self.swagger_types = {
            'reason': str
        }

        self.attribute_map = {
            'reason': 'reason'
        }
        self._reason = reason

    @classmethod
    def from_dict(cls, dikt) -> 'MinerSuspendMinerBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The miner.SuspendMinerBody of this MinerSuspendMinerBody.  # noqa: E501
        :rtype: MinerSuspendMinerBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def reason(self) -> str:
        """Gets the reason of this MinerSuspendMinerBody.


        :return: The reason of this MinerSuspendMinerBody.
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason: str):
        """Sets the reason of this MinerSuspendMinerBody.


        :param reason: The reason of this MinerSuspendMinerBody.
        :type reason: str
        """

        self._reason = reason
