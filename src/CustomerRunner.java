public class CustomerRunner {
    public static void CustomerRunnerMethod(){
        Address homeAddress = new Address("Ram Nagar", "Bhopal", "462023");
        Address workAddress = new Address("Work Office", "Bhopal", "462033");
        Customer customer = new Customer("Ram", homeAddress );
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
