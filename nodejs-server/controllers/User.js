'use strict';

var utils = require('../utils/writer.js');
var User = require('../service/UserService');

module.exports.userApi_keysGET = function userApi_keysGET (req, res, next) {
  User.userApi_keysGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userApi_keysKey_or_hashDELETE = function userApi_keysKey_or_hashDELETE (req, res, next) {
  var key_or_hash = req.swagger.params['key_or_hash'].value;
  User.userApi_keysKey_or_hashDELETE(key_or_hash)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userApi_keysPOST = function userApi_keysPOST (req, res, next) {
  var expiry = req.swagger.params['expiry'].value;
  var perms = req.swagger.params['perms'].value;
  User.userApi_keysPOST(expiry,perms)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userExportGET = function userExportGET (req, res, next) {
  User.userExportGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userStatsGET = function userStatsGET (req, res, next) {
  User.userStatsGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
