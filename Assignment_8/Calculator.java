class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));

        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

        System.out.println("Sum of two decimal numbers: " + calc.add(10.5, 20.5));
    }
}