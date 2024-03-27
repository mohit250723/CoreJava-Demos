package com.abst.design;

public class TraineeFactoryImpl extends ProfessionFactory{

	@Override
	Profession getProfession(String profession) {
		
		if(profession.equalsIgnoreCase("Engineer")) {
			   
			   return new TraineeEngieer();
			   
		   }
		   if(profession.equalsIgnoreCase("Teacher")) {
			   
			   return new TraineeTeacher();
			   
		   }
		return null;
	}

}
