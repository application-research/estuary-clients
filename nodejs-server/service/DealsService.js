'use strict';


/**
 * Estimate the cost of a deal
 * This endpoint estimates the cost of a deal
 *
 * body Main.estimateDealBody The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
 * no response value expected for this operation
 **/
exports.dealEstimatePOST = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get Deal Info
 * This endpoint returns the deal info for a deal
 *
 * dealid Integer Deal ID
 * no response value expected for this operation
 **/
exports.dealInfoDealidGET = function(dealid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get Proposal
 * This endpoint returns the proposal for a deal
 *
 * propcid String Proposal CID
 * no response value expected for this operation
 **/
exports.dealProposalPropcidGET = function(propcid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Query Ask
 * This endpoint returns the ask for a given CID
 *
 * miner String CID
 * no response value expected for this operation
 **/
exports.dealQueryMinerGET = function(miner) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Deal Status
 * This endpoint returns the status of a deal
 *
 * miner String Miner
 * propcid String Proposal CID
 * no response value expected for this operation
 **/
exports.dealStatusMinerPropcidGET = function(miner,propcid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get Deal Status by PropCid
 * Get Deal Status by PropCid
 *
 * propcid String PropCid
 * no response value expected for this operation
 **/
exports.dealStatus_by_proposalPropcidGET = function(propcid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Transfer In Progress
 * This endpoint returns the in-progress transfers
 *
 * no response value expected for this operation
 **/
exports.dealTransferIn_progressGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Transfer Status
 * This endpoint returns the status of a transfer
 *
 * no response value expected for this operation
 **/
exports.dealTransferStatusPOST = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get storage failures for user
 * This endpoint returns a list of storage failures for user
 *
 * no response value expected for this operation
 **/
exports.dealsFailuresGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Make Deal
 * This endpoint makes a deal for a given content and miner
 *
 * miner String Miner
 * dealRequest String Deal Request
 * no response value expected for this operation
 **/
exports.dealsMakeMinerPOST = function(miner,dealRequest) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get Deal Status
 * This endpoint returns the status of a deal
 *
 * deal Integer Deal ID
 * no response value expected for this operation
 **/
exports.dealsStatusDealGET = function(deal) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get storage failures
 * This endpoint returns a list of storage failures
 *
 * no response value expected for this operation
 **/
exports.publicDealsFailuresGET = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Query Ask
 * This endpoint returns the ask for a given CID
 *
 * miner String CID
 * no response value expected for this operation
 **/
exports.publicMinersStorageQueryMinerGET = function(miner) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

