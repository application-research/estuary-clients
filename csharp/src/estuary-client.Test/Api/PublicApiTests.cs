/* 
 * Estuary API
 *
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using estuary-client.Client;
using estuary-client.Api;
using estuary-client.Model;

namespace estuary-client.Test
{
    /// <summary>
    ///  Class for testing PublicApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class PublicApiTests
    {
        private PublicApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PublicApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PublicApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' PublicApi
            //Assert.IsInstanceOfType(typeof(PublicApi), instance, "instance is a PublicApi");
        }

        /// <summary>
        /// Test GetCidGet
        /// </summary>
        [Test]
        public void GetCidGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string cid = null;
            //instance.GetCidGet(cid);
            
        }
        /// <summary>
        /// Test PublicByCidCidGet
        /// </summary>
        [Test]
        public void PublicByCidCidGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string cid = null;
            //var response = instance.PublicByCidCidGet(cid);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test PublicInfoGet
        /// </summary>
        [Test]
        public void PublicInfoGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.PublicInfoGet();
            //Assert.IsInstanceOf<ApiPublicNodeInfo> (response, "response is ApiPublicNodeInfo");
        }
        /// <summary>
        /// Test PublicMetricsDealsOnChainGet
        /// </summary>
        [Test]
        public void PublicMetricsDealsOnChainGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.PublicMetricsDealsOnChainGet();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test PublicMinersDealsMinerGet
        /// </summary>
        [Test]
        public void PublicMinersDealsMinerGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string miner = null;
            //string ignoreFailed = null;
            //var response = instance.PublicMinersDealsMinerGet(miner, ignoreFailed);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test PublicMinersFailuresMinerGet
        /// </summary>
        [Test]
        public void PublicMinersFailuresMinerGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string miner = null;
            //var response = instance.PublicMinersFailuresMinerGet(miner);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test PublicMinersStatsMinerGet
        /// </summary>
        [Test]
        public void PublicMinersStatsMinerGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string miner = null;
            //var response = instance.PublicMinersStatsMinerGet(miner);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test PublicNetAddrsGet
        /// </summary>
        [Test]
        public void PublicNetAddrsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.PublicNetAddrsGet();
            //Assert.IsInstanceOf<List<string>> (response, "response is List<string>");
        }
        /// <summary>
        /// Test PublicNetPeersGet
        /// </summary>
        [Test]
        public void PublicNetPeersGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.PublicNetPeersGet();
            //Assert.IsInstanceOf<List<string>> (response, "response is List<string>");
        }
        /// <summary>
        /// Test PublicStatsGet
        /// </summary>
        [Test]
        public void PublicStatsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.PublicStatsGet();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
    }

}
