package com.mohit.serial.deserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserialPerform {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Raju");
		employee.setSalary(2000);
		
		FileOutputStream fileOutputStream= new FileOutputStream("D:\\Java Projects\\testfile\\employee.ser");
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		FileInputStream fileInputStream = new FileInputStream("D:\\\\Java Projects\\\\testfile\\\\employee.ser");
		ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
		Employee employeeDeserial  = (Employee) objectInputStream.readObject();
		objectInputStream.close();
		objectInputStream.close();
		
		System.out.print(employeeDeserial);
		
	}

}
