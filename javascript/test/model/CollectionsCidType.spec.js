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
    describe('CollectionsCidType', function() {
      beforeEach(function() {
        instance = EstuaryClient.CollectionsCidType;
      });

      it('should create an instance of CollectionsCidType', function() {
        // TODO: update the code to test CollectionsCidType
        expect(instance).to.be.a('object');
      });

      it('should have the property directory', function() {
        expect(instance).to.have.property('directory');
        expect(instance.directory).to.be("directory");
      });

      it('should have the property file', function() {
        expect(instance).to.have.property('file');
        expect(instance.file).to.be("file");
      });

    });
  });

}));
