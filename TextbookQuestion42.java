import java.util.*;
public class TextbookQuestion42
{
    public static void main(String[] args) {
        
        double ShotsTaken,ShotsMade,percent;
        
        Scanner z=new Scanner(System.in);
        System.out.println("Enter ShotsTaken by player");
        ShotsTaken=z.nextDouble();
        
        Scanner x=new Scanner(System.in);
        System.out.println("Enter ShotsMade by player");
        ShotsMade=x.nextDouble();
        
        percent=(ShotsMade/ShotsTaken)*100;
        
        if(percent>30){
            System.out.println("The player is elligible for all stars");
        }
        else if(percent<=30)
            System.out.println("Not elligible for all starts");
    }
}