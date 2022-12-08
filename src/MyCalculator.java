import java.util.Scanner;

public class MyCalculator {
    public static double addNumbers(double num1, double num2) {
        return num1+num2;
    }
    public static double subtractNumbers(double num1, double num2) {
        return num1-num2;
    }
    public static double multiplyNumbers(double num1, double num2) {
        return num1*num2;
    }
    public static double divideNumbers(double num1, double num2) {
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextInt();
        System.out.println("Enter second number:");
        double num2 = sc.nextInt();
        System.out.println(addNumbers(num1, num2));
        System.out.println(subtractNumbers(num1, num2));
        System.out.println(multiplyNumbers(num1, num2));
        System.out.println(divideNumbers(num1, num2));
    }
}

