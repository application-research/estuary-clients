import connexion
import six

from estuary-client.models.main_channel_id_param import MainChannelIDParam  # noqa: E501
from estuary-client.models.main_estimate_deal_body import MainEstimateDealBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def deal_estimate_post(body):  # noqa: E501
    """Estimate the cost of a deal

    This endpoint estimates the cost of a deal # noqa: E501

    :param body: The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
    :type body: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        body = MainEstimateDealBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def deal_info_dealid_get(dealid):  # noqa: E501
    """Get Deal Info

    This endpoint returns the deal info for a deal # noqa: E501

    :param dealid: Deal ID
    :type dealid: int

    :rtype: str
    """
    return 'do some magic!'


def deal_proposal_propcid_get(propcid):  # noqa: E501
    """Get Proposal

    This endpoint returns the proposal for a deal # noqa: E501

    :param propcid: Proposal CID
    :type propcid: str

    :rtype: str
    """
    return 'do some magic!'


def deal_query_miner_get(miner):  # noqa: E501
    """Query Ask

    This endpoint returns the ask for a given CID # noqa: E501

    :param miner: CID
    :type miner: str

    :rtype: str
    """
    return 'do some magic!'


def deal_status_by_proposal_propcid_get(propcid):  # noqa: E501
    """Get Deal Status by PropCid

    Get Deal Status by PropCid # noqa: E501

    :param propcid: PropCid
    :type propcid: str

    :rtype: str
    """
    return 'do some magic!'


def deal_status_miner_propcid_get(miner, propcid):  # noqa: E501
    """Deal Status

    This endpoint returns the status of a deal # noqa: E501

    :param miner: Miner
    :type miner: str
    :param propcid: Proposal CID
    :type propcid: str

    :rtype: str
    """
    return 'do some magic!'


def deal_transfer_in_progress_get():  # noqa: E501
    """Transfer In Progress

    This endpoint returns the in-progress transfers # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def deal_transfer_status_post(body):  # noqa: E501
    """Transfer Status

    This endpoint returns the status of a transfer # noqa: E501

    :param body: Channel ID
    :type body: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        body = MainChannelIDParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def deals_failures_get():  # noqa: E501
    """Get storage failures for user

    This endpoint returns a list of storage failures for user # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def deals_make_miner_post(body, miner):  # noqa: E501
    """Make Deal

    This endpoint makes a deal for a given content and miner # noqa: E501

    :param body: Deal Request
    :type body: dict | bytes
    :param miner: Miner
    :type miner: str

    :rtype: str
    """
    if connexion.request.is_json:
        body = str.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def deals_status_deal_get(deal):  # noqa: E501
    """Get Deal Status

    This endpoint returns the status of a deal # noqa: E501

    :param deal: Deal ID
    :type deal: int

    :rtype: str
    """
    return 'do some magic!'


def public_deals_failures_get():  # noqa: E501
    """Get storage failures

    This endpoint returns a list of storage failures # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def public_miners_storage_query_miner_get(miner):  # noqa: E501
    """Query Ask

    This endpoint returns the ask for a given CID # noqa: E501

    :param miner: CID
    :type miner: str

    :rtype: str
    """
    return 'do some magic!'
