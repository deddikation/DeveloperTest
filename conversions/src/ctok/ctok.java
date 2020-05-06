/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctok;

import java.util.Scanner;

/**
 *
 * @author Lethabo
 */
public class ctok {

    /**
     * @param args the command line arguments
     */
    
      private static Scanner in;
    public static void main(String[] args)
    {
         // get input in celsius
          in  = new Scanner(System.in);
        
        
        System.out.println("Enter celsius value");
        
        float c = in.nextFloat();
        
        
        //convert and display in celvin
       float k = c +273.15F;
        System.out.println("Kelvin : " + k);
    }
    
}
