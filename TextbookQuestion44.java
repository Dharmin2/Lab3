import java.util.*;
public class TextbookQuestion44
{
    public static void main(String[] args) {
        
        double areasqare,arearectangle;
        final double rectanglewidth=1/9;
        final double rectanglength=4;
        final double squareside=2/3;
        
        areasqare=squareside*squareside;
        arearectangle=rectanglength*rectanglewidth;
        
        if(arearectangle==areasqare){
            System.out.println("Area's are equal");
        }
        
        else if(arearectangle!=areasqare)
            System.out.println("Area's are not equal");
    }
}
    