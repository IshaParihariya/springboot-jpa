package com.isha.springbootjpa4.repo;

import com.isha.springbootjpa4.entity.Vaccine;
import com.isha.springbootjpa4.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {

    //findBy-propertyName-keyword
    // example :  findByCostLessThan()
    // here findBy is fixed
    // Cost is the property based on which we will be fetching the name and company of the vaccine
    // LessThan is the keyword which can be found on internet
    // LessThan here used cuz we want to fetch fields which have cost less than ( this value )
    // there are multiple keywords

    //for fetching fields using the cost
    List<ResultView> findByCostLessThan(Double cost);
}