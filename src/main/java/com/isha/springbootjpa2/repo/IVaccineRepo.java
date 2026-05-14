package com.isha.springbootjpa2.repo;

import com.isha.springbootjpa2.entity.Vaccine;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer>
{

}
