import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/main_estimate_deal_body.dart';
import 'package:swagger/model/main_channel_id_param.dart';
import 'package:swagger/model/util_http_error.dart';


part 'deals_api.jretro.dart';

@GenApiClient()
class DealsApi extends _$DealsApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;

    DealsApi({this.base, this.serializers});

    /// Estimate the cost of a deal
    ///
    /// This endpoint estimates the cost of a deal
    @PostReq(path: "/deal/estimate", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealEstimatePost(
        
        @AsJson() MainEstimateDealBody body
    );

    /// Get Deal Info
    ///
    /// This endpoint returns the deal info for a deal
    @GetReq(path: "/deal/info/:dealid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealInfoDealidGet(
            @PathParam("dealid") int dealid
    );

    /// Get Proposal
    ///
    /// This endpoint returns the proposal for a deal
    @GetReq(path: "/deal/proposal/:propcid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealProposalPropcidGet(
            @PathParam("propcid") String propcid
    );

    /// Query Ask
    ///
    /// This endpoint returns the ask for a given CID
    @GetReq(path: "/deal/query/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealQueryMinerGet(
            @PathParam("miner") String miner
    );

    /// Get Deal Status by PropCid
    ///
    /// Get Deal Status by PropCid
    @GetReq(path: "/deal/status-by-proposal/:propcid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealStatusByProposalPropcidGet(
            @PathParam("propcid") String propcid
    );

    /// Deal Status
    ///
    /// This endpoint returns the status of a deal
    @GetReq(path: "/deal/status/:miner/:propcid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealStatusMinerPropcidGet(
            @PathParam("miner") String miner, 
            @PathParam("propcid") String propcid
    );

    /// Transfer In Progress
    ///
    /// This endpoint returns the in-progress transfers
    @GetReq(path: "/deal/transfer/in-progress", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealTransferInProgressGet(
    );

    /// Transfer Status
    ///
    /// This endpoint returns the status of a transfer
    @PostReq(path: "/deal/transfer/status", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealTransferStatusPost(
        
        @AsJson() MainChannelIDParam chanid
    );

    /// Get storage failures for user
    ///
    /// This endpoint returns a list of storage failures for user
    @GetReq(path: "/deals/failures", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealsFailuresGet(
    );

    /// Make Deal
    ///
    /// This endpoint makes a deal for a given content and miner
    @PostReq(path: "/deals/make/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealsMakeMinerPost(
            @PathParam("miner") String miner
        ,
        @AsJson() String dealRequest
    );

    /// Get Deal Status
    ///
    /// This endpoint returns the status of a deal
    @GetReq(path: "/deals/status/:deal", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> dealsStatusDealGet(
            @PathParam("deal") int deal
    );

    /// Get storage failures
    ///
    /// This endpoint returns a list of storage failures
    @GetReq(path: "/public/deals/failures", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicDealsFailuresGet(
    );

    /// Query Ask
    ///
    /// This endpoint returns the ask for a given CID
    @GetReq(path: "/public/miners/storage/query/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<String> publicMinersStorageQueryMinerGet(
            @PathParam("miner") String miner
    );


}
