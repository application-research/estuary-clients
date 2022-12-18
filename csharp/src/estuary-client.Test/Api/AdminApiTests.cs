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
    ///  Class for testing AdminApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AdminApiTests
    {
        private AdminApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AdminApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AdminApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AdminApi
            //Assert.IsInstanceOfType(typeof(AdminApi), instance, "instance is a AdminApi");
        }

        /// <summary>
        /// Test AdminPeeringPeersDelete
        /// </summary>
        [Test]
        public void AdminPeeringPeersDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<string> body = null;
            //var response = instance.AdminPeeringPeersDelete(body);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminPeeringPeersGet
        /// </summary>
        [Test]
        public void AdminPeeringPeersGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.AdminPeeringPeersGet();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminPeeringPeersPost
        /// </summary>
        [Test]
        public void AdminPeeringPeersPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<PeeringPeeringPeer> body = null;
            //var response = instance.AdminPeeringPeersPost(body);
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminPeeringStartPost
        /// </summary>
        [Test]
        public void AdminPeeringStartPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.AdminPeeringStartPost();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminPeeringStatusGet
        /// </summary>
        [Test]
        public void AdminPeeringStatusGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.AdminPeeringStatusGet();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminPeeringStopPost
        /// </summary>
        [Test]
        public void AdminPeeringStopPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.AdminPeeringStopPost();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminSystemConfigGet
        /// </summary>
        [Test]
        public void AdminSystemConfigGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.AdminSystemConfigGet();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
        /// <summary>
        /// Test AdminUsersGet
        /// </summary>
        [Test]
        public void AdminUsersGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.AdminUsersGet();
            //Assert.IsInstanceOf<string> (response, "response is string");
        }
    }

}
