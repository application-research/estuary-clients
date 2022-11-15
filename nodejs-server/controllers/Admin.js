'use strict';

var utils = require('../utils/writer.js');
var Admin = require('../service/AdminService');

module.exports.adminPeeringPeersDELETE = function adminPeeringPeersDELETE (req, res, next, body) {
  Admin.adminPeeringPeersDELETE(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringPeersGET = function adminPeeringPeersGET (req, res, next) {
  Admin.adminPeeringPeersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringPeersPOST = function adminPeeringPeersPOST (req, res, next) {
  Admin.adminPeeringPeersPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStartPOST = function adminPeeringStartPOST (req, res, next) {
  Admin.adminPeeringStartPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStatusGET = function adminPeeringStatusGET (req, res, next) {
  Admin.adminPeeringStatusGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStopPOST = function adminPeeringStopPOST (req, res, next) {
  Admin.adminPeeringStopPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminSystemConfigGET = function adminSystemConfigGET (req, res, next) {
  Admin.adminSystemConfigGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminUsersGET = function adminUsersGET (req, res, next) {
  Admin.adminUsersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
