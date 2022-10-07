@isTest
private class SwagMainCollectionTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = mainCollection1;
        SwagMainCollection mainCollection3 = new SwagMainCollection();
        SwagMainCollection mainCollection4 = mainCollection3;

        System.assert(mainCollection1.equals(mainCollection2));
        System.assert(mainCollection2.equals(mainCollection1));
        System.assert(mainCollection1.equals(mainCollection1));
        System.assert(mainCollection3.equals(mainCollection4));
        System.assert(mainCollection4.equals(mainCollection3));
        System.assert(mainCollection3.equals(mainCollection3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection3 = new SwagMainCollection();
        SwagMainCollection mainCollection4 = new SwagMainCollection();

        System.assert(mainCollection1.equals(mainCollection2));
        System.assert(mainCollection2.equals(mainCollection1));
        System.assert(mainCollection3.equals(mainCollection4));
        System.assert(mainCollection4.equals(mainCollection3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = new SwagMainCollection();

        System.assertEquals(false, mainCollection1.equals(mainCollection2));
        System.assertEquals(false, mainCollection2.equals(mainCollection1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = new SwagMainCollection();

        System.assertEquals(false, mainCollection1.equals('foo'));
        System.assertEquals(false, mainCollection2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = new SwagMainCollection();
        SwagMainCollection mainCollection3;

        System.assertEquals(false, mainCollection1.equals(mainCollection3));
        System.assertEquals(false, mainCollection2.equals(mainCollection3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = new SwagMainCollection();

        System.assertEquals(mainCollection1.hashCode(), mainCollection1.hashCode());
        System.assertEquals(mainCollection2.hashCode(), mainCollection2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainCollection mainCollection1 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection2 = SwagMainCollection.getExample();
        SwagMainCollection mainCollection3 = new SwagMainCollection();
        SwagMainCollection mainCollection4 = new SwagMainCollection();

        System.assert(mainCollection1.equals(mainCollection2));
        System.assert(mainCollection3.equals(mainCollection4));
        System.assertEquals(mainCollection1.hashCode(), mainCollection2.hashCode());
        System.assertEquals(mainCollection3.hashCode(), mainCollection4.hashCode());
    }
}
