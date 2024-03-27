package com.abst.design;

public class ClientCall {
	
	public static void main(String args[]) {
		
		ProfessionFactory factory=	ProfessionFactoryDecider.ProfessionFactoryCreation(true);
		factory.getProfession("teacher").print();
		
	}

}
