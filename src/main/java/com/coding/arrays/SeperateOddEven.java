
package com.coding.arrays;


import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author Naveen K Wodeyar
 * @apiNote Given a list of integers, separate odd and even numbers
 */
public class SeperateOddEven {

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
    	intList.parallelStream().distinct().sorted().collect(Collectors.partitioningBy(n->n%2==0))
    			.forEach((isEven,numbers)->System.out.printf("%n%sNumbers%n%s",isEven?"EvenNo":"Odd",numbers.stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator()))));
    
    	intList.stream().distinct().sorted().collect(Collectors.partitioningBy(n-> n%2 ==0)).entrySet().stream().map(n->String.format("%n%sNumbers%n%s",n.getKey()?"Even": "Odd",n.getValue().stream().map(String::valueOf).collect(Collectors.joining()))).forEach(System.out::println);
    
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87,24,42,18,67);
        oddEvenSeperator(intList);
    }

}
