package com.demo.oops;

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setEmpId(2);
        s1.setEmpName("sona");
        System.out.println(s1.getEmpId());
        System.out.println(s1.getEmpName());
        Student s2 = new Student();
        Student s3 = new Student();
    }
}
class Student{
    private int empId;
    private String empName;

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
}