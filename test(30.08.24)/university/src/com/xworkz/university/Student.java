package com.xworkz.university;

import com.xworkz.university.address.Address;
import com.xworkz.university.university.University;

public class Student extends University {

    Address address;

    private String usn;
    private String name;
    private String branchName;
    public Student student;

    public Student(Address address) {
        this.address = address;
    }

    public void getStudentDetails() {

        System.out.println("The usn is:" + this.usn);
        System.out.println("The name is:" + this.name);
        System.out.println("The branch name is:" + this.branchName);

        this.address.getAddressDetails();
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void getuniversity(Student student) {
        this.student=student;
        getuniversity();
    }
}