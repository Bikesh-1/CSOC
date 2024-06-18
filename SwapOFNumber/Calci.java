package SwapOFNumber;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double x = sc.nextDouble();
        System.out.print("Enter thr Second Number:");
        double y = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = x + y;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = x - y;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = x * y;
                System.out.println("The result is: " + result);
                break;
            case '/':
                    result = x / y;
                    System.out.println("Value is " + result);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
