import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        // create a Scanner object to intake input
       

        // Create an Account object and assign it to my account1 and 2
        // Account object has custom constructor values of String name & double balance
        Account account1 = new Account("Jane green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Displays initial value of null
        displayAccount(account1);
        displayAccount(account2);

        // Initiaing scanner object
        Scanner input= new Scanner(System.in);

        // Intakes deposit ammount for account1 and uses class Account method deposit to update balance
        System.out.print("Enter the amount for account1:  ");
        double depositAmount= input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance %n",depositAmount);
        account1.deposit(depositAmount);

        // display balances

        displayAccount(account1);
        displayAccount(account2);

        // Intakes deposit ammount for account2 uses class Account method deposit to update balance
        System.out.print("Enter the amount for account2:  ");
        depositAmount= input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n",depositAmount);
        account2.deposit(depositAmount);

        // display balances

        displayAccount(account1);
        displayAccount(account2);


    }

    public static void displayAccount(Account accountToDisplay){
       System.out.printf("%s balance $%.2f%n",accountToDisplay.getName(),accountToDisplay.getBalance());
    }
  

}