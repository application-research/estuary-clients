import connexion
import six

from estuary-client.models.types_ipfs_list_pin_status_response import TypesIpfsListPinStatusResponse  # noqa: E501
from estuary-client.models.types_ipfs_pin import TypesIpfsPin  # noqa: E501
from estuary-client.models.types_ipfs_pin_status_response import TypesIpfsPinStatusResponse  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def pinning_pins_get():  # noqa: E501
    """List all pin status objects

    This endpoint lists all pin status objects # noqa: E501


    :rtype: TypesIpfsListPinStatusResponse
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

    :rtype: TypesIpfsPinStatusResponse
    """
    return 'do some magic!'


def pinning_pins_pinid_post(pinid, body=None):  # noqa: E501
    """Replace a pinned object

    This endpoint replaces a pinned object. # noqa: E501

    :param pinid: Pin ID
    :type pinid: str
    :param body: Meta information of new pin
    :type body: dict | bytes

    :rtype: TypesIpfsPinStatusResponse
    """
    if connexion.request.is_json:
        body = str.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def pinning_pins_post(body):  # noqa: E501
    """Add and pin object

    This endpoint adds a pin to the IPFS daemon. # noqa: E501

    :param body: Pin Body {cid:cid, name:name}
    :type body: dict | bytes

    :rtype: TypesIpfsPinStatusResponse
    """
    if connexion.request.is_json:
        body = TypesIpfsPin.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
