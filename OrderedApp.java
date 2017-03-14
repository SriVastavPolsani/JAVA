/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderedapp;

/**
 *
 * @author SriVastav
 */
class OrderedArray //Ordered array class
{
    private long[]a; //ref to array a
    private int nElems; //No of elemensts in the array
    //-------------------------------------------------------------------------
    public OrderedArray(int size)   //Constructor
    {
    a= new long[size]; //Creating array
    nElems=0; //Init no of elements to 0
    }
    
    public int size() //Size of the array
    {
        return nElems; //return the number of elements
    }
    
    public int find(long searchKey) //Find the searched item
    {
        int lowerBound=0; //Set lower bound = 0
        int upperBound=nElems-1; //Upper bound as the highest element
        int currInst; //Declare the current instance
        
        while(true) //While the range is true
        {
            currInst=(lowerBound+upperBound)/2; //Set current instance as half the range
            if (a[currInst]==searchKey) //found the searched eklement?
                return currInst; //yes
            else if(lowerBound>upperBound) //If you are out of range
                return nElems; //Could not find it , return the size +1
            else //else change the range accordingly
            {
                if(a[currInst]>searchKey) //If search key is too low
                {
                    upperBound=currInst-1; //Change upper bound to cuur-1
                }
                else // if search key is high
                    lowerBound=currInst+1;
            } //end else divide ranhge
        } //end range loop
        
        
    }// end find
    
    public void insert(long value) //Insert an element
    {
        int j; //loop iterator
        for(j=0; j<nElems;j++) //For all the elements
            if (a[j]>value) //If value to insert is greater than the current element
                break; //break out of loop
        for(int k=nElems; k>j;k--) //For all elements from the end till the curr element
            a[k]=a[k-1]; //Move all elements from that position one poition extra
        a[j]=value; //insert the value in the empty position 
        nElems++; //Increase the mmber of elements
     
    } //end insert
    
    public boolean delete(long value) //delete a value
    {
        int j=find(value); //Find the value to be deleted first
        if(j==nElems) //if that returns nElems
            return false; //Didn't find the element
        else //If you found the element
        {
            for(int k=j;k<nElems; k++) //All the element from that position
                a[k]=a[k+1]; //move them one poition down
        nElems--; //Decrease the number of elements by 1
        return true; //Return true
        }   //End else
    } //end delete()
    
    public void display() //Display all the values
    {
        for(int j=0;j<nElems;j++) //For all the elements
        
            System.out.print(a[j]+" "); //print out the elements
            System.out.println(""); //Print a line space
        
    } //end display()
}
public class OrderedApp { //ordered app starts here

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main starts here
        // TODO code application logic here
    int maxSize=100; //max size of the array
    OrderedArray arr; //reference to the array
    arr=new OrderedArray(maxSize); //Create the array
    
    arr.insert(11); //inserting 10 elements
    arr.insert(31);
    arr.insert(9);
    arr.insert(3);
    arr.insert(10);
    arr.insert(49);
    arr.insert(12);
    arr.insert(19);
    arr.insert(25);
    arr.insert(27);
    
    int searchKey=25; //Element to be searched
    if(arr.find(searchKey)!=arr.size()) //If element is there
        System.out.println("Found your element" + searchKey); //Display that you found it 
    else  
        System.out.println(searchKey+"Element not found"); //Display you didn't find it
    
    arr.display(); //display elements
    
    arr.delete(19); //delete 2 elements
    arr.delete(25);
    
    arr.display(); //Display elements after deletion
        
    }//End main
    
} //End ordered app here
