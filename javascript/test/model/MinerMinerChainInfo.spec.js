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
    describe('MinerMinerChainInfo', function() {
      beforeEach(function() {
        instance = new EstuaryClient.MinerMinerChainInfo();
      });

      it('should create an instance of MinerMinerChainInfo', function() {
        // TODO: update the code to test MinerMinerChainInfo
        expect(instance).to.be.a(EstuaryClient.MinerMinerChainInfo);
      });

      it('should have the property addresses (base name: "addresses")', function() {
        // TODO: update the code to test the property addresses
        expect(instance).to.have.property('addresses');
        // expect(instance.addresses).to.be(expectedValueLiteral);
      });

      it('should have the property owner (base name: "owner")', function() {
        // TODO: update the code to test the property owner
        expect(instance).to.have.property('owner');
        // expect(instance.owner).to.be(expectedValueLiteral);
      });

      it('should have the property peerId (base name: "peerId")', function() {
        // TODO: update the code to test the property peerId
        expect(instance).to.have.property('peerId');
        // expect(instance.peerId).to.be(expectedValueLiteral);
      });

      it('should have the property worker (base name: "worker")', function() {
        // TODO: update the code to test the property worker
        expect(instance).to.have.property('worker');
        // expect(instance.worker).to.be(expectedValueLiteral);
      });

    });
  });

}));
