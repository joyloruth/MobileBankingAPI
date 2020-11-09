

public class User {

    private final String firstName;
    private final String lastName;
    private final String ssn;
    private final Account account;

    public User(String firstName, String lastName, String ssn, Account account){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.account = account;
        }

    public static Object getintialpayment() {
    }

    public static Object getfirstname() {
    }

    public static Object getlastname() {
    }

    public static Object getPhoneNumber() {
    }

    public String toString(){
        return "\nCustomerInformation\n" +
                "First Name: " + firstName +
                "Last Name: " + lastName +
                "Social Security number: " + ssn
                + account;
    }

}
