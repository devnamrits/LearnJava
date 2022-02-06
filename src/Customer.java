public class Customer {
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //creating
    Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("Name: [%s], HomeAddress: [%s], WorkAddress[%s]", name, homeAddress, workAddress);
    }
}
