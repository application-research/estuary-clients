# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from estuary-client.models.base_model_ import Model
from estuary-client.models.address_address import AddressAddress  # noqa: F401,E501
from estuary-client import util


class MinerClaimMinerBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, claim: str=None, miner: AddressAddress=None, name: str=None):  # noqa: E501
        """MinerClaimMinerBody - a model defined in Swagger

        :param claim: The claim of this MinerClaimMinerBody.  # noqa: E501
        :type claim: str
        :param miner: The miner of this MinerClaimMinerBody.  # noqa: E501
        :type miner: AddressAddress
        :param name: The name of this MinerClaimMinerBody.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'claim': str,
            'miner': AddressAddress,
            'name': str
        }

        self.attribute_map = {
            'claim': 'claim',
            'miner': 'miner',
            'name': 'name'
        }
        self._claim = claim
        self._miner = miner
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'MinerClaimMinerBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The miner.ClaimMinerBody of this MinerClaimMinerBody.  # noqa: E501
        :rtype: MinerClaimMinerBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def claim(self) -> str:
        """Gets the claim of this MinerClaimMinerBody.


        :return: The claim of this MinerClaimMinerBody.
        :rtype: str
        """
        return self._claim

    @claim.setter
    def claim(self, claim: str):
        """Sets the claim of this MinerClaimMinerBody.


        :param claim: The claim of this MinerClaimMinerBody.
        :type claim: str
        """

        self._claim = claim

    @property
    def miner(self) -> AddressAddress:
        """Gets the miner of this MinerClaimMinerBody.


        :return: The miner of this MinerClaimMinerBody.
        :rtype: AddressAddress
        """
        return self._miner

    @miner.setter
    def miner(self, miner: AddressAddress):
        """Sets the miner of this MinerClaimMinerBody.


        :param miner: The miner of this MinerClaimMinerBody.
        :type miner: AddressAddress
        """

        self._miner = miner

    @property
    def name(self) -> str:
        """Gets the name of this MinerClaimMinerBody.


        :return: The name of this MinerClaimMinerBody.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this MinerClaimMinerBody.


        :param name: The name of this MinerClaimMinerBody.
        :type name: str
        """

        self._name = name
