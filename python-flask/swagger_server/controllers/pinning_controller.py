import connexion
import six

from swagger_server.models.util_http_error import UtilHttpError  # noqa: E501
from swagger_server import util


def pinning_pins_get():  # noqa: E501
    """List all pin status objects

    This endpoint lists all pin status objects # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def pinning_pins_pinid_delete(pinid):  # noqa: E501
    """Delete a pinned object

    This endpoint deletes a pinned object. # noqa: E501

    :param pinid: Pin ID
    :type pinid: str

    :rtype: None
    """
    return 'do some magic!'


def pinning_pins_pinid_get(pinid):  # noqa: E501
    """Get a pin status object

    This endpoint returns a pin status object. # noqa: E501

    :param pinid: cid
    :type pinid: str

    :rtype: None
    """
    return 'do some magic!'


def pinning_pins_pinid_post(pinid):  # noqa: E501
    """Replace a pinned object

    This endpoint replaces a pinned object. # noqa: E501

    :param pinid: Pin ID
    :type pinid: str

    :rtype: None
    """
    return 'do some magic!'


def pinning_pins_post(cid, name):  # noqa: E501
    """Add and pin object

    This endpoint adds a pin to the IPFS daemon. # noqa: E501

    :param cid: cid
    :type cid: str
    :param name: name
    :type name: str

    :rtype: None
    """
    return 'do some magic!'
