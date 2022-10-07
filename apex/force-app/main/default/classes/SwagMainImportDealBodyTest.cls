@isTest
private class SwagMainImportDealBodyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = mainImportDealBody1;
        SwagMainImportDealBody mainImportDealBody3 = new SwagMainImportDealBody();
        SwagMainImportDealBody mainImportDealBody4 = mainImportDealBody3;

        System.assert(mainImportDealBody1.equals(mainImportDealBody2));
        System.assert(mainImportDealBody2.equals(mainImportDealBody1));
        System.assert(mainImportDealBody1.equals(mainImportDealBody1));
        System.assert(mainImportDealBody3.equals(mainImportDealBody4));
        System.assert(mainImportDealBody4.equals(mainImportDealBody3));
        System.assert(mainImportDealBody3.equals(mainImportDealBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody3 = new SwagMainImportDealBody();
        SwagMainImportDealBody mainImportDealBody4 = new SwagMainImportDealBody();

        System.assert(mainImportDealBody1.equals(mainImportDealBody2));
        System.assert(mainImportDealBody2.equals(mainImportDealBody1));
        System.assert(mainImportDealBody3.equals(mainImportDealBody4));
        System.assert(mainImportDealBody4.equals(mainImportDealBody3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = new SwagMainImportDealBody();

        System.assertEquals(false, mainImportDealBody1.equals(mainImportDealBody2));
        System.assertEquals(false, mainImportDealBody2.equals(mainImportDealBody1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = new SwagMainImportDealBody();

        System.assertEquals(false, mainImportDealBody1.equals('foo'));
        System.assertEquals(false, mainImportDealBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = new SwagMainImportDealBody();
        SwagMainImportDealBody mainImportDealBody3;

        System.assertEquals(false, mainImportDealBody1.equals(mainImportDealBody3));
        System.assertEquals(false, mainImportDealBody2.equals(mainImportDealBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = new SwagMainImportDealBody();

        System.assertEquals(mainImportDealBody1.hashCode(), mainImportDealBody1.hashCode());
        System.assertEquals(mainImportDealBody2.hashCode(), mainImportDealBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainImportDealBody mainImportDealBody1 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody2 = SwagMainImportDealBody.getExample();
        SwagMainImportDealBody mainImportDealBody3 = new SwagMainImportDealBody();
        SwagMainImportDealBody mainImportDealBody4 = new SwagMainImportDealBody();

        System.assert(mainImportDealBody1.equals(mainImportDealBody2));
        System.assert(mainImportDealBody3.equals(mainImportDealBody4));
        System.assertEquals(mainImportDealBody1.hashCode(), mainImportDealBody2.hashCode());
        System.assertEquals(mainImportDealBody3.hashCode(), mainImportDealBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagMainImportDealBody mainImportDealBody = new SwagMainImportDealBody();
        System.assertEquals(new List<Integer>(), mainImportDealBody.dealIDs);
        System.assertEquals(null, mainImportDealBody.coluuid);
        System.assertEquals(null, mainImportDealBody.dir);
        System.assertEquals(null, mainImportDealBody.name);
    }
}
