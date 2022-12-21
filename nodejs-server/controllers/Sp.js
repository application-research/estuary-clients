'use strict';

var utils = require('../utils/writer.js');
var Sp = require('../service/SpService');

module.exports.storage_providersClaimPOST = function storage_providersClaimPOST (req, res, next, body) {
  Sp.storage_providersClaimPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersClaimSpGET = function storage_providersClaimSpGET (req, res, next, sp) {
  Sp.storage_providersClaimSpGET(sp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersDealsSpGET = function storage_providersDealsSpGET (req, res, next, sp, ignoreFailed) {
  Sp.storage_providersDealsSpGET(sp, ignoreFailed)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersFailuresSpGET = function storage_providersFailuresSpGET (req, res, next, sp) {
  Sp.storage_providersFailuresSpGET(sp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersGET = function storage_providersGET (req, res, next) {
  Sp.storage_providersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersSet_infoSpPUT = function storage_providersSet_infoSpPUT (req, res, next, body, sp) {
  Sp.storage_providersSet_infoSpPUT(body, sp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersStatsSpGET = function storage_providersStatsSpGET (req, res, next, sp) {
  Sp.storage_providersStatsSpGET(sp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersSuspendSpPOST = function storage_providersSuspendSpPOST (req, res, next, body, sp) {
  Sp.storage_providersSuspendSpPOST(body, sp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.storage_providersUnsuspendSpPUT = function storage_providersUnsuspendSpPUT (req, res, next, sp) {
  Sp.storage_providersUnsuspendSpPUT(sp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
