package com.mohit.closable;

public class Employee implements AutoCloseable{
	
	private int id;
	private String name;
	
	

	public Employee(int id, String name) {
		System.out.print("CCCC");
		this.id = id;
		this.name = name;
		
		throw new ArithmeticException();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void close() throws Exception {
		
		System.out.println("Employee Class closed!!");
	}

}
