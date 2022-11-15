'use strict';

var utils = require('../utils/writer.js');
var Autoretrieve = require('../service/AutoretrieveService');

module.exports.adminAutoretrieveInitPOST = function adminAutoretrieveInitPOST (req, res, next) {
  Autoretrieve.adminAutoretrieveInitPOST()
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

module.exports.autoretrieveHeartbeatPOST = function autoretrieveHeartbeatPOST (req, res, next, token) {
  Autoretrieve.autoretrieveHeartbeatPOST(token)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
