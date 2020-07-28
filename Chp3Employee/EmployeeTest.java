/************************************************************/
/*Program: Employee Class                                   */
/*CIS163AA-17045                                            */
/*Anthony Almanza                                           */
/*06/03/2020                                                */
/*Program utilizes employee class to create two employee objects, displays the
 employee objects salaries, then it displays the salaries with a 10% raise. */
/************************************************************/

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("name", "lastname", 40_000);
        Employee employee2 = new Employee("name", "lastname", 50_000);

        System.out.print("\n");
        System.out.println("Employee Salary's \n");
        employee1.setName("Steven", "Buschemi");
        System.out.printf("%s : %.2f\n", employee1.getName(), employee1.salary());
        employee2.setName("Alec", "Baldwin");
        System.out.printf("%s : %.2f\n\n", employee2.getName(), employee2.salary());

        System.out.print("Salary's with 10% raise:\n\n");
        employee1.raiseSalary();
        employee2.raiseSalary();
        System.out.printf("%s : %.2f\n", employee1.getName(), employee1.salary());
        System.out.printf("%s : %.2f\n", employee2.getName(), employee2.salary());

    }
}