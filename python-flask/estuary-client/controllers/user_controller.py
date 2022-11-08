import connexion
import six

from estuary-client.models.main_get_api_keys_resp import MainGetApiKeysResp  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def user_api_keys_get():  # noqa: E501
    """Get API keys for a user

    This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user. # noqa: E501


    :rtype: List[List[MainGetApiKeysResp]]
    """
    return 'do some magic!'


def user_api_keys_key_or_hash_delete(key_or_hash):  # noqa: E501
    """Revoke a User API Key.

    This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#39;s assigned to the user. Revoked API keys are completely deleted and are not recoverable. # noqa: E501

    :param key_or_hash: Key or Hash
    :type key_or_hash: str

    :rtype: str
    """
    return 'do some magic!'


def user_api_keys_post(expiry=None, perms=None):  # noqa: E501
    """Create API keys for a user

    This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features. # noqa: E501

    :param expiry: Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
    :type expiry: str
    :param perms: Permissions -- currently unused
    :type perms: str

    :rtype: MainGetApiKeysResp
    """
    return 'do some magic!'


def user_export_get():  # noqa: E501
    """Export user data

    This endpoint is used to get API keys for a user. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def user_stats_get():  # noqa: E501
    """Create API keys for a user

    This endpoint is used to create API keys for a user. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'
