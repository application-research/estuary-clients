/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.38
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
    describe('AutoretrieveInitBody', function() {
      beforeEach(function() {
        instance = new EstuaryClient.AutoretrieveInitBody();
      });

      it('should create an instance of AutoretrieveInitBody', function() {
        // TODO: update the code to test AutoretrieveInitBody
        expect(instance).to.be.a(EstuaryClient.AutoretrieveInitBody);
      });

      it('should have the property addresses (base name: "addresses")', function() {
        // TODO: update the code to test the property addresses
        expect(instance).to.have.property('addresses');
        // expect(instance.addresses).to.be(expectedValueLiteral);
      });

      it('should have the property pubKey (base name: "pubKey")', function() {
        // TODO: update the code to test the property pubKey
        expect(instance).to.have.property('pubKey');
        // expect(instance.pubKey).to.be(expectedValueLiteral);
      });

    });
  });

}));
