package calculator;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("=== Java Calculator DevSecOps Demo ===");
        System.out.println("Addition: 10 + 5 = " + calc.add(10, 5));
        System.out.println("Subtraction: 10 - 5 = " + calc.subtract(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + calc.multiply(10, 5));
        System.out.println("Division: 10 / 5 = " + calc.divide(10, 5));
    }
}
