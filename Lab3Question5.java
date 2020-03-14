import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.Calendar;
import java.time.temporal.ChronoUnit;

public class Main{
    
    public static int today(LocalDate x){
        LocalDate date=LocalDate.now();
        return Period.between(x,date).getYears();
    public static void main(String[]args){
        System.out.println("Enter birthday in yyyy-mm-dd");
        System.out.println("Remember to add 0 in front mm 09 for september");
        Scanner z=new Scanner(System.in);
        String birthday= z.nextLine();
        
        LocalDate x=LocalDate.parse(birthday);
        System.out.println("You are " + today(x));
        
            LocalDate today=LocalDate.now();
            LocalDate Bday=x;
            LocalDate nextBday=x.withYear(today.getYear());
            
            if(nextBday.isBefore(today)||nextBday.isEqual(today)){
                nextBday=nextBday.plusYears(1);
            }
            Period p=Period.between(today,nextBday);
            long pe = ChronoUnit.DAYS.between(today, nextBday);
            System.out.println("Your birthday is in "+p.getMonths()+"months and "+p.getDays()+"days");
        }
}