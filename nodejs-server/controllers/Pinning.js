'use strict';

var utils = require('../utils/writer.js');
var Pinning = require('../service/PinningService');

module.exports.pinningPinsGET = function pinningPinsGET (req, res, next) {
  Pinning.pinningPinsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pinningPinsPOST = function pinningPinsPOST (req, res, next) {
  var pin = req.swagger.params['pin'].value;
  Pinning.pinningPinsPOST(pin)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pinningPinsPinidDELETE = function pinningPinsPinidDELETE (req, res, next) {
  var pinid = req.swagger.params['pinid'].value;
  Pinning.pinningPinsPinidDELETE(pinid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pinningPinsPinidGET = function pinningPinsPinidGET (req, res, next) {
  var pinid = req.swagger.params['pinid'].value;
  Pinning.pinningPinsPinidGET(pinid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pinningPinsPinidPOST = function pinningPinsPinidPOST (req, res, next) {
  var pinid = req.swagger.params['pinid'].value;
  Pinning.pinningPinsPinidPOST(pinid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
