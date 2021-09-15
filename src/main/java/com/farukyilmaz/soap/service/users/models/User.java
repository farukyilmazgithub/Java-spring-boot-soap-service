package com.farukyilmaz.soap.service.users.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "Id",
    "userCode",
    "name",
    "surName",
    "accountType",
    "accountCode",
    "balance"
})
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @XmlElement
    private Long Id;
    @XmlElement(required = true)
    protected Integer userCode;
    @XmlElement(required = true)
    protected String name;
    protected String surName;
    @XmlElement(required = true)
    protected String accountType;
    @XmlElement(required = true)
    protected Integer accountCode;
    @XmlElement(required = true)
    protected Double balance;

    public User(Integer userCode, String name, String surName, String accountType, Integer accountCode, Double balance){
        this.userCode = userCode;
        this.name = name;
        this.surName = surName;
        this.accountType = accountType;
        this.accountCode = accountCode;
        this.balance = balance;
    }

    public User() {

    }
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
