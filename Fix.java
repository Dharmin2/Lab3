import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
        String Password,Password2;
        
        Scanner z=new Scanner(System.in);
        System.out.println("Enter Password");
        Password=z.next();
        
        Scanner x=new Scanner(System.in);
        System.out.println("Rewrite Password");
        Password2=x.next();
        
        
        if(Password==Password2){
            System.out.println("You're registered as a new user");
        }
        else if(Password!=Password2)
            System.out.println("Sorry there is a typo in your Password");
    }
}