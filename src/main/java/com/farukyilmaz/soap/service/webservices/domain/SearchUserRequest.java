package com.farukyilmaz.soap.service.webservices.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userCode",
    "accountCode"
})
@XmlRootElement(name = "searchUserRequest")
public class SearchUserRequest {

    @XmlElement(required = true)
    protected Integer userCode;
    @XmlElement(required = true)
    protected Integer accountCode;

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer value) {
        this.userCode = value;
    }

    public Integer getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Integer value) {
        this.accountCode = value;
    }

}
