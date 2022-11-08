@isTest
private class SwagTypesIpfsPinStatusResponseTest {
    @isTest
    private static void equalsSameInstance() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = typesIpfsPinStatusResponse1;
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse3 = new SwagTypesIpfsPinStatusResponse();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse4 = typesIpfsPinStatusResponse3;

        System.assert(typesIpfsPinStatusResponse1.equals(typesIpfsPinStatusResponse2));
        System.assert(typesIpfsPinStatusResponse2.equals(typesIpfsPinStatusResponse1));
        System.assert(typesIpfsPinStatusResponse1.equals(typesIpfsPinStatusResponse1));
        System.assert(typesIpfsPinStatusResponse3.equals(typesIpfsPinStatusResponse4));
        System.assert(typesIpfsPinStatusResponse4.equals(typesIpfsPinStatusResponse3));
        System.assert(typesIpfsPinStatusResponse3.equals(typesIpfsPinStatusResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse3 = new SwagTypesIpfsPinStatusResponse();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse4 = new SwagTypesIpfsPinStatusResponse();

        System.assert(typesIpfsPinStatusResponse1.equals(typesIpfsPinStatusResponse2));
        System.assert(typesIpfsPinStatusResponse2.equals(typesIpfsPinStatusResponse1));
        System.assert(typesIpfsPinStatusResponse3.equals(typesIpfsPinStatusResponse4));
        System.assert(typesIpfsPinStatusResponse4.equals(typesIpfsPinStatusResponse3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = new SwagTypesIpfsPinStatusResponse();

        System.assertEquals(false, typesIpfsPinStatusResponse1.equals(typesIpfsPinStatusResponse2));
        System.assertEquals(false, typesIpfsPinStatusResponse2.equals(typesIpfsPinStatusResponse1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = new SwagTypesIpfsPinStatusResponse();

        System.assertEquals(false, typesIpfsPinStatusResponse1.equals('foo'));
        System.assertEquals(false, typesIpfsPinStatusResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = new SwagTypesIpfsPinStatusResponse();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse3;

        System.assertEquals(false, typesIpfsPinStatusResponse1.equals(typesIpfsPinStatusResponse3));
        System.assertEquals(false, typesIpfsPinStatusResponse2.equals(typesIpfsPinStatusResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = new SwagTypesIpfsPinStatusResponse();

        System.assertEquals(typesIpfsPinStatusResponse1.hashCode(), typesIpfsPinStatusResponse1.hashCode());
        System.assertEquals(typesIpfsPinStatusResponse2.hashCode(), typesIpfsPinStatusResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse1 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse2 = SwagTypesIpfsPinStatusResponse.getExample();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse3 = new SwagTypesIpfsPinStatusResponse();
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse4 = new SwagTypesIpfsPinStatusResponse();

        System.assert(typesIpfsPinStatusResponse1.equals(typesIpfsPinStatusResponse2));
        System.assert(typesIpfsPinStatusResponse3.equals(typesIpfsPinStatusResponse4));
        System.assertEquals(typesIpfsPinStatusResponse1.hashCode(), typesIpfsPinStatusResponse2.hashCode());
        System.assertEquals(typesIpfsPinStatusResponse3.hashCode(), typesIpfsPinStatusResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagTypesIpfsPinStatusResponse typesIpfsPinStatusResponse = new SwagTypesIpfsPinStatusResponse();
        System.assertEquals(new List<String>(), typesIpfsPinStatusResponse.delegates);
        System.assertEquals(null, typesIpfsPinStatusResponse.created);
        System.assertEquals(null, typesIpfsPinStatusResponse.info);
        System.assertEquals(null, typesIpfsPinStatusResponse.pin);
        System.assertEquals(null, typesIpfsPinStatusResponse.requestid);
        System.assertEquals(null, typesIpfsPinStatusResponse.status);
    }
}
