@isTest
private class SwagUtilContentAddIpfsBodyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = utilContentAddIpfsBody1;
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody3 = new SwagUtilContentAddIpfsBody();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody4 = utilContentAddIpfsBody3;

        System.assert(utilContentAddIpfsBody1.equals(utilContentAddIpfsBody2));
        System.assert(utilContentAddIpfsBody2.equals(utilContentAddIpfsBody1));
        System.assert(utilContentAddIpfsBody1.equals(utilContentAddIpfsBody1));
        System.assert(utilContentAddIpfsBody3.equals(utilContentAddIpfsBody4));
        System.assert(utilContentAddIpfsBody4.equals(utilContentAddIpfsBody3));
        System.assert(utilContentAddIpfsBody3.equals(utilContentAddIpfsBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody3 = new SwagUtilContentAddIpfsBody();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody4 = new SwagUtilContentAddIpfsBody();

        System.assert(utilContentAddIpfsBody1.equals(utilContentAddIpfsBody2));
        System.assert(utilContentAddIpfsBody2.equals(utilContentAddIpfsBody1));
        System.assert(utilContentAddIpfsBody3.equals(utilContentAddIpfsBody4));
        System.assert(utilContentAddIpfsBody4.equals(utilContentAddIpfsBody3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = new SwagUtilContentAddIpfsBody();

        System.assertEquals(false, utilContentAddIpfsBody1.equals(utilContentAddIpfsBody2));
        System.assertEquals(false, utilContentAddIpfsBody2.equals(utilContentAddIpfsBody1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = new SwagUtilContentAddIpfsBody();

        System.assertEquals(false, utilContentAddIpfsBody1.equals('foo'));
        System.assertEquals(false, utilContentAddIpfsBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = new SwagUtilContentAddIpfsBody();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody3;

        System.assertEquals(false, utilContentAddIpfsBody1.equals(utilContentAddIpfsBody3));
        System.assertEquals(false, utilContentAddIpfsBody2.equals(utilContentAddIpfsBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = new SwagUtilContentAddIpfsBody();

        System.assertEquals(utilContentAddIpfsBody1.hashCode(), utilContentAddIpfsBody1.hashCode());
        System.assertEquals(utilContentAddIpfsBody2.hashCode(), utilContentAddIpfsBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody1 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody2 = SwagUtilContentAddIpfsBody.getExample();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody3 = new SwagUtilContentAddIpfsBody();
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody4 = new SwagUtilContentAddIpfsBody();

        System.assert(utilContentAddIpfsBody1.equals(utilContentAddIpfsBody2));
        System.assert(utilContentAddIpfsBody3.equals(utilContentAddIpfsBody4));
        System.assertEquals(utilContentAddIpfsBody1.hashCode(), utilContentAddIpfsBody2.hashCode());
        System.assertEquals(utilContentAddIpfsBody3.hashCode(), utilContentAddIpfsBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        SwagUtilContentAddIpfsBody utilContentAddIpfsBody = new SwagUtilContentAddIpfsBody();
        System.assertEquals(new List<String>(), utilContentAddIpfsBody.peers);
        System.assertEquals(null, utilContentAddIpfsBody.coluuid);
        System.assertEquals(null, utilContentAddIpfsBody.dir);
        System.assertEquals(null, utilContentAddIpfsBody.filename);
        System.assertEquals(null, utilContentAddIpfsBody.root);
    }
}
