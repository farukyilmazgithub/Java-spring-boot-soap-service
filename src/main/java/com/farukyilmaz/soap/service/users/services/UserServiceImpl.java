package com.farukyilmaz.soap.service.users.services;


import com.farukyilmaz.soap.service.users.models.User;
import com.farukyilmaz.soap.service.users.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Set<User> getList() {
        Set<User> userSet =new HashSet<>();
        userRepository.findAll().iterator().forEachRemaining(userSet::add);
        return userSet;
    }

    @Override
    public Set<User> getListByUserAndAccountCode(Integer uscode, Integer accode) {
        Set<User> userSet =new HashSet<>();
        userRepository.findByUserCodeAndAccountCode(uscode, accode).iterator().forEachRemaining(userSet::add);
        return userSet;
    }

    @Override
    public User save(User u) {
        return userRepository.save(u);
    }

    @Override
    public void delete(User u) {
        userRepository.delete(u);
    }

}
