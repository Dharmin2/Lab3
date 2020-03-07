import java.util.*;
public class Lab3Question4Final
{
  public static void main(String[] args) {
    
    double x , y;
    int choice;

    Scanner z = new Scanner(System.in);

    System.out.println("Choice one of the options");
    System.out.println("(1) Meters to feet");
    System.out.println("(2) CAD to USD");
    System.out.println("(3) Celsius to Fahrenheit");
    System.out.println("(4) pounds to kilos");
    System.out.println("(5) Liters to milliters");
    
    choice = z.nextInt();
    
    switch(choice){
        
        case 1: 
            System.out.println("Enter height in meters");
            x=z.nextDouble();
            y=x*3.28;
            System.out.println("Your height in feet is " + y);
        break;

        case 2: 
            System.out.println("Enter money in CAD");
            x=z.nextDouble();
            y=x*0.75;
            System.out.println("CAD in USD is " + y);
        break;

        case 3:
            System.out.println("Enter temperature in Celsius");
            x=z.nextDouble();
            y=(x*9/5)+32;
            System.out.println("Celsius in Fahrenheit is " + y);
        break;

        case 4:
            System.out.println("Enter weight in pounds");
            x=z.nextDouble();
            y=x*0.4535;
            System.out.println("pounds in kilos is " + y);
        break;

        case 5:
            System.out.println("Enter liquid in Liters");
            x=z.nextDouble();
            y=x*1000;
            System.out.println("Liters in milliters is " + y);
        break;
    }
  }
}
}