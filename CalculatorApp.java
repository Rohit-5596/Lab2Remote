import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

    	double num1, num2, output;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); 

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                System.out.println("Sum= "+output);

                break;

            case '-':
            	output = num1 - num2;
                System.out.println("Difference= "+output);

            	
                break;

            case '*':
            	output = num1 * num2;
                System.out.println("Multiplication= "+output);

            	
                break;

            case '/':
            	output = num1 / num2;
                System.out.println("Division= "+output);

            	
                break;

            default:
                System.out.println("You have entered wrong operator");
                return;
        }
    }
}

    