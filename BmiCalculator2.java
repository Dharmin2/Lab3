import java.lang.Math;
import java.util.Scanner;
public class BmiCalculator {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.

        double weight;
        double height;
        double bmi;
        double meters;
        double kilos;

        Scanner w= new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        weight = w.nextDouble();
        Scanner h=new Scanner(System.in);
        System.out.println("Enter height in feet");
        height = h.nextDouble();
        

       meters=0.3048*height;
       kilos=0.453592*weight;
       
       bmi= kilos/(meters*meters);
       System.out.println(bmi);
       
       if(bmi<18.5){
           System.out.println("Underweight");
           
       }
       else if(bmi>=18.5 && bmi<=25){
           System.out.println("Healthy");
       }
       else if(bmi>=25 && bmi<30){
           System.out.println("Overweight");
           }
           else if(bmi>=30){
               System.out.println("Obese");
           }
    }
}
