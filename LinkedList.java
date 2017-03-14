/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SriVastav
 */
public class LinkedList {
    //Default constructor
    public LinkedList(){
        length=0;
    }
    //This is the only field of the class. Holds the head of the list
    ListNode head; 
    
    //Length of the linked list
    private int length = 0;
    
    //return the first node in the list
    public synchronized void ListNode getHead()
    {
        return head;
    }
    
    //Insert a node at the beginning of the list
    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head=node;
        length++;
    }
    
    //Insert a node at the end of the list
    public synchronized void insertAtEnd(ListNode node){
        if(head==null)
            head=node;
        else{
            ListNode p,q;
            for(p=head;(q=p.getNext())!=null; p=q);
            p.setNext(node);
        }
        length++;
    }
    //Add a new value at a given position
    //all values from this position to the end move over to make room
    public void insert(int data, int position)
    {
        //fix the position
        if(position<0)
            position=0;
        if(position>length)
            position=length;
        //if list is empty, make it to be the only element
        if(head==null){
            head=new ListNode(data);
        }
        //if adding at the front of the list
        else if(position==0){
            ListNode temp = new ListNode(data);
            temp.next= head;
            head=temp;
            }
        else {
            ListNode temp = head;
            for(int i=1 ; i<position ; i++){
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.setNext(newNode);
            }
        //list is one value longer now
        length+=1;
    }
    //Remove and return the node at the beginning of the list
    public synchronized ListNode removeFromBegin(){
        ListNode node = head;
        if(node!=null)
        {
            head= node.getnext();
            node.setnext(null); //??
        }
        return node;
    }
    //Remove the value at a given position
    public void remove(int position){
        if(position<0){
            position=0;
        }
        if(position>=length){
            postion = length-1;
        }
        //If nothing is in the list, do nothing
        if(head==null)
            return;
        //if moving the head element
        if(position==0)
            head=head.getNext();
        else{
            ListNode temp = head;
            for(int i=1; i< position;i+=1){
                temp=temp.getNext();
        }
            temp.setNext(temp.getNext().getNext());
        }
        //reduce the length of the list
        length -=1;
    }
    //return a string representation of this collection , in the form ["str1","str2",....].
    public string toString() {
    string result = "[";
    if(head==null){
    return result+"]";
    }
        result = result + head.getData();
        ListNode temp = head.getNext();
        
        while(temp!=null){
            result = result + ","+ temp.getData();
            temp= temp.getNext();
    }
        return result +  "]";
    }
    
    //return the current length of the list.
    
    public int length() {
        return length;
    }
    
    //Find the position of the first value that is equal to a given value
    public int getPosition(int data){
        ListNode temp = head;
        int pos = 0;
        
        while(temp!=null){
            if(temp.getData()==data){
                return pos;
            }
            pos+=1;
            temp = temp.getNext();
        }
        //else return some latge value
        return Integer.MIN_VALUE;
    }
    //Remove everything from the list
    public void clearList(){
        head = null;
        length =0;
    }
    
}
