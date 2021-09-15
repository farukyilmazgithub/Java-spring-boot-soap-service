package com.farukyilmaz.soap.service.companies.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Companie", propOrder = {
        "id",
        "companieName",
        "phoneNumber",
        "faxNumber",
        "companieAdress"
})

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Companie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlElement
    private Long id;
    @XmlElement(required = true)
    private String companieName;
    @XmlElement(required = true)
    private Integer phoneNumber;
    @XmlElement(required = true)
    private Integer faxNumber;
    @XmlElement(required = true)
    private String companieAdress;
}
