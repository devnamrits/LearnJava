package Inheritance;

public class MainClass {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Ram Kumar");
        student.setEmail("ramkumar@gmail.com");
        student.setPhoneNumber("9999999999");
        student.setCollegeName("UIT RGPV");
        System.out.println(student.getName()+student.getCollegeName()+student.getPhoneNumber());
    }
}
