@isTest
private class SwagCollectionsCollectionTest {
    @isTest
    private static void equalsSameInstance() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = collectionsCollection1;
        SwagCollectionsCollection collectionsCollection3 = new SwagCollectionsCollection();
        SwagCollectionsCollection collectionsCollection4 = collectionsCollection3;

        System.assert(collectionsCollection1.equals(collectionsCollection2));
        System.assert(collectionsCollection2.equals(collectionsCollection1));
        System.assert(collectionsCollection1.equals(collectionsCollection1));
        System.assert(collectionsCollection3.equals(collectionsCollection4));
        System.assert(collectionsCollection4.equals(collectionsCollection3));
        System.assert(collectionsCollection3.equals(collectionsCollection3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection3 = new SwagCollectionsCollection();
        SwagCollectionsCollection collectionsCollection4 = new SwagCollectionsCollection();

        System.assert(collectionsCollection1.equals(collectionsCollection2));
        System.assert(collectionsCollection2.equals(collectionsCollection1));
        System.assert(collectionsCollection3.equals(collectionsCollection4));
        System.assert(collectionsCollection4.equals(collectionsCollection3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = new SwagCollectionsCollection();

        System.assertEquals(false, collectionsCollection1.equals(collectionsCollection2));
        System.assertEquals(false, collectionsCollection2.equals(collectionsCollection1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = new SwagCollectionsCollection();

        System.assertEquals(false, collectionsCollection1.equals('foo'));
        System.assertEquals(false, collectionsCollection2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = new SwagCollectionsCollection();
        SwagCollectionsCollection collectionsCollection3;

        System.assertEquals(false, collectionsCollection1.equals(collectionsCollection3));
        System.assertEquals(false, collectionsCollection2.equals(collectionsCollection3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = new SwagCollectionsCollection();

        System.assertEquals(collectionsCollection1.hashCode(), collectionsCollection1.hashCode());
        System.assertEquals(collectionsCollection2.hashCode(), collectionsCollection2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagCollectionsCollection collectionsCollection1 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection2 = SwagCollectionsCollection.getExample();
        SwagCollectionsCollection collectionsCollection3 = new SwagCollectionsCollection();
        SwagCollectionsCollection collectionsCollection4 = new SwagCollectionsCollection();

        System.assert(collectionsCollection1.equals(collectionsCollection2));
        System.assert(collectionsCollection3.equals(collectionsCollection4));
        System.assertEquals(collectionsCollection1.hashCode(), collectionsCollection2.hashCode());
        System.assertEquals(collectionsCollection3.hashCode(), collectionsCollection4.hashCode());
    }
}
