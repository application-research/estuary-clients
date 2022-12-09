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

  beforeEach(function() {
    instance = new EstuaryClient.CollectionsApi();
  });

  describe('(package)', function() {
    describe('CollectionsApi', function() {
      describe('collectionsColuuidCommitPost', function() {
        it('should call collectionsColuuidCommitPost successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsColuuidCommitPost call and complete the assertions
          /*

          instance.collectionsColuuidCommitPost(coluuid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsColuuidContentsDelete', function() {
        it('should call collectionsColuuidContentsDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsColuuidContentsDelete call and complete the assertions
          /*

          instance.collectionsColuuidContentsDelete(body, coluuid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsColuuidDelete', function() {
        it('should call collectionsColuuidDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsColuuidDelete call and complete the assertions
          /*

          instance.collectionsColuuidDelete(coluuid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsColuuidGet', function() {
        it('should call collectionsColuuidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsColuuidGet call and complete the assertions
          /*
          var opts = {};

          instance.collectionsColuuidGet(coluuid, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(EstuaryClient.CollectionsCollectionListResponse);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsColuuidPost', function() {
        it('should call collectionsColuuidPost successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsColuuidPost call and complete the assertions
          /*
          var opts = {};

          instance.collectionsColuuidPost(body, coluuid, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsFsAddPost', function() {
        it('should call collectionsFsAddPost successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsFsAddPost call and complete the assertions
          /*

          instance.collectionsFsAddPost(coluuid, content, path, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsGet', function() {
        it('should call collectionsGet successfully', function(done) {
          // TODO: uncomment collectionsGet call and complete the assertions
          /*

          instance.collectionsGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(EstuaryClient.CollectionsCollection);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('collectionsPost', function() {
        it('should call collectionsPost successfully', function(done) {
          // TODO: uncomment, update parameter values for collectionsPost call and complete the assertions
          /*

          instance.collectionsPost(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.CollectionsCollection);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
