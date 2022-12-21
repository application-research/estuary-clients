import connexion
import six

from estuary-client.models.api_storage_provider_resp import ApiStorageProviderResp  # noqa: E501
from estuary-client.models.github_com_application_research_estuary_api_v2_claim_msg_response import GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse  # noqa: E501
from estuary-client.models.github_com_application_research_estuary_api_v2_claim_response import GithubComApplicationResearchEstuaryApiV2ClaimResponse  # noqa: E501
from estuary-client.models.miner_claim_miner_body import MinerClaimMinerBody  # noqa: E501
from estuary-client.models.miner_miner_set_info_params import MinerMinerSetInfoParams  # noqa: E501
from estuary-client.models.miner_suspend_miner_body import MinerSuspendMinerBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def storage_providers_claim_post(body):  # noqa: E501
    """Claim Storage Provider

    This endpoint lets a user claim a storage provider # noqa: E501

    :param body: Claim Storage Provider Body
    :type body: dict | bytes

    :rtype: GithubComApplicationResearchEstuaryApiV2ClaimResponse
    """
    if connexion.request.is_json:
        body = MinerClaimMinerBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def storage_providers_claim_sp_get(sp):  # noqa: E501
    """Get Claim Storage Provider

    This endpoint lets a user get the message in order to claim a storage provider # noqa: E501

    :param sp: Storage Provider claim message
    :type sp: str

    :rtype: GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse
    """
    return 'do some magic!'


def storage_providers_deals_sp_get(sp, ignore_failed=None):  # noqa: E501
    """Get all storage providers deals

    This endpoint returns all storage providers deals # noqa: E501

    :param sp: Filter by storage provider
    :type sp: str
    :param ignore_failed: Ignore Failed
    :type ignore_failed: str

    :rtype: str
    """
    return 'do some magic!'


def storage_providers_failures_sp_get(sp):  # noqa: E501
    """Get all storage providers

    This endpoint returns all storage providers # noqa: E501

    :param sp: Filter by storage provider
    :type sp: str

    :rtype: str
    """
    return 'do some magic!'


def storage_providers_get():  # noqa: E501
    """Get all storage providers

    This endpoint returns all storage providers # noqa: E501


    :rtype: List[ApiStorageProviderResp]
    """
    return 'do some magic!'


def storage_providers_set_info_sp_put(body, sp):  # noqa: E501
    """Set Storage Provider Info

    This endpoint lets a user set storage provider info. # noqa: E501

    :param body: Storage Provider set info params
    :type body: dict | bytes
    :param sp: Storage Provider to set info for
    :type sp: str

    :rtype: None
    """
    if connexion.request.is_json:
        body = MinerMinerSetInfoParams.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def storage_providers_stats_sp_get(sp):  # noqa: E501
    """Get storage provider stats

    This endpoint returns storage provider stats # noqa: E501

    :param sp: Filter by storage provider
    :type sp: str

    :rtype: str
    """
    return 'do some magic!'


def storage_providers_suspend_sp_post(body, sp):  # noqa: E501
    """Suspend Storage Provider

    This endpoint lets a user suspend a storage provider. # noqa: E501

    :param body: Suspend Storage Provider Body
    :type body: dict | bytes
    :param sp: Storage Provider to suspend
    :type sp: str

    :rtype: Dict[str, str]
    """
    if connexion.request.is_json:
        body = MinerSuspendMinerBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def storage_providers_unsuspend_sp_put(sp):  # noqa: E501
    """Unuspend Storage Provider

    This endpoint lets a user unsuspend a Storage Provider. # noqa: E501

    :param sp: Storage Provider to unsuspend
    :type sp: str

    :rtype: None
    """
    return 'do some magic!'
