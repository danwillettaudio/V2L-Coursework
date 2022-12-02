public class FibonacciCalc {
    public static int fibonacci(int f) {
        int x = 0;
        int y = 1;
        int z;
        while (f > 0) {
            System.out.println(x);
            z = x + y;
            x = y;
            y = z;
            f--;
        }
        return x;
    }
    public static void main(String[] args) {
        fibonacci(50);
    }
}

