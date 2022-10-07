goog.provide('API.Client.util.HttpError');

/**
 * @record
 */
API.Client.UtilHttpError = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.UtilHttpError.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.UtilHttpError.prototype.details;

/**
 * @type {!string}
 * @export
 */
API.Client.UtilHttpError.prototype.reason;

