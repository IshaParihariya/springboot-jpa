package com.isha.springbootjpa1;

import com.isha.springbootjpa1.entity.Vaccine;
import com.isha.springbootjpa1.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootjpaApplication1
{
    public static void main(String[] args) {
       ConfigurableApplicationContext container= SpringApplication.run(SpringbootjpaApplication1.class, args);

       VaccineService vaccineService=container.getBean(VaccineService.class);

       // for single vaccine
       //String status=vaccineService.registerVaccineInfo(new Vaccine("phizer","moderate",4545.6);
        //System.out.println(status);

       // for multiple vaccines
       // Vaccine vac1=new Vaccine("phizer1","moderate1",4545.6);
        //Vaccine vac2=new Vaccine("phizer2","moderate2",45453.6);
       // Vaccine vac3=new Vaccine("phizer3","moderate3",445.6);

        //List<Vaccine> vaccines=new ArrayList<>();
       // vaccines.add(vac1);
        //vaccines.add(vac2);
        //vaccines.add(vac3);

        //vaccineService.registerMultipleVaccineInfo(vaccines);

        // for vaccines count
        //Long count=vaccineService.vaccineCount();
        //System.out.println("count of vaccines : "+count);

        // for chacking availibility of thr vaccines
        //Boolean ava=vaccineService.checkAvailibiltyOfVaccineById(2);
        //System.out.println("availaible or not : "+ava);

        // for optional<>
        /*
    NOTE : Optional<>
  Optional<T> is a class in the java.util package that is used
  to store a value that may or may not be present,
  helping avoid NullPointerException.
     */
        Integer id=3;
       Optional<Vaccine> optionalVaccine= vaccineService.getVaccineById(id);
       if(optionalVaccine.isPresent()) // if present
       {
           System.out.println(optionalVaccine.get());
       } else
       {
           System.out.println("vaccine with id "+id+" is not present in the records.");
       }

       // to delete Vaccine by id
       String statusForDeletion= vaccineService.deleteVaccineById(2);
       System.out.println( statusForDeletion);

       // delete using Vaccine object
        Vaccine vac=new Vaccine("phizer1","moderate1",4545.6);
        vac.setId(3);
        String statusWithObject=vaccineService.deleteVaccineByObject(vac);
        System.out.println( statusWithObject);


    }
}
