/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;

/**
 *
 * @author vivaantiwari
 */
public class Calculator {
    public double add(double a, double b) {
        double sum = a + b;
        System.out.println("Answer: " + sum);
        return sum;
    }
    
    public double subtract(double a, double b) {       
        double subtract = a - b;
        System.out.println("Answer: " + subtract);
        return subtract;
    }
    
    public double multiply(double a, double b) {
        double product = a*b;
        System.out.println("Answer: " + product);
        return product;
    }
    
    public double divide(double a, double b) {
        double divide = a/b;
        if(a==0 || b==0 || a==0&&b==0) {
            System.out.println("Division is not possible");
        }
        System.out.println("Answer: " + divide);
        return divide;
    }
    
    public static void main(String[] args) {
            Calculator obj = new Calculator();
            Scanner sc = new Scanner(System.in);
            System.out.println("Select operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Select option (1-4): ");
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Enter second number: ");
                    double num2 = sc.nextDouble();
                    obj.add(num1, num2);
                    break;
                    
                case 2:
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter a number: ");
                    num2 = sc.nextDouble();
                    obj.subtract(num1, num2);
                    break;
                    
                case 3:
                    System.out.println("Enter first number: ");
                    double number1 = sc.nextDouble();
                    System.out.println("Enter second number: ");
                    double number2 = sc.nextDouble();
                    obj.multiply(number1, number2);
                    break;
            
                case 4:
                    System.out.println("Enter first number: ");
                    double firstNumber = sc.nextDouble();
                    System.out.println("Enter second number: ");
                    double secondNumber = sc.nextDouble();
                    obj.divide(firstNumber, secondNumber);
                    break;
            }
    }
}
