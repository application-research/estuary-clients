goog.provide('API.Client.types.IpfsPinStatusResponse');

/**
 * @record
 */
API.Client.TypesIpfsPinStatusResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TypesIpfsPinStatusResponse.prototype.created;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TypesIpfsPinStatusResponse.prototype.delegates;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.TypesIpfsPinStatusResponse.prototype.info;

/**
 * @type {!API.Client.types.IpfsPin}
 * @export
 */
API.Client.TypesIpfsPinStatusResponse.prototype.pin;

/**
 * @type {!string}
 * @export
 */
API.Client.TypesIpfsPinStatusResponse.prototype.requestid;

/**
 * @type {!string}
 * @export
 */
API.Client.TypesIpfsPinStatusResponse.prototype.status;

