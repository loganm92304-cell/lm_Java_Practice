import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] frequency = new int[10];

        System.out.println("Enter 100 integers between 0 and 9:");

        for(int i = 0; i < 100; i++) {

            int number = input.nextInt();

            if(number >= 0 && number <= 9) {
                frequency[number]++;
            } else {
                System.out.println("Invalid number");
                i--;
            }
        }

        System.out.println("Number\tFrequency");

        for(int i = 0; i < frequency.length; i++) {
            System.out.println(i + "\t" + frequency[i] + " times");
        }
    }
}