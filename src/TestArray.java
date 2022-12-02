public class TestArray {
    public static void main(String[] args) {
        double sum = 0;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(double num: numbers) {
            sum = sum + num;
        }
        double avg = sum / numbers.length;
        System.out.println("sum of all numbers: " + sum);
        System.out.println(" Average is: " + avg);
    }
}
