package adding_integers;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your first integer: ");
        int number1 = input.nextInt();

        System.out.print("Input your second integer: ");
        int number2 = input.nextInt();

    try{ 
        if (number1 == number2) {
            System.out.printf("%d == %d\n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d != %d\n", number1, number2);
        }

        if (number1 > number2) {
            System.out.printf("%d > %d\n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d\n", number1, number2);
        }

        if (number1 >= number2) {
            System.out.printf("%d >= %d\n", number1, number2);
        }

        if (number1 <= number2) {
            System.out.printf("%d <= %d\n", number1, number2);
        }
    }
    finally{
        input.close();
    }
    }

}