@isTest
private class SwagMainChannelIDParamTest {
    @isTest
    private static void equalsSameInstance() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = mainChannelIDParam1;
        SwagMainChannelIDParam mainChannelIDParam3 = new SwagMainChannelIDParam();
        SwagMainChannelIDParam mainChannelIDParam4 = mainChannelIDParam3;

        System.assert(mainChannelIDParam1.equals(mainChannelIDParam2));
        System.assert(mainChannelIDParam2.equals(mainChannelIDParam1));
        System.assert(mainChannelIDParam1.equals(mainChannelIDParam1));
        System.assert(mainChannelIDParam3.equals(mainChannelIDParam4));
        System.assert(mainChannelIDParam4.equals(mainChannelIDParam3));
        System.assert(mainChannelIDParam3.equals(mainChannelIDParam3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam3 = new SwagMainChannelIDParam();
        SwagMainChannelIDParam mainChannelIDParam4 = new SwagMainChannelIDParam();

        System.assert(mainChannelIDParam1.equals(mainChannelIDParam2));
        System.assert(mainChannelIDParam2.equals(mainChannelIDParam1));
        System.assert(mainChannelIDParam3.equals(mainChannelIDParam4));
        System.assert(mainChannelIDParam4.equals(mainChannelIDParam3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = new SwagMainChannelIDParam();

        System.assertEquals(false, mainChannelIDParam1.equals(mainChannelIDParam2));
        System.assertEquals(false, mainChannelIDParam2.equals(mainChannelIDParam1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = new SwagMainChannelIDParam();

        System.assertEquals(false, mainChannelIDParam1.equals('foo'));
        System.assertEquals(false, mainChannelIDParam2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = new SwagMainChannelIDParam();
        SwagMainChannelIDParam mainChannelIDParam3;

        System.assertEquals(false, mainChannelIDParam1.equals(mainChannelIDParam3));
        System.assertEquals(false, mainChannelIDParam2.equals(mainChannelIDParam3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = new SwagMainChannelIDParam();

        System.assertEquals(mainChannelIDParam1.hashCode(), mainChannelIDParam1.hashCode());
        System.assertEquals(mainChannelIDParam2.hashCode(), mainChannelIDParam2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagMainChannelIDParam mainChannelIDParam1 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam2 = SwagMainChannelIDParam.getExample();
        SwagMainChannelIDParam mainChannelIDParam3 = new SwagMainChannelIDParam();
        SwagMainChannelIDParam mainChannelIDParam4 = new SwagMainChannelIDParam();

        System.assert(mainChannelIDParam1.equals(mainChannelIDParam2));
        System.assert(mainChannelIDParam3.equals(mainChannelIDParam4));
        System.assertEquals(mainChannelIDParam1.hashCode(), mainChannelIDParam2.hashCode());
        System.assertEquals(mainChannelIDParam3.hashCode(), mainChannelIDParam4.hashCode());
    }
}
