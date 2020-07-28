
public class Employee {
    private String name;
    private String last_Name;
    private double salary;

    public Employee(String name, String last_name, double salary){
        this.name= name;
        this.last_Name= last_name;
        if (salary > 0){
            this.salary= salary;
        }
    }


    public void setName(String name, String last_name){
        this.name= name;
        last_Name = last_name;
    }

    public String getName(){
        return name + " " + last_Name;
    }

    public double salary(){
        return salary;
        }

    public void raiseSalary(){
        if (salary > 0){
            salary= salary + (salary * .10);
        }
    }    
       
    }

    
