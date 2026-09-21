public class PrimitiveWrapper {
    public static void main(String[] args) {

        // Primitive variables
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 100;
        long longValue = 1000L;
        float floatValue = 10.5f;
        double doubleValue = 20.5;
        char charValue = 'A';
        boolean booleanValue = true;

        // Wrapper variables
        Byte byteObj = 10;
        Short shortObj = 20;
        Integer intObj = 100;
        Long longObj = 1000L;
        Float floatObj = 10.5f;
        Double doubleObj = 20.5;
        Character charObj = 'A';
        Boolean booleanObj = true;

        System.out.println("Primitive Values:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\nWrapper Values:");
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Integer: " + intObj);
        System.out.println("Long: " + longObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + booleanObj);
    }
}