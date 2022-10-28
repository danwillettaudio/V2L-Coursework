public class AndOrNot {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 3 && x < 10); //tests for two expressions x>3 and x<10 so it returns true
        System.out.println(x > 3 || x < 10);
        System.out.println(!(x > 3 && x < 10));
    }
}
