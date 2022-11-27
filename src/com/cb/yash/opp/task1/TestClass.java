package com.cb.yash.opp.task1;
/// this example already shown in 1st tast package
public class TestClass {
    public static void main(String[] args) {
        Department[] departments = new Department[2];
        departments[0]= new Department(101, "developer");
        departments[1]= new Department(102, "Testing");

        Employee e = new Employee(101, "Ram", "Indore", "12/10/1995", departments[0]);
        Customer c = new Customer(102, "shyam","Indore", "12/10/2000");

        e.setSalary(20000);
        e.setDate_of_joining("18/10/2019");
        e.setBase_location("indore");
        e.setContactNo("1234567891");
        e.setEmailId("ram@gmail.com");

        c.setDate_of_registration("02/01/2021");
        c.setDelivery_address("indore");
        c.setContactno("081236485");
        c.setEmail_id("shyam@gmail");

        System.out.println("employee details are \n"+ e.toString());
        System.out.println();
        System.out.println("customer details are \n"+ c.toString());

    }
}
