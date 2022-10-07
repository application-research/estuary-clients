@isTest
private class SwagUtilContentAddResponseTest {
    @isTest
    private static void equalsSameInstance() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = utilContentAddResponse1;
        SwagUtilContentAddResponse utilContentAddResponse3 = new SwagUtilContentAddResponse();
        SwagUtilContentAddResponse utilContentAddResponse4 = utilContentAddResponse3;

        System.assert(utilContentAddResponse1.equals(utilContentAddResponse2));
        System.assert(utilContentAddResponse2.equals(utilContentAddResponse1));
        System.assert(utilContentAddResponse1.equals(utilContentAddResponse1));
        System.assert(utilContentAddResponse3.equals(utilContentAddResponse4));
        System.assert(utilContentAddResponse4.equals(utilContentAddResponse3));
        System.assert(utilContentAddResponse3.equals(utilContentAddResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse3 = new SwagUtilContentAddResponse();
        SwagUtilContentAddResponse utilContentAddResponse4 = new SwagUtilContentAddResponse();

        System.assert(utilContentAddResponse1.equals(utilContentAddResponse2));
        System.assert(utilContentAddResponse2.equals(utilContentAddResponse1));
        System.assert(utilContentAddResponse3.equals(utilContentAddResponse4));
        System.assert(utilContentAddResponse4.equals(utilContentAddResponse3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = new SwagUtilContentAddResponse();

        System.assertEquals(false, utilContentAddResponse1.equals(utilContentAddResponse2));
        System.assertEquals(false, utilContentAddResponse2.equals(utilContentAddResponse1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = new SwagUtilContentAddResponse();

        System.assertEquals(false, utilContentAddResponse1.equals('foo'));
        System.assertEquals(false, utilContentAddResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = new SwagUtilContentAddResponse();
        SwagUtilContentAddResponse utilContentAddResponse3;

        System.assertEquals(false, utilContentAddResponse1.equals(utilContentAddResponse3));
        System.assertEquals(false, utilContentAddResponse2.equals(utilContentAddResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = new SwagUtilContentAddResponse();

        System.assertEquals(utilContentAddResponse1.hashCode(), utilContentAddResponse1.hashCode());
        System.assertEquals(utilContentAddResponse2.hashCode(), utilContentAddResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagUtilContentAddResponse utilContentAddResponse1 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse2 = SwagUtilContentAddResponse.getExample();
        SwagUtilContentAddResponse utilContentAddResponse3 = new SwagUtilContentAddResponse();
        SwagUtilContentAddResponse utilContentAddResponse4 = new SwagUtilContentAddResponse();

        System.assert(utilContentAddResponse1.equals(utilContentAddResponse2));
        System.assert(utilContentAddResponse3.equals(utilContentAddResponse4));
        System.assertEquals(utilContentAddResponse1.hashCode(), utilContentAddResponse2.hashCode());
        System.assertEquals(utilContentAddResponse3.hashCode(), utilContentAddResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagUtilContentAddResponse utilContentAddResponse = new SwagUtilContentAddResponse();
        Map<String, String> propertyMappings = utilContentAddResponse.getPropertyMappings();
        System.assertEquals('retrievalUrl', propertyMappings.get('retrieval_url'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagUtilContentAddResponse utilContentAddResponse = new SwagUtilContentAddResponse();
        System.assertEquals(new List<String>(), utilContentAddResponse.providers);
        System.assertEquals(null, utilContentAddResponse.cid);
        System.assertEquals(null, utilContentAddResponse.estuaryId);
        System.assertEquals(null, utilContentAddResponse.retrievalUrl);
    }
}
