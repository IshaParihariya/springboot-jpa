package com.isha.springbootjpa4.service;
import com.isha.springbootjpa4.repo.IVaccineRepo;
import com.isha.springbootjpa4.entity.Vaccine;
import com.isha.springbootjpa4.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService
{
    @Autowired
    private IVaccineRepo repo;

    @Override
    public List<ResultView> findByCost(Double cost)
    {
       return repo.findByCostLessThan(cost);
    }
}
