/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertsort;

/**
 *
 * @author SriVastav
 */
class arrayIns
{
    private long[] a; //ref to the array
    private int nElems; //no of elems in the array
    
    public arrayIns(int max) //Constructor
    {
        a=new long[max]; //create the array
        nElems=0; //no items yet in the array
    }
    
    public void insert(long value) //Method to insert values in array
    {
        a[nElems]=value; //put a value in the array
        nElems++; //Increment the size after addinbg an ekement
    }
    
    public void display() //Display all the values
    {
        for(int j=0;j<nElems;j++) //For all the elements
        
            System.out.print(a[j]+" "); //print out the elements
            System.out.println(""); //Print a line space
        
    } //end display()
    
    public void insertSort()
    {       
        //insertion sort method starts here
        int in,out;
        for( out=1;out<nElems;out++) //throw a marker elemensts to left sorted, right not.initially at second position
        {                           //for loop start
            long temp= a[out]; //put the marked element in a temp variable
            in=out; //start shifting of partially sorted elements from marked element
            while( in>0 && a[in-1]>=temp) // condition for elements to be shifted
            {
                a[in]=a[in-1]; //Shift the elements
                --in; //Move to left
                
            }
            a[in]=temp; //sort, put the marked element in its sorted position
        } //for ends
    } //sort ends
} //array class ends
public class InsertSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int maxsize=100; //max size of array
        arrayIns arr; //ref to arr
        arr=new arrayIns(maxsize); //create arr
        
        arr.insert(23); //insert the elements
         arr.insert(12);
          arr.insert(24);
           arr.insert(36);
            arr.insert(19);
             arr.insert(7);
              arr.insert(22);
               arr.insert(16);
                arr.insert(14);
                 arr.insert(32);
                 
                 arr.display(); //display
                 arr.insertSort(); //sort the elements using select sort
                 arr.display(); //Display them again
    } //main ends
    
} //App ends
