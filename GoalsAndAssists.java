/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goalsandassists;

/**
 *
 * @author SriVastav
 */
public class GoalsAndAssists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player Kane = new Player("Harry Kane");
        Player Sanchez = new Player("Alexis Sanchez");
        Player Lukaku = new Player("Romeu Lukaku");
        Player Ibra = new Player("Zlatan Ibrahimovic");
        Player Costa = new Player("Diego Costa");
        
        System.out.println(Costa.getAssists());
        System.out.println(Sanchez.getGoals());
        
        
        Kane.setGoals(15);
        Lukaku.setGoals(15);
        Sanchez.setGoals(15);
        Costa.setGoals(15);
        Ibra.setGoals(15);
        
        System.out.println(Ibra.getGoals());
        System.out.println(Kane.getGoals());
        System.out.println(Lukaku.getGoals());
        System.out.println(Sanchez.getGoals());
        System.out.println(Costa.getGoals());
        
        Kane.modifyGoals(4);
        Lukaku.modifyGoals(5);
        
        Ibra.modifyAssists(5);
        
         System.out.println(Ibra.getAssists());
        System.out.println(Kane.getGoals());
        System.out.println(Lukaku.getGoals());
        
        
        
    }
    
}
