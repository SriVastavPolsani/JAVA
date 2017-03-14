
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoi;

/**
 *
 * @author SriVastav
 */
public class TowersOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TowersOfHanoi(3, 'a','b','c');
        
    }
    
  public static void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg)
    {
        if(n==1)
        {
            System.out.println("Move disk 1 from " +frompeg + "to peg" + topeg);
            return;
        }
        else
        {
        TowersOfHanoi(n-1,frompeg,auxpeg,topeg);
        System.out.println("Move disk from peg " +frompeg+ "topeg " +topeg);
        TowersOfHanoi(n-1,auxpeg,topeg,frompeg);
        }
    }
}

    
    

