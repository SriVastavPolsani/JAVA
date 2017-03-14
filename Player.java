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
public class Player {
    private String name;
    private int goals;
    private int assists;
    
    public Player(String n){
        
        name = n;
        goals =0;
        assists =0;
    
}
    
    public String getName(){
        return this.name;
    }
    
    public int getGoals(){
        return this.goals;
    }
    
    public int getAssists(){
        return this.assists;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public void setGoals(int goals){
        this.goals = goals;
    }
     
      public void setAssists(int assists){
        this.assists = assists;
    }
      
      public void modifyAssists(int matchAssists){
          assists += matchAssists;
      }
      
      public void modifyGoals(int matchGoals){
          goals += matchGoals;
      }
      
      
      
}
