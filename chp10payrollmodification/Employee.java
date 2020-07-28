/************************************************************/
/*Program:  Chapter 10 Payroll_Modification            */
/*CIS163AA-17045                                            */
/*Anthony Almanza                                           */
/*07/3/2020                                                */
/* Added additional subclass, PieceWorker, it extends from the superclass Employee
. The PieceWorker subclass has an fields for hourly wage and pieces collected. The program
creates an Employee array that stores the Employee subclasses then the program polymorphically 
accesses the getPaymentAmount method. Implementation is done by each subclass that overrides the 
earnings method in the superclass Employee*/
/************************************************************/
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nSocial Security Number: %s", getFirstName(), getlastName(),
                getSocialSecurityNumber());
    }

    public abstract double earnings();

    public double getPaymentAmount() {
        return earnings();
    }

}