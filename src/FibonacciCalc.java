public class FibonacciCalc {
    static void fibonacci(int f) {
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
    }
    public static void main(String[] args) {
        fibonacci(100);
    }
}

