/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbollsetup;

/**
 *
 * @author NHLUJ
 */
public class Forward extends Player{

        int numGoalsScored;

    public Forward(int numGoalsScored, String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
        this.numGoalsScored = numGoalsScored;
    }
        
   
    
}
