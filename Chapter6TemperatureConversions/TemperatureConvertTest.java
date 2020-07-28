/************************************************************/
/*Program: Temperature_Conversions                          */
/*CIS163AA-17045                                            */
/*Anthony Almanza                                           */
/*06/14/2020                                                */
/*Program has user choose conversion type for temperature 
then takes input and converts it to desired conversion type. */
/************************************************************/



import java.util.Scanner;
public class TemperatureConvertTest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Please type 'celsius' for celsius conversion or 'fahrenheit' for fahrenheit conversion: \n");
        String inputChoice= input.next().toLowerCase();

        if (inputChoice.equals("celsius")){
            System.out.printf("Please input your Fahrenheit degree you want to convert to celsius:\n");
            Double celsiusInput= input.nextDouble();
            Temperature convert1= new Temperature();
            Double finalConvert= convert1.celsiusConvert(celsiusInput);
            System.out.printf("%.1f converted to Fahrenheit is : %.1f F\n",celsiusInput,finalConvert);
        }
        else if(inputChoice.equals("fahrenheit")){
            System.out.printf("Please input your celsius degree you want converted to fahrenheit:\n");
            Double fahrenheitInput= input.nextDouble();
            Temperature convert2= new Temperature();
            Double finalConvert2= convert2.fahrenheitConvert(fahrenheitInput);
            System.out.printf("%.1f convertedt to celsius is : %.1f C\n", fahrenheitInput,finalConvert2);
        }
        else{
            System.out.print("\nError in selection.");
        }
            
        input.close();

        
    }


}