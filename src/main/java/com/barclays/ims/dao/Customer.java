package com.barclays.ims.dao;

import com.barclays.ims.CrudController;

import java.util.List;

public class Customer  {
    int customerId;
    String firstName;
    String lastName;
    //String Address;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
