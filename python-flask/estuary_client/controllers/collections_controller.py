import connexion
import six

from estuary_client.models.main_collection import MainCollection  # noqa: E501
from estuary_client.models.main_create_collection_body import MainCreateCollectionBody  # noqa: E501
from estuary_client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary_client import util


def collections_coluuid_commit_post(coluuid):  # noqa: E501
    """Produce a CID of the collection contents

    This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection. # noqa: E501

    :param coluuid: coluuid
    :type coluuid: str

    :rtype: str
    """
    return 'do some magic!'


def collections_coluuid_delete(coluuid):  # noqa: E501
    """Deletes a collection

    This endpoint is used to delete an existing collection. # noqa: E501

    :param coluuid: Collection ID
    :type coluuid: str

    :rtype: None
    """
    return 'do some magic!'


def collections_coluuid_get(coluuid, dir=None):  # noqa: E501
    """Get contents in a collection

    This endpoint is used to get contents in a collection. If no colpath query param is passed # noqa: E501

    :param coluuid: Collection UUID
    :type coluuid: str
    :param dir: Directory
    :type dir: str

    :rtype: str
    """
    return 'do some magic!'


def collections_coluuid_post(body):  # noqa: E501
    """Add contents to a collection

    This endpoint adds already-pinned contents (that have ContentIDs) to a collection. # noqa: E501

    :param body: Content IDs to add to collection
    :type body: List[]

    :rtype: Dict[str, str]
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

    :rtype: None
    """
    return 'do some magic!'


def collections_get(id):  # noqa: E501
    """List all collections

    This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user. # noqa: E501

    :param id: User ID
    :type id: int

    :rtype: List[MainCollection]
    """
    return 'do some magic!'


def collections_post(body):  # noqa: E501
    """Create a new collection

    This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection. # noqa: E501

    :param body: Collection name and description
    :type body: dict | bytes

    :rtype: MainCollection
    """
    if connexion.request.is_json:
        body = MainCreateCollectionBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
