import java.util.*;
public class TextbookQuestion47
{
    public static void main(String[] args) {
        
        String Password,Password2;
        
        Scanner z=new Scanner(System.in);
        System.out.println("Enter Password");
        Password=z.next();
        
        Scanner x=new Scanner(System.in);
        System.out.println("Rewrite Password");
        Password2=x.next();
        
        if(Password.equals(Password2)){
            System.out.println("Welcome new user");
        }
        else{
            System.out.println("Error there is a typo in your Password");
        }
    }
}