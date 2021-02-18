/*
 1. Employee Class has employee name, 
 phone number and age. 
 Write a custom exception for Employee class 
 and throw this custom exception if -ve number is input for age.*/
public class Employee {
	private String firstName;
	private String phoneNumber;
	private int age = 0;
	
	
	public Employee() {
		firstName = "";
		phoneNumber = "";
		age = 0;
	}
	public Employee(String firstName, String phoneNumber, int age) {
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		if (firstName == "" && phoneNumber == "" && age  ==  0) return "Nobody here";
		return "Employee [firstName=" + firstName + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}
	
	
	
	
}
