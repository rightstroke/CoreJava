package com.rsc.srm.fs.basic;

public class Customer  {

	private String adhaarNumber;
	
	private String Firstname;
	
	private String lastName;
	
	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	@Override
	public String toString() {
		return this.getAdhaarNumber().concat(this.getFirstname()).concat(this.getLastName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Firstname == null) ? 0 : Firstname.hashCode());
		result = prime * result + ((adhaarNumber == null) ? 0 : adhaarNumber.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		cust.setAdhaarNumber("12345778677676");
		cust.setFirstname("Siva");
		cust.setLastName("RSC");
		
		Customer cust2 = new Customer();
		cust2.setAdhaarNumber("12345778677676");
		cust2.setFirstname("Siva");
		cust2.setLastName("RSC");
		
		System.out.println(cust.toString());
		
		System.out.println(cust.hashCode());
		System.out.println(cust2.hashCode());
	}

}
