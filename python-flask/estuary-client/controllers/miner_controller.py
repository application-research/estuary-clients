import connexion
import six

from estuary-client.models.github_com_application_research_estuary_api_v1_claim_msg_response import GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse  # noqa: E501
from estuary-client.models.github_com_application_research_estuary_api_v1_claim_response import GithubComApplicationResearchEstuaryApiV1ClaimResponse  # noqa: E501
from estuary-client.models.miner_claim_miner_body import MinerClaimMinerBody  # noqa: E501
from estuary-client.models.miner_miner_set_info_params import MinerMinerSetInfoParams  # noqa: E501
from estuary-client.models.miner_suspend_miner_body import MinerSuspendMinerBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def miner_claim_miner_get(miner):  # noqa: E501
    """Get Claim Miner Message

    This endpoint lets a user get the message in order to claim a miner # noqa: E501

    :param miner: Miner claim message
    :type miner: str

    :rtype: GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse
    """
    return 'do some magic!'


def miner_claim_post(body):  # noqa: E501
    """Claim Miner

    This endpoint lets a user claim a miner # noqa: E501

    :param body: Claim Miner Body
    :type body: dict | bytes

    :rtype: GithubComApplicationResearchEstuaryApiV1ClaimResponse
    """
    if connexion.request.is_json:
        body = MinerClaimMinerBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def miner_set_info_miner_put(body, miner):  # noqa: E501
    """Set Miner Info

    This endpoint lets a user set miner info. # noqa: E501

    :param body: Miner set info params
    :type body: dict | bytes
    :param miner: Miner to set info for
    :type miner: str

    :rtype: Dict[str, str]
    """
    if connexion.request.is_json:
        body = MinerMinerSetInfoParams.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def miner_suspend_miner_post(body, miner):  # noqa: E501
    """Suspend Miner

    This endpoint lets a user suspend a miner. # noqa: E501

    :param body: Suspend Miner Body
    :type body: dict | bytes
    :param miner: Miner to suspend
    :type miner: str

    :rtype: Dict[str, str]
    """
    if connexion.request.is_json:
        body = MinerSuspendMinerBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def miner_unsuspend_miner_put(miner):  # noqa: E501
    """Unuspend Miner

    This endpoint lets a user unsuspend a miner. # noqa: E501

    :param miner: Miner to unsuspend
    :type miner: str

    :rtype: Dict[str, str]
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


def public_miners_stats_miner_get(miner):  # noqa: E501
    """Get miner stats

    This endpoint returns miner stats # noqa: E501

    :param miner: Filter by miner
    :type miner: str

    :rtype: str
    """
    return 'do some magic!'
