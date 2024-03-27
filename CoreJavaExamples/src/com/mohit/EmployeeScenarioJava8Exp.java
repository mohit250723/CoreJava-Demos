package com.mohit;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeScenarioJava8Exp {
	
	public static void main(String arg[]) {
		
	
	Employee e1= new Employee(1,"Mohit",2500.0, new Address("jersey1", "NJ1",07301, "USA"),null);
	Employee e2= new Employee(2,"Rohit",2600.0, new Address("jersey2", "NJ2",07302, "USA"),null);
	Employee e3= new Employee(3,"Sohit",2700.0, new Address("jersey3", "NJ3",07303, "USA"),null);
	Employee e4= new Employee(4,"Rahul",2800.0, new Address("jersey4", "NJ4",07304, "USA"),null);
		
	Stream<Employee> empStream=Stream.of(e1,e2,e3,e4);
	//empStream.sorted((ob1,ob2)-> ob2.getSalary().compareTo(ob1.getSalary())).forEach(emp-> System.out.println(emp));
	
	// Highest Salary
	
	//Employee highestSalariedEmp=empStream.sorted((ob1,ob2)-> ob2.getSalary().compareTo(ob1.getSalary())).findFirst().get();
	// System.out.print(highestSalariedEmp);
	
	//Lowest Salary
	//Employee lowestSalariedEmp=empStream.sorted((ob1,ob2)-> ob1.getSalary().compareTo(ob2.getSalary())).findFirst().get();
	 //System.out.print(lowestSalariedEmp);
	
	// nth 3rd highest salary
	 
	// Employee empThirdHighSal= empStream.sorted((ob1,ob2)-> ob2.getSalary().compareTo(ob1.getSalary())).skip(2).findFirst().get();
	 //System.out.print(empThirdHighSal);
	
	//dscending order of Zip code
	
   empStream.sorted((obj1,obj2)-> obj2.getAddress().getZip()- obj1.getAddress().getZip()).forEach(System.out::println);;
	  
   }
}
	

class Employee{
	
	private int id;
	private String name;
	private Double salary;
	private Address address;
	private List<Benefit> benefits;

	public Employee() {
		
	}
	

	public Employee(int id, String name, Double salary, Address address, List<Benefit> benefits) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.benefits = benefits;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Benefit> getBenefits() {
		return benefits;
	}


	public void setBenefits(List<Benefit> benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", benefits="
				+ benefits + "]";
	}

}

class Address{
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Address() {
		
	}
	
	
	public Address(String city, String state, int zip, String country) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
	
}

class Benefit{
	
	private int id;
	private String benefitName;
	
	public Benefit() {}
	
	public Benefit(int id, String benefitName) {
		this.id = id;
		this.benefitName = benefitName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBenefitName() {
		return benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	@Override
	public String toString() {
		return "Benefit [id=" + id + ", benefitName=" + benefitName + "]";
	}
	
	
	
}


