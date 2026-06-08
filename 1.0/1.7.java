import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter decimal number: ");
                int decimal = input.nextInt();

                String binary = Integer.toBinaryString(decimal);

                System.out.println("Binary = " + binary);
                break;

            case 2:
                System.out.print("Enter binary number: ");
                String bin = input.next();

                int decimalValue = Integer.parseInt(bin, 2);

                System.out.println("Decimal = " + decimalValue);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
