/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package higharrayapp;

class HighArray
{
private long[] a; //Reference to array a
private int nElems; // number of elements in the array
//------------------------------------------------------------------------------
public HighArray(int size) //Constructor
{
    a=new long[size]; //Create array of size size
    nElems=0; //Number of elements in array are 0
}

public boolean find(int SearchKey) //Find specified value
{
    int j;
for( j=0;j<nElems;j++) //Go through every element

    if(a[j]==SearchKey) //Found element?
        break; //Go out of loop then
    if(j==nElems) //Loop has ended?
        return false; //You haven't found the element
    else 
        return true; // You have found the element
}

public void insert(long value) //insert specified value
{
    a[nElems]=value; //insert value at the next available position
    nElems++; //increase the number of elements
}

public boolean delete(long value) //Delete an element
{
    int k; //Loop iterator
for(k=0;k<nElems;k++) //Go through every element
if(a[k]==value) //Found element?
    break; //Get out of loop
if(k==nElems) //Reached end of loop
    return false; //Didn't find element
else
{
   for(int l=k;l<nElems;l++) //All elements from now
   
    a[l]=a[l+1];   //Delete the element and move all elements by one space
    nElems--; //Decrease the num of elements by 1
    return true; // return true
   }
}// end delete

public boolean removeMax() //Remove the maximum num for the array
{
    long max=a[0]; //initialize the first element to be the maximum
    int j; //iterator
    for(j=0;j<nElems;j++) //All the elements in the array
     if(a[j]>max) //I any element greater than current max element
       break; //break from loop
        if(j==nElems) //If you reach end of loop
            return false; //return false
        else //otherwise delete the element
        {
        for(int k= j;k<nElems;k++) //All elements from there on
            a[k]=a[k+1]; //Move one position in front
        nElems--; //Decrease the size of the array
        return true; //Return true
        }    //End else
    
//System.out.println("max number is " + max);
    //return max;
} //End removeMX METHOD
public void display() //Display all the elements
{
   for(int j=0;j<nElems;j++) //For all the elements
       System.out.print(a[j]+" "); //Display the element
   System.out.println(" "); //Line space after displaying the elements
}
}//End HighClass Array


/**
 *
 * @author SriVastav
 */
public class HighArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int MaxSize=100; //Array size
        HighArray arr; //reference to array
        arr=new HighArray(MaxSize); //Create an array
        
        
                        //insert 10 items in the array
        arr.insert(77);
        arr.insert(31);
        arr.insert(24);
        arr.insert(17);
        arr.insert(20);
        arr.insert(18);
        arr.insert(19);
        arr.insert(21);
        arr.insert(92);
        arr.insert(78);
        
        arr.display(); //Display all the items
        
        int SearchKey=10; //Search for 10
        
        if(arr.find(SearchKey)) //If 10 is there
            System.out.println("Found" + SearchKey); //Display hat you found the element
        else
             System.out.println("Did not find" + SearchKey); //Display that element is not there
        
        arr.delete(24); //Delete 3 elemets
        arr.delete(17);
        arr.delete(20);
        
        arr.display(); //Display elemeyts after deletion
        
        arr.removeMax(); //Remove the max element from the array
        arr.display(); //Display all the elements after removing max element
        
    }// end main
    
} //end high array app
