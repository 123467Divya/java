package com.xworkz.university.university;

import com.xworkz.university.Student;

public class University {
   Student student ;
    public String universityName;
    public String universityAddress;

    public void getuniversity(){
        System.out.println("The university name is:"+this.universityName);
        System.out.println("The university address is:"+this.universityAddress);
        this.student.getuniversity();
    }
}
