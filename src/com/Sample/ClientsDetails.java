package com.Sample;

public class ClientsDetails extends EmployeeDetails{
//multilevel inheritance
	public void clientName() {
		System.out.println("Tata consulting Services");
	}

	public void clientId() {
		System.out.println("001");
	}

	public static void main(String[] args) {
		ClientsDetails details = new ClientsDetails();
//		details.clientName();
//		details.clientId();
//
//		EmployeeDetails details2 = new EmployeeDetails();
//		details2.empId();
//		details2.empName();
		details.clientId();
		details.clientName();
		details.empId();
		details.empName();
		details.ownerId();
		details.ownerLocation();
	}

}
