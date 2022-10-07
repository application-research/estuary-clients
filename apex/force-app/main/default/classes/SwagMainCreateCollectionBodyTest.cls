@isTest
private class SwagMainCreateCollectionBodyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = mainCreateCollectionBody1;
        SwagMainCreateCollectionBody mainCreateCollectionBody3 = new SwagMainCreateCollectionBody();
        SwagMainCreateCollectionBody mainCreateCollectionBody4 = mainCreateCollectionBody3;

        System.assert(mainCreateCollectionBody1.equals(mainCreateCollectionBody2));
        System.assert(mainCreateCollectionBody2.equals(mainCreateCollectionBody1));
        System.assert(mainCreateCollectionBody1.equals(mainCreateCollectionBody1));
        System.assert(mainCreateCollectionBody3.equals(mainCreateCollectionBody4));
        System.assert(mainCreateCollectionBody4.equals(mainCreateCollectionBody3));
        System.assert(mainCreateCollectionBody3.equals(mainCreateCollectionBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody3 = new SwagMainCreateCollectionBody();
        SwagMainCreateCollectionBody mainCreateCollectionBody4 = new SwagMainCreateCollectionBody();

        System.assert(mainCreateCollectionBody1.equals(mainCreateCollectionBody2));
        System.assert(mainCreateCollectionBody2.equals(mainCreateCollectionBody1));
        System.assert(mainCreateCollectionBody3.equals(mainCreateCollectionBody4));
        System.assert(mainCreateCollectionBody4.equals(mainCreateCollectionBody3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = new SwagMainCreateCollectionBody();

        System.assertEquals(false, mainCreateCollectionBody1.equals(mainCreateCollectionBody2));
        System.assertEquals(false, mainCreateCollectionBody2.equals(mainCreateCollectionBody1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = new SwagMainCreateCollectionBody();

        System.assertEquals(false, mainCreateCollectionBody1.equals('foo'));
        System.assertEquals(false, mainCreateCollectionBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = new SwagMainCreateCollectionBody();
        SwagMainCreateCollectionBody mainCreateCollectionBody3;

        System.assertEquals(false, mainCreateCollectionBody1.equals(mainCreateCollectionBody3));
        System.assertEquals(false, mainCreateCollectionBody2.equals(mainCreateCollectionBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = new SwagMainCreateCollectionBody();

        System.assertEquals(mainCreateCollectionBody1.hashCode(), mainCreateCollectionBody1.hashCode());
        System.assertEquals(mainCreateCollectionBody2.hashCode(), mainCreateCollectionBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainCreateCollectionBody mainCreateCollectionBody1 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody2 = SwagMainCreateCollectionBody.getExample();
        SwagMainCreateCollectionBody mainCreateCollectionBody3 = new SwagMainCreateCollectionBody();
        SwagMainCreateCollectionBody mainCreateCollectionBody4 = new SwagMainCreateCollectionBody();

        System.assert(mainCreateCollectionBody1.equals(mainCreateCollectionBody2));
        System.assert(mainCreateCollectionBody3.equals(mainCreateCollectionBody4));
        System.assertEquals(mainCreateCollectionBody1.hashCode(), mainCreateCollectionBody2.hashCode());
        System.assertEquals(mainCreateCollectionBody3.hashCode(), mainCreateCollectionBody4.hashCode());
    }
}
