# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from estuary-client.models.base_model_ import Model
from estuary-client import util


class AddressAddress(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self):  # noqa: E501
        """AddressAddress - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'AddressAddress':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The address.Address of this AddressAddress.  # noqa: E501
        :rtype: AddressAddress
        """
        return util.deserialize_model(dikt, cls)
