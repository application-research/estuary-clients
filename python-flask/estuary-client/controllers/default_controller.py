import connexion
import six

from estuary-client.models.util_http_error import UtilHttpError  # noqa: E501
from estuary-client.models.util_viewer_response import UtilViewerResponse  # noqa: E501
from estuary-client import util


def viewer_get():  # noqa: E501
    """Fetch viewer details

    This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc. # noqa: E501


    :rtype: UtilViewerResponse
    """
    return 'do some magic!'
