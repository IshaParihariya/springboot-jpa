package com.isha.springbootjpa3;

import com.isha.springbootjpa3.entity.Vaccine;
import com.isha.springbootjpa3.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class SpringbootjpaApplication3
{
    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringbootjpaApplication3.class, args);

        VaccineService vaccineService = container.getBean(VaccineService.class);

      //Vaccine v=vaccineService.searchVaccineById(1);
        //System.out.println(v);

        // with Example
        /*
        Example<T> in Spring Data JPA is used for Query By Example (QBE).
        It means:
        You create an object with some values filled, and Spring searches matching records automatically.
         */

        // in Example even if one object is incorrect then it will not show results
        // all needs to be same
       //Vaccine vaccine=new Vaccine("Phizer","moderala",45456.2);
       //vaccine.setId(1);

       //vaccineService.searchVaccineByGivenInfo(vaccine).forEach(v->System.out.println(v));



        // for remove all vaccine info by ids
        // NOTE: ** in JPARepository the vaccine infos are deleted in Batch only one query for selection and one for deletion
        // unlike others where each vaccine info needs selection and deletion each time
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String msg="";
        msg=vaccineService.removeVaccineInfoByIds(list);
         System.out.println(msg);
    }
}
