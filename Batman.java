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
import java.util.EnumSet;
public class Batman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (Robin things : Robin.values())
            System.out.printf("%s\t%s\t%s\t\n", things, things.getName(), things.getAge());
        
        for (Robin things : EnumSet.range(Robin.MUFC, Robin.CONOR))
            System.out.printf("%s\t%s\t%s\t\n", things, things.getName(), things.getAge());
    }
    
}
