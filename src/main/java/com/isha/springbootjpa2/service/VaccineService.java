package com.isha.springbootjpa2.service;
import com.isha.springbootjpa2.repo.IVaccineRepo;
import com.isha.springbootjpa2.entity.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
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
    //This method is doing dynamic sorting in Spring Data JPA.
    public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties)
    {
      // if status = true => Ascending order sorting
      // if status = false => Descending order sorting
      Sort sort=  Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC , properties);
      return repo.findAll(sort);
    }


    // pagination with sorting
    /*
    here :
    pNo : Which page?
    pSize : How many records per page?
     */
    @Override
    public List<Vaccine> fetchDetailsByPagination(int pNo, int pSize, boolean status, String... properties)
    {
        // sorting first
        Sort sort=  Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC , properties);
        // concert into pages
        PageRequest pageRequest=PageRequest.of(pNo, pSize,sort);
        // findAll in the pages
        Page<Vaccine> page=repo.findAll(pageRequest);
        // return the content
        return page.getContent();
    }
}
