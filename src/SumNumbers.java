import java.util.Scanner;
class SumNumbers{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        // Asks for user input
        int sumTotal = reader.nextInt();
        int n = sumTotal, sum = 0, i = 1;
        /* While loop*/
        // Test condition
        while (i <= n) {
            /* Statements to execute */
            // Update the current sum till
            // test condition holds true
            sum = sum + i;
            // Increment the variable counter
            // or jumping to next natural number
            i++;
        }
        // Print the sum
        System.out.println("Sum Total is: " + sum);
    }
}