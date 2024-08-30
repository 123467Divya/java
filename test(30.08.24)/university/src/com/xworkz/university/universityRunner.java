package com.xworkz.university;

import com.xworkz.university.address.Address;
import com.xworkz.university.city.City;
import com.xworkz.university.country.Country;
import com.xworkz.university.state.State;
import com.xworkz.university.street.Street;

public class universityRunner {
    public static void main(String[] args) {


        Street street = new Street();
        street.streetNo=23;
        street.streetName="Srinivasapura";

        City city = new City(street);
        city.city="Bangalore";

        State state = new State(city);
        state.state="Karnataka";

        Country country = new Country(state);
        country.countyName="India";

        Address address = new Address(country);
        address.addressName="Nelamangala";
//encapsulation
        Student student = new Student(address);
        student.setUsn("1SS21CS763");
        student.setName("Divya");
        student.setBranchName("cse");

        student.getStudentDetails();
        student.getuniversity();


    }
}