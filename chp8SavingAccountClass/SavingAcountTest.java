/************************************************************/
/*Program:  Savings_Account_Class             */
/*CIS163AA-17045                                            */
/*Anthony Almanza                                           */
/*06/26/2020                                                */
/*Program creates savers account objects and stores balance value, then
interest rates are applied. The class methods of SavingAccount display monthly and yearly interest
on principal amount. */
/************************************************************/
public class SavingAcountTest {

    public static void main(String[] args) {
        // Initiating SavingAccount objects
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        // array storing SavingAccounts objects
        SavingAccount[] accounts = { saver1, saver2 };

        for (int i = 0; i < accounts.length; i++) {
            System.out.printf("\tCurrent Account Total: %.2f\n", accounts[i].getSavingsBalance());
            accounts[i].calculateMonthlyInterest();
            System.out.printf(
                    "\tCurrent Account Total: %.2f, with one month of interest, yearly interest is %.2f, current rate:%.2f\n",
                    accounts[i].getSavingsBalance(), Math.floor(accounts[i].calculateMonthlyInterest() * 12),
                    SavingAccount.getInterestRate());
        }

        // nested for loops resets balance values to apply new interest rate
        for (int x = 0; x < 1; x++) {
            accounts[0].setSavingsBalance(2000);
            accounts[1].setSavingsBalance(3000);
            SavingAccount.modifyInterestRate(.05);
            System.out.printf("\tNew interest rate %.2f\n", SavingAccount.getInterestRate());
            for (int y = 0; y < accounts.length; y++) {
                accounts[y].calculateMonthlyInterest();
                System.out.printf(
                        "\n\tCurrent Account Total: %s monthly with interest, yearly interest is %.2f, current rate: %.2f ",
                        accounts[y].toString(), Math.floor(accounts[y].calculateMonthlyInterest() * 12),
                        SavingAccount.getInterestRate());

            }
        }

    }
}