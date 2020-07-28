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



public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[] { new HourlyEmployee("Anthony", "Almanza", "897456734", 12.0, 38.0),
                new CommisionEmployee("Steven", "Tagaban", "453451243", 3000.0, 0.5),
                new SalariedEmployee("Devin", "Almanza", "231657546", 1000.0),
                new BasePlusCommissionEmployee("Tom", "Cruise", "349770101", 10000.0, .75, 10000.0),
                new PieceWorker("Jake", "Owens", "125679832", 30.0, 84)

        };

        for(Employee current : employeeArray){
            System.out.printf("\n%s%n%s:$%s \n",current.toString(),"Earnings",current.earnings());
        }
    }

}