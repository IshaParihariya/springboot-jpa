package com.isha.springbootjpa1.repo;

import com.isha.springbootjpa1.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer>
{

    Integer id(Integer id);
}
