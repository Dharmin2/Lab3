import java.util.*;
public class Lab3Question3
{
    public static void main(String[] args) {
        
        int Celsius;
        
        System.out.println("Enter temperature in Celsius");
        
        Scanner z=new Scanner(System.in);
        Celsius=z.nextInt();
        if(Celsius>0&&Celsius!=0){
            System.out.println("Its hot");
        }
        else if(Celsius<0&&Celsius!=0){
            System.out.println("Its cold");
        }
        
    }
}