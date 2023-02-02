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
    describe('ApiMinerResp', function() {
      beforeEach(function() {
        instance = new EstuaryClient.ApiMinerResp();
      });

      it('should create an instance of ApiMinerResp', function() {
        // TODO: update the code to test ApiMinerResp
        expect(instance).to.be.a(EstuaryClient.ApiMinerResp);
      });

      it('should have the property addr (base name: "addr")', function() {
        // TODO: update the code to test the property addr
        expect(instance).to.have.property('addr');
        // expect(instance.addr).to.be(expectedValueLiteral);
      });

      it('should have the property chainInfo (base name: "chain_info")', function() {
        // TODO: update the code to test the property chainInfo
        expect(instance).to.have.property('chainInfo');
        // expect(instance.chainInfo).to.be(expectedValueLiteral);
      });

      it('should have the property name (base name: "name")', function() {
        // TODO: update the code to test the property name
        expect(instance).to.have.property('name');
        // expect(instance.name).to.be(expectedValueLiteral);
      });

      it('should have the property suspended (base name: "suspended")', function() {
        // TODO: update the code to test the property suspended
        expect(instance).to.have.property('suspended');
        // expect(instance.suspended).to.be(expectedValueLiteral);
      });

      it('should have the property suspendedReason (base name: "suspendedReason")', function() {
        // TODO: update the code to test the property suspendedReason
        expect(instance).to.have.property('suspendedReason');
        // expect(instance.suspendedReason).to.be(expectedValueLiteral);
      });

      it('should have the property version (base name: "version")', function() {
        // TODO: update the code to test the property version
        expect(instance).to.have.property('version');
        // expect(instance.version).to.be(expectedValueLiteral);
      });

    });
  });

}));
