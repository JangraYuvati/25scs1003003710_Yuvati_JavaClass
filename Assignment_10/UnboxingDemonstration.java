public class UnboxingDemo {
    public static void main(String[] args) {

        // Wrapper objects
        Integer intObj = 100;
        Double doubleObj = 25.5;
        Character charObj = 'A';
        Boolean boolObj = true;

        // Unboxing
        int number = intObj;
        double decimal = doubleObj;
        char letter = charObj;
        boolean status = boolObj;

        System.out.println("After Unboxing:");
        System.out.println("int: " + number);
        System.out.println("double: " + decimal);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + status);
    }
}