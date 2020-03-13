import java.util.*;
public class TextbookQuestion46 {
    public static void main(String args[]) {
        
        System.out.println("Enter email");
        Scanner z=new Scanner(System.in);
        String email=z.nextLine();
        
        if(email.contains("@")){
            System.out.println("It is an email");
        }
        else{
            System.out.println("@ is not found not an email");
        }
    }
}