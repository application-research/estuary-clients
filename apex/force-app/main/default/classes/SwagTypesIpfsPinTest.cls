@isTest
private class SwagTypesIpfsPinTest {
    @isTest
    private static void equalsSameInstance() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = typesIpfsPin1;
        SwagTypesIpfsPin typesIpfsPin3 = new SwagTypesIpfsPin();
        SwagTypesIpfsPin typesIpfsPin4 = typesIpfsPin3;

        System.assert(typesIpfsPin1.equals(typesIpfsPin2));
        System.assert(typesIpfsPin2.equals(typesIpfsPin1));
        System.assert(typesIpfsPin1.equals(typesIpfsPin1));
        System.assert(typesIpfsPin3.equals(typesIpfsPin4));
        System.assert(typesIpfsPin4.equals(typesIpfsPin3));
        System.assert(typesIpfsPin3.equals(typesIpfsPin3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin3 = new SwagTypesIpfsPin();
        SwagTypesIpfsPin typesIpfsPin4 = new SwagTypesIpfsPin();

        System.assert(typesIpfsPin1.equals(typesIpfsPin2));
        System.assert(typesIpfsPin2.equals(typesIpfsPin1));
        System.assert(typesIpfsPin3.equals(typesIpfsPin4));
        System.assert(typesIpfsPin4.equals(typesIpfsPin3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = new SwagTypesIpfsPin();

        System.assertEquals(false, typesIpfsPin1.equals(typesIpfsPin2));
        System.assertEquals(false, typesIpfsPin2.equals(typesIpfsPin1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = new SwagTypesIpfsPin();

        System.assertEquals(false, typesIpfsPin1.equals('foo'));
        System.assertEquals(false, typesIpfsPin2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = new SwagTypesIpfsPin();
        SwagTypesIpfsPin typesIpfsPin3;

        System.assertEquals(false, typesIpfsPin1.equals(typesIpfsPin3));
        System.assertEquals(false, typesIpfsPin2.equals(typesIpfsPin3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = new SwagTypesIpfsPin();

        System.assertEquals(typesIpfsPin1.hashCode(), typesIpfsPin1.hashCode());
        System.assertEquals(typesIpfsPin2.hashCode(), typesIpfsPin2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagTypesIpfsPin typesIpfsPin1 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin2 = SwagTypesIpfsPin.getExample();
        SwagTypesIpfsPin typesIpfsPin3 = new SwagTypesIpfsPin();
        SwagTypesIpfsPin typesIpfsPin4 = new SwagTypesIpfsPin();

        System.assert(typesIpfsPin1.equals(typesIpfsPin2));
        System.assert(typesIpfsPin3.equals(typesIpfsPin4));
        System.assertEquals(typesIpfsPin1.hashCode(), typesIpfsPin2.hashCode());
        System.assertEquals(typesIpfsPin3.hashCode(), typesIpfsPin4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagTypesIpfsPin typesIpfsPin = new SwagTypesIpfsPin();
        System.assertEquals(new List<String>(), typesIpfsPin.origins);
        System.assertEquals(null, typesIpfsPin.cid);
        System.assertEquals(null, typesIpfsPin.meta);
        System.assertEquals(null, typesIpfsPin.name);
    }
}
