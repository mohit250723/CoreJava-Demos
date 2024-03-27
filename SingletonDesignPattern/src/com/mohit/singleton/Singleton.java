package com.mohit.singleton;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton singleton=null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInSingleton() {
		
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
