/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdataapp;

/**
 *
 * @author SriVastav
 */
class Person //Class person starts
{
private String lastName; //Data members
private String firstName;
private int age;

public Person(String last, String first, int a) //Constructor assigning values
{
  lastName=last;
  firstName=first;
  age=a;
}

public void displayPerson() //Display the details of the person
{
    System.out.println("Last name" + lastName);
    System.out.println("First name" + firstName);
    System.out.println("Age" + age);
}

public String getLast() //Get the last name of the person
{
    return lastName; // returning last name of the person
}
} //Person clsas ends
////////////////////////////////////////////////////////////////////////////////

class ClassDataArray //Class for all the persons starts here
{
    private Person[] a; //Reference to person array a
    int nElems; //The size of the array
    
    public ClassDataArray(int max) //Constructor
            {
                a=new Person[max]; //Create the new array
                nElems=0; //Num of elements now are 0
            }
    
    public Person find(String SearchName) //Find specified person
{
    int j;
for( j=0;j<nElems;j++) //Go through every element

    if(a[j].getLast().equals(SearchName)) //Found your person?? using equals because its a string you are comparing
        break; //Go out of loop then
    if(j==nElems) //Loop has ended?
        return null; //You haven't found the person
    else 
        return a[j]; // You have found the person
}
    //--------------------------------------------------------------------------------------------------------------------------
    public void insert(String last, String first, int age) //inserting a person into the array
    {
        a[nElems]= new Person(last, first, age); //CAlling the pPerson constructor to insert element at the available position
        nElems++; //Increasing number of elements
    }
    //----------------------------------------------------------------------------------------------------------------------------
    public boolean delete(String SearchName) //Delete a person
{
    int k; //Loop iterator
for(k=0;k<nElems;k++) //Go through every element
if(a[k].getLast().equals(SearchName)) //Found the person
    break; //Get out of loop
if(k==nElems) //Reached end of loop
    return false; //Didn't find the person
else //Found the person
{
   for(int l=k;l<nElems;l++) //All persons in array from now
   
    a[l]=a[l+1];   //Delete the person and move all persons by one space
    nElems--; //Decrease the num of persons by 1
    return true; // return true
   }
}// end delete
    
    public void displaya() //Display all the values
    {
        for(int j=0;j<nElems;j++) //For all the elements
        
           a[j].displayPerson(); //Print a line space
        
    } //end display()
 }// end ClassDataArray

public class ClassDataApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Main starts here
        // TODO code application logic here
        int maxSize=100; //Max size of the array
        ClassDataArray arr; //reference to the array
        arr = new ClassDataArray(maxSize); //Create the array
        
        arr.insert("Rooney", "Wayne", 30); //Insert 10 persons
        arr.insert("Ronaldo", "Cristiano", 31);
        arr.insert("Van Persie", "Robin", 32);
        arr.insert("Messi", "Lionel", 30);
        arr.insert("Drogba", "Didier", 34);
        arr.insert("Ibrahimovic", "Zlatan", 35);
        arr.insert("Huntelaar", "Klaas-Jan", 33);
        arr.insert("Torres", "Fernando", 29);
        arr.insert("Tevez", "Carlos", 32);
        arr.insert("Villa", "David", 31);
        
        arr.displaya(); //Display the array
        
        String SearchName = "Torres"; //Search for person with last name torres
        Person found; //Create new person object
        found=arr.find(SearchName); //Compare with the person being searched
        if (found!=null) //If you didn't find searched person
        {
            System.out.println("found"); //Display that you found the person
            found.displayPerson(); //Display details about person object
        }
        
        else 
            System.out.println("Can't find person"); // display that you didn't find the person
        
        System.out.println("Deleting Tevez, Villa and Drogba"); // delete three persons
        
        arr.delete("Tevez"); //Commands to delete
        arr.delete("Torres");
        arr.delete("Villa");
        
        arr.displaya(); // display the updated array
        
        
    }// end main
    
}// end classdataapp
