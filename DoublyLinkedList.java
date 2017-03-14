/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author SriVastav
 */
public class DoublyLinkedList {

    //properties
    private DLLNode head;
    private DLLNoe tail;
    private int length;
    
    //Create a new empty doubly linked list 
    public DoublyLinkedList(){
        head= new DLLNode(Integer.MIN_VALUE, null, null);
        tail = new DLLNode(Integer.MIN_VALUE, head, null);
        head.setNext(tail);
        length= 0;
    }
    
    //Get the value at a given position
    public int get(int position)
    {
        return Integer.MIN_VALUE;
    }
    
    //Find the position of the head value that is equal to a given value
    public int getPosition(int Data){
        DLLNode temp = head;
        int pos =0;
        while(temp!=null){
            if(temp.getData() == data){
                return pos;
            }
            pos+=1;
            temp=temp.getNext();
        }
        //else return some large value
        return Integer.MIN_VALUE;
    }
    //Return the current length of DLL
    public int Length(){
        return length;
    }
    
    //Add A new value to the front of the list
    public void insert (int newValue) {
        DLLNode newNode = new DLLNode(newValue, head, head.getNext());
        newNode.getNext().setPrev(newNode);
        head.setNext(newNode);
        length+=1;
    }
    
    //Add a new value to the list at a given poition
    //All values at this position move over to make room 
    
    public void insert(int data, int position)
    {
        //Fix the position
        if(position<0)
            position = 0;
        if(position>  length)
            position = length;
        // If list is empty , make it the only element
        if(head == null){
            head = new DLLNode(data);
            tail = head;
        }
        // If adding at the front of the list
        else if(position == 0){
            
            DLLNode temp = new DLLNode(data);
            temp.next = head;
            head=temp;
        }
        // else find the correct position and insert
        else
        {
            DLLNode temp = head;
            for(int i =1 ; i < position ; i+=1){
                temp = temp.getNext();
            }
            DLLNode newNode = new DLLNode(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            newNode.next.prev = newNode;
            temp.next = newNode;
        }
        //the list is one value longer now
        length+=1;
    }
    
    //Add a value at the rear end of the list
    public void insertTail(int newValue){
        DLLNode newNode = new DLLNode(newValue, tail.getPrev(), tail);
        newNode.getPrev().setNext(newNode);
        tail.setPrev(newNode);
        length+=1;
        
    }
    
    //Remove the value at a given position
    public void remove(int position)
    {
        //fix position
        if(position<0)
            position =0 ;
        if(position>length){
            position = length-1;
        }
        //if nothing in the list, do nothing
        if(head==null)
            return;
        
        //if removing the head element
        if(position ==0){
            head = head.getNext();
            if(head==null)
                tail=null;
        }
            
        //else advance to the correct position and remove
        else{
            DLLNode temp = head;
            for(int i = 1; i<position; i++)
            {
                temp=temp.getNext();
            }
            temp.getNext().setPrev(temp.getPrev());
            temp.getPrev().setNext(temp.getNext());
        }
        //reduce the length of the list
        length-=1;
    }
    
    //reduce a node matching the specified node from the list
    public synchronized void remove(DLLNode node){
        if(head==null) return;
        if(node.equals(head)){
            head=head.getNext();
            if(head==null){
                tail=null;
                return;
            }
            DLLNode p = head;
            while(p!=null){
                if(node.equals(p)){
                   p.prev.next=p.next;// p.getPrev().setNext(p.getNext());
                   p.next.prev=p.prev;
                   return;
                }
                //p=p.getNext() missing??
            }
        }
    }
    
    //Remove the head value from the list, if list is empty , do nothing
    
    public int removeHead(){
        if(length==0)
            return Integer.MIN_VALUE;
        DLLNode save = head.getNext();
        head.setNext(save.getNext());
        save.getNext().setPrev(head);
        length-=1;
        return save.getData();
    }
    
    //Remove the tail value from the list
    
    public int removeTail(){
        if(length==0)
            return Integer.MIN_VALUE;
        DLLNode save = tail.getPrev();
        tail.setPrev(save.getPrev());
        save.getPrev().setNext(tail);
        length-=1;
        return save.getData();
    }
}
