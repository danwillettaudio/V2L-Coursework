import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();
        { //This gives the user input for the string creating a char name ‘letters’
            String revString = "";
//This creates the new string revString
            for (int i = letters.length - 1; i>=0; i--)
//the for loop defines the character length based on the input
                revString = revString + letters[i];
//this defines the revString as a function of the input
            System.out.println("Reversed word: " + revString);
//Prints out the words with the reversed of the inputted word
        }
    }
}