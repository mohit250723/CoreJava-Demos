package com.mohit.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class TestImmutable {
	
	private Integer id;
	private String name;
	private Double salary;
	private  Date salDate;
	private List<Integer> noOfleaves;
	private List<String> days;
	

	public TestImmutable(Integer id, String name, Double salary, List<Integer> noOfleaves,List<String> days,Date salDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		//applying deep copy 
		List<Integer> deepCopyLeaves= new ArrayList<Integer>();
		for(Integer day:noOfleaves) {
			deepCopyLeaves.add(day);
			
		}
		this.noOfleaves=deepCopyLeaves;
		//need to apply deep copy
		this.days=days; 
		//no need to apply deep copy
		this.salDate=salDate;
		
	}

	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public List<Integer> getNoOfleaves() {
		return noOfleaves;
	}

	public List<String> getDays() {
		return days;
	}
	
	public Date getSalDate() {
		return salDate;
	}

	@Override
	public String toString() {
		return "TestImmutable [id=" + id + ", name=" + name + ", salary=" + salary + ", salDate=" + salDate
				+ ", noOfleaves=" + noOfleaves + ", days=" + days + "]";
	}

	

}
