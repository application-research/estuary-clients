import connexion
import six

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def public_by_cid_cid_get(cid):  # noqa: E501
    """Get Content by Cid

    This endpoint returns the content associated with a CID # noqa: E501

    :param cid: Cid
    :type cid: str

    :rtype: str
    """
    return 'do some magic!'


def public_info_get():  # noqa: E501
    """Get public node info

    This endpoint returns information about the node # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def public_metrics_deals_on_chain_get():  # noqa: E501
    """Get deal metrics

    This endpoint is used to get deal metrics # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def public_miners_deals_miner_get(miner, ignore_failed=None):  # noqa: E501
    """Get all miners deals

    This endpoint returns all miners deals # noqa: E501

    :param miner: Filter by miner
    :type miner: str
    :param ignore_failed: Ignore Failed
    :type ignore_failed: str

    :rtype: str
    """
    return 'do some magic!'


def public_miners_failures_miner_get(miner):  # noqa: E501
    """Get all miners

    This endpoint returns all miners # noqa: E501

    :param miner: Filter by miner
    :type miner: str

    :rtype: str
    """
    return 'do some magic!'


def public_miners_get():  # noqa: E501
    """Get all miners

    This endpoint returns all miners # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def public_miners_stats_miner_get(miner):  # noqa: E501
    """Get miner stats

    This endpoint returns miner stats # noqa: E501

    :param miner: Filter by miner
    :type miner: str

    :rtype: str
    """
    return 'do some magic!'


def public_net_addrs_get():  # noqa: E501
    """Net Addrs

    This endpoint is used to get net addrs # noqa: E501


    :rtype: List[str]
    """
    return 'do some magic!'


def public_net_peers_get():  # noqa: E501
    """Net Peers

    This endpoint is used to get net peers # noqa: E501


    :rtype: List[str]
    """
    return 'do some magic!'


def public_stats_get():  # noqa: E501
    """Public stats

    This endpoint is used to get public stats. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'
