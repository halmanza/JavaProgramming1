
public class SavingAccount {
    public static double annualInterestRate = .04;
    private double savingsBalance;

    // constructor
    public SavingAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // setter
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        if (newInterestRate >= 0.0f) {
            annualInterestRate = newInterestRate;
        } else {
            throw new IllegalArgumentException("Please enter valid interest rate");
        }

    }

    public double calculateMonthlyInterest() {

        double calculate = (savingsBalance * getInterestRate()) / 12;
        savingsBalance += calculate;

        return calculate;
    }

    public String toString() {
        return String.format("%.2f", getSavingsBalance());
    }

}