@isTest
private class SwagMainDeleteContentFromCollectionBTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = mainDeleteContentFromCollectionBody1;
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody3 = new SwagMainDeleteContentFromCollectionB();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody4 = mainDeleteContentFromCollectionBody3;

        System.assert(mainDeleteContentFromCollectionBody1.equals(mainDeleteContentFromCollectionBody2));
        System.assert(mainDeleteContentFromCollectionBody2.equals(mainDeleteContentFromCollectionBody1));
        System.assert(mainDeleteContentFromCollectionBody1.equals(mainDeleteContentFromCollectionBody1));
        System.assert(mainDeleteContentFromCollectionBody3.equals(mainDeleteContentFromCollectionBody4));
        System.assert(mainDeleteContentFromCollectionBody4.equals(mainDeleteContentFromCollectionBody3));
        System.assert(mainDeleteContentFromCollectionBody3.equals(mainDeleteContentFromCollectionBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody3 = new SwagMainDeleteContentFromCollectionB();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody4 = new SwagMainDeleteContentFromCollectionB();

        System.assert(mainDeleteContentFromCollectionBody1.equals(mainDeleteContentFromCollectionBody2));
        System.assert(mainDeleteContentFromCollectionBody2.equals(mainDeleteContentFromCollectionBody1));
        System.assert(mainDeleteContentFromCollectionBody3.equals(mainDeleteContentFromCollectionBody4));
        System.assert(mainDeleteContentFromCollectionBody4.equals(mainDeleteContentFromCollectionBody3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = new SwagMainDeleteContentFromCollectionB();

        System.assertEquals(false, mainDeleteContentFromCollectionBody1.equals(mainDeleteContentFromCollectionBody2));
        System.assertEquals(false, mainDeleteContentFromCollectionBody2.equals(mainDeleteContentFromCollectionBody1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = new SwagMainDeleteContentFromCollectionB();

        System.assertEquals(false, mainDeleteContentFromCollectionBody1.equals('foo'));
        System.assertEquals(false, mainDeleteContentFromCollectionBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = new SwagMainDeleteContentFromCollectionB();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody3;

        System.assertEquals(false, mainDeleteContentFromCollectionBody1.equals(mainDeleteContentFromCollectionBody3));
        System.assertEquals(false, mainDeleteContentFromCollectionBody2.equals(mainDeleteContentFromCollectionBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = new SwagMainDeleteContentFromCollectionB();

        System.assertEquals(mainDeleteContentFromCollectionBody1.hashCode(), mainDeleteContentFromCollectionBody1.hashCode());
        System.assertEquals(mainDeleteContentFromCollectionBody2.hashCode(), mainDeleteContentFromCollectionBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody1 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody2 = SwagMainDeleteContentFromCollectionB.getExample();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody3 = new SwagMainDeleteContentFromCollectionB();
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody4 = new SwagMainDeleteContentFromCollectionB();

        System.assert(mainDeleteContentFromCollectionBody1.equals(mainDeleteContentFromCollectionBody2));
        System.assert(mainDeleteContentFromCollectionBody3.equals(mainDeleteContentFromCollectionBody4));
        System.assertEquals(mainDeleteContentFromCollectionBody1.hashCode(), mainDeleteContentFromCollectionBody2.hashCode());
        System.assertEquals(mainDeleteContentFromCollectionBody3.hashCode(), mainDeleteContentFromCollectionBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagMainDeleteContentFromCollectionB mainDeleteContentFromCollectionBody = new SwagMainDeleteContentFromCollectionB();
        Map<String, String> propertyMappings = mainDeleteContentFromCollectionBody.getPropertyMappings();
        System.assertEquals('r_by', propertyMappings.get('by'));
    }
}
