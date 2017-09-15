package com.scp.Hibernate1;

public class Employee {
	
		   private int id;
		   private String firstName; 
		   private String lastName;
		   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String firstName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public Employee(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}   

		  

}




