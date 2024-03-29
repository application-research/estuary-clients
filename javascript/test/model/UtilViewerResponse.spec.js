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
    describe('UtilViewerResponse', function() {
      beforeEach(function() {
        instance = new EstuaryClient.UtilViewerResponse();
      });

      it('should create an instance of UtilViewerResponse', function() {
        // TODO: update the code to test UtilViewerResponse
        expect(instance).to.be.a(EstuaryClient.UtilViewerResponse);
      });

      it('should have the property address (base name: "address")', function() {
        // TODO: update the code to test the property address
        expect(instance).to.have.property('address');
        // expect(instance.address).to.be(expectedValueLiteral);
      });

      it('should have the property authExpiry (base name: "auth_expiry")', function() {
        // TODO: update the code to test the property authExpiry
        expect(instance).to.have.property('authExpiry');
        // expect(instance.authExpiry).to.be(expectedValueLiteral);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property miners (base name: "miners")', function() {
        // TODO: update the code to test the property miners
        expect(instance).to.have.property('miners');
        // expect(instance.miners).to.be(expectedValueLiteral);
      });

      it('should have the property perms (base name: "perms")', function() {
        // TODO: update the code to test the property perms
        expect(instance).to.have.property('perms');
        // expect(instance.perms).to.be(expectedValueLiteral);
      });

      it('should have the property settings (base name: "settings")', function() {
        // TODO: update the code to test the property settings
        expect(instance).to.have.property('settings');
        // expect(instance.settings).to.be(expectedValueLiteral);
      });

      it('should have the property username (base name: "username")', function() {
        // TODO: update the code to test the property username
        expect(instance).to.have.property('username');
        // expect(instance.username).to.be(expectedValueLiteral);
      });

    });
  });

}));
