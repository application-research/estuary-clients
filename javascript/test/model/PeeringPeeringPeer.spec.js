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

  describe('(package)', function() {
    describe('PeeringPeeringPeer', function() {
      beforeEach(function() {
        instance = new EstuaryClient.PeeringPeeringPeer();
      });

      it('should create an instance of PeeringPeeringPeer', function() {
        // TODO: update the code to test PeeringPeeringPeer
        expect(instance).to.be.a(EstuaryClient.PeeringPeeringPeer);
      });

      it('should have the property addrs (base name: "Addrs")', function() {
        // TODO: update the code to test the property addrs
        expect(instance).to.have.property('addrs');
        // expect(instance.addrs).to.be(expectedValueLiteral);
      });

      it('should have the property connected (base name: "Connected")', function() {
        // TODO: update the code to test the property connected
        expect(instance).to.have.property('connected');
        // expect(instance.connected).to.be(expectedValueLiteral);
      });

      it('should have the property ID (base name: "ID")', function() {
        // TODO: update the code to test the property ID
        expect(instance).to.have.property('ID');
        // expect(instance.ID).to.be(expectedValueLiteral);
      });

    });
  });

}));
