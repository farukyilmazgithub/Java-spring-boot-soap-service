package com.farukyilmaz.soap.service.companies.services;



import com.farukyilmaz.soap.service.companies.models.Companie;

import java.util.Set;

public interface CompanieService {
    Set<Companie> getList();
    Set<Companie> getListByCompanieName(String filter);
    Companie save (Companie p);
    void delete(Companie p);
}
