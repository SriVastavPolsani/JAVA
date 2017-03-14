/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcheckrecursion;

/**
 *
 * @author SriVastav
 */
public class SortCheckRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A={1,2,3,4,5};
        
        isArraySorted(A, 3);
        
    }
    
    public static int isArraySorted(int[] A, int index)
    {
        if(A.length==1)
            return 1;
        return(A[index-1]<A[index-2])?0:isArraySorted(A,index-1);
    }
    
}
