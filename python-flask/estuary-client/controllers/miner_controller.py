import connexion
import six

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


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


def public_miners_stats_miner_get(miner):  # noqa: E501
    """Get miner stats

    This endpoint returns miner stats # noqa: E501

    :param miner: Filter by miner
    :type miner: str

    :rtype: str
    """
    return 'do some magic!'
