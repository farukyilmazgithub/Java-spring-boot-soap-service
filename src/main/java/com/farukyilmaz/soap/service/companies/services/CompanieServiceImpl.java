package com.farukyilmaz.soap.service.companies.services;


import com.farukyilmaz.soap.service.companies.models.Companie;
import com.farukyilmaz.soap.service.companies.repositories.CompanieRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CompanieServiceImpl implements CompanieService {

    private final CompanieRepository companieRepository;

    public CompanieServiceImpl(CompanieRepository companieRepository) {
        this.companieRepository = companieRepository;
    }


    @Override
    public Set<Companie> getList() {
        Set<Companie> companieSet =new HashSet<>();
        companieRepository.findAll().iterator().forEachRemaining(companieSet::add);
        return companieSet;
    }

    @Override
    public Set<Companie> getListByCompanieName(String filter) {
        Set<Companie> companieSet =new HashSet<>();
        companieRepository.findByCompanieName(filter).iterator().forEachRemaining(companieSet::add);
        return companieSet;
    }

    @Override
    public Companie save(Companie p) {
        return companieRepository.save(p);
    }

    @Override
    public void delete(Companie p) {
        companieRepository.delete(p);
    }

}
