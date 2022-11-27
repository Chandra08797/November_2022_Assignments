package com.cb.yash.opp.task1;

public class Employee extends Person{
    private int salary;
    private String date_of_joining;
    private String base_location;
    private String contactNo;
    private String emailId;
    private Department deptObj;

    public Employee(int id, String name, String address, String dob, Department deptObj){
        super(id, name, address, dob );
        this.deptObj = deptObj;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getBase_location() {
        return base_location;
    }

    public void setBase_location(String base_location) {
        this.base_location = base_location;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Department getDeptObj() {
        return deptObj;
    }

    public void setDeptObj(Department deptObj) {
        this.deptObj = deptObj;
    }

    @Override
    public String toString(){
        return  "Id = \t"+ getpId()+ "\n"+
                "Name = \t"+ getpName()+ "\n"+
                "Address = \t"+ getpAddress()+ "\n"+
                "Dob = \t"+ getDob()+ "\n"+
                "salarty = \t"+ getSalary()+ "\n"+
                "Date_Of_Joining = \t"+ getDate_of_joining()+ "\n"+
                "baselocation = \t"+ getBase_location()+ "\n"+
                "contactNo. = \t"+ getContactNo()+ "\n"+
                "Email = \t"+ getEmailId()+ "\n"+
                "Department Id = \t"+getDeptObj().getDeptid()+ "\n"+
                "Department Name = \t"+ getDeptObj().getDname()+ "\n";

    }
}
