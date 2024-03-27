package com.abst.design;

public class ProfessionFactoryImpl extends ProfessionFactory{

	@Override
	Profession getProfession(String profession) {
		
		
		
		   if(profession.equalsIgnoreCase("Engineer")) {
			   
			   return new Engineer();
			   
		   }
		   if(profession.equalsIgnoreCase("Teacher")) {
			   
			   return new Teacher();
			   
		   }
		
		return null;
	}

}
