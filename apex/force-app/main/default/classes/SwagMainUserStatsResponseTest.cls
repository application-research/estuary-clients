@isTest
private class SwagMainUserStatsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = mainUserStatsResponse1;
        SwagMainUserStatsResponse mainUserStatsResponse3 = new SwagMainUserStatsResponse();
        SwagMainUserStatsResponse mainUserStatsResponse4 = mainUserStatsResponse3;

        System.assert(mainUserStatsResponse1.equals(mainUserStatsResponse2));
        System.assert(mainUserStatsResponse2.equals(mainUserStatsResponse1));
        System.assert(mainUserStatsResponse1.equals(mainUserStatsResponse1));
        System.assert(mainUserStatsResponse3.equals(mainUserStatsResponse4));
        System.assert(mainUserStatsResponse4.equals(mainUserStatsResponse3));
        System.assert(mainUserStatsResponse3.equals(mainUserStatsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse3 = new SwagMainUserStatsResponse();
        SwagMainUserStatsResponse mainUserStatsResponse4 = new SwagMainUserStatsResponse();

        System.assert(mainUserStatsResponse1.equals(mainUserStatsResponse2));
        System.assert(mainUserStatsResponse2.equals(mainUserStatsResponse1));
        System.assert(mainUserStatsResponse3.equals(mainUserStatsResponse4));
        System.assert(mainUserStatsResponse4.equals(mainUserStatsResponse3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = new SwagMainUserStatsResponse();

        System.assertEquals(false, mainUserStatsResponse1.equals(mainUserStatsResponse2));
        System.assertEquals(false, mainUserStatsResponse2.equals(mainUserStatsResponse1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = new SwagMainUserStatsResponse();

        System.assertEquals(false, mainUserStatsResponse1.equals('foo'));
        System.assertEquals(false, mainUserStatsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = new SwagMainUserStatsResponse();
        SwagMainUserStatsResponse mainUserStatsResponse3;

        System.assertEquals(false, mainUserStatsResponse1.equals(mainUserStatsResponse3));
        System.assertEquals(false, mainUserStatsResponse2.equals(mainUserStatsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = new SwagMainUserStatsResponse();

        System.assertEquals(mainUserStatsResponse1.hashCode(), mainUserStatsResponse1.hashCode());
        System.assertEquals(mainUserStatsResponse2.hashCode(), mainUserStatsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainUserStatsResponse mainUserStatsResponse1 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse2 = SwagMainUserStatsResponse.getExample();
        SwagMainUserStatsResponse mainUserStatsResponse3 = new SwagMainUserStatsResponse();
        SwagMainUserStatsResponse mainUserStatsResponse4 = new SwagMainUserStatsResponse();

        System.assert(mainUserStatsResponse1.equals(mainUserStatsResponse2));
        System.assert(mainUserStatsResponse3.equals(mainUserStatsResponse4));
        System.assertEquals(mainUserStatsResponse1.hashCode(), mainUserStatsResponse2.hashCode());
        System.assertEquals(mainUserStatsResponse3.hashCode(), mainUserStatsResponse4.hashCode());
    }
}
