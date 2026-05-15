package com.isha.springbootjpa3.repo;

import com.isha.springbootjpa3.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer>
{

}
