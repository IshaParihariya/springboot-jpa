package com.isha.springbootjpa2.repo;

import com.isha.springbootjpa2.entity.Vaccine;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer>
{
/*
PagingAndSortingRepository is an interface in Spring Data JPA used for:

Pagination
Sorting
 
CrudRepository	Basic CRUD
PagingAndSortingRepository	CRUD + Sorting + Pagination
JpaRepository	All above + extra JPA features
 */
}
