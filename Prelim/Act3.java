import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String expression = scanner.nextLine();

        double result = calculate(expression);
        System.out.println("Result: " + result);
    }

    public static double calculate(String expression) {
        String[] tokens = expression.split(" ");
        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double num = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
            }
        }

        return result;
    }
}