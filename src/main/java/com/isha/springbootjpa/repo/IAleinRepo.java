package com.isha.springbootjpa.repo;

import com.isha.springbootjpa.entity.Alien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAleinRepo extends CrudRepository<Alien, Integer>
{
    // here Integer is the data type of the primary key

}
