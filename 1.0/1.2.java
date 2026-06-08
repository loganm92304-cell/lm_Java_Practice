import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largest;

        System.out.print("Enter first integer: ");
        largest = input.nextInt();

        for(int i = 2; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = input.nextInt();

            if(num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest integer is: " + largest);
    }
}