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
    instance = new EstuaryClient.SpApi();
  });

  describe('(package)', function() {
    describe('SpApi', function() {
      describe('storageProvidersClaimPost', function() {
        it('should call storageProvidersClaimPost successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersClaimPost call and complete the assertions
          /*

          instance.storageProvidersClaimPost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.GithubComApplicationResearchEstuaryApiV2ClaimResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('storageProvidersClaimSpGet', function() {
        it('should call storageProvidersClaimSpGet successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersClaimSpGet call and complete the assertions
          /*

          instance.storageProvidersClaimSpGet(sp, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('storageProvidersDealsSpGet', function() {
        it('should call storageProvidersDealsSpGet successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersDealsSpGet call and complete the assertions
          /*
          var opts = {};

          instance.storageProvidersDealsSpGet(sp, opts, function(error, data, response) {
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
      describe('storageProvidersFailuresSpGet', function() {
        it('should call storageProvidersFailuresSpGet successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersFailuresSpGet call and complete the assertions
          /*

          instance.storageProvidersFailuresSpGet(sp, function(error, data, response) {
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
      describe('storageProvidersGet', function() {
        it('should call storageProvidersGet successfully', function(done) {
          // TODO: uncomment storageProvidersGet call and complete the assertions
          /*

          instance.storageProvidersGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(EstuaryClient.ApiStorageProviderResp);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('storageProvidersSetInfoSpPut', function() {
        it('should call storageProvidersSetInfoSpPut successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersSetInfoSpPut call
          /*

          instance.storageProvidersSetInfoSpPut(body, sp, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('storageProvidersStatsSpGet', function() {
        it('should call storageProvidersStatsSpGet successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersStatsSpGet call and complete the assertions
          /*

          instance.storageProvidersStatsSpGet(sp, function(error, data, response) {
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
      describe('storageProvidersSuspendSpPost', function() {
        it('should call storageProvidersSuspendSpPost successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersSuspendSpPost call and complete the assertions
          /*

          instance.storageProvidersSuspendSpPost(body, sp, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(&#x27;string&#x27;);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('storageProvidersUnsuspendSpPut', function() {
        it('should call storageProvidersUnsuspendSpPut successfully', function(done) {
          // TODO: uncomment, update parameter values for storageProvidersUnsuspendSpPut call
          /*

          instance.storageProvidersUnsuspendSpPut(sp, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

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
