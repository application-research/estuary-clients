@isTest
private class SwagMainEstimateDealBodyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = mainEstimateDealBody1;
        SwagMainEstimateDealBody mainEstimateDealBody3 = new SwagMainEstimateDealBody();
        SwagMainEstimateDealBody mainEstimateDealBody4 = mainEstimateDealBody3;

        System.assert(mainEstimateDealBody1.equals(mainEstimateDealBody2));
        System.assert(mainEstimateDealBody2.equals(mainEstimateDealBody1));
        System.assert(mainEstimateDealBody1.equals(mainEstimateDealBody1));
        System.assert(mainEstimateDealBody3.equals(mainEstimateDealBody4));
        System.assert(mainEstimateDealBody4.equals(mainEstimateDealBody3));
        System.assert(mainEstimateDealBody3.equals(mainEstimateDealBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody3 = new SwagMainEstimateDealBody();
        SwagMainEstimateDealBody mainEstimateDealBody4 = new SwagMainEstimateDealBody();

        System.assert(mainEstimateDealBody1.equals(mainEstimateDealBody2));
        System.assert(mainEstimateDealBody2.equals(mainEstimateDealBody1));
        System.assert(mainEstimateDealBody3.equals(mainEstimateDealBody4));
        System.assert(mainEstimateDealBody4.equals(mainEstimateDealBody3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = new SwagMainEstimateDealBody();

        System.assertEquals(false, mainEstimateDealBody1.equals(mainEstimateDealBody2));
        System.assertEquals(false, mainEstimateDealBody2.equals(mainEstimateDealBody1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = new SwagMainEstimateDealBody();

        System.assertEquals(false, mainEstimateDealBody1.equals('foo'));
        System.assertEquals(false, mainEstimateDealBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = new SwagMainEstimateDealBody();
        SwagMainEstimateDealBody mainEstimateDealBody3;

        System.assertEquals(false, mainEstimateDealBody1.equals(mainEstimateDealBody3));
        System.assertEquals(false, mainEstimateDealBody2.equals(mainEstimateDealBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = new SwagMainEstimateDealBody();

        System.assertEquals(mainEstimateDealBody1.hashCode(), mainEstimateDealBody1.hashCode());
        System.assertEquals(mainEstimateDealBody2.hashCode(), mainEstimateDealBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainEstimateDealBody mainEstimateDealBody1 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody2 = SwagMainEstimateDealBody.getExample();
        SwagMainEstimateDealBody mainEstimateDealBody3 = new SwagMainEstimateDealBody();
        SwagMainEstimateDealBody mainEstimateDealBody4 = new SwagMainEstimateDealBody();

        System.assert(mainEstimateDealBody1.equals(mainEstimateDealBody2));
        System.assert(mainEstimateDealBody3.equals(mainEstimateDealBody4));
        System.assertEquals(mainEstimateDealBody1.hashCode(), mainEstimateDealBody2.hashCode());
        System.assertEquals(mainEstimateDealBody3.hashCode(), mainEstimateDealBody4.hashCode());
    }
}
