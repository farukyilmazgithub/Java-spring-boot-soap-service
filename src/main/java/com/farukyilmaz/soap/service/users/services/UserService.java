package com.farukyilmaz.soap.service.users.services;


import com.farukyilmaz.soap.service.users.models.User;

import java.util.Set;

public interface UserService {
    Set<User> getList();
    Set<User> getListByUserAndAccountCode(Integer uscode, Integer accode);
    User save (User p);
    void delete(User p);
}
