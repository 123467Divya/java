package com.xworkz.university.address;

import com.xworkz.university.country.Country;

public class Address {
    Country country;
    public String addressName;

    public Address(Country country){
        this.country=country;
    }

    public void getAddressDetails(){
        this.country.getCountryDetails();

        System.out.println("The address is :"+this.addressName);

    }
}
