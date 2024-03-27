package com.mohit;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementInString {
	
	public static void main(String args[]) {
		
	//	String s="I welcome you and you welcome me";
		/*
		 * String[] stringArray= s.split(" "); Arrays.stream(stringArray)
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet().stream().filter(a-> a.getValue() > 1).map(b->b.getKey())
		 * .forEach(System.out::println);
		 */
		String s="I welcome you and you welcome me";
		s.chars().mapToObj(i->(char) i)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(a-> a.getValue() == 1).map(b->b.getKey()+"---"+b.getValue())
		.forEach(System.out::println);
		
	}

}
