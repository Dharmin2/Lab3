import java.util.*;
public class TextbookQuestion48
{
    public static void main(String[] args) {
        
        System.out.println("Enter Id");
        Scanner z=new Scanner(System.in);
        String Id=z.nextLine();
        int IdLength= Id.length();
        
        if(IdLength>=6 && IdLength<=10){
            System.out.println("Welcome "+Id);
        }
        else if(IdLength<6 | IdLength>10)
            System.out.println("Sorry user id invalid");
    }
}