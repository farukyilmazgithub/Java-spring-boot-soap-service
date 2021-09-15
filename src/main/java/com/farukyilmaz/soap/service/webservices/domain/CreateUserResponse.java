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
        "users"
})
@XmlRootElement(name = "createUserResponse")
public class CreateUserResponse {

    protected List<User> users;

    public List<User> getUsers() {
        if (users == null) {
            users = new ArrayList<User>();
        }
        return this.users;
    }
}
