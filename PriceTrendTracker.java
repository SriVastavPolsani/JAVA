/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricetrendtracker;

/**
 *
 * @author SriVastav
 */
import java.util.ArrayList;
import java.util.List;

public class PriceTrendTracker{

     public static void main(String []args){
        Integer N = 5;
        Integer K =2;
        Integer[] SalePrice = {188930, 194123, 201345, 154243, 154243};
        
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
        
     }
  
  public static List<Integer> findingRange(Integer N, Integer K, Integer[] SalePrice ) {
  List<Integer> output = new ArrayList<Integer>();
    Integer noOfWindows = N-K+1;
    Integer endOfRange = K;
    List<List<Integer>> windowContainer = new ArrayList<List<Integer>>();
    for(int i = 0; i<SalePrice.length; i++){
    List<Integer> window = new ArrayList<Integer>();
      if(i<noOfWindows){
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
  List<List<Integer>> subranges = new ArrayList<List<Integer>>();
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
  List<List<Integer>> subranges = new ArrayList<List<Integer>>();
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
