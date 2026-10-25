import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(new AddStrategy());

        while (true) {
            System.out.println("\n SMART CALCULATOR ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("0. Exit");
            System.out.print("Choose operation: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }

            switch (choice) {
                case "1" -> calculator.setStrategy(new AddStrategy());
                case "2" -> calculator.setStrategy(new SubtractStrategy());
                case "3" -> calculator.setStrategy(new MultiplyStrategy());
                case "4" -> calculator.setStrategy(new DivideStrategy());
                case "5" -> calculator.setStrategy(new PowerStrategy());
                default -> {
                    System.out.println("Invalid operation. Try again.");
                    continue;
                }
            }

            try {
                System.out.print("Enter first number: ");
                double a = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter second number: ");
                double b = Double.parseDouble(scanner.nextLine());

                if (!Double.isFinite(a) || !Double.isFinite(b)) {
                    System.out.println("Error: Numbers must be finite.");
                    continue;
                }

                double result = calculator.calculate(a, b);
                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
