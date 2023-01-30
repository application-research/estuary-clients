# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from estuary-client.models.base_model_ import Model
from estuary-client import util


class MinerMinerChainInfo(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, addresses: List[str]=None, owner: str=None, peer_id: str=None, worker: str=None):  # noqa: E501
        """MinerMinerChainInfo - a model defined in Swagger

        :param addresses: The addresses of this MinerMinerChainInfo.  # noqa: E501
        :type addresses: List[str]
        :param owner: The owner of this MinerMinerChainInfo.  # noqa: E501
        :type owner: str
        :param peer_id: The peer_id of this MinerMinerChainInfo.  # noqa: E501
        :type peer_id: str
        :param worker: The worker of this MinerMinerChainInfo.  # noqa: E501
        :type worker: str
        """
        self.swagger_types = {
            'addresses': List[str],
            'owner': str,
            'peer_id': str,
            'worker': str
        }

        self.attribute_map = {
            'addresses': 'addresses',
            'owner': 'owner',
            'peer_id': 'peerId',
            'worker': 'worker'
        }
        self._addresses = addresses
        self._owner = owner
        self._peer_id = peer_id
        self._worker = worker

    @classmethod
    def from_dict(cls, dikt) -> 'MinerMinerChainInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The miner.MinerChainInfo of this MinerMinerChainInfo.  # noqa: E501
        :rtype: MinerMinerChainInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def addresses(self) -> List[str]:
        """Gets the addresses of this MinerMinerChainInfo.


        :return: The addresses of this MinerMinerChainInfo.
        :rtype: List[str]
        """
        return self._addresses

    @addresses.setter
    def addresses(self, addresses: List[str]):
        """Sets the addresses of this MinerMinerChainInfo.


        :param addresses: The addresses of this MinerMinerChainInfo.
        :type addresses: List[str]
        """

        self._addresses = addresses

    @property
    def owner(self) -> str:
        """Gets the owner of this MinerMinerChainInfo.


        :return: The owner of this MinerMinerChainInfo.
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner: str):
        """Sets the owner of this MinerMinerChainInfo.


        :param owner: The owner of this MinerMinerChainInfo.
        :type owner: str
        """

        self._owner = owner

    @property
    def peer_id(self) -> str:
        """Gets the peer_id of this MinerMinerChainInfo.


        :return: The peer_id of this MinerMinerChainInfo.
        :rtype: str
        """
        return self._peer_id

    @peer_id.setter
    def peer_id(self, peer_id: str):
        """Sets the peer_id of this MinerMinerChainInfo.


        :param peer_id: The peer_id of this MinerMinerChainInfo.
        :type peer_id: str
        """

        self._peer_id = peer_id

    @property
    def worker(self) -> str:
        """Gets the worker of this MinerMinerChainInfo.


        :return: The worker of this MinerMinerChainInfo.
        :rtype: str
        """
        return self._worker

    @worker.setter
    def worker(self, worker: str):
        """Sets the worker of this MinerMinerChainInfo.


        :param worker: The worker of this MinerMinerChainInfo.
        :type worker: str
        """

        self._worker = worker