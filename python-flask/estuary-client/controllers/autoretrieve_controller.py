import connexion
import six

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def admin_autoretrieve_init_post(addresses, pubKey):  # noqa: E501
    """Register autoretrieve server

    This endpoint registers a new autoretrieve server # noqa: E501

    :param addresses: Autoretrieve&#39;s comma-separated list of addresses
    :type addresses: str
    :param pubKey: Autoretrieve&#39;s public key
    :type pubKey: str

    :rtype: str
    """
    return 'do some magic!'


def admin_autoretrieve_list_get():  # noqa: E501
    """List autoretrieve servers

    This endpoint lists all registered autoretrieve servers # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def autoretrieve_heartbeat_post(token):  # noqa: E501
    """Marks autoretrieve server as up

    This endpoint updates the lastConnection field for autoretrieve # noqa: E501

    :param token: Autoretrieve&#39;s auth token
    :type token: str

    :rtype: str
    """
    return 'do some magic!'
