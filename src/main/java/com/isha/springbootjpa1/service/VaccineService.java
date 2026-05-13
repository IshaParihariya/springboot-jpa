package com.isha.springbootjpa1.service;

import com.isha.springbootjpa1.entity.Vaccine;
import com.isha.springbootjpa1.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Optional<Vaccine> getVaccineById(Integer id)
    {
      return repo.findById(id);
    }

    @Override
    public String deleteVaccineById(Integer id) {

        // id present then delete else return some msg
      Optional<Vaccine> optional=repo.findById(id);
       if(optional.isPresent())
       {
           repo.deleteById(id);
           return "Vaccine with id "+id+" is deleted";
       }
       return "Vaccine with id "+ id+" is not in the records";
    }

    @Override
    public String deleteVaccineByObject(Vaccine obj)
    {
        // get the id first then using id delete
        Integer i=obj.getId();
        Optional<Vaccine> optional=repo.findById(i);
        if(optional.isPresent())
        {
            repo.deleteById(i);
            return "Vaccine with id "+i+" is deleted";
        }
        return "Vaccine with id "+ i+" is not in the records";
    }

}
