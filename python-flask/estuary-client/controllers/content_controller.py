import connexion
import six

from estuary-client.models.pinner_ipfs_pin import PinnerIpfsPin  # noqa: E501
from estuary-client.models.util_content_add_response import UtilContentAddResponse  # noqa: E501
from estuary-client.models.util_content_create_body import UtilContentCreateBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def admin_invites_code_post(code):  # noqa: E501
    """Create an Estuary invite

    This endpoint is used to create an estuary invite. # noqa: E501

    :param code: Invite code to be created
    :type code: str

    :rtype: str
    """
    return 'do some magic!'


def admin_invites_get():  # noqa: E501
    """Get Estuary invites

    This endpoint is used to list all estuary invites. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def content_add_car_post(body, ignore_dupes=None, filename=None):  # noqa: E501
    """Add Car object

    This endpoint is used to add a car object to the network. The object can be a file or a directory. # noqa: E501

    :param body: Car
    :type body: dict | bytes
    :param ignore_dupes: Ignore Dupes
    :type ignore_dupes: str
    :param filename: Filename
    :type filename: str

    :rtype: UtilContentAddResponse
    """
    if connexion.request.is_json:
        body = str.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def content_add_ipfs_post(body, ignore_dupes=None, overwrite=None):  # noqa: E501
    """Add IPFS object

    This endpoint is used to add an IPFS object to the network. The object can be a file or a directory. # noqa: E501

    :param body: IPFS Body
    :type body: dict | bytes
    :param ignore_dupes: Ignore Dupes
    :type ignore_dupes: str
    :param overwrite: Overwrite conflicting files in collections
    :type overwrite: str

    :rtype: str
    """
    if connexion.request.is_json:
        body = PinnerIpfsPin.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def content_add_post(data, filename, coluuid=None, replication=None, ignore_dupes=None, overwrite=None, lazy_provide=None, dir=None):  # noqa: E501
    """Add new content

    This endpoint is used to upload new content. # noqa: E501

    :param data: 
    :type data: strstr
    :param filename: 
    :type filename: str
    :param coluuid: Collection UUID
    :type coluuid: str
    :param replication: Replication value
    :type replication: int
    :param ignore_dupes: Ignore Dupes true/false
    :type ignore_dupes: str
    :param overwrite: Overwrite files with the same path on same collection
    :type overwrite: str
    :param lazy_provide: Lazy Provide true/false
    :type lazy_provide: str
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

    :rtype: str
    """
    return 'do some magic!'


def content_bw_usage_content_get(content):  # noqa: E501
    """Get content bandwidth

    This endpoint returns content bandwidth # noqa: E501

    :param content: Content ID
    :type content: str

    :rtype: str
    """
    return 'do some magic!'


def content_contents_get(limit, offset):  # noqa: E501
    """Get user contents

    This endpoint is used to get user contents # noqa: E501

    :param limit: limit
    :type limit: str
    :param offset: offset
    :type offset: str

    :rtype: str
    """
    return 'do some magic!'


def content_create_post(body, ignore_dupes=None):  # noqa: E501
    """Add a new content

    This endpoint adds a new content # noqa: E501

    :param body: Content
    :type body: dict | bytes
    :param ignore_dupes: Ignore Dupes
    :type ignore_dupes: str

    :rtype: str
    """
    if connexion.request.is_json:
        body = UtilContentCreateBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def content_deals_get(limit=None, offset=None):  # noqa: E501
    """Content with deals

    This endpoint lists all content with deals # noqa: E501

    :param limit: Limit
    :type limit: int
    :param offset: Offset
    :type offset: int

    :rtype: str
    """
    return 'do some magic!'


def content_ensure_replication_datacid_get(datacid):  # noqa: E501
    """Ensure Replication

    This endpoint ensures that the content is replicated to the specified number of providers # noqa: E501

    :param datacid: Data CID
    :type datacid: str

    :rtype: str
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


def content_id_get(id):  # noqa: E501
    """Content

    This endpoint returns a content by its ID # noqa: E501

    :param id: Content ID
    :type id: int

    :rtype: str
    """
    return 'do some magic!'


def content_list_get():  # noqa: E501
    """List all pinned content

    This endpoint lists all content # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def content_staging_zones_get():  # noqa: E501
    """Get staging zone for user, excluding its contents

    This endpoint is used to get staging zone for user, excluding its contents. # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def content_staging_zones_staging_zone_contents_get(staging_zone, limit, offset):  # noqa: E501
    """Get contents for a staging zone

    This endpoint is used to get the contents for a staging zone # noqa: E501

    :param staging_zone: Staging Zone Content ID
    :type staging_zone: int
    :param limit: limit
    :type limit: str
    :param offset: offset
    :type offset: str

    :rtype: str
    """
    return 'do some magic!'


def content_staging_zones_staging_zone_get(staging_zone):  # noqa: E501
    """Get staging zone without its contents field populated

    This endpoint is used to get a staging zone, excluding its contents. # noqa: E501

    :param staging_zone: Staging Zone Content ID
    :type staging_zone: int

    :rtype: str
    """
    return 'do some magic!'


def content_stats_get(limit, offset):  # noqa: E501
    """Get content statistics

    This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content # noqa: E501

    :param limit: limit
    :type limit: str
    :param offset: offset
    :type offset: str

    :rtype: str
    """
    return 'do some magic!'


def content_status_id_get(id):  # noqa: E501
    """Content Status

    This endpoint returns the status of a content # noqa: E501

    :param id: Content ID
    :type id: int

    :rtype: str
    """
    return 'do some magic!'
