package adding_integers;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window

        Scanner input = new Scanner(System.in);

        try {
            // Prompt
            System.out.print("Enter first integer: ");
            float number1 = input.nextFloat(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            float number2 = input.nextFloat(); // read second number from user

            float sum = number1 + number2; // add numbers, then store total in sum

            System.out.printf("Sum is %f%n", sum); // display sum

        } finally {
            input.close();
        }
    }

}