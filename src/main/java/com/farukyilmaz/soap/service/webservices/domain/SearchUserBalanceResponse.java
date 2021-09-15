package com.farukyilmaz.soap.service.webservices.domain;


import com.farukyilmaz.soap.service.users.models.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "usersBalance"
})
@XmlRootElement(name = "searchUserBalanceResponse")
public class SearchUserBalanceResponse {

    protected List<User> usersBalance;

    public List<User> getUsers() {
        if (usersBalance == null) {
            usersBalance = new ArrayList<User>();
        }
        usersBalance.forEach(item-> item.setAccountType(null));
        return this.usersBalance;
    }

}
