package com.farukyilmaz.soap.service.webservices.domain;


import com.farukyilmaz.soap.service.companies.models.Companie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "companies"
})
@XmlRootElement(name = "searchCompanieResponse")

public class SearchCompanieResponse {
    protected List<Companie> companies;

    public List<Companie> getCompanies() {
        if (companies == null) {
            companies = new ArrayList<Companie>();
        }
        return this.companies;
    }
}
