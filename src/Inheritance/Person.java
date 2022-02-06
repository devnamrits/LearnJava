package Inheritance;

public class Person extends Object {
    private String name;
    private String email;
    private String phoneNumber;

    // Default constructor when super() is called implicitly
    Person(){

    }

    // When we call super(name) is invoked explicitly then this
    // constructor is called
    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name + ' ' + email + ' ' + phoneNumber;
    }
}
