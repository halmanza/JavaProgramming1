import java.util.ArrayList;
import java.util.Scanner;
public class PracticeArray {
    public static void main(String args[]) {
        ArrayList studentGrades= new ArrayList(10);
        Scanner input=new Scanner(System.in);
        
        for(int name=0;name < 10;name++){
            
            System.out.print("Please enter students name:\n");
            String nameInput= input.nextLine();
            studentGrades.add(nameInput);
            for(int grade=0;grade<1;grade++){
                System.out.print("Please enter the students grade:\n");
                int gradeInput=input.nextInt();
                studentGrades.add(gradeInput);
                
            }
            input.nextLine();
        }
        
    }
}