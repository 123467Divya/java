package com.xworkz.university.country;
import com.xworkz.university.state.State;

public class Country {

    State state;

    public  String country;

    public  String countyName;

    public Country(State state){
        this.state=state;

    }

    public void getCountryDetails(){
        this.state.getStateDetails();

        System.out.println("The State name is :" +this.countyName);
    }


}