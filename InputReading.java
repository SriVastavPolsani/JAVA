/*
Amne Challenge #1
 */
package inputreading;

/**
 *
 * @author SriVastav
 */ // headers MUST be above the first class
import java.util.List;
import java.util.ArrayList; 
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
// one class needs to have a main() method
public class InputReading
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args) throws IOException
  {
      Integer N;
      Integer K;
 Scanner s = new Scanner(new File("D:\\Data Structures and Algorithms\\ExamplePrograms\\InputReading\\src\\inputreading\\Input.txt"));
 ArrayList<Integer> list = new ArrayList<>();
 while(s.hasNext()){
     if(s.hasNextInt()){
         list.add(s.nextInt());
     }
     else {
         s.next();
     }
 } 
 N = list.get(0);
 K = list.get(1);
 ArrayList<Integer> newList = new ArrayList<>(list.subList(2,N+2));
// Integer [] SalePrice = newList.toArray(new Integer[newList.size()]);
 Integer[] SalePrice =  new Integer[newList.size()];
 
 for(int i =0; i<SalePrice.length;i++){
     SalePrice[i] = newList.get(i).intValue();
 }
 
/* System.out.println(N);
  System.out.println(K);
  // System.out.println(Arrays.toString(SalePrice));
 System.out.println(SalePrice[0]);
 //System.out.println(list);*/
if(N == null || K==null || N<1||N>200000 || K<1 || K>N){
            throw new RuntimeException();
        }
        
        System.out.println("N :" + N);
        System.out.println("K :" + K);
        System.out.println("Values: ");
        for(int i =0; i< SalePrice.length; i++ ) {
            System.out.println(SalePrice[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Results " + findingRange(N,K,SalePrice));
        
        List<Integer> Output = new ArrayList<>();
        Output = findingRange(N,K,SalePrice);
        
        for (Integer elem : Output){
        System.out.println(elem);
        }

  }
  public static List<Integer> findingRange(Integer N, Integer K, Integer[] SalePrice ) {
  List<Integer> output = new ArrayList<>();
    Integer noOfWindows = N-K+1;
    Integer endOfRange = K;
    List<List<Integer>> windowContainer = new ArrayList<>();
    for(int i = 0; i<SalePrice.length; i++){
    List<Integer> window = new ArrayList<>();
      if(i<K){
        for(int j =i; j < endOfRange; j++ ){
        window.add(SalePrice[j]);
        }
        endOfRange++;
        windowContainer.add(window);
     }
    }
    System.out.println("Windows : " + windowContainer);
    for(List<Integer> window : windowContainer) {
    output.add(determineIncreasing(window) - determineDecreasing(window));
    }
    if(output.size() != noOfWindows) {
    throw new RuntimeException();
    }
    return output;
  }
  
  public static Integer determineIncreasing(List<Integer> data){
  List<List<Integer>> subranges = new ArrayList<>();
    for(int i =0; i< data.size() -1 ; i++){
      for(int j =1; j< data.size(); j++) {
        if(i+j >= data.size()){
        continue;
        }
        if(data.get(i+j-1) < data.get(i+j)){
        subranges.add(data.subList(i, i+j+1));
        } else {
        break;
        }
      }
    }
    System.out.println("Window" + data + " -Increasing Subranges: " + subranges);
    return subranges.size();
  }
  
  public static Integer determineDecreasing(List<Integer> data){
  List<List<Integer>> subranges = new ArrayList<>();
    for(int i =0; i< data.size() -1 ; i++){
      for(int j =1; j< data.size(); j++) {
        if(i+j >= data.size()){
        continue;
        }
        if(data.get(i+j-1) > data.get(i+j)){
        subranges.add(data.subList(i, i+j+1));
        } else {
        break;
        }
      }
    }
    System.out.println("Window" + data + " -Decreasing Subranges: " + subranges);
    return subranges.size();
  }
  
}