@isTest
private class SwagUtilHttpErrorTest {
    @isTest
    private static void equalsSameInstance() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = utilHttpError1;
        SwagUtilHttpError utilHttpError3 = new SwagUtilHttpError();
        SwagUtilHttpError utilHttpError4 = utilHttpError3;

        System.assert(utilHttpError1.equals(utilHttpError2));
        System.assert(utilHttpError2.equals(utilHttpError1));
        System.assert(utilHttpError1.equals(utilHttpError1));
        System.assert(utilHttpError3.equals(utilHttpError4));
        System.assert(utilHttpError4.equals(utilHttpError3));
        System.assert(utilHttpError3.equals(utilHttpError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError3 = new SwagUtilHttpError();
        SwagUtilHttpError utilHttpError4 = new SwagUtilHttpError();

        System.assert(utilHttpError1.equals(utilHttpError2));
        System.assert(utilHttpError2.equals(utilHttpError1));
        System.assert(utilHttpError3.equals(utilHttpError4));
        System.assert(utilHttpError4.equals(utilHttpError3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = new SwagUtilHttpError();

        System.assertEquals(false, utilHttpError1.equals(utilHttpError2));
        System.assertEquals(false, utilHttpError2.equals(utilHttpError1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = new SwagUtilHttpError();

        System.assertEquals(false, utilHttpError1.equals('foo'));
        System.assertEquals(false, utilHttpError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = new SwagUtilHttpError();
        SwagUtilHttpError utilHttpError3;

        System.assertEquals(false, utilHttpError1.equals(utilHttpError3));
        System.assertEquals(false, utilHttpError2.equals(utilHttpError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = new SwagUtilHttpError();

        System.assertEquals(utilHttpError1.hashCode(), utilHttpError1.hashCode());
        System.assertEquals(utilHttpError2.hashCode(), utilHttpError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagUtilHttpError utilHttpError1 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError2 = SwagUtilHttpError.getExample();
        SwagUtilHttpError utilHttpError3 = new SwagUtilHttpError();
        SwagUtilHttpError utilHttpError4 = new SwagUtilHttpError();

        System.assert(utilHttpError1.equals(utilHttpError2));
        System.assert(utilHttpError3.equals(utilHttpError4));
        System.assertEquals(utilHttpError1.hashCode(), utilHttpError2.hashCode());
        System.assertEquals(utilHttpError3.hashCode(), utilHttpError4.hashCode());
    }
}
