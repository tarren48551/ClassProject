package com.tarren.classproject;

/**
 * Created by Tarren on 4/11/2017.
 */

public class Account {
    public long id;
    public String name;
    public String contactName;
    public String phone;
    public String address;


    public Account(){

    }

    public Account(long id, String name, String contactName, String phone, String address){
        this.id = id;
        this.name = name;
        this.contactName = contactName;
        this.phone = phone;
        this.address = address;
    }

    public Account(String name, String contactName, String phone, String address) {
        this.name = name;
        this.contactName = contactName;
        this.phone = phone;
        this.address = address;
    }

    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}