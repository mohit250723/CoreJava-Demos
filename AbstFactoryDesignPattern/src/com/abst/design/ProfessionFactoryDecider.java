package com.abst.design;

public class ProfessionFactoryDecider {
	
	public static  ProfessionFactory ProfessionFactoryCreation(Boolean isTrainee) {
		
		if(isTrainee) {
			
			 return new TraineeFactoryImpl();
		}else {
			return new ProfessionFactoryImpl();
		}
		
	}

}
