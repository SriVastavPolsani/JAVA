/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batman;

/**
 *
 * @author SriVastav
 */
public enum Robin {
    
    VASTAV("Cricket", 7),
    MUFC("Soccer", 15),
    ROCK("WWE", 10),
    CONOR("UFC", 24),
    BATEMAN("American Psycho",19);
    
    
    private String Name;
    private int Age;
    
    Robin(String n, int a){
        Name = n;
        Age = a;
    }
    
    public String getName(){
        return Name;
    }
    
    public int getAge(){
        return Age;
    }
    
    
    
    
    
    
    
    
}
