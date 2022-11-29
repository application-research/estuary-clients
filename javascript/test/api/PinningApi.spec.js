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
    instance = new EstuaryClient.PinningApi();
  });

  describe('(package)', function() {
    describe('PinningApi', function() {
      describe('pinningPinsGet', function() {
        it('should call pinningPinsGet successfully', function(done) {
          // TODO: uncomment pinningPinsGet call and complete the assertions
          /*

          instance.pinningPinsGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsListPinStatusResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPinidDelete', function() {
        it('should call pinningPinsPinidDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPinidDelete call
          /*

          instance.pinningPinsPinidDelete(pinid, function(error, data, response) {
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
      describe('pinningPinsPinidGet', function() {
        it('should call pinningPinsPinidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPinidGet call and complete the assertions
          /*

          instance.pinningPinsPinidGet(pinid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPinidPost', function() {
        it('should call pinningPinsPinidPost successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPinidPost call and complete the assertions
          /*

          instance.pinningPinsPinidPost(body, pinid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPost', function() {
        it('should call pinningPinsPost successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPost call and complete the assertions
          /*

          instance.pinningPinsPost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);

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
