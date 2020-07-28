
public class Temperature {
   
  
    // Method converts fahrenheit to celsius
   public double celsiusConvert(double fahrenheit){
       
       double celsiusConvert= 5.0 / 9.0 * (fahrenheit -32);
       return celsiusConvert;
   }
    //Method converts celsius to fahrenheit    
   public double fahrenheitConvert(double celsius){
       double fahrenheitConvert= 9.0 / 5.0 * celsius + 32;
       return fahrenheitConvert;
   }

}