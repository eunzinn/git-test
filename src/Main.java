public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Add: " + calculator.add(a, b));
        System.out.println("Subtract: " + calculator.subtract(a, b));
        System.out.println("Multiply: " + calculator.multiply(a, b));
    }
}