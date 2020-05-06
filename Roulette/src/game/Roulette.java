/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lethabo
 */
public class Roulette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            
    {
        //Read names from file
        File namesFile = new File("Names.txt");
        ArrayList<String> names = new ArrayList<>();
        
        try
        {
        Scanner reader = new Scanner(namesFile);
         
        while(reader.hasNextLine())
        {
            String data = reader.nextLine();
            names.add(data);
        }
        reader.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Reading names from file error ocurred");
        }
        
        
        
        
        
        
    }
    
}
