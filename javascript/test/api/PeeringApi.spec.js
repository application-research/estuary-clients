/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.28
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
    instance = new EstuaryClient.PeeringApi();
  });

  describe('(package)', function() {
    describe('PeeringApi', function() {
      describe('adminPeeringPeersDelete', function() {
        it('should call adminPeeringPeersDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for adminPeeringPeersDelete call
          /*
          var body = [new EstuaryClient.[String]()];

          instance.adminPeeringPeersDelete(body, function(error, data, response) {
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
      describe('adminPeeringPeersGet', function() {
        it('should call adminPeeringPeersGet successfully', function(done) {
          // TODO: uncomment adminPeeringPeersGet call
          /*

          instance.adminPeeringPeersGet(function(error, data, response) {
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
      describe('adminPeeringPeersPost', function() {
        it('should call adminPeeringPeersPost successfully', function(done) {
          // TODO: uncomment adminPeeringPeersPost call
          /*

          instance.adminPeeringPeersPost(function(error, data, response) {
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
      describe('adminPeeringStartPost', function() {
        it('should call adminPeeringStartPost successfully', function(done) {
          // TODO: uncomment adminPeeringStartPost call
          /*

          instance.adminPeeringStartPost(function(error, data, response) {
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
      describe('adminPeeringStatusGet', function() {
        it('should call adminPeeringStatusGet successfully', function(done) {
          // TODO: uncomment adminPeeringStatusGet call
          /*

          instance.adminPeeringStatusGet(function(error, data, response) {
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
      describe('adminPeeringStopPost', function() {
        it('should call adminPeeringStopPost successfully', function(done) {
          // TODO: uncomment adminPeeringStopPost call
          /*

          instance.adminPeeringStopPost(function(error, data, response) {
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
