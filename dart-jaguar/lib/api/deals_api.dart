import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:swagger/model/main_estimate_deal_body.dart';


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
    Future<void> dealEstimatePost(
        
        @AsJson() MainEstimateDealBody body
    );

    /// Get Deal Info
    ///
    /// This endpoint returns the deal info for a deal
    @GetReq(path: "/deal/info/:dealid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealInfoDealidGet(
            @PathParam("dealid") int dealid
    );

    /// Get Proposal
    ///
    /// This endpoint returns the proposal for a deal
    @GetReq(path: "/deal/proposal/:propcid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealProposalPropcidGet(
            @PathParam("propcid") String propcid
    );

    /// Query Ask
    ///
    /// This endpoint returns the ask for a given CID
    @GetReq(path: "/deal/query/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealQueryMinerGet(
            @PathParam("miner") String miner
    );

    /// Get Deal Status by PropCid
    ///
    /// Get Deal Status by PropCid
    @GetReq(path: "/deal/status-by-proposal/:propcid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealStatusByProposalPropcidGet(
            @PathParam("propcid") String propcid
    );

    /// Deal Status
    ///
    /// This endpoint returns the status of a deal
    @GetReq(path: "/deal/status/:miner/:propcid", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealStatusMinerPropcidGet(
            @PathParam("miner") String miner, 
            @PathParam("propcid") String propcid
    );

    /// Transfer In Progress
    ///
    /// This endpoint returns the in-progress transfers
    @GetReq(path: "/deal/transfer/in-progress", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealTransferInProgressGet(
    );

    /// Get storage failures for user
    ///
    /// This endpoint returns a list of storage failures for user
    @GetReq(path: "/deals/failures", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealsFailuresGet(
    );

    /// Make Deal
    ///
    /// This endpoint makes a deal for a given content and miner
    @PostReq(path: "/deals/make/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealsMakeMinerPost(
            @PathParam("miner") String miner
        ,
        @AsJson() String dealRequest
    );

    /// Get Deal Status
    ///
    /// This endpoint returns the status of a deal
    @GetReq(path: "/deals/status/:deal", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> dealsStatusDealGet(
            @PathParam("deal") int deal
    );

    /// Get storage failures
    ///
    /// This endpoint returns a list of storage failures
    @GetReq(path: "/public/deals/failures", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> publicDealsFailuresGet(
    );

    /// Query Ask
    ///
    /// This endpoint returns the ask for a given CID
    @GetReq(path: "/public/miners/storage/query/:miner", metadata: {"auth": [ {"type": "apiKey", "name": "bearerAuth", "keyName": "Authorization", "where": "header" }]})
    Future<void> publicMinersStorageQueryMinerGet(
            @PathParam("miner") String miner
    );


}
