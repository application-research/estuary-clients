import connexion
import six

from estuary-client.models.collections_collection import CollectionsCollection  # noqa: E501
from estuary-client.models.main_create_collection_body import MainCreateCollectionBody  # noqa: E501
from estuary-client.models.main_delete_content_from_collection_body import MainDeleteContentFromCollectionBody  # noqa: E501
from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client import util


def collections_coluuid_commit_post(coluuid):  # noqa: E501
    """Produce a CID of the collection contents

    This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection. # noqa: E501

    :param coluuid: coluuid
    :type coluuid: str

    :rtype: str
    """
    return 'do some magic!'


def collections_coluuid_contents_delete(coluuid, contentid, body):  # noqa: E501
    """Deletes a content from a collection

    This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path # noqa: E501

    :param coluuid: Collection ID
    :type coluuid: str
    :param contentid: Content ID
    :type contentid: str
    :param body: Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;)
    :type body: dict | bytes

    :rtype: str
    """
    if connexion.request.is_json:
        body = MainDeleteContentFromCollectionBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def collections_coluuid_delete(coluuid):  # noqa: E501
    """Deletes a collection

    This endpoint is used to delete an existing collection. # noqa: E501

    :param coluuid: Collection ID
    :type coluuid: str

    :rtype: str
    """
    return 'do some magic!'


def collections_coluuid_get(coluuid, dir=None):  # noqa: E501
    """Get contents in a collection

    This endpoint is used to get contents in a collection. If no colpath query param is passed # noqa: E501

    :param coluuid: coluuid
    :type coluuid: str
    :param dir: Directory
    :type dir: str

    :rtype: str
    """
    return 'do some magic!'


def collections_coluuid_post(coluuid, contentIDs):  # noqa: E501
    """Add contents to a collection

    This endpoint adds already-pinned contents (that have ContentIDs) to a collection. # noqa: E501

    :param coluuid: coluuid
    :type coluuid: str
    :param contentIDs: Content IDs to add to collection
    :type contentIDs: List[]

    :rtype: str
    """
    return 'do some magic!'


def collections_fs_add_post(coluuid, content, path):  # noqa: E501
    """Add a file to a collection

    This endpoint adds a file to a collection # noqa: E501

    :param coluuid: Collection ID
    :type coluuid: str
    :param content: Content
    :type content: str
    :param path: Path to file
    :type path: str

    :rtype: str
    """
    return 'do some magic!'


def collections_get():  # noqa: E501
    """List all collections

    This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user. # noqa: E501


    :rtype: List[List[CollectionsCollection]]
    """
    return 'do some magic!'


def collections_post(body):  # noqa: E501
    """Create a new collection

    This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection. # noqa: E501

    :param body: Collection name and description
    :type body: dict | bytes

    :rtype: CollectionsCollection
    """
    if connexion.request.is_json:
        body = MainCreateCollectionBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
