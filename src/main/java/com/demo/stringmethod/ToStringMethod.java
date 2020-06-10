package com.demo.stringmethod;

public class ToStringMethod {
    public static void main(String[] args) {
        Student s = new Student(11,"sonali");
        System.out.println(s);
    }
}
class Student{
    int rollNo;
    String sName;

    public Student(int rollNo, String sName) {
        this.rollNo = rollNo;
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                '}';
    }
}