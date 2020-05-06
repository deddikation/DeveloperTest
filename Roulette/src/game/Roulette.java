/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
        Scanner in = new Scanner(System.in);
         String response = "";
         Random r = new Random();
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
        
        
        //Get bets 
        System.out.println("Type Start to begin the game, anything other key to end the game");
        response = in.nextLine();
        while(response.equalsIgnoreCase("Start"))
        {
            int number = r.nextInt(37);
             String output = "";
            
            System.out.println("Place your bets");
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                @Override
                public void run() 
                {
                    String bet = in.nextLine();
                    
                    String player = bet.substring(0, bet.indexOf(" "));
                    int p =-1;
                    
                    
                    switch(player)
                    {
                        case "Tiki_Monkey" : p = 0;
                        break;
                        case "Barbara" : p =1;
                    }
                    
                  String rem =  bet.replaceAll(player,"");
                    
                String  betNumber = rem.substring(0, rem.indexOf(" "));
                
                Double betVal = Double.parseDouble(rem.replace(betNumber,""));
                
                if(betNumber.)
                {
                    
                }
                    
                    
                };
            };
            timer.schedule(tt,1000,30000);
            
            
            
            
            
            
                System.out.println("Type Start to begin the game, anything other key to end the game");
        response = in.nextLine();
        }
        
        
        
        
    }
    
    
 
    
}
