package com.isha.springbootjpa4.view;


    /*
    In Spring Data JPA, projection means fetching only the required fields
    from the database instead of the whole entity.

    2 types of projection :

    Static Projection :
    Projection where the result type is fixed at compile time.

    Dynamic Projection :
    Projection where the result type is decided at runtime using Class<T>.
     */

import com.isha.springbootjpa3.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;

public interface ResultView
{


    // getters of fields which we want to fetch from the table

    public String getVaccineName();

    public String getVaccineCompany();
}
