# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from estuary-client.models.base_model_ import Model
from estuary-client.models.util_content_type import UtilContentType  # noqa: F401,E501
from estuary-client.models.util_db_cid import UtilDbCID  # noqa: F401,E501
from estuary-client import util


class UtilContent(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, active: bool=None, aggregate: bool=None, aggregated_in: int=None, cid: UtilDbCID=None, created_at: str=None, dag_split: bool=None, deal_status: str=None, description: str=None, failed: bool=None, id: int=None, location: str=None, name: str=None, offloaded: bool=None, origins: str=None, pin_meta: str=None, pinning: bool=None, pinning_status: str=None, replace: bool=None, replication: int=None, size: int=None, split_from: int=None, type: UtilContentType=None, updated_at: str=None, user_id: int=None):  # noqa: E501
        """UtilContent - a model defined in Swagger

        :param active: The active of this UtilContent.  # noqa: E501
        :type active: bool
        :param aggregate: The aggregate of this UtilContent.  # noqa: E501
        :type aggregate: bool
        :param aggregated_in: The aggregated_in of this UtilContent.  # noqa: E501
        :type aggregated_in: int
        :param cid: The cid of this UtilContent.  # noqa: E501
        :type cid: UtilDbCID
        :param created_at: The created_at of this UtilContent.  # noqa: E501
        :type created_at: str
        :param dag_split: The dag_split of this UtilContent.  # noqa: E501
        :type dag_split: bool
        :param deal_status: The deal_status of this UtilContent.  # noqa: E501
        :type deal_status: str
        :param description: The description of this UtilContent.  # noqa: E501
        :type description: str
        :param failed: The failed of this UtilContent.  # noqa: E501
        :type failed: bool
        :param id: The id of this UtilContent.  # noqa: E501
        :type id: int
        :param location: The location of this UtilContent.  # noqa: E501
        :type location: str
        :param name: The name of this UtilContent.  # noqa: E501
        :type name: str
        :param offloaded: The offloaded of this UtilContent.  # noqa: E501
        :type offloaded: bool
        :param origins: The origins of this UtilContent.  # noqa: E501
        :type origins: str
        :param pin_meta: The pin_meta of this UtilContent.  # noqa: E501
        :type pin_meta: str
        :param pinning: The pinning of this UtilContent.  # noqa: E501
        :type pinning: bool
        :param pinning_status: The pinning_status of this UtilContent.  # noqa: E501
        :type pinning_status: str
        :param replace: The replace of this UtilContent.  # noqa: E501
        :type replace: bool
        :param replication: The replication of this UtilContent.  # noqa: E501
        :type replication: int
        :param size: The size of this UtilContent.  # noqa: E501
        :type size: int
        :param split_from: The split_from of this UtilContent.  # noqa: E501
        :type split_from: int
        :param type: The type of this UtilContent.  # noqa: E501
        :type type: UtilContentType
        :param updated_at: The updated_at of this UtilContent.  # noqa: E501
        :type updated_at: str
        :param user_id: The user_id of this UtilContent.  # noqa: E501
        :type user_id: int
        """
        self.swagger_types = {
            'active': bool,
            'aggregate': bool,
            'aggregated_in': int,
            'cid': UtilDbCID,
            'created_at': str,
            'dag_split': bool,
            'deal_status': str,
            'description': str,
            'failed': bool,
            'id': int,
            'location': str,
            'name': str,
            'offloaded': bool,
            'origins': str,
            'pin_meta': str,
            'pinning': bool,
            'pinning_status': str,
            'replace': bool,
            'replication': int,
            'size': int,
            'split_from': int,
            'type': UtilContentType,
            'updated_at': str,
            'user_id': int
        }

        self.attribute_map = {
            'active': 'active',
            'aggregate': 'aggregate',
            'aggregated_in': 'aggregatedIn',
            'cid': 'cid',
            'created_at': 'createdAt',
            'dag_split': 'dagSplit',
            'deal_status': 'dealStatus',
            'description': 'description',
            'failed': 'failed',
            'id': 'id',
            'location': 'location',
            'name': 'name',
            'offloaded': 'offloaded',
            'origins': 'origins',
            'pin_meta': 'pinMeta',
            'pinning': 'pinning',
            'pinning_status': 'pinningStatus',
            'replace': 'replace',
            'replication': 'replication',
            'size': 'size',
            'split_from': 'splitFrom',
            'type': 'type',
            'updated_at': 'updatedAt',
            'user_id': 'userId'
        }
        self._active = active
        self._aggregate = aggregate
        self._aggregated_in = aggregated_in
        self._cid = cid
        self._created_at = created_at
        self._dag_split = dag_split
        self._deal_status = deal_status
        self._description = description
        self._failed = failed
        self._id = id
        self._location = location
        self._name = name
        self._offloaded = offloaded
        self._origins = origins
        self._pin_meta = pin_meta
        self._pinning = pinning
        self._pinning_status = pinning_status
        self._replace = replace
        self._replication = replication
        self._size = size
        self._split_from = split_from
        self._type = type
        self._updated_at = updated_at
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'UtilContent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The util.Content of this UtilContent.  # noqa: E501
        :rtype: UtilContent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def active(self) -> bool:
        """Gets the active of this UtilContent.


        :return: The active of this UtilContent.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active: bool):
        """Sets the active of this UtilContent.


        :param active: The active of this UtilContent.
        :type active: bool
        """

        self._active = active

    @property
    def aggregate(self) -> bool:
        """Gets the aggregate of this UtilContent.


        :return: The aggregate of this UtilContent.
        :rtype: bool
        """
        return self._aggregate

    @aggregate.setter
    def aggregate(self, aggregate: bool):
        """Sets the aggregate of this UtilContent.


        :param aggregate: The aggregate of this UtilContent.
        :type aggregate: bool
        """

        self._aggregate = aggregate

    @property
    def aggregated_in(self) -> int:
        """Gets the aggregated_in of this UtilContent.

        TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler  # noqa: E501

        :return: The aggregated_in of this UtilContent.
        :rtype: int
        """
        return self._aggregated_in

    @aggregated_in.setter
    def aggregated_in(self, aggregated_in: int):
        """Sets the aggregated_in of this UtilContent.

        TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler  # noqa: E501

        :param aggregated_in: The aggregated_in of this UtilContent.
        :type aggregated_in: int
        """

        self._aggregated_in = aggregated_in

    @property
    def cid(self) -> UtilDbCID:
        """Gets the cid of this UtilContent.


        :return: The cid of this UtilContent.
        :rtype: UtilDbCID
        """
        return self._cid

    @cid.setter
    def cid(self, cid: UtilDbCID):
        """Sets the cid of this UtilContent.


        :param cid: The cid of this UtilContent.
        :type cid: UtilDbCID
        """

        self._cid = cid

    @property
    def created_at(self) -> str:
        """Gets the created_at of this UtilContent.


        :return: The created_at of this UtilContent.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this UtilContent.


        :param created_at: The created_at of this UtilContent.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def dag_split(self) -> bool:
        """Gets the dag_split of this UtilContent.

        If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)  # noqa: E501

        :return: The dag_split of this UtilContent.
        :rtype: bool
        """
        return self._dag_split

    @dag_split.setter
    def dag_split(self, dag_split: bool):
        """Sets the dag_split of this UtilContent.

        If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)  # noqa: E501

        :param dag_split: The dag_split of this UtilContent.
        :type dag_split: bool
        """

        self._dag_split = dag_split

    @property
    def deal_status(self) -> str:
        """Gets the deal_status of this UtilContent.


        :return: The deal_status of this UtilContent.
        :rtype: str
        """
        return self._deal_status

    @deal_status.setter
    def deal_status(self, deal_status: str):
        """Sets the deal_status of this UtilContent.


        :param deal_status: The deal_status of this UtilContent.
        :type deal_status: str
        """

        self._deal_status = deal_status

    @property
    def description(self) -> str:
        """Gets the description of this UtilContent.


        :return: The description of this UtilContent.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this UtilContent.


        :param description: The description of this UtilContent.
        :type description: str
        """

        self._description = description

    @property
    def failed(self) -> bool:
        """Gets the failed of this UtilContent.


        :return: The failed of this UtilContent.
        :rtype: bool
        """
        return self._failed

    @failed.setter
    def failed(self, failed: bool):
        """Sets the failed of this UtilContent.


        :param failed: The failed of this UtilContent.
        :type failed: bool
        """

        self._failed = failed

    @property
    def id(self) -> int:
        """Gets the id of this UtilContent.


        :return: The id of this UtilContent.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this UtilContent.


        :param id: The id of this UtilContent.
        :type id: int
        """

        self._id = id

    @property
    def location(self) -> str:
        """Gets the location of this UtilContent.


        :return: The location of this UtilContent.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location: str):
        """Sets the location of this UtilContent.


        :param location: The location of this UtilContent.
        :type location: str
        """

        self._location = location

    @property
    def name(self) -> str:
        """Gets the name of this UtilContent.


        :return: The name of this UtilContent.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UtilContent.


        :param name: The name of this UtilContent.
        :type name: str
        """

        self._name = name

    @property
    def offloaded(self) -> bool:
        """Gets the offloaded of this UtilContent.


        :return: The offloaded of this UtilContent.
        :rtype: bool
        """
        return self._offloaded

    @offloaded.setter
    def offloaded(self, offloaded: bool):
        """Sets the offloaded of this UtilContent.


        :param offloaded: The offloaded of this UtilContent.
        :type offloaded: bool
        """

        self._offloaded = offloaded

    @property
    def origins(self) -> str:
        """Gets the origins of this UtilContent.


        :return: The origins of this UtilContent.
        :rtype: str
        """
        return self._origins

    @origins.setter
    def origins(self, origins: str):
        """Sets the origins of this UtilContent.


        :param origins: The origins of this UtilContent.
        :type origins: str
        """

        self._origins = origins

    @property
    def pin_meta(self) -> str:
        """Gets the pin_meta of this UtilContent.


        :return: The pin_meta of this UtilContent.
        :rtype: str
        """
        return self._pin_meta

    @pin_meta.setter
    def pin_meta(self, pin_meta: str):
        """Sets the pin_meta of this UtilContent.


        :param pin_meta: The pin_meta of this UtilContent.
        :type pin_meta: str
        """

        self._pin_meta = pin_meta

    @property
    def pinning(self) -> bool:
        """Gets the pinning of this UtilContent.


        :return: The pinning of this UtilContent.
        :rtype: bool
        """
        return self._pinning

    @pinning.setter
    def pinning(self, pinning: bool):
        """Sets the pinning of this UtilContent.


        :param pinning: The pinning of this UtilContent.
        :type pinning: bool
        """

        self._pinning = pinning

    @property
    def pinning_status(self) -> str:
        """Gets the pinning_status of this UtilContent.


        :return: The pinning_status of this UtilContent.
        :rtype: str
        """
        return self._pinning_status

    @pinning_status.setter
    def pinning_status(self, pinning_status: str):
        """Sets the pinning_status of this UtilContent.


        :param pinning_status: The pinning_status of this UtilContent.
        :type pinning_status: str
        """

        self._pinning_status = pinning_status

    @property
    def replace(self) -> bool:
        """Gets the replace of this UtilContent.


        :return: The replace of this UtilContent.
        :rtype: bool
        """
        return self._replace

    @replace.setter
    def replace(self, replace: bool):
        """Sets the replace of this UtilContent.


        :param replace: The replace of this UtilContent.
        :type replace: bool
        """

        self._replace = replace

    @property
    def replication(self) -> int:
        """Gets the replication of this UtilContent.


        :return: The replication of this UtilContent.
        :rtype: int
        """
        return self._replication

    @replication.setter
    def replication(self, replication: int):
        """Sets the replication of this UtilContent.


        :param replication: The replication of this UtilContent.
        :type replication: int
        """

        self._replication = replication

    @property
    def size(self) -> int:
        """Gets the size of this UtilContent.


        :return: The size of this UtilContent.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this UtilContent.


        :param size: The size of this UtilContent.
        :type size: int
        """

        self._size = size

    @property
    def split_from(self) -> int:
        """Gets the split_from of this UtilContent.


        :return: The split_from of this UtilContent.
        :rtype: int
        """
        return self._split_from

    @split_from.setter
    def split_from(self, split_from: int):
        """Sets the split_from of this UtilContent.


        :param split_from: The split_from of this UtilContent.
        :type split_from: int
        """

        self._split_from = split_from

    @property
    def type(self) -> UtilContentType:
        """Gets the type of this UtilContent.


        :return: The type of this UtilContent.
        :rtype: UtilContentType
        """
        return self._type

    @type.setter
    def type(self, type: UtilContentType):
        """Sets the type of this UtilContent.


        :param type: The type of this UtilContent.
        :type type: UtilContentType
        """

        self._type = type

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this UtilContent.


        :return: The updated_at of this UtilContent.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this UtilContent.


        :param updated_at: The updated_at of this UtilContent.
        :type updated_at: str
        """

        self._updated_at = updated_at

    @property
    def user_id(self) -> int:
        """Gets the user_id of this UtilContent.


        :return: The user_id of this UtilContent.
        :rtype: int
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: int):
        """Sets the user_id of this UtilContent.


        :param user_id: The user_id of this UtilContent.
        :type user_id: int
        """

        self._user_id = user_id
