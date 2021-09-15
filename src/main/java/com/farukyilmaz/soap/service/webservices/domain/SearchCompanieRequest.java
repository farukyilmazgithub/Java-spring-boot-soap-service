package com.farukyilmaz.soap.service.webservices.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companieName",
})
@XmlRootElement(name = "searchCompanieRequest")
public class SearchCompanieRequest {

    @XmlElement(required = true)
    protected String companieName;

    public String getCompanieName() {
        return companieName;
    }

    public void setCompanieName(String value) {
        this.companieName = value;
    }


}
