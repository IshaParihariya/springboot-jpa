package com.isha.springbootjpa2;

import com.isha.springbootjpa2.entity.Vaccine;
import com.isha.springbootjpa2.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class SpringbootjpaApplication2
{
    public static void main(String[] args) {
       ConfigurableApplicationContext container= SpringApplication.run(SpringbootjpaApplication2.class, args);

       VaccineService vaccineService=container.getBean(VaccineService.class);

// find by sorting
      // Iterable<Vaccine> sortVaccine=vaccineService.fetchDetailsBySorting(true,"vaccineName","vaccineCompany");

       //System.out.println(sortVaccine);

        // pagination with sorting as per vaccineName
        //this can still be dynamic
         vaccineService.fetchDetailsByPagination(0,5,true,"vaccineName")
                 .forEach(v->System.out.println(v));
    }
}
