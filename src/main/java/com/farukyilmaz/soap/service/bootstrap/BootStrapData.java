package com.farukyilmaz.soap.service.bootstrap;
import com.farukyilmaz.soap.service.companies.models.Companie;
import com.farukyilmaz.soap.service.companies.services.CompanieService;
import com.farukyilmaz.soap.service.users.models.User;
import com.farukyilmaz.soap.service.users.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final CompanieService companieService;
    private final UserService userService;

    public BootStrapData(CompanieService companieService, UserService userService) {
        this.companieService = companieService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        Companie companie =new Companie();
        companie.setCompanieName("Merkezi Kayıt Kuruluşu A.Ş. (MKK)");
        companie.setCompanieAdress("Reşitpaşa Mah., Borsa İstanbul Cad. No:4, 34467 Emirgan-Sarıyer/İstanbul");
        companie.setPhoneNumber(02123345700);
        companie.setFaxNumber(02123345700);
        companieService.save(companie);

        Companie companie2 =new Companie();
        companie2.setCompanieName("test");
        companieService.save(companie2);

        User user = new User(1,"Faruk","Yilmaz","Owner",1,10.10);
        userService.save(user);

        User user2 = new User(2,"FFFF","YYY","Real",2,0.0);
        userService.save(user2);

        User user3 = new User(3,"YYY","FFF","Owner",3,23425.25235);
        userService.save(user3);

        User user4 = new User(4,"FY","FY",null,4,23423424.5);
        userService.save(user4);

    }
}