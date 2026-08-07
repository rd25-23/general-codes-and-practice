public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("                                       ");

        System.out.println("--- Calculator Method Overloading ---");

        int sum1 = calc.add(15, 25);
        System.out.println("Result of adding two integers (15 + 25)       : " + sum1);

        int sum2 = calc.add(10, 20, 30);
        System.out.println("Result of adding three integers (10 + 20 + 30): " + sum2);

        double sum3 = calc.add(12.5, 7.3);
        System.out.println("Result of adding two doubles (12.5 + 7.3)     : " + sum3);
    }
}
