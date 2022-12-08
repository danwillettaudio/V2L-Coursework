import java.util.Scanner;

public class MinMaxMethods {
    public static int minNumber(int num1, int num2, int num3){
        int min;
        if(num1<num2) {
            if(num3<num1) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            if(num2<num3) {
                min = num2;
            } else {
                min = num3;
            }
        }
        return min;
        }
    public static int maxNumber(int num1, int num2, int num3){
        int max;
        if(num1>num2) {
            if(num3>num1) {
                max = num3;
            } else {
                max = num1;
            }
        } else {
            if(num2>num3) {
                max = num2;
            } else {
                max = num3;
            }
        }
        return max;
    }
    public static double minNumber(double num1, double num2, double num3){
        double min;
        if (num1<num2) {
            if(num3<num1) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            if(num2<num3) {
                min = num2;
            } else {
                min = num3;
            }
        }
        return min;
    }
    public static double maxNumber(double num1, double num2, double num3){
        double max;
        if(num1>num2) {
            if(num3>num1) {
                max = num3;
            } else {
                max = num1;
            }
        } else {
            if(num2>num3) {
                max = num2;
            } else {
                max = num3;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();
        if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0) {
            System.out.println("They are int");
            System.out.println("Max number is : " + maxNumber((int) num1, (int) num2, (int) num3));
            System.out.println("Min number is : " + minNumber((int) num1, (int) num2, (int) num3));
        } else {
            System.out.println("They are double");
            System.out.println("Max number is : " + maxNumber(num1, num2, num3));
            System.out.println("Min number is : " + minNumber(num1, num2, num3));
        }
    }
}