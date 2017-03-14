/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectsort;

/**
 *
 * @author SriVastav
 */
class arraySel //Array class
{
    private long[] a; //ref to the array
    private int nElems; //no of elems in the array
    
    public arraySel(int max) //Constructor
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
     
     public void selectSort() //select sort method
     {
         int i,j,min; //iterators for inner and outer loop
         for(j=0;j<nElems-1;j++) //Outer loop from the first element because first positions sorted first
         {
             min=j; //Set the first element position as the min element position
             for(i=j+1;i<nElems;i++) //Check all the elements after the prev assigned position
                 if(a[i]<a[min]) //If element is tless than the current min element
                     min=i; //Set the position of current element as minimum element posn
             swap(j,min); //Swap the element in min position to the first element now
         }
     }
     private void swap(int x,int y) //swap method
     {
         long temp=a[x]; //Store the lower element in temp variable
         a[x]=a[y]; //swap 
         a[y]=temp; //
     }
} //end class arrayBub
public class SelectSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        int maxsize=100; //max size of array
        arraySel arr; //ref to arr
        arr=new arraySel(maxsize); //create arr
        
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
                 arr.selectSort(); //sort the elements using select sort
                 arr.display(); //Display them again
    } //main ends 
    
} //Select sort app ends here
