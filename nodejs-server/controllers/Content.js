'use strict';

var utils = require('../utils/writer.js');
var Content = require('../service/ContentService');

module.exports.contentAddPOST = function contentAddPOST (req, res, next) {
  var data = req.swagger.params['data'].value;
  var filename = req.swagger.params['filename'].value;
  var coluuid = req.swagger.params['coluuid'].value;
  var replication = req.swagger.params['replication'].value;
  var ignoreDupes = req.swagger.params['ignore-dupes'].value;
  var lazyProvide = req.swagger.params['lazy-provide'].value;
  var dir = req.swagger.params['dir'].value;
  Content.contentAddPOST(data,filename,coluuid,replication,ignoreDupes,lazyProvide,dir)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAdd_carPOST = function contentAdd_carPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  var ignoreDupes = req.swagger.params['ignore-dupes'].value;
  var filename = req.swagger.params['filename'].value;
  Content.contentAdd_carPOST(body,ignoreDupes,filename)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAdd_ipfsPOST = function contentAdd_ipfsPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  var ignoreDupes = req.swagger.params['ignore-dupes'].value;
  Content.contentAdd_ipfsPOST(body,ignoreDupes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAggregatedContentGET = function contentAggregatedContentGET (req, res, next) {
  var content = req.swagger.params['content'].value;
  Content.contentAggregatedContentGET(content)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentAll_dealsGET = function contentAll_dealsGET (req, res, next) {
  var begin = req.swagger.params['begin'].value;
  var duration = req.swagger.params['duration'].value;
  var all = req.swagger.params['all'].value;
  Content.contentAll_dealsGET(begin,duration,all)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentBw_usageContentGET = function contentBw_usageContentGET (req, res, next) {
  var content = req.swagger.params['content'].value;
  Content.contentBw_usageContentGET(content)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentCreatePOST = function contentCreatePOST (req, res, next) {
  var req = req.swagger.params['req'].value;
  var ignoreDupes = req.swagger.params['ignore-dupes'].value;
  Content.contentCreatePOST(req,ignoreDupes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentDealsGET = function contentDealsGET (req, res, next) {
  var limit = req.swagger.params['limit'].value;
  var offset = req.swagger.params['offset'].value;
  Content.contentDealsGET(limit,offset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentEnsure_replicationDatacidGET = function contentEnsure_replicationDatacidGET (req, res, next) {
  var datacid = req.swagger.params['datacid'].value;
  Content.contentEnsure_replicationDatacidGET(datacid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentFailuresContentGET = function contentFailuresContentGET (req, res, next) {
  var content = req.swagger.params['content'].value;
  Content.contentFailuresContentGET(content)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentIdGET = function contentIdGET (req, res, next) {
  var id = req.swagger.params['id'].value;
  Content.contentIdGET(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentImportdealPOST = function contentImportdealPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Content.contentImportdealPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentListGET = function contentListGET (req, res, next) {
  Content.contentListGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentReadContGET = function contentReadContGET (req, res, next) {
  var cont = req.swagger.params['cont'].value;
  Content.contentReadContGET(cont)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStaging_zonesGET = function contentStaging_zonesGET (req, res, next) {
  Content.contentStaging_zonesGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStatsGET = function contentStatsGET (req, res, next) {
  var limit = req.swagger.params['limit'].value;
  var offset = req.swagger.params['offset'].value;
  Content.contentStatsGET(limit,offset)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.contentStatusIdGET = function contentStatusIdGET (req, res, next) {
  var id = req.swagger.params['id'].value;
  Content.contentStatusIdGET(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
