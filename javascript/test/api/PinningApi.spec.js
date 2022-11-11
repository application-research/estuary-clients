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

  beforeEach(function() {
    instance = new EstuaryClient.PinningApi();
  });

  describe('(package)', function() {
    describe('PinningApi', function() {
      describe('pinningPinsGet', function() {
        it('should call pinningPinsGet successfully', function(done) {
          // TODO: uncomment pinningPinsGet call and complete the assertions
          /*

          instance.pinningPinsGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsListPinStatusResponse);
            expect(data.count).to.be.a('number');
            expect(data.count).to.be(0);
            {
              let dataCtr = data.results;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);
                expect(data.created).to.be.a('string');
                expect(data.created).to.be("");
                {
                  let dataCtr = data.delegates;
                  expect(dataCtr).to.be.an(Array);
                  expect(dataCtr).to.not.be.empty();
                  for (let p in dataCtr) {
                    let data = dataCtr[p];
                    expect(data).to.be.a('string');
                    expect(data).to.be("");
                  }
                }
                expect(data.info).to.be.a(Object);
                expect(data.info).to.be();
                expect(data.pin).to.be.a(EstuaryClient.TypesIpfsPin);
                      expect(data.pin.cid).to.be.a('string');
                  expect(data.pin.cid).to.be("");
                  expect(data.pin.meta).to.be.a(Object);
                  expect(data.pin.meta).to.be();
                  expect(data.pin.name).to.be.a('string');
                  expect(data.pin.name).to.be("");
                  {
                    let dataCtr = data.pin.origins;
                    expect(dataCtr).to.be.an(Array);
                    expect(dataCtr).to.not.be.empty();
                    for (let p in dataCtr) {
                      let data = dataCtr[p];
                      expect(data).to.be.a('string');
                      expect(data).to.be("");
                    }
                  }
                expect(data.requestid).to.be.a('string');
                expect(data.requestid).to.be("");
                expect(data.status).to.be.a('string');
                expect(data.status).to.be("");

                      }
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPinidDelete', function() {
        it('should call pinningPinsPinidDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPinidDelete call
          /*
          var pinid = "pinid_example";

          instance.pinningPinsPinidDelete(pinid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPinidGet', function() {
        it('should call pinningPinsPinidGet successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPinidGet call and complete the assertions
          /*
          var pinid = "pinid_example";

          instance.pinningPinsPinidGet(pinid, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);
            expect(data.created).to.be.a('string');
            expect(data.created).to.be("");
            {
              let dataCtr = data.delegates;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a('string');
                expect(data).to.be("");
              }
            }
            expect(data.info).to.be.a(Object);
            expect(data.info).to.be();
            expect(data.pin).to.be.a(EstuaryClient.TypesIpfsPin);
                  expect(data.pin.cid).to.be.a('string');
              expect(data.pin.cid).to.be("");
              expect(data.pin.meta).to.be.a(Object);
              expect(data.pin.meta).to.be();
              expect(data.pin.name).to.be.a('string');
              expect(data.pin.name).to.be("");
              {
                let dataCtr = data.pin.origins;
                expect(dataCtr).to.be.an(Array);
                expect(dataCtr).to.not.be.empty();
                for (let p in dataCtr) {
                  let data = dataCtr[p];
                  expect(data).to.be.a('string');
                  expect(data).to.be("");
                }
              }
            expect(data.requestid).to.be.a('string');
            expect(data.requestid).to.be("");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPinidPost', function() {
        it('should call pinningPinsPinidPost successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPinidPost call and complete the assertions
          /*
          var pinid = "pinid_example";
          var cid = "cid_example";
          var opts = {};
          opts.name = "name_example";
          opts.origins = "origins_example";
          opts.meta = "meta_example";

          instance.pinningPinsPinidPost(pinid, cid, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);
            expect(data.created).to.be.a('string');
            expect(data.created).to.be("");
            {
              let dataCtr = data.delegates;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a('string');
                expect(data).to.be("");
              }
            }
            expect(data.info).to.be.a(Object);
            expect(data.info).to.be();
            expect(data.pin).to.be.a(EstuaryClient.TypesIpfsPin);
                  expect(data.pin.cid).to.be.a('string');
              expect(data.pin.cid).to.be("");
              expect(data.pin.meta).to.be.a(Object);
              expect(data.pin.meta).to.be();
              expect(data.pin.name).to.be.a('string');
              expect(data.pin.name).to.be("");
              {
                let dataCtr = data.pin.origins;
                expect(dataCtr).to.be.an(Array);
                expect(dataCtr).to.not.be.empty();
                for (let p in dataCtr) {
                  let data = dataCtr[p];
                  expect(data).to.be.a('string');
                  expect(data).to.be("");
                }
              }
            expect(data.requestid).to.be.a('string');
            expect(data.requestid).to.be("");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('pinningPinsPost', function() {
        it('should call pinningPinsPost successfully', function(done) {
          // TODO: uncomment, update parameter values for pinningPinsPost call and complete the assertions
          /*
          var pin = new EstuaryClient.TypesIpfsPin();
          pin.cid = "";
          pin.meta = ;
          pin.name = "";
          pin.origins = [""];

          instance.pinningPinsPost(pin, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(EstuaryClient.TypesIpfsPinStatusResponse);
            expect(data.created).to.be.a('string');
            expect(data.created).to.be("");
            {
              let dataCtr = data.delegates;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a('string');
                expect(data).to.be("");
              }
            }
            expect(data.info).to.be.a(Object);
            expect(data.info).to.be();
            expect(data.pin).to.be.a(EstuaryClient.TypesIpfsPin);
                  expect(data.pin.cid).to.be.a('string');
              expect(data.pin.cid).to.be("");
              expect(data.pin.meta).to.be.a(Object);
              expect(data.pin.meta).to.be();
              expect(data.pin.name).to.be.a('string');
              expect(data.pin.name).to.be("");
              {
                let dataCtr = data.pin.origins;
                expect(dataCtr).to.be.an(Array);
                expect(dataCtr).to.not.be.empty();
                for (let p in dataCtr) {
                  let data = dataCtr[p];
                  expect(data).to.be.a('string');
                  expect(data).to.be("");
                }
              }
            expect(data.requestid).to.be.a('string');
            expect(data.requestid).to.be("");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");

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
