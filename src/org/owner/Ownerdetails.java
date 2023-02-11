package org.owner;

import com.Sample.ClientsDetails;
import com.Sample.EmployeeDetails;

public class Ownerdetails {
	public void ownerId() {
		System.out.println("The Owner Id is -----407");
	}

	public void ownerLocation() {
		System.out.println("The location of Owner is ----- chennai");

	}

	public static void main(String[] args) {
		Ownerdetails details3= new Ownerdetails();
		details3.ownerId();
		details3.ownerLocation();
		EmployeeDetails details= new EmployeeDetails();
		details.empId();
		details.empName();
		ClientsDetails details2 = new ClientsDetails();
		details2.clientId();
		details2.clientName();
	}
}
