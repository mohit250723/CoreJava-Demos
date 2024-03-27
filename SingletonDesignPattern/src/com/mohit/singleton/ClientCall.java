package com.mohit.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ClientCall {
	
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, CloneNotSupportedException {
    System.out.println("Original Hash Code");
    Singleton singletonOriginal=Singleton.getInSingleton();
	System.out.println(singletonOriginal.hashCode());
	
	System.out.println(">>>>>>>>>>>>>>>>>>>>Breaking of Singleton Ways>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	// By Reflection 
	
	Class<?> class1= Class.forName("com.mohit.singleton.Singleton");
	Constructor<Singleton> constructor =(Constructor<Singleton>) class1.getDeclaredConstructor();
	constructor.setAccessible(true);
	Singleton reflectionBreakSingleton =constructor.newInstance();
	System.out.println("Reflection Singleton break Hashcode:::"+ reflectionBreakSingleton.hashCode());
		
	// By Serial/Deserial	
	
	FileOutputStream fileOutputStream= new FileOutputStream("D:\\Java Projects\\testfile\\singleton.ser");
	ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(singletonOriginal);
	objectOutputStream.close();
	fileOutputStream.close();
	
	
	FileInputStream fileInputStream = new FileInputStream("D:\\\\Java Projects\\\\testfile\\\\singleton.ser");
	ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
	Singleton deserialSingleton  = (Singleton) objectInputStream.readObject();
	objectInputStream.close();
	objectInputStream.close();
	
	System.out.println("Deserial--Singleton break Hashcode :::: "+deserialSingleton.hashCode());
	
	
	// By Clonning 
	
	Singleton colneSingletonBreak= (Singleton) singletonOriginal.clone();
	System.out.print("clone break singleton Hashcode :::"+ colneSingletonBreak.hashCode());
	}

}
