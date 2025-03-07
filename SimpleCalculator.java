import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the operator:");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt(); 
        int result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;  
            case '-':
                result = num1 - num2;
                break;  
            case '*':
                result = num1 * num2;
                break;  
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed");
                    scanner.close();
                    return;
                }
                break; 
            default:
                System.out.println("Invalid operator");
                scanner.close();
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
