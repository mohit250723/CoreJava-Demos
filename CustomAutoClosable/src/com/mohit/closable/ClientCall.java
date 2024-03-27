package com.mohit.closable;

public class ClientCall {
	
	public static void main(String args[]) throws Exception {
		System.out.print("AAAAAA");
		try(Employee e1= new Employee(1,"A")){
			System.out.print("BBBBB");
			
		} 
		
	}

}
