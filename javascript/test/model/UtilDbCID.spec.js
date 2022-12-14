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

  describe('(package)', function() {
    describe('UtilDbCID', function() {
      beforeEach(function() {
        instance = new EstuaryClient.UtilDbCID();
      });

      it('should create an instance of UtilDbCID', function() {
        // TODO: update the code to test UtilDbCID
        expect(instance).to.be.a(EstuaryClient.UtilDbCID);
      });

      it('should have the property cid (base name: "cid")', function() {
        // TODO: update the code to test the property cid
        expect(instance).to.have.property('cid');
        // expect(instance.cid).to.be(expectedValueLiteral);
      });

    });
  });

}));