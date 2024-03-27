package com.mohit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapvsflatmap {
	
	public static void main(String args[]) {
		List<Benefit> be1= new ArrayList<Benefit>();
		be1.add(new Benefit(1, "B1"));
		be1.add(new Benefit(2, "B2"));
		
		List<Benefit> be2= new ArrayList<Benefit>();
		
		be2.add(new Benefit(1, "B3"));
		be2.add(new Benefit(2, "B4"));
		be2.add(new Benefit(3, "B1"));
		List<Benefit> be3= new ArrayList<Benefit>();
		
		be3.add(new Benefit(1, "B5"));
		be3.add(new Benefit(2, "B6"));
		be3.add(new Benefit(3, "B3"));
		
		List<Benefit> be4= new ArrayList<Benefit>();
		be4.add(new Benefit(1, "B7"));
		be4.add(new Benefit(2, "B8"));
		be4.add(new Benefit(3, "B1"));
		be4.add(new Benefit(4, "B2"));
		be4.add(new Benefit(5, "B3"));
		be4.add(new Benefit(6, "B4"));
		
		Employee e1= new Employee(1,"Mohit",2500.0, new Address("jersey1", "NJ1",07301, "USA"),be1);
		Employee e2= new Employee(2,"Rohit",2600.0, new Address("jersey2", "NJ2",07302, "USA"),be2);
		Employee e3= new Employee(3,"Sohit",2700.0, new Address("jersey3", "NJ3",07303, "USA"),be3);
		Employee e4= new Employee(4,"Rahul",2800.0, new Address("jersey4", "NJ4",07304, "USA"),be4);
			
	    Stream<Employee> empStream=	Stream.of(e1,e2,e3,e4);
	    
	//  List<List<Benefit>> eList = empStream.map(emp-> emp.getBenefits()).collect(Collectors.toList());
	    Set<Benefit> eList = empStream.flatMap(emp-> emp.getBenefits().stream()).collect(Collectors.toSet());
	    System.out.println(eList);
		
		
		
	}

}
