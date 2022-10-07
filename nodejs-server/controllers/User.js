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

module.exports.userApi_keysKeyDELETE = function userApi_keysKeyDELETE (req, res, next) {
  var key = req.swagger.params['key'].value;
  User.userApi_keysKeyDELETE(key)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userApi_keysPOST = function userApi_keysPOST (req, res, next) {
  User.userApi_keysPOST()
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
