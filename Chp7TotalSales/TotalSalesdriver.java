/************************************************************/
/*Program:  Chapter 7 Total_Sales             */
/*CIS163AA-17045                                            */
/*Anthony Almanza                                           */
/*06/22/2020                                                */
/*Program intakes salesnumber input and products sold by each sales person. It calculates 
total sold by agent for each product, and overal product total from all agents. */
/************************************************************/


import java.util.Scanner;

public class TotalSalesdriver {
    private static final int PRODUCT_AMOUNT = 5;
    private static final int TOTALSALESPEOPLE = 4;
    private static final int[][] sales = new int[PRODUCT_AMOUNT][];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] badgeNum = new int[4];

        // Intake for Salesperson id number.
        for (int b = 0; b < badgeNum.length; b++) {
            System.out.print("Please Enter your Salesperson Number: \n");
            int bNum = input.nextInt();
            badgeNum[b] = bNum;

        }

        for (int z = 0; z < sales.length; z++) {
            sales[z] = new int[TOTALSALESPEOPLE];
        }

        // Intake for product sold by each agent. Intakes amount for each prodcut by agent according to the salesnumber order entered.
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%s  %d %s\n","Please enter the amount for product #",row +1," for each employee in the order you entered their salesnumber:" );
            for (int column = 0; column < sales[row].length ; column++) {

                sales[row][column] = input.nextInt();
            }

        }
        System.out.printf("%30s", "Employees\n");
        for(int emp= 0;emp < 4; emp++){
            System.out.printf("\t%6d",badgeNum[emp]);
        }
        System.out.println();
        format();
        input.close();

    }

    public static void format() {
    

        int rTotal = 0;
        int cTotal = 0;

        // formats product number row
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%d%s", row + 1,"Product");
            rTotal = 0;
            cTotal = 0;
            
            for (int col = 0; col < 4; col++) {
                System.out.printf("%6d ", sales[row][col]);
                rTotal += sales[row][col];
            }
            System.out.printf(" %9d  ", rTotal);
            System.out.println();
        }
        System.out.printf("\n%8s", "Total");

        for(int col=0;col < TOTALSALESPEOPLE;col++){
            for(int row=0; row < sales.length;row++){
                cTotal += sales[row][col];
            }
            System.out.printf("%6d ",cTotal);
            cTotal =0;
        }
        System.out.println();

    }
}

