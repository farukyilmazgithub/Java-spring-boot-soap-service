package com.farukyilmaz.soap.service.companies.repositories;


import com.farukyilmaz.soap.service.companies.models.Companie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanieRepository extends CrudRepository<Companie,Long> {
    List<Companie> findByCompanieName(String filter);

}
