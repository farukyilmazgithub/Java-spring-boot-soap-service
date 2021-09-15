package com.farukyilmaz.soap.service.users.repositories;

import com.farukyilmaz.soap.service.users.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long>{
    List<User> findByUserCodeAndAccountCode(Integer uscode, Integer accode);
}
