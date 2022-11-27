package com.cb.yash.collection.task9;


public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private int salary;
    private String deptName;
    private String address;

    public Employee(int empId, String empName, int salary, String deptName, String address) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.deptName = deptName;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(getEmpId(), employee.getEmpId());
    }

    public int getIndex(int employeeId){
        return (employeeId % 10);
    }

    @Override
    public int hashCode() {
        return (empId % 10) ;
    }
}
