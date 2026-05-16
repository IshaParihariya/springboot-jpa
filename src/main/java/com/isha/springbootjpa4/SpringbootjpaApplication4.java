package com.isha.springbootjpa4;

import com.isha.springbootjpa4.service.VaccineService;
import com.isha.springbootjpa4.view.ResultView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

// static projection
@SpringBootApplication
public class SpringbootjpaApplication4
{
    /*
    In Spring Data JPA, projection means fetching only the required fields
    from the database instead of the whole entity.

    2 types of projection :

    Static Projection :
    Projection where the result type is fixed at compile time.

    Dynamic Projection :
    Projection where the result type is decided at runtime using Class<T>.
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringbootjpaApplication4.class, args);

        VaccineService vaccineService = container.getBean(VaccineService.class);

        // fetching fields by cost less than some variable
        vaccineService.findByCost(5000.0).forEach(v->System.out.println(v));


    }
}
