'use strict';

var utils = require('../utils/writer.js');
var Autoretrieve = require('../service/AutoretrieveService');

module.exports.adminAutoretrieveInitPOST = function adminAutoretrieveInitPOST (req, res, next) {
  var addresses = req.swagger.params['addresses'].value;
  var pubKey = req.swagger.params['pubKey'].value;
  Autoretrieve.adminAutoretrieveInitPOST(addresses,pubKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.adminAutoretrieveListGET = function adminAutoretrieveListGET (req, res, next) {
  Autoretrieve.adminAutoretrieveListGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.autoretrieveHeartbeatPOST = function autoretrieveHeartbeatPOST (req, res, next) {
  var token = req.swagger.params['token'].value;
  Autoretrieve.autoretrieveHeartbeatPOST(token)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
