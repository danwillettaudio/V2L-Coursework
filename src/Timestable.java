import java.util.Scanner;
// Java program to read data of various types using Scanner class.
class Timestable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like: " );
//Asks for user input of which Times table is required
        int timesTable = reader.nextInt();
        int N = timesTable;
        int range = 12;
        // looping from 1 to the range = 12 to print the
        // multiplication table of the number.
        int i = 1;
        // using for loop
        for (i = 1; i <= range; i++) {
            // printing the N*i,ie ‘i'th multiple of N.
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}