package com.xworkz.university.state;


import com.xworkz.university.city.City;

public class State {

    City city;
    public String state;
    public String StateName;

    public State(City city){
        this.city=city;

    }



    public void getStateDetails(){
        this.city.getCityDetails();

        System.out.println("The state name is:" +this.state);

    }
}


