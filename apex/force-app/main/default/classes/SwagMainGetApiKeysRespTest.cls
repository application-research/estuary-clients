@isTest
private class SwagMainGetApiKeysRespTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = mainGetApiKeysResp1;
        SwagMainGetApiKeysResp mainGetApiKeysResp3 = new SwagMainGetApiKeysResp();
        SwagMainGetApiKeysResp mainGetApiKeysResp4 = mainGetApiKeysResp3;

        System.assert(mainGetApiKeysResp1.equals(mainGetApiKeysResp2));
        System.assert(mainGetApiKeysResp2.equals(mainGetApiKeysResp1));
        System.assert(mainGetApiKeysResp1.equals(mainGetApiKeysResp1));
        System.assert(mainGetApiKeysResp3.equals(mainGetApiKeysResp4));
        System.assert(mainGetApiKeysResp4.equals(mainGetApiKeysResp3));
        System.assert(mainGetApiKeysResp3.equals(mainGetApiKeysResp3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp3 = new SwagMainGetApiKeysResp();
        SwagMainGetApiKeysResp mainGetApiKeysResp4 = new SwagMainGetApiKeysResp();

        System.assert(mainGetApiKeysResp1.equals(mainGetApiKeysResp2));
        System.assert(mainGetApiKeysResp2.equals(mainGetApiKeysResp1));
        System.assert(mainGetApiKeysResp3.equals(mainGetApiKeysResp4));
        System.assert(mainGetApiKeysResp4.equals(mainGetApiKeysResp3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = new SwagMainGetApiKeysResp();

        System.assertEquals(false, mainGetApiKeysResp1.equals(mainGetApiKeysResp2));
        System.assertEquals(false, mainGetApiKeysResp2.equals(mainGetApiKeysResp1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = new SwagMainGetApiKeysResp();

        System.assertEquals(false, mainGetApiKeysResp1.equals('foo'));
        System.assertEquals(false, mainGetApiKeysResp2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = new SwagMainGetApiKeysResp();
        SwagMainGetApiKeysResp mainGetApiKeysResp3;

        System.assertEquals(false, mainGetApiKeysResp1.equals(mainGetApiKeysResp3));
        System.assertEquals(false, mainGetApiKeysResp2.equals(mainGetApiKeysResp3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = new SwagMainGetApiKeysResp();

        System.assertEquals(mainGetApiKeysResp1.hashCode(), mainGetApiKeysResp1.hashCode());
        System.assertEquals(mainGetApiKeysResp2.hashCode(), mainGetApiKeysResp2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainGetApiKeysResp mainGetApiKeysResp1 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp2 = SwagMainGetApiKeysResp.getExample();
        SwagMainGetApiKeysResp mainGetApiKeysResp3 = new SwagMainGetApiKeysResp();
        SwagMainGetApiKeysResp mainGetApiKeysResp4 = new SwagMainGetApiKeysResp();

        System.assert(mainGetApiKeysResp1.equals(mainGetApiKeysResp2));
        System.assert(mainGetApiKeysResp3.equals(mainGetApiKeysResp4));
        System.assertEquals(mainGetApiKeysResp1.hashCode(), mainGetApiKeysResp2.hashCode());
        System.assertEquals(mainGetApiKeysResp3.hashCode(), mainGetApiKeysResp4.hashCode());
    }
}
