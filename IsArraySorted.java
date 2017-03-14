/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isarraysorted;

/**
 *
 * @author SriVastav
 */
public class IsArraySorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A={1,2,3,4};
        
        int ans = isArraySortedOrder(A, 4);
        
        if(ans == 1)
            System.out.println("sorted");
        else
              System.out.println(" not sorted");
    }
    public static int isArraySortedOrder(int [] A, int index){
        if(A.length==1)
            return 1;
        return(A[index-1]<A[index-2])?0:isArraySortedOrder(A, index-1);
    }
    
}
