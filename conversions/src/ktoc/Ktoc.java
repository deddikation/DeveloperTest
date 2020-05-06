/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktoc;

import java.util.Scanner;

/**
 *
 * @author Lethabo
 */
public class Ktoc {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner in;
    public static void main(String[] args) 
    {
        // get input in kelvin
        in  = new Scanner(System.in);
        
        
        System.out.println("Enter celsius value");
        
        float c = in.nextFloat();
        
       float k = c +273.15F;
        System.out.println("Kelvin : " + k);
        
        
        
    }
    
}
