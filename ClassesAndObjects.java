/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author SriVastav
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        person Ibra = new person();
        person Wazza = new person();
        
        Ibra.setid(9);
        Ibra.setage(36);
        Ibra.setname("Ibrahimovic"); 
        
        Wazza.setid(10);
        Wazza.setage(31);
        Wazza.setname("Rooney");
        
        
        System.out.println(Ibra.getname() + " is " + Ibra.getage() + " Years old and wears the " + Ibra.getid() + " Jersey ");
        System.out.println(Wazza.getname() + " is " + Wazza.getage() + " Years old and wears the " + Wazza.getid() + " Jersey ");
        
        
    }
    
}
