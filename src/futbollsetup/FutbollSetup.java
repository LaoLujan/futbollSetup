/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbollsetup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author NHLUJ
 */
public class FutbollSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int optionNum = mainMenu();
        if (optionNum ==1){
            dataInput();
        }
    }
    
    public static int mainMenu(){
    
       System.out.println("Welcome to Fantasy Football program");
       System.out.println("1. Initialize the program with data");
       System.out.println("2. Enter in a team");
       Scanner sc = new Scanner(System.in);
       String option = sc.nextLine();
//       int optionNum = Integer.parseInt(option);
       return Integer.parseInt(option);
    }
    public static void dataInput() throws IOException{
       BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData2.csv"));
       String line;
       while ((line = br.readLine()) !=null){
       String[] playerData = line.split(",");
       System.out.println(playerData[0]);
    }
       
    }
}
