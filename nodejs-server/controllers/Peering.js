'use strict';

var utils = require('../utils/writer.js');
var Peering = require('../service/PeeringService');

module.exports.adminPeeringPeersDELETE = function adminPeeringPeersDELETE (req, res, next) {
  var peerIds = req.swagger.params['peerIds'].value;
  Peering.adminPeeringPeersDELETE(peerIds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringPeersGET = function adminPeeringPeersGET (req, res, next) {
  Peering.adminPeeringPeersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringPeersPOST = function adminPeeringPeersPOST (req, res, next) {
  Peering.adminPeeringPeersPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStartPOST = function adminPeeringStartPOST (req, res, next) {
  Peering.adminPeeringStartPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStatusGET = function adminPeeringStatusGET (req, res, next) {
  Peering.adminPeeringStatusGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStopPOST = function adminPeeringStopPOST (req, res, next) {
  Peering.adminPeeringStopPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
