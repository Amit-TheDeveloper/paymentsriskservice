package com.payments.easypayments.risk.paymentsrisk.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.List;

@Entity
public class Customer {

    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastname;
    private String email;
    private String phoneNo;
    private List<Account> accounts;

    public Customer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
