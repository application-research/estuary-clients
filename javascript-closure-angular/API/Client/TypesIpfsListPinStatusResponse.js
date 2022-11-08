goog.provide('API.Client.types.IpfsListPinStatusResponse');

/**
 * @record
 */
API.Client.TypesIpfsListPinStatusResponse = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.TypesIpfsListPinStatusResponse.prototype.count;

/**
 * @type {!Array<!API.Client.types.IpfsPinStatusResponse>}
 * @export
 */
API.Client.TypesIpfsListPinStatusResponse.prototype.results;

