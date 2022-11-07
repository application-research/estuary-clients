'use strict';

var utils = require('../utils/writer.js');
var Peers = require('../service/PeersService');

module.exports.adminPeeringPeersDELETE = function adminPeeringPeersDELETE (req, res, next) {
  var peerIds = req.swagger.params['peerIds'].value;
  Peers.adminPeeringPeersDELETE(peerIds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringPeersGET = function adminPeeringPeersGET (req, res, next) {
  Peers.adminPeeringPeersGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringPeersPOST = function adminPeeringPeersPOST (req, res, next) {
  Peers.adminPeeringPeersPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStartPOST = function adminPeeringStartPOST (req, res, next) {
  Peers.adminPeeringStartPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStatusGET = function adminPeeringStatusGET (req, res, next) {
  Peers.adminPeeringStatusGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminPeeringStopPOST = function adminPeeringStopPOST (req, res, next) {
  Peers.adminPeeringStopPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
