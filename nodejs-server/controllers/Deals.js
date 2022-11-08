'use strict';

var utils = require('../utils/writer.js');
var Deals = require('../service/DealsService');

module.exports.dealEstimatePOST = function dealEstimatePOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Deals.dealEstimatePOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealInfoDealidGET = function dealInfoDealidGET (req, res, next) {
  var dealid = req.swagger.params['dealid'].value;
  Deals.dealInfoDealidGET(dealid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealProposalPropcidGET = function dealProposalPropcidGET (req, res, next) {
  var propcid = req.swagger.params['propcid'].value;
  Deals.dealProposalPropcidGET(propcid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealQueryMinerGET = function dealQueryMinerGET (req, res, next) {
  var miner = req.swagger.params['miner'].value;
  Deals.dealQueryMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealStatusMinerPropcidGET = function dealStatusMinerPropcidGET (req, res, next) {
  var miner = req.swagger.params['miner'].value;
  var propcid = req.swagger.params['propcid'].value;
  Deals.dealStatusMinerPropcidGET(miner,propcid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealStatus_by_proposalPropcidGET = function dealStatus_by_proposalPropcidGET (req, res, next) {
  var propcid = req.swagger.params['propcid'].value;
  Deals.dealStatus_by_proposalPropcidGET(propcid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealTransferIn_progressGET = function dealTransferIn_progressGET (req, res, next) {
  Deals.dealTransferIn_progressGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealTransferStatusPOST = function dealTransferStatusPOST (req, res, next) {
  var chanid = req.swagger.params['chanid'].value;
  Deals.dealTransferStatusPOST(chanid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealsFailuresGET = function dealsFailuresGET (req, res, next) {
  Deals.dealsFailuresGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealsMakeMinerPOST = function dealsMakeMinerPOST (req, res, next) {
  var miner = req.swagger.params['miner'].value;
  var dealRequest = req.swagger.params['dealRequest'].value;
  Deals.dealsMakeMinerPOST(miner,dealRequest)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.dealsStatusDealGET = function dealsStatusDealGET (req, res, next) {
  var deal = req.swagger.params['deal'].value;
  Deals.dealsStatusDealGET(deal)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicDealsFailuresGET = function publicDealsFailuresGET (req, res, next) {
  Deals.publicDealsFailuresGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.publicMinersStorageQueryMinerGET = function publicMinersStorageQueryMinerGET (req, res, next) {
  var miner = req.swagger.params['miner'].value;
  Deals.publicMinersStorageQueryMinerGET(miner)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
