package com.farukyilmaz.soap.service.webservices.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userCode",
        "name",
        "surName",
        "accountType",
        "accountCode",
        "balance"
})
@XmlRootElement(name = "createUserRequest")
public class CreateUserRequest {

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
