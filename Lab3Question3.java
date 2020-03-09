import java.util.*;
public class Lab3Question3
{
	public static void main(String[] args) {
		
		String output;
		int Celsius;
		
		Scanner z=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		Celsius=z.nextInt();
		output = Celsius >= 0 ? "It's hot" : "It's cold";
		System.out.println(output);
		
	
		   
	}
}