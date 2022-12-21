/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.36
 *
 * Do not edit the class manually.
 *
 */
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.EstuaryClient);
  }
}(this, function(expect, EstuaryClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new EstuaryClient.DealsApi();
  });

  describe('(package)', function() {
    describe('DealsApi', function() {
      describe('dealEstimatePost', function() {
        it('should call dealEstimatePost successfully', function(done) {
          // TODO: uncomment, update parameter values for dealEstimatePost call and complete the assertions
          /*

          instance.dealEstimatePost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealInfoDealidGet', function() {
        it('should call dealInfoDealidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealInfoDealidGet call and complete the assertions
          /*

          instance.dealInfoDealidGet(dealid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealProposalPropcidGet', function() {
        it('should call dealProposalPropcidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealProposalPropcidGet call and complete the assertions
          /*

          instance.dealProposalPropcidGet(propcid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealQueryMinerGet', function() {
        it('should call dealQueryMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealQueryMinerGet call and complete the assertions
          /*

          instance.dealQueryMinerGet(miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealStatusByProposalPropcidGet', function() {
        it('should call dealStatusByProposalPropcidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealStatusByProposalPropcidGet call and complete the assertions
          /*

          instance.dealStatusByProposalPropcidGet(propcid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealStatusMinerPropcidGet', function() {
        it('should call dealStatusMinerPropcidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealStatusMinerPropcidGet call and complete the assertions
          /*

          instance.dealStatusMinerPropcidGet(miner, propcid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealTransferInProgressGet', function() {
        it('should call dealTransferInProgressGet successfully', function(done) {
          // TODO: uncomment dealTransferInProgressGet call and complete the assertions
          /*

          instance.dealTransferInProgressGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealTransferStatusPost', function() {
        it('should call dealTransferStatusPost successfully', function(done) {
          // TODO: uncomment, update parameter values for dealTransferStatusPost call and complete the assertions
          /*

          instance.dealTransferStatusPost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealsFailuresGet', function() {
        it('should call dealsFailuresGet successfully', function(done) {
          // TODO: uncomment dealsFailuresGet call and complete the assertions
          /*

          instance.dealsFailuresGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealsMakeMinerPost', function() {
        it('should call dealsMakeMinerPost successfully', function(done) {
          // TODO: uncomment, update parameter values for dealsMakeMinerPost call and complete the assertions
          /*

          instance.dealsMakeMinerPost(body, miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('dealsStatusDealGet', function() {
        it('should call dealsStatusDealGet successfully', function(done) {
          // TODO: uncomment, update parameter values for dealsStatusDealGet call and complete the assertions
          /*

          instance.dealsStatusDealGet(deal, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('publicDealsFailuresGet', function() {
        it('should call publicDealsFailuresGet successfully', function(done) {
          // TODO: uncomment publicDealsFailuresGet call and complete the assertions
          /*

          instance.publicDealsFailuresGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('publicMinersStorageQueryMinerGet', function() {
        it('should call publicMinersStorageQueryMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for publicMinersStorageQueryMinerGet call and complete the assertions
          /*

          instance.publicMinersStorageQueryMinerGet(miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('storageProvidersStorageQueryCidGet', function() {
        it('should call storageProvidersStorageQueryCidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersStorageQueryCidGet call and complete the assertions
          /*

          instance.storageProvidersStorageQueryCidGet(cid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
