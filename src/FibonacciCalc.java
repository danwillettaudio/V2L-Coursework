import java.util.Scanner;
public class FibonacciCalc {
    public static long fibonacci(int i) {
        if (i <= 1)
            return i;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many results?");
        int res = sc.nextInt();
        for (int i = 0; i <= res; i++)
            System.out.println(fibonacci(i));
    }
}