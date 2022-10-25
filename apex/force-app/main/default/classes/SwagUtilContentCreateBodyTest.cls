@isTest
private class SwagUtilContentCreateBodyTest {
    @isTest
    private static void equalsSameInstance() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = utilContentCreateBody1;
        SwagUtilContentCreateBody utilContentCreateBody3 = new SwagUtilContentCreateBody();
        SwagUtilContentCreateBody utilContentCreateBody4 = utilContentCreateBody3;

        System.assert(utilContentCreateBody1.equals(utilContentCreateBody2));
        System.assert(utilContentCreateBody2.equals(utilContentCreateBody1));
        System.assert(utilContentCreateBody1.equals(utilContentCreateBody1));
        System.assert(utilContentCreateBody3.equals(utilContentCreateBody4));
        System.assert(utilContentCreateBody4.equals(utilContentCreateBody3));
        System.assert(utilContentCreateBody3.equals(utilContentCreateBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody3 = new SwagUtilContentCreateBody();
        SwagUtilContentCreateBody utilContentCreateBody4 = new SwagUtilContentCreateBody();

        System.assert(utilContentCreateBody1.equals(utilContentCreateBody2));
        System.assert(utilContentCreateBody2.equals(utilContentCreateBody1));
        System.assert(utilContentCreateBody3.equals(utilContentCreateBody4));
        System.assert(utilContentCreateBody4.equals(utilContentCreateBody3));
    }

    @isTest
    private static void notEqualsUnlikeInstance() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = new SwagUtilContentCreateBody();

        System.assertEquals(false, utilContentCreateBody1.equals(utilContentCreateBody2));
        System.assertEquals(false, utilContentCreateBody2.equals(utilContentCreateBody1));
    }

    @isTest
    private static void notEqualsDifferentType() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = new SwagUtilContentCreateBody();

        System.assertEquals(false, utilContentCreateBody1.equals('foo'));
        System.assertEquals(false, utilContentCreateBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = new SwagUtilContentCreateBody();
        SwagUtilContentCreateBody utilContentCreateBody3;

        System.assertEquals(false, utilContentCreateBody1.equals(utilContentCreateBody3));
        System.assertEquals(false, utilContentCreateBody2.equals(utilContentCreateBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = new SwagUtilContentCreateBody();

        System.assertEquals(utilContentCreateBody1.hashCode(), utilContentCreateBody1.hashCode());
        System.assertEquals(utilContentCreateBody2.hashCode(), utilContentCreateBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        SwagUtilContentCreateBody utilContentCreateBody1 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody2 = SwagUtilContentCreateBody.getExample();
        SwagUtilContentCreateBody utilContentCreateBody3 = new SwagUtilContentCreateBody();
        SwagUtilContentCreateBody utilContentCreateBody4 = new SwagUtilContentCreateBody();

        System.assert(utilContentCreateBody1.equals(utilContentCreateBody2));
        System.assert(utilContentCreateBody3.equals(utilContentCreateBody4));
        System.assertEquals(utilContentCreateBody1.hashCode(), utilContentCreateBody2.hashCode());
        System.assertEquals(utilContentCreateBody3.hashCode(), utilContentCreateBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        SwagUtilContentCreateBody utilContentCreateBody = new SwagUtilContentCreateBody();
        Map<String, String> propertyMappings = utilContentCreateBody.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
