public class CheckAge {
    static void checkAge(int age) {
        //if under 18 print "Access denied"
        if (age < 18) {
            System.out.println("Access denied");

            //if over 18, print "Access granted"
        }
        else {
            System.out.println("Access granted");

        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}


