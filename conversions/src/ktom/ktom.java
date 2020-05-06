/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktom;

import java.util.Scanner;

/**
 *
 * @author Lethabo
 */
public class ktom {

    /**
     * @param args the command line arguments
     */
    
     private static Scanner in;
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        // get input in kilometers
          in  = new Scanner(System.in);
        
        
        System.out.println("Enter kilometers value");
        
        double k = in.nextDouble();
        
        
        //convert and display in miles
       double m =  0.621371 * k;
        System.out.println("Miles : " + m);
    }
    
}
