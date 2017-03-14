/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author SriVastav
 */
class arrayBub //Array class
{
    private long[] a; //ref to the array
    private int nElems; //no of elems in the array
    
    public arrayBub(int max) //Constructor
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
     
     public void bubblesort() //Bubble sort method
     {
         int i,j; //iterators
         for(j=nElems-1;j>1;j--) //Outer loop from the last element because last positions sorted first
             for(i=0;i<j;i++) //inner loop from the beginning till the last element
                 if(a[i]>a[i+1]) //compare the two elements
                     swap(i,i+1); //Calling the swap method
     }
     private void swap(int x,int y) //swap method
     {
         long temp=a[x]; //Store the lower element in temp variable
         a[x]=a[y]; //swap 
         a[y]=temp; //
     }
} //end class arrayBub

public class BubbleSort { //Bubble sort class app starts here

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main starts here
        // TODO code application logic here
        int maxsize=100; //max size of array
        arrayBub arr; //ref to arr
        arr=new arrayBub(maxsize); //create arr
        
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
                 arr.bubblesort(); //sort the elements
                 arr.display(); //Display them again
        
    } //end main
     
} // end bubble sort app
