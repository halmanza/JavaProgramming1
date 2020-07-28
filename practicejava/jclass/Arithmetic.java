/**********************************************/ 
/*Program: Chp-2_Arithmetic_Smallest_Largest  */
/*CIS163AA_17045                                    */
/*Anthony Almanza                             */
/*05_28_2020                                  */
/*Program intakes 3 integers from the user 
  and prints the smallest and largest integers,
  the average, the product, and sum of the integers*/

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        /* Intake of user values */
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your first number: ");
        int number1 = input.nextInt();

        System.out.print("Please input your second number: ");
        int number2 = input.nextInt();

        System.out.print("Please input your Third number: ");
        int number3 = input.nextInt();
        /* Start of processing user integer input */
        try {
            if (number1 < number2 && number1 < number3 || number1 <= number2 && number1 <= number3) {
                System.out.printf("%d is the smallest number\n", number1);
            }
            if (number2 < number1 && number2 < number3 || number2 <= number1 && number2 <= number3) {
                System.out.printf("%d is the smallest number\n", number2);
            }
            if (number3 < number1 && number3 < number2 || number3 <= number1 && number3 <= number2) {
                System.out.printf("%d is the smallest number\n", number3);
            }


            if (number1 > number2 && number1 > number3 || number1 >= number2 && number1 >= number3) {
                System.out.printf("%d is the largest number\n", number1);
            }
            if (number2 > number2 && number2 > number3 || number2 >= number1 && number2 >= number3) {
                System.out.printf("%d is the largest number \n", number2);
            }
            if (number3 > number1 && number3 > number2 || number3 >= number1 && number3 >= number2) {
                System.out.printf("%d is the largest number\n", number3);
            }

            System.out.printf("The sum is %d\n", number1 + number2 + number3);
            System.out.printf("The average is %d\n", (number1 + number2 + number3) / 3);
            System.out.printf("The product of the integers is %d %n", number1 * number2 * number3);
        }
        /* Closing of input source to prevent resource leak */
        finally {
            input.close();
        }
    }
}
