/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.40
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
    instance = new EstuaryClient.MinerApi();
  });

  describe('(package)', function() {
    describe('MinerApi', function() {
      describe('minerClaimMinerGet', function() {
        it('should call minerClaimMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for minerClaimMinerGet call and complete the assertions
          /*

          instance.minerClaimMinerGet(miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.ApiClaimMsgResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('minerClaimPost', function() {
        it('should call minerClaimPost successfully', function(done) {
          // TODO: uncomment, update parameter values for minerClaimPost call and complete the assertions
          /*

          instance.minerClaimPost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.ApiClaimResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('minerSetInfoMinerPut', function() {
        it('should call minerSetInfoMinerPut successfully', function(done) {
          // TODO: uncomment, update parameter values for minerSetInfoMinerPut call and complete the assertions
          /*

          instance.minerSetInfoMinerPut(body, miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.ApiEmptyResp);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('minerSuspendMinerPost', function() {
        it('should call minerSuspendMinerPost successfully', function(done) {
          // TODO: uncomment, update parameter values for minerSuspendMinerPost call and complete the assertions
          /*

          instance.minerSuspendMinerPost(body, miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.ApiEmptyResp);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('minerUnsuspendMinerPut', function() {
        it('should call minerUnsuspendMinerPut successfully', function(done) {
          // TODO: uncomment, update parameter values for minerUnsuspendMinerPut call and complete the assertions
          /*

          instance.minerUnsuspendMinerPut(miner, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.ApiEmptyResp);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('publicMinersDealsMinerGet', function() {
        it('should call publicMinersDealsMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for publicMinersDealsMinerGet call and complete the assertions
          /*
          var opts = {};

          instance.publicMinersDealsMinerGet(miner, opts, function(error, data, response) {
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
      describe('publicMinersStatsMinerGet', function() {
        it('should call publicMinersStatsMinerGet successfully', function(done) {
          // TODO: uncomment, update parameter values for publicMinersStatsMinerGet call and complete the assertions
          /*

          instance.publicMinersStatsMinerGet(miner, function(error, data, response) {
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
