package com.mohit.proxy.design;

public class ProxyLogic extends LogicParent{
	
	@Override
	public void printDetails() {
		//Here we can add any logic to precheck the details from client...
		//If everythings looks good then proxyclass will call the main class logic
		System.out.println("In Proxy Class Logic ...Need validations/Prechecks etc to decide if control goes to main class object else come out from here");
		super.printDetails();
	}

}
