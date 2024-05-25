
package com.coding.arrays;


import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author Naveen K Wodeyar
 * @apiNote Given a list of integers, separate odd and even numbers
 */
public class seperateOddEven {

    static void oddEven(List<Integer> intList) {
        		
        Map<Boolean, List<Integer>> collect = intList.stream().collect(Collectors.partitioningBy(n-> n%2==0));
        
        for(Entry<Boolean, List<Integer>> map:collect.entrySet()) {
            if(map.getKey()) {
        	System.out.println("\n Even");
            }else {
        	System.out.println("\n Odd");
            }
            for(Integer i:map.getValue()) {
        	System.out.println(i);
            }
        }
    
    }
    
    static void oddEvenSeperator(List<Integer> intList) {
    	Stream<Object> collect = intList.parallelStream().collect(Collectors.partitioningBy(n->n%2==0))
    		.entrySet().stream()
    		.map(k->String.format("%n%s",k.getKey()?"Even":"Odd",k.getValue().stream().map(String::valueOf).collect(Collectors.joining("\n"))));
    	System.out.println(collect);
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//        oddEven(intList);
        oddEvenSeperator(intList);
    }

}
