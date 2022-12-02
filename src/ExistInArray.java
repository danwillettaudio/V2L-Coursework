import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        boolean checkValue = false;
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter integer value: ");
        int value = reader.nextInt();
        for (int num : numbers) {
            if (value == num) {
                checkValue = true;
            }
        }
        if (checkValue) {
            System.out.println("Value was found in array");
        } else {
            System.out.println("Value was not found in array");
        }
    }
}
