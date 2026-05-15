package com.isha.springbootjpa3.service;
import com.isha.springbootjpa3.entity.Vaccine;
import com.isha.springbootjpa3.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService
{

    @Autowired
    private IVaccineRepo repo;


    @Override
    public Vaccine searchVaccineById(Integer id)
    {
        return repo.getReferenceById(id);
    }

    /*
    Example<T> in Spring Data JPA is used for Query By Example (QBE).
    It means:
    You create an object with some values filled, and Spring searches matching records automatically.
     */
    @Override
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac)
    {
       Example<Vaccine> example=Example.of(vac);
       return repo.findAll(example);
    }
}
