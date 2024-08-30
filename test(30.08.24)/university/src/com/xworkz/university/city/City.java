package com.xworkz.university.city;

import com.xworkz.university.street.Street;

public class City {


        Street street;

        public String city;
        public   String cityName;

        public  City(Street street){
            this.street=street;

        }


        public void getCityDetails(){
            this.street.getStreetDetails();
            System.out.println("The city name is :" + this.city);

        }
    }

