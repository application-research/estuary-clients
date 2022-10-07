import connexion
import six

from swagger_server.models.main_import_deal_body import MainImportDealBody  # noqa: E501
from swagger_server.models.util_content_add_ipfs_body import UtilContentAddIpfsBody  # noqa: E501
from swagger_server.models.util_content_add_response import UtilContentAddResponse  # noqa: E501
from swagger_server import util


def content_add_car_post(body, filename=None, commp=None, size=None):  # noqa: E501
    """Add Car object

    This endpoint is used to add a car object to the network. The object can be a file or a directory. # noqa: E501

    :param body: Car
    :type body: str
    :param filename: Filename
    :type filename: str
    :param commp: Commp
    :type commp: str
    :param size: Size
    :type size: str

    :rtype: None
    """
    return 'do some magic!'


def content_add_ipfs_post(body):  # noqa: E501
    """Add IPFS object

    This endpoint is used to add an IPFS object to the network. The object can be a file or a directory. # noqa: E501

    :param body: IPFS Body
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = UtilContentAddIpfsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def content_add_post(file, coluuid, dir):  # noqa: E501
    """Add new content

    This endpoint is used to upload new content. # noqa: E501

    :param file: File to upload
    :type file: werkzeug.datastructures.FileStorage
    :param coluuid: Collection UUID
    :type coluuid: str
    :param dir: Directory
    :type dir: str

    :rtype: UtilContentAddResponse
    """
    return 'do some magic!'


def content_aggregated_content_get(content):  # noqa: E501
    """Get aggregated content stats

    This endpoint returns aggregated content stats # noqa: E501

    :param content: Content ID
    :type content: str

    :rtype: str
    """
    return 'do some magic!'


def content_all_deals_get(begin, duration, all):  # noqa: E501
    """Get all deals for a user

    This endpoint is used to get all deals for a user # noqa: E501

    :param begin: Begin
    :type begin: str
    :param duration: Duration
    :type duration: str
    :param all: All
    :type all: str

    :rtype: None
    """
    return 'do some magic!'


def content_bw_usage_content_get(content):  # noqa: E501
    """Get content bandwidth

    This endpoint returns content bandwidth # noqa: E501

    :param content: Content ID
    :type content: str

    :rtype: None
    """
    return 'do some magic!'


def content_create_post(body):  # noqa: E501
    """Add a new content

    This endpoint adds a new content # noqa: E501

    :param body: Content
    :type body: str

    :rtype: None
    """
    return 'do some magic!'


def content_deals_get(limit=None, offset=None):  # noqa: E501
    """Content with deals

    This endpoint lists all content with deals # noqa: E501

    :param limit: Limit
    :type limit: int
    :param offset: Offset
    :type offset: int

    :rtype: None
    """
    return 'do some magic!'


def content_ensure_replication_datacid_get(datacid):  # noqa: E501
    """Ensure Replication

    This endpoint ensures that the content is replicated to the specified number of providers # noqa: E501

    :param datacid: Data CID
    :type datacid: str

    :rtype: None
    """
    return 'do some magic!'


def content_failures_content_get(content):  # noqa: E501
    """List all failures for a content

    This endpoint returns all failures for a content # noqa: E501

    :param content: Content ID
    :type content: str

    :rtype: str
    """
    return 'do some magic!'


def content_importdeal_post(body):  # noqa: E501
    """Import a deal

    This endpoint imports a deal into the shuttle. # noqa: E501

    :param body: Import a deal
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = MainImportDealBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def content_list_get():  # noqa: E501
    """List all pinned content

    This endpoint lists all content # noqa: E501


    :rtype: List[str]
    """
    return 'do some magic!'


def content_read_cont_get(cont):  # noqa: E501
    """Read content

    This endpoint reads content from the blockstore # noqa: E501

    :param cont: CID
    :type cont: str

    :rtype: None
    """
    return 'do some magic!'


def content_staging_zones_get():  # noqa: E501
    """Get staging zone for user

    This endpoint is used to get staging zone for user. # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def content_stats_get(limit):  # noqa: E501
    """Get content statistics

    This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten # noqa: E501

    :param limit: limit
    :type limit: str

    :rtype: None
    """
    return 'do some magic!'


def content_status_id_get(id):  # noqa: E501
    """Content Status

    This endpoint returns the status of a content # noqa: E501

    :param id: Content ID
    :type id: int

    :rtype: None
    """
    return 'do some magic!'
