import task.calculator.Calculator;

public class TestApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сума: " + calc.add(10, 5));
        System.out.println("Різниця: " + calc.subtract(10, 5));
        System.out.println("Множення: " + calc.multiply(10, 5));
        System.out.println("Ділення: " + calc.divide(10, 5));
    }
}