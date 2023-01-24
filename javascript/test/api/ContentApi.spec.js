/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.38
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
    instance = new EstuaryClient.ContentApi();
  });

  describe('(package)', function() {
    describe('ContentApi', function() {
      describe('adminInvitesCodePost', function() {
        it('should call adminInvitesCodePost successfully', function(done) {
          // TODO: uncomment, update parameter values for adminInvitesCodePost call and complete the assertions
          /*

          instance.adminInvitesCodePost(code, function(error, data, response) {
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
      describe('adminInvitesGet', function() {
        it('should call adminInvitesGet successfully', function(done) {
          // TODO: uncomment adminInvitesGet call and complete the assertions
          /*

          instance.adminInvitesGet(function(error, data, response) {
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
      describe('contentAddCarPost', function() {
        it('should call contentAddCarPost successfully', function(done) {
          // TODO: uncomment, update parameter values for contentAddCarPost call and complete the assertions
          /*
          var opts = {};

          instance.contentAddCarPost(body, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.UtilContentAddResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('contentAddIpfsPost', function() {
        it('should call contentAddIpfsPost successfully', function(done) {
          // TODO: uncomment, update parameter values for contentAddIpfsPost call and complete the assertions
          /*
          var opts = {};

          instance.contentAddIpfsPost(body, opts, function(error, data, response) {
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
      describe('contentAddPost', function() {
        it('should call contentAddPost successfully', function(done) {
          // TODO: uncomment, update parameter values for contentAddPost call and complete the assertions
          /*
          var opts = {};

          instance.contentAddPost(data, filename, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.UtilContentAddResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('contentAggregatedContentGet', function() {
        it('should call contentAggregatedContentGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentAggregatedContentGet call and complete the assertions
          /*

          instance.contentAggregatedContentGet(content, function(error, data, response) {
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
      describe('contentAllDealsGet', function() {
        it('should call contentAllDealsGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentAllDealsGet call and complete the assertions
          /*

          instance.contentAllDealsGet(begin, duration, all, function(error, data, response) {
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
      describe('contentBwUsageContentGet', function() {
        it('should call contentBwUsageContentGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentBwUsageContentGet call and complete the assertions
          /*

          instance.contentBwUsageContentGet(content, function(error, data, response) {
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
      describe('contentContentsGet', function() {
        it('should call contentContentsGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentContentsGet call and complete the assertions
          /*

          instance.contentContentsGet(limit, offset, function(error, data, response) {
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
      describe('contentCreatePost', function() {
        it('should call contentCreatePost successfully', function(done) {
          // TODO: uncomment, update parameter values for contentCreatePost call and complete the assertions
          /*
          var opts = {};

          instance.contentCreatePost(body, opts, function(error, data, response) {
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
      describe('contentDealsGet', function() {
        it('should call contentDealsGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentDealsGet call and complete the assertions
          /*
          var opts = {};

          instance.contentDealsGet(opts, function(error, data, response) {
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
      describe('contentEnsureReplicationDatacidGet', function() {
        it('should call contentEnsureReplicationDatacidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentEnsureReplicationDatacidGet call and complete the assertions
          /*

          instance.contentEnsureReplicationDatacidGet(datacid, function(error, data, response) {
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
      describe('contentFailuresContentGet', function() {
        it('should call contentFailuresContentGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentFailuresContentGet call and complete the assertions
          /*

          instance.contentFailuresContentGet(content, function(error, data, response) {
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
      describe('contentIdGet', function() {
        it('should call contentIdGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentIdGet call and complete the assertions
          /*

          instance.contentIdGet(id, function(error, data, response) {
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
      describe('contentListGet', function() {
        it('should call contentListGet successfully', function(done) {
          // TODO: uncomment contentListGet call and complete the assertions
          /*

          instance.contentListGet(function(error, data, response) {
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
      describe('contentStagingZonesGet', function() {
        it('should call contentStagingZonesGet successfully', function(done) {
          // TODO: uncomment contentStagingZonesGet call and complete the assertions
          /*

          instance.contentStagingZonesGet(function(error, data, response) {
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
      describe('contentStagingZonesStagingZoneContentsGet', function() {
        it('should call contentStagingZonesStagingZoneContentsGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentStagingZonesStagingZoneContentsGet call and complete the assertions
          /*

          instance.contentStagingZonesStagingZoneContentsGet(stagingZone, limit, offset, function(error, data, response) {
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
      describe('contentStagingZonesStagingZoneGet', function() {
        it('should call contentStagingZonesStagingZoneGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentStagingZonesStagingZoneGet call and complete the assertions
          /*

          instance.contentStagingZonesStagingZoneGet(stagingZone, function(error, data, response) {
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
      describe('contentStatsGet', function() {
        it('should call contentStatsGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentStatsGet call and complete the assertions
          /*

          instance.contentStatsGet(limit, offset, function(error, data, response) {
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
      describe('contentStatusIdGet', function() {
        it('should call contentStatusIdGet successfully', function(done) {
          // TODO: uncomment, update parameter values for contentStatusIdGet call and complete the assertions
          /*

          instance.contentStatusIdGet(id, function(error, data, response) {
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
