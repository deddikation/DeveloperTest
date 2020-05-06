/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtok;

import java.util.Scanner;

/**
 *
 * @author Lethabo
 */
public class mtok {

    /**
     * @param args the command line arguments
     */
      private static Scanner in;
    public static void main(String[] args) {
        // TODO code application logic here
        
        // get input in celsius
          in  = new Scanner(System.in);
        
        
        System.out.println("Enter miles value");
        
        double m = in.nextDouble();
        
        
        //convert and display in kilometers
       double k =  1.60964 * m;
        System.out.println("Kilometers : " + k);
    }
    
}
