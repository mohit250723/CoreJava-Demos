package com.mohit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodeDecodeJava8Prac {
	
	public static void main(String args[]) {
		//Q 1: find the duplicate elements in integer list
		
		List<Integer> list= Arrays.asList(10,28,87,10,20,76,28,80,80,80,80);
	//unique elements //list.stream().collect(Collectors.toSet()).forEach(System.out::println);
	//duplicate elements now
		Set<Integer> duplicateElement= new HashSet<Integer>();
		
		//list.stream().filter(e->!duplicateElement.add(e)).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		// Q 2: number of occurances occured  
		String s= "welcome to code decode and code decode welcome you";
		//Convert the String to List<String> and split that with space 
		List<String> list2= Arrays.asList(s.split(" "));
		//Below we are converting it to map
	    Map<String,Long> map=list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    //System.out.print(map);
		
	    
	    //Hashmap
	    
	    Map<String,String> map2= new HashMap<String, String>();
	    
	    map2.put("1","Mohit");
	    map2.put("2","KoiNahi");
	    map2.put("1","Rohit");
	    map2.put("3","Sabhi");
	    
	   // map2.forEach((a,b)-> System.out.println("Key::::" + a +":::Value:::"+ b));
	    
	    System.out.println("GetValue:::" + map2.get("1"));
	    
	    
		
		
		
		
	}

}
