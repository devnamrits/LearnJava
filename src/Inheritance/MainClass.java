package Inheritance;

public class MainClass {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Ram Kumar");
        student.setEmail("ramkumar@gmail.com");
        student.setPhoneNumber("9999999999");
        student.setCollegeName("UIT RGPV");
        System.out.println(student.getName()+student.getCollegeName()+student.getPhoneNumber());

        Person person = new Person();
        person.setName("Ramesh");
        person.setEmail("ramesh@gmail.com");
        person.setPhoneNumber("1234567890");
        String val = person.toString();

        System.out.println(val);
        System.out.println(person);

        Employee employee = new Employee();
        employee.setName("Mohan");
        employee.setEmail("mohan@gmail.com");
        employee.setPhoneNumber("1234567890");
        employee.setEmployer("BFHL");
        employee.setTitle("SDE");
        employee.setEmployeeGrade('A');

        System.out.println(employee);
    }
}
