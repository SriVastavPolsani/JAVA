/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandparams;

/**
 *
 * @author SriVastav
 */
public class TunaFish {
    
    private String Name;
    
    public void setName(String name){
        
        Name = name;
        
    }
    
    public String getName()
    {
        return Name;
    }
    
    
   public void SimpleMessage(String Name){
        System.out.println(Name +  " Was a babe");
    } 
}
