@isTest
private class SwagTypesIpfsListPinStatusResponseTest {
    @isTest
    private static void equalsSameInstance() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = typesIpfsListPinStatusResponse1;
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse3 = new SwagTypesIpfsListPinStatusResponse();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse4 = typesIpfsListPinStatusResponse3;

        System.assert(typesIpfsListPinStatusResponse1.equals(typesIpfsListPinStatusResponse2));
        System.assert(typesIpfsListPinStatusResponse2.equals(typesIpfsListPinStatusResponse1));
        System.assert(typesIpfsListPinStatusResponse1.equals(typesIpfsListPinStatusResponse1));
        System.assert(typesIpfsListPinStatusResponse3.equals(typesIpfsListPinStatusResponse4));
        System.assert(typesIpfsListPinStatusResponse4.equals(typesIpfsListPinStatusResponse3));
        System.assert(typesIpfsListPinStatusResponse3.equals(typesIpfsListPinStatusResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse3 = new SwagTypesIpfsListPinStatusResponse();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse4 = new SwagTypesIpfsListPinStatusResponse();

        System.assert(typesIpfsListPinStatusResponse1.equals(typesIpfsListPinStatusResponse2));
        System.assert(typesIpfsListPinStatusResponse2.equals(typesIpfsListPinStatusResponse1));
        System.assert(typesIpfsListPinStatusResponse3.equals(typesIpfsListPinStatusResponse4));
        System.assert(typesIpfsListPinStatusResponse4.equals(typesIpfsListPinStatusResponse3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = new SwagTypesIpfsListPinStatusResponse();

        System.assertEquals(false, typesIpfsListPinStatusResponse1.equals(typesIpfsListPinStatusResponse2));
        System.assertEquals(false, typesIpfsListPinStatusResponse2.equals(typesIpfsListPinStatusResponse1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = new SwagTypesIpfsListPinStatusResponse();

        System.assertEquals(false, typesIpfsListPinStatusResponse1.equals('foo'));
        System.assertEquals(false, typesIpfsListPinStatusResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = new SwagTypesIpfsListPinStatusResponse();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse3;

        System.assertEquals(false, typesIpfsListPinStatusResponse1.equals(typesIpfsListPinStatusResponse3));
        System.assertEquals(false, typesIpfsListPinStatusResponse2.equals(typesIpfsListPinStatusResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = new SwagTypesIpfsListPinStatusResponse();

        System.assertEquals(typesIpfsListPinStatusResponse1.hashCode(), typesIpfsListPinStatusResponse1.hashCode());
        System.assertEquals(typesIpfsListPinStatusResponse2.hashCode(), typesIpfsListPinStatusResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse1 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse2 = SwagTypesIpfsListPinStatusResponse.getExample();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse3 = new SwagTypesIpfsListPinStatusResponse();
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse4 = new SwagTypesIpfsListPinStatusResponse();

        System.assert(typesIpfsListPinStatusResponse1.equals(typesIpfsListPinStatusResponse2));
        System.assert(typesIpfsListPinStatusResponse3.equals(typesIpfsListPinStatusResponse4));
        System.assertEquals(typesIpfsListPinStatusResponse1.hashCode(), typesIpfsListPinStatusResponse2.hashCode());
        System.assertEquals(typesIpfsListPinStatusResponse3.hashCode(), typesIpfsListPinStatusResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagTypesIpfsListPinStatusResponse typesIpfsListPinStatusResponse = new SwagTypesIpfsListPinStatusResponse();
        System.assertEquals(new List<SwagTypesIpfsPinStatusResponse>(), typesIpfsListPinStatusResponse.results);
        System.assertEquals(null, typesIpfsListPinStatusResponse.count);
    }
}
