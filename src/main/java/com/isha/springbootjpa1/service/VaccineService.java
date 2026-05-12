package com.isha.springbootjpa1.service;

import com.isha.springbootjpa1.entity.Vaccine;
import com.isha.springbootjpa1.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineService implements IVaccineService
{
    private IVaccineRepo repo;

    // setter injection for more flexibility and control instead of field injection of dependency
    @Autowired
    public void setRepo(IVaccineRepo repo)
    {
        this.repo=repo;
    }
    @Override
    public String registerVaccineInfo(Vaccine vaccine)
    {
        Vaccine vac=repo.save(vaccine);
        return "vaccine info registered with id "+vac.getId();
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines)
    {
        return repo.saveAll(vaccines);
    }

    @Override
    public Long vaccineCount()
    {
        return repo.count();
    }

    @Override
    public Boolean checkAvailibiltyOfVaccineById(Integer id)
    {
        return repo.existsById(id);
}
}
