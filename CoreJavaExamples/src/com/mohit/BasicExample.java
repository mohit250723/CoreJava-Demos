package com.mohit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicExample {

	public static void main(String args[]) {
	//1) Given a list of integers, separate odd and even numbers? values 71, 18, 42, 21, 67, 32, 95, 14, 56, 87
		
List<Integer> evenList=	Stream.of(71, 18, 42, 21, 67, 32, 95, 14, 56, 87).filter(n-> n%2==0).collect(Collectors.toList());
List<Integer> oddList=Stream.of(71, 18, 42, 21, 67, 32, 95, 14, 56, 87).filter(n-> n%2!=0).collect(Collectors.toList());
//evenList.forEach(System.out::println);
//System.out.print(">>>>>>>>>>>>>>>>>>>>>>>");
//oddList.forEach(System.out::println);

//2.How do you remove duplicate elements from a list using Java 8 streams?
//values "Java", "Python", "C#", "Java", "Kotlin", "Python"

 List<String> duplList=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
 
  //Set<String> removedDup=duplList.stream().collect(Collectors.toSet());
  //System.out.print(removedDup);
  
  //if not changing to set then use distinct

  List<String> uniqueStrngs = duplList.stream().distinct().collect(Collectors.toList());
 // System.out.print(uniqueStrngs);
  
  //3.) How do you find frequency of each character in a string using Java 8 streams?
   String inputString = "Java Concept Of The Day";
    
 // Map<Character,Long> map1= inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   
//System.out.println(map1);

 //How do you sort the given list of decimals in reverse order?

List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//  decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
  
  //List<Integer> numList= Arrays.asList(12,1,34,23,55,33,9,34,25,67);
  
  int[] arr= {12,1,34,23,55,33,9,34,25,67};
		  
  IntStream.range(0, arr.length/2).forEach(i->
  {
	  int temp=arr[i];
	  arr[i] = arr[arr.length -i-1];
	  arr[arr.length -i-1] = temp;
  }
  );

//for (int j : arr) {
//System.out.println(j);	
//}
  
  
  int[] arr1= {1,2,3,4,5};
  int[] arr2= {9,7,1,6,2};
  Arrays.stream(arr1).filter(a-> Arrays.stream(arr2).anyMatch(b-> b==a)).forEach(System.out::println);
  
  //using box in same exmaple
  
 List<Integer> listOfMatched= Arrays.stream(arr1).filter(a-> Arrays.stream(arr2).anyMatch(b-> b==a)).boxed().collect(Collectors.toList());
  
  System.out.println(listOfMatched);
  
	}
}
