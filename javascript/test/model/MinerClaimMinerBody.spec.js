/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.39
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
    describe('MinerClaimMinerBody', function() {
      beforeEach(function() {
        instance = new EstuaryClient.MinerClaimMinerBody();
      });

      it('should create an instance of MinerClaimMinerBody', function() {
        // TODO: update the code to test MinerClaimMinerBody
        expect(instance).to.be.a(EstuaryClient.MinerClaimMinerBody);
      });

      it('should have the property claim (base name: "claim")', function() {
        // TODO: update the code to test the property claim
        expect(instance).to.have.property('claim');
        // expect(instance.claim).to.be(expectedValueLiteral);
      });

      it('should have the property miner (base name: "miner")', function() {
        // TODO: update the code to test the property miner
        expect(instance).to.have.property('miner');
        // expect(instance.miner).to.be(expectedValueLiteral);
      });

      it('should have the property name (base name: "name")', function() {
        // TODO: update the code to test the property name
        expect(instance).to.have.property('name');
        // expect(instance.name).to.be(expectedValueLiteral);
      });

    });
  });

}));
