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

  describe('(package)', function() {
    describe('MainUserStatsResponse', function() {
      beforeEach(function() {
        instance = new EstuaryClient.MainUserStatsResponse();
      });

      it('should create an instance of MainUserStatsResponse', function() {
        // TODO: update the code to test MainUserStatsResponse
        expect(instance).to.be.a(EstuaryClient.MainUserStatsResponse);
      });

      it('should have the property numPins (base name: "numPins")', function() {
        // TODO: update the code to test the property numPins
        expect(instance).to.have.property('numPins');
        // expect(instance.numPins).to.be(expectedValueLiteral);
      });

      it('should have the property totalSize (base name: "totalSize")', function() {
        // TODO: update the code to test the property totalSize
        expect(instance).to.have.property('totalSize');
        // expect(instance.totalSize).to.be(expectedValueLiteral);
      });

    });
  });

}));
