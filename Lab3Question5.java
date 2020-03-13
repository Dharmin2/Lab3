import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Lab3Quesion5{
    
    public static int today(LocalDate x){
        LocalDate date=LocalDate.now();
        return Period.between(x,date).getYears();
    }
    public static void main(String[]args){
        System.out.println("Enter birthday in yyyy-mm-dd");
        System.out.println("Remember to add 0 in front mm 09 for september");
        Scanner z=new Scanner(System.in);
        String birthday= z.nextLine();
        
        LocalDate x=LocalDate.parse(birthday);
        System.out.println("You are " + today(x));
    }
}