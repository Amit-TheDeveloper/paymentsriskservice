package com.payments.easypayments.risk.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Account {

    @GeneratedValue
    private Integer id;
    private Integer customerId;

    public Account() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
