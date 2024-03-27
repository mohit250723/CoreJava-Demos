package com.mohit;

import java.util.Arrays;

public class ReTest {
public static void main(String args[]) {

	int[] arr1= {1,2,3,4,5};
	int[] arr2= {2,6,7,8,1,9};
	

	Arrays.stream(arr1).filter(a1-> Arrays.stream(arr2).anyMatch(a2-> a2==a1)).forEach(System.out:: println);
	
}
}
