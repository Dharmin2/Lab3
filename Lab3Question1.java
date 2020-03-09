/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3Question1;

import java.util.*;
public class Lab3Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double radius,area;
        Scanner c=new Scanner(System.in);

                System.out.println("Enter raidus");
                radius= c.nextDouble();
                
                if(radius>=0){
                    area=radius*radius*Math.PI;
                    System.out.println(area);         
                }

                else if(radius<=0)
                    System.out.println("Error");
                }
    
}
