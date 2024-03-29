import connexion
import six

from estuary-client.models.api_miner_resp import ApiMinerResp  # noqa: E501
from estuary-client.models.peering_peering_peer import PeeringPeeringPeer  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def admin_miners_get():  # noqa: E501
    """Get all miners

    This endpoint returns all miners. Note: value may be cached # noqa: E501


    :rtype: ApiMinerResp
    """
    return 'do some magic!'


def admin_peering_peers_delete(body):  # noqa: E501
    """Remove peers on Peering Service

    This endpoint can be used to remove a Peer from the Peering Service # noqa: E501

    :param body: Peer ids
    :type body: List[]

    :rtype: str
    """
    return 'do some magic!'


def admin_peering_peers_get():  # noqa: E501
    """List all Peering peers

    This endpoint can be used to list all peers on Peering Service # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def admin_peering_peers_post(body):  # noqa: E501
    """Add peers on Peering Service

    This endpoint can be used to add a Peer from the Peering Service # noqa: E501

    :param body: Peering Peer array
    :type body: list | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        body = [PeeringPeeringPeer.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def admin_peering_start_post():  # noqa: E501
    """Start Peering

    This endpoint can be used to start the Peering Service # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def admin_peering_status_get():  # noqa: E501
    """Check Peering Status

    This endpoint can be used to check the Peering status # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def admin_peering_stop_post():  # noqa: E501
    """Stop Peering

    This endpoint can be used to stop the Peering Service # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def admin_system_config_get():  # noqa: E501
    """Get systems(estuary/shuttle) config

    This endpoint is used to get system configs. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def admin_users_get():  # noqa: E501
    """Get all users

    This endpoint is used to get all users. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'
