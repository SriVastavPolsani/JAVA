/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodsandparams;
import java.util.Scanner;

/**
 *
 * @author SriVastav
 */
public class MethodsAndParams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // System.out.println("Hello, What is your name?");
        
        TunaFish TunaFishObject = new TunaFish();
        
        System.out.println("What is her name?");
        
        Scanner input = new Scanner(System.in);
        
        TunaFishObject.setName(input.nextLine());
        
        TunaFishObject.SimpleMessage(TunaFishObject.getName());
        
        
        
        
    }
    
}
