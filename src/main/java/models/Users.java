package models;

import java.util.Scanner;

public class Users {

    private String firstName;
    private final String lastName;
    private final String ssn;
    private final String phoneNumber;
    
    
   

    public Users(String firstName, String lastName, String phoneNumber, String ssn){
        this.setFirstName(firstName);
        this.lastName = lastName;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        
       }
//
   //  public static int getintialpayment() {
		//return 0;
    	 
     
    public String setFirstName() {
    	Scanner scan = new Scanner(System.in);
    	String firstName = scan.next();
    	return firstName;
    }
    
     
    public String getfirstName() {
		return this.getFirstName();
   }

    public String getlastname() {
		return lastName;
   }

    public String getPhoneNumber() {
    	return phoneNumber;
   }

    public String toString(){
        return "\nCustomerInformation\n" +
                "First Name: " + getFirstName() +
                "Last Name: " + lastName +
              "Social Security number: " + ssn;
   }


	private String getFirstName() {
		return firstName;
	}


	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
