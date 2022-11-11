/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.29
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
    instance = new EstuaryClient.AdminApi();
  });

  describe('(package)', function() {
    describe('AdminApi', function() {
      describe('adminPeeringPeersDelete', function() {
        it('should call adminPeeringPeersDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for adminPeeringPeersDelete call and complete the assertions
          /*
          var peerIds = [new EstuaryClient.[Boolean]()];

          instance.adminPeeringPeersDelete(peerIds, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminPeeringPeersGet', function() {
        it('should call adminPeeringPeersGet successfully', function(done) {
          // TODO: uncomment adminPeeringPeersGet call and complete the assertions
          /*

          instance.adminPeeringPeersGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminPeeringPeersPost', function() {
        it('should call adminPeeringPeersPost successfully', function(done) {
          // TODO: uncomment adminPeeringPeersPost call and complete the assertions
          /*

          instance.adminPeeringPeersPost(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminPeeringStartPost', function() {
        it('should call adminPeeringStartPost successfully', function(done) {
          // TODO: uncomment adminPeeringStartPost call and complete the assertions
          /*

          instance.adminPeeringStartPost(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminPeeringStatusGet', function() {
        it('should call adminPeeringStatusGet successfully', function(done) {
          // TODO: uncomment adminPeeringStatusGet call and complete the assertions
          /*

          instance.adminPeeringStatusGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminPeeringStopPost', function() {
        it('should call adminPeeringStopPost successfully', function(done) {
          // TODO: uncomment adminPeeringStopPost call and complete the assertions
          /*

          instance.adminPeeringStopPost(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminSystemConfigGet', function() {
        it('should call adminSystemConfigGet successfully', function(done) {
          // TODO: uncomment adminSystemConfigGet call and complete the assertions
          /*

          instance.adminSystemConfigGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('adminUsersGet', function() {
        it('should call adminUsersGet successfully', function(done) {
          // TODO: uncomment adminUsersGet call and complete the assertions
          /*

          instance.adminUsersGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a('string');
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
