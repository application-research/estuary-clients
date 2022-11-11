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

  describe('(package)', function() {
    describe('MainChannelIDParam', function() {
      beforeEach(function() {
        instance = new EstuaryClient.MainChannelIDParam();
      });

      it('should create an instance of MainChannelIDParam', function() {
        // TODO: update the code to test MainChannelIDParam
        expect(instance).to.be.a(EstuaryClient.MainChannelIDParam);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property initiator (base name: "initiator")', function() {
        // TODO: update the code to test the property initiator
        expect(instance).to.have.property('initiator');
        // expect(instance.initiator).to.be(expectedValueLiteral);
      });

      it('should have the property responder (base name: "responder")', function() {
        // TODO: update the code to test the property responder
        expect(instance).to.have.property('responder');
        // expect(instance.responder).to.be(expectedValueLiteral);
      });

    });
  });

}));
